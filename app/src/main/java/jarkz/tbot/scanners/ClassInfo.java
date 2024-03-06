package jarkz.tbot.scanners;

import jarkz.tbot.core.BotCore;
import jarkz.tbot.core.Rule;
import jarkz.tbot.types.Update;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class ClassInfo {

  public record MethodInfo(Method method, Rule rule) {}

  private Class<?> sourceClass;
  private Constructor<?> constructor;

  private List<MethodInfo> methods = new ArrayList<>();

  public ClassInfo(Class<?> sourceClass) {
    this.sourceClass = sourceClass;

    var constructors = sourceClass.getDeclaredConstructors();
    for (var constructor : constructors) {
      if (!Modifier.isPublic(constructor.getModifiers())) {
        continue;
      }

      var params = constructor.getParameters();
      if (BotCore.isClassInstantiable(params)) {
        this.constructor = constructor;
        break;
      }
    }

    if (constructor == null) {
      throw new RuntimeException(
          "Can't use this class with handler, because it doesn't contain applicable constructor.");
    }
  }

  public void addMethodInfo(Method method) {
    var rule = method.getAnnotation(Rule.class);
    methods.add(new MethodInfo(method, rule));
  }

  public void registerIntoPool() {
    instantiateIntoPool();
    instantiateRuleClasses();
    registerMethods();
  }

  private void instantiateIntoPool() {
    try {
      BotCore.instantiateClass(sourceClass, constructor);

    } catch (InvocationTargetException | IllegalAccessException | InstantiationException e) {
      throw new RuntimeException(e);
    }
  }

  private void instantiateRuleClasses() {
    for (var methodInfo : methods) {
      var rule = methodInfo.rule();
      var mentionedClassInfo = new ClassInfo(rule.mentionedClass());
      mentionedClassInfo.instantiateIntoPool();

      try {
        rule.mentionedClass().getMethod(rule.methodName(), Update.class);
      } catch (NoSuchMethodException e) {
        throw new RuntimeException(e);
      }
    }
  }

  private void registerMethods() {
    for (var methodInfo : methods) {
      BotCore.registerHandler(methodInfo.rule(), methodInfo.method());
    }
  }
}
