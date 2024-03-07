package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to edit name and icon of a topic in a forum supergroup chat. The bot must be an
 * administrator in the chat for this to work and must have can_manage_topics administrator rights,
 * unless it is the creator of the topic. Returns True on success.
 */
public final class EditForumTopicParameters {

  /**
   * Unique identifier for the target chat or username of the target supergroup (in the
   * format @supergroupusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** Unique identifier for the target message thread of the forum topic */
  @NotNull
  @SerializedName("message_thread_id")
  public int messageThreadId;

  /**
   * New topic name, 0-128 characters. If not specified or empty, the current name of the topic will
   * be kept
   */
  public String name;

  /**
   * New unique identifier of the custom emoji shown as the topic icon. Use
   * getForumTopicIconStickers to get all allowed custom emoji identifiers. Pass an empty string to
   * remove the icon. If not specified, the current icon will be kept
   */
  @SerializedName("icon_custom_emoji_id")
  public String iconCustomEmojiId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof EditForumTopicParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && messageThreadId == other.messageThreadId
        && Objects.equals(name, other.name)
        && Objects.equals(iconCustomEmojiId, other.iconCustomEmojiId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, messageThreadId, name, iconCustomEmojiId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("EditForumTopicParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
        .append(", name=")
        .append(name)
        .append(", iconCustomEmojiId=")
        .append(iconCustomEmojiId)
        .append("]");
    return builder.toString();
  }
}
