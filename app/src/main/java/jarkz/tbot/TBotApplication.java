package jarkz.tbot;

import jarkz.tbot.core.BotApi;
import jarkz.tbot.core.BotCore;
import jarkz.tbot.core.EventExecutor;
import jarkz.tbot.scanners.PackageScanner;

public class TBotApplication {

  public static void launch(Class<?> mainClass) {
    if (mainClass == TBotApplication.class) {
      throw new RuntimeException(
          "Don't call method from TBotApplication instance, except extended by it classes!");
    }

    var botToken = System.getenv("BOT_TOKEN");
    var botApi = new BotApi(botToken);
    BotCore.registerObject(BotApi.class, botApi);

    var scanner = new PackageScanner();
    var classInfos = scanner.scanUserPackages(mainClass);
    classInfos.stream().forEach(ci -> ci.registerIntoPool());

    var executor = new EventExecutor(botApi);
    try {

      executor.runPolling();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
