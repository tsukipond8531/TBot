package jarkz.tbot;

import jarkz.tbot.scanners.PackageScanner;

public class TBotApplication {

  public void launch() {
    if (this.getClass() == TBotApplication.class) {
      throw new RuntimeException("Don't call method from TBotApplication instance, except extended by it classes!");
    }

    var scanner = new PackageScanner();
    scanner.scanUserPackages(this.getClass());
  }
}
