package jarkz.tbot.core;

import jarkz.tbot.types.Update;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RuleHandler {

  private Object instance;
  private Method callableMethod;

  public RuleHandler(Rule rule) {
    var mentionedClass = rule.mentionedClass();
    try {
      callableMethod = mentionedClass.getMethod(rule.methodName(), Update.class);
    } catch (NoSuchMethodException e) {
      throw new RuntimeException(e);
    }

    instance = BotCore.objectPool.get(mentionedClass);
    if (instance == null) {
      throw new RuntimeException("Class is unregistered!");
    }
  }

  public boolean check(Update event) {
    try {
      return (Boolean) callableMethod.invoke(instance, event);
    } catch (InvocationTargetException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }
}
