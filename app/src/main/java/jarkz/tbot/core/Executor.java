package jarkz.tbot.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import jarkz.tbot.core.parameters.GetUpdatesParameters;

public class Executor {

  private final int WAIT_TIME = 300;

  private ExecutorService service;
  private BotApi api;

  public Executor(BotApi api) {
    service = Executors.newSingleThreadExecutor();
    this.api = api;
  }

  public Executor(BotApi api, int threadCount) {
    service = Executors.newFixedThreadPool(threadCount);
    this.api = api;
  }

  public void runPolling() throws InterruptedException {
    while (true) {
      var params = new GetUpdatesParameters();
      var updates = api.getUpdates(params);

      for (var event : updates) {
        var handler = new HandlerTask(event);
        service.execute(handler);
      }

      Thread.sleep(WAIT_TIME);
    }
  }
}
