package jarkz.tbot.types;

/**
 * This object represents a service message about a forum topic closed in the chat. Currently holds
 * no information.
 */
public final class ForumTopicClosed {

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ForumTopicClosed other)) return false;
    return true;
  }

  @Override
  public final int hashCode() {
    int prime = 31;
    return prime;
  }

  @Override
  public final String toString() {
    return "ForumTopicClosed[]";
  }
}