package jarkz.tbot.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BotCore {

  protected static Map<Rule, Method> ruleToHandler = new HashMap<>();
  protected static Map<Class<?>, Object> objectPool = new HashMap<>();


  public static void registerHandler(Rule rule, Method method) {
    ruleToHandler.put(rule, method);
  }

  public static void registerObject(Class<?> type, Object instance) {
    objectPool.put(type, instance);
  }
}
