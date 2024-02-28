package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Use this method to clear the list of pinned messages in a forum topic. The bot must be an
 * administrator in the chat for this to work and must have the can_pin_messages administrator right
 * in the supergroup. Returns True on success.
 */
public final class UnpinAllForumTopicMessagesParameters {

  /**
   * Unique identifier for the target chat or username of the target supergroup (in the
   * format @supergroupusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public String chatId;

  /** Unique identifier for the target message thread of the forum topic */
  @NotNull
  @SerializedName("message_thread_id")
  public int messageThreadId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof UnpinAllForumTopicMessagesParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && messageThreadId == other.messageThreadId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, messageThreadId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("UnpinAllForumTopicMessagesParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
        .append("]");
    return builder.toString();
  }
}
