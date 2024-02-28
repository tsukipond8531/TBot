package jarkz.tbot.core.parameters;

/**
 * Use this method to get current webhook status. Requires no parameters. On success, returns a
 * WebhookInfo object. If the bot is using getUpdates, will return an object with the url field
 * empty.
 */
public final class GetWebhookInfoParameters {

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetWebhookInfoParameters other)) return false;
    return true;
  }

  @Override
  public final int hashCode() {
    int prime = 31;
    return prime;
  }

  @Override
  public final String toString() {
    return "GetWebhookInfoParameters[]";
  }
}
