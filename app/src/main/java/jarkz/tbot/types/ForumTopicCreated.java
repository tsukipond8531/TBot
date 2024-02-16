package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a service message about a new forum topic created in the chat. */
public final class ForumTopicCreated {

  /** Name of the topic */
  @NotNull public String name;

  /** Color of the topic icon in RGB format */
  @NotNull
  @SerializedName("icon_color")
  public int iconColor;

  /** Optional. Unique identifier of the custom emoji shown as the topic icon */
  @SerializedName("icon_custom_emoji_id")
  public String iconCustomEmojiId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ForumTopicCreated other)) return false;
    return Objects.equals(name, other.name)
        && iconColor == other.iconColor
        && Objects.equals(iconCustomEmojiId, other.iconCustomEmojiId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name, iconColor, iconCustomEmojiId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ForumTopicCreated[name=")
        .append(name)
        .append(", iconColor=")
        .append(iconColor)
        .append(", iconCustomEmojiId=")
        .append(iconCustomEmojiId)
        .append("]");
    return builder.toString();
  }
}
