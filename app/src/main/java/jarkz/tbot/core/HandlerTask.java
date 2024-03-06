package jarkz.tbot.core;

import jarkz.tbot.types.Update;

public class HandlerTask implements Runnable {

  private Update event;

  public HandlerTask(Update event) {
    this.event = event;
  }

  @Override
  public void run() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'run'");
  }
}
