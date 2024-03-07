package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** This object represents a service message about an edited forum topic. */
public final class ForumTopicEdited {

  public static final class Builder {

    private ForumTopicEdited buildingType;

    public Builder() {
      buildingType = new ForumTopicEdited();
    }

    public Builder setName(String name) {
      buildingType.name = name;
      return this;
    }

    public Builder setIconCustomEmojiId(String iconCustomEmojiId) {
      buildingType.iconCustomEmojiId = iconCustomEmojiId;
      return this;
    }

    public ForumTopicEdited build() {
      return buildingType;
    }
  }

  /** Optional. New name of the topic, if it was edited */
  public String name;

  /**
   * Optional. New identifier of the custom emoji shown as the topic icon, if it was edited; an
   * empty string if the icon was removed
   */
  @SerializedName("icon_custom_emoji_id")
  public String iconCustomEmojiId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ForumTopicEdited other)) return false;
    return Objects.equals(name, other.name)
        && Objects.equals(iconCustomEmojiId, other.iconCustomEmojiId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name, iconCustomEmojiId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ForumTopicEdited[name=")
        .append(name)
        .append(", iconCustomEmojiId=")
        .append(iconCustomEmojiId)
        .append("]");
    return builder.toString();
  }
}
