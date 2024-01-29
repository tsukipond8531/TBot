package jarkz.tbot.types.forum;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a service message about a new forum topic created in the chat.
 *
 * @author Pavel Bialiauski
 */
public class ForumTopicCreated {

  @NotNull private String name;

  @SerializedName("icon_color")
  @NotNull
  private int iconColor;

  @SerializedName("icon_custom_emoji_id")
  private String iconCustomEmojiId;

  /** Default constructor. */
  public ForumTopicCreated() {}

  /**
   * Name of the topic.
   *
   * @return name as String.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of the topic.
   *
   * @param name the name of the topic as String.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Color of the topic icon in RGB format.
   *
   * @return icon_color as int.
   */
  public int getIconColor() {
    return iconColor;
  }

  /**
   * Sets the color of the topic icon in RGB format.
   *
   * @param iconColor the color of the topic icon in RGB format as int.
   */
  public void setIconColor(int iconColor) {
    this.iconColor = iconColor;
  }

  /**
   * <i>Optional.</i> Unique identifier of the custom emoji shown as the topic icon.
   *
   * @return an optional value of icon_custom_emoji_id as String.
   */
  public Optional<String> getIconCustomEmojiId() {
    return Optional.ofNullable(iconCustomEmojiId);
  }

  /**
   * Sets the unique identifier of the custom emoji shown as the topic icon.
   *
   * @param iconCustomEmojiId the unique identifier of the custom emoji shown as the topic icon as
   *     String or null if it not is custom emoji.
   */
  public void setIconCustomEmojiId(String iconCustomEmojiId) {
    this.iconCustomEmojiId = iconCustomEmojiId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name, iconColor, iconCustomEmojiId);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ForumTopicCreated other)) return false;
    return Objects.equals(name, other.name)
        && iconColor == other.iconColor
        && Objects.equals(iconCustomEmojiId, other.iconCustomEmojiId);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
