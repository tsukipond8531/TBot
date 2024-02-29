package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to remove a message from the list of pinned messages in a chat. If the chat is
 * not a private chat, the bot must be an administrator in the chat for this to work and must have
 * the 'can_pin_messages' administrator right in a supergroup or 'can_edit_messages' administrator
 * right in a channel. Returns True on success.
 */
public final class UnpinChatMessageParameters {

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /**
   * Identifier of a message to unpin. If not specified, the most recent pinned message (by sending
   * date) will be unpinned.
   */
  @SerializedName("message_id")
  public Integer messageId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof UnpinChatMessageParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && Objects.equals(messageId, other.messageId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, messageId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("UnpinChatMessageParameters[chatId=")
        .append(chatId)
        .append(", messageId=")
        .append(messageId)
        .append("]");
    return builder.toString();
  }
}
