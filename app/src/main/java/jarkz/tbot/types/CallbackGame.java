package jarkz.tbot.types;

/** A placeholder, currently holds no information. Use BotFather to set up your game. */
public final class CallbackGame {

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof CallbackGame other)) return false;
    return true;
  }

  @Override
  public final int hashCode() {
    int prime = 31;
    return prime;
  }

  @Override
  public final String toString() {
    return "CallbackGame[]";
  }
}
