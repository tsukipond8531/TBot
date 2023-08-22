package jarkz.tbot.types.forum;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a service message about an edited forum topic.
 *
 * @author Pavel Bialiauski
 */
public class ForumTopicEdited {

  private String name;

  @SerializedName("icon_custom_emoji_id")
  private String iconCustomEmojiId;

  /** Default constructor. */
  public ForumTopicEdited() {}

  /**
   * <i>Optional.</i> New name of the topic, if it was edited.
   *
   * @return an optional value of name as String.
   */
  public Optional<String> getName() {
    return Optional.of(name);
  }

  /**
   * Sets the new name of the topic, if it was edited.
   *
   * @param name the new name of the topic as String or null if it is not edited.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * <i>Optional.</i> New identifier of the custom emoji shown as the topic icon, if it was edited;
   * an empty string if the icon was removed.
   *
   * @return an optional value of icon_custom_emoji_id as String.
   */
  public Optional<String> getIconCustomEmojiId() {
    return Optional.of(iconCustomEmojiId);
  }

  /**
   * Sets the new identifier of the custom emoji shown as the topic icon, if it was edited; an empty
   * string if the icon was removed.
   *
   * @param iconCustomEmojiId the new identifier of the custom emoji shown as the topic icon as
   *     String or null if it is not edited.
   */
  public void setIconCustomEmojiId(String iconCustomEmojiId) {
    this.iconCustomEmojiId = iconCustomEmojiId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name, iconCustomEmojiId);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ForumTopicEdited other)) return false;
    return Objects.equals(name, other.name)
        && Objects.equals(iconCustomEmojiId, other.iconCustomEmojiId);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ForumTopicEdited[name=")
        .append(name)
        .append(", iconCustomEmojiId=")
        .append(iconCustomEmojiId)
        .append("]");
    return builder.toString();
  }
}
