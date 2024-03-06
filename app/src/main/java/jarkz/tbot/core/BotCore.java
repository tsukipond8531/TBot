package jarkz.tbot.core;

import java.lang.reflect.Method;
import java.util.Map;
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
}
