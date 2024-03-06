package jarkz.tbot;

import jarkz.tbot.scanners.PackageScanner;

public class TBotApplication {

  public void launch() {
    if (this.getClass() == TBotApplication.class) {
      throw new RuntimeException("Don't call method from TBotApplication instance, except extended by it classes!");
    }

    var scanner = new PackageScanner();
    var classInfos = scanner.scanUserPackages(this.getClass());
    classInfos.stream().forEach(ci -> ci.registerIntoPool());
  }
}
