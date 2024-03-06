package jarkz.tbot.core;

import java.lang.reflect.Method;
import java.util.Optional;

import jarkz.tbot.types.Update;

public class HandlerTask implements Runnable {

  private Update event;

  public HandlerTask(Update event) {
    this.event = event;
  }

  private Optional<Method> pickMethod() {
    for (var entry : BotCore.ruleToHandler.entrySet()) {
      if (entry.getKey().value.test(this.event)) {
        return Optional.of(entry.getValue());
      }
    }

    return Optional.empty();
  }

  @Override
  public void run() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'run'");
  }
}
