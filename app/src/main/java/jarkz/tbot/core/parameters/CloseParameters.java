package jarkz.tbot.core.parameters;

/**
 * Use this method to close the bot instance before moving it from one local server to another. You
 * need to delete the webhook before calling this method to ensure that the bot isn't launched again
 * after server restart. The method will return error 429 in the first 10 minutes after the bot is
 * launched. Returns True on success. Requires no parameters.
 */
public final class CloseParameters {

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof CloseParameters other)) return false;
    return true;
  }

  @Override
  public final int hashCode() {
    int prime = 31;
    return prime;
  }

  @Override
  public final String toString() {
    return "CloseParameters[]";
  }
}
