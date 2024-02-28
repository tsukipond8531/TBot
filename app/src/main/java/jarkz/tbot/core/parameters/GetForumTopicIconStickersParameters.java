package jarkz.tbot.core.parameters;

/**
 * Use this method to get custom emoji stickers, which can be used as a forum topic icon by any
 * user. Requires no parameters. Returns an Array of Sticker objects.
 */
public final class GetForumTopicIconStickersParameters {

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetForumTopicIconStickersParameters other)) return false;
    return true;
  }

  @Override
  public final int hashCode() {
    int prime = 31;
    return prime;
  }

  @Override
  public final String toString() {
    return "GetForumTopicIconStickersParameters[]";
  }
}
