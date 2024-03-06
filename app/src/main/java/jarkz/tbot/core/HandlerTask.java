package jarkz.tbot.core;

import jarkz.tbot.types.Update;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

public class HandlerTask implements Runnable {

  private Update event;

  public HandlerTask(Update event) {
    this.event = event;
  }

  private Optional<Method> pickMethod() {
    for (var entry : BotCore.ruleToHandler.entrySet()) {
      if (entry.getKey().test(this.event)) {
        return Optional.of(entry.getValue());
      }
    }

    return Optional.empty();
  }

  @Override
  public void run() {

    var maybeMethod = pickMethod();
    if (maybeMethod.isEmpty()) {
      return;
    }

    var method = maybeMethod.get();
    var parameters = method.getParameters();
    var args = new Object[parameters.length];
    for (var i = 0; i < parameters.length; i++) {
      var argType = parameters[i].getType();
      if (argType == Update.class) {
        args[i] = event;
        continue;
      }
      args[i] = BotCore.objectPool.get(argType);
    }

    var declClass = method.getDeclaringClass();
    var instance = BotCore.objectPool.get(declClass);

    try {
      method.invoke(instance, args);
    } catch (IllegalAccessException | InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }
}
