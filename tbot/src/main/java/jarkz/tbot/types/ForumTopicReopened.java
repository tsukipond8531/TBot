package jarkz.tbot.types;

/**
 * This object represents a service message about a forum topic reopened in the chat. Currently
 * holds no information.
 */
public final class ForumTopicReopened {

  public static final class Builder {

    private ForumTopicReopened buildingType;

    public Builder() {
      buildingType = new ForumTopicReopened();
    }

    public ForumTopicReopened build() {
      return buildingType;
    }
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ForumTopicReopened)) return false;
    return true;
  }

  @Override
  public final int hashCode() {
    int prime = 31;
    return prime;
  }

  @Override
  public final String toString() {
    return "ForumTopicReopened[]";
  }
}
