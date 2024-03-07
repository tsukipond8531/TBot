package jarkz.tbot.types;

/**
 * This object represents a service message about a video chat started in the chat. Currently holds
 * no information.
 */
public final class VideoChatStarted {

  public static final class Builder {

    private VideoChatStarted buildingType;

    public Builder() {
      buildingType = new VideoChatStarted();
    }

    public VideoChatStarted build() {
      return buildingType;
    }
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof VideoChatStarted)) return false;
    return true;
  }

  @Override
  public final int hashCode() {
    int prime = 31;
    return prime;
  }

  @Override
  public final String toString() {
    return "VideoChatStarted[]";
  }
}
