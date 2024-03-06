package jarkz.tbot.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class BotCore {

  protected static Map<RuleHandler, Method> ruleToHandler = new ConcurrentHashMap<>();
  protected static Map<Class<?>, Object> objectPool = new ConcurrentHashMap<>();

  public static void registerHandler(Rule rule, Method method) {
    ruleToHandler.put(new RuleHandler(rule), method);
  }

  public static void registerObject(Class<?> type, Object instance) {
    objectPool.put(type, instance);
  }

  public static boolean isClassInstantiable(Parameter[] params) {
    for (var param : params) {
      if (!objectPool.containsKey(param.getType())) {
        return false;
      }
    }

    return true;
  }

  public static void instantiateClass(Class<?> instantiableClass, Constructor<?> constructor)
      throws InvocationTargetException, IllegalAccessException, InstantiationException {
    if (BotCore.objectPool.containsKey(instantiableClass)) {
      return;
    }

    var params = constructor.getParameters();
    var args = new Object[params.length];
    for (var i = 0; i < params.length; i++) {
      args[i] = BotCore.objectPool.get(params[i].getType());
    }

    var newInstance = constructor.newInstance(args);
    BotCore.objectPool.put(instantiableClass, newInstance);
  }

  public static Optional<Object> retrieveInstanceBy(Class<?> referableClass) {
    return Optional.ofNullable(BotCore.objectPool.get(referableClass));
  }
}
