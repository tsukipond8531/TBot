package jarkz.tbot.core.parameters;

/**
 * A simple method for testing your bot's authentication token. Requires no parameters. Returns
 * basic information about the bot in form of a User object.
 */
public final class GetMeParameters {

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetMeParameters other)) return false;
    return true;
  }

  @Override
  public final int hashCode() {
    int prime = 31;
    return prime;
  }

  @Override
  public final String toString() {
    return "GetMeParameters[]";
  }
}
