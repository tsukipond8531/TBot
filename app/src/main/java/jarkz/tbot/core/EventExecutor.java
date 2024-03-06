package jarkz.tbot.core;

import jarkz.tbot.core.parameters.GetUpdatesParameters;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EventExecutor {

  private final int WAIT_TIME = 300;

  private ExecutorService service;
  private BotApi api;

  private int offset = 0;

  public EventExecutor(BotApi api) {
    service = Executors.newSingleThreadExecutor();
    this.api = api;
  }

  public EventExecutor(BotApi api, int threadCount) {
    service = Executors.newFixedThreadPool(threadCount);
    this.api = api;
  }

  public void runPolling() throws InterruptedException {
    while (true) {
      var params = new GetUpdatesParameters();
      params.offset = offset;
      var updates = api.getUpdates(params);

      for (var event : updates) {
        offset = Math.max(offset, event.updateId + 1);

        var handler = new HandlerTask(event);
        service.execute(handler);
      }

      Thread.sleep(WAIT_TIME);
    }
  }
}
