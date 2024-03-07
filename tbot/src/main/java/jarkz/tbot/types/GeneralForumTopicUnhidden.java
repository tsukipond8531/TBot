package jarkz.tbot.types;

/**
 * This object represents a service message about General forum topic unhidden in the chat.
 * Currently holds no information.
 */
public final class GeneralForumTopicUnhidden {

  public static final class Builder {

    private GeneralForumTopicUnhidden buildingType;

    public Builder() {
      buildingType = new GeneralForumTopicUnhidden();
    }

    public GeneralForumTopicUnhidden build() {
      return buildingType;
    }
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GeneralForumTopicUnhidden)) return false;
    return true;
  }

  @Override
  public final int hashCode() {
    int prime = 31;
    return prime;
  }

  @Override
  public final String toString() {
    return "GeneralForumTopicUnhidden[]";
  }
}
