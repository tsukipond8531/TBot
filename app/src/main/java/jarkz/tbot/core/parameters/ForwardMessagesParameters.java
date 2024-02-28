package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to forward multiple messages of any kind. If some of the specified messages can't
 * be found or forwarded, they are skipped. Service messages and messages with protected content
 * can't be forwarded. Album grouping is kept for forwarded messages. On success, an array of
 * MessageId of the sent messages is returned.
 */
public final class ForwardMessagesParameters {

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public String chatId;

  /**
   * Unique identifier for the target message thread (topic) of the forum; for forum supergroups
   * only
   */
  @SerializedName("message_thread_id")
  public Integer messageThreadId;

  /**
   * Unique identifier for the chat where the original messages were sent (or channel username in
   * the format @channelusername)
   */
  @NotNull
  @SerializedName("from_chat_id")
  public String fromChatId;

  /**
   * Identifiers of 1-100 messages in the chat from_chat_id to forward. The identifiers must be
   * specified in a strictly increasing order.
   */
  @NotNull
  @SerializedName("message_ids")
  public List<Integer> messageIds;

  /** Sends the messages silently. Users will receive a notification with no sound. */
  @SerializedName("disable_notification")
  public Boolean disableNotification;

  /** Protects the contents of the forwarded messages from forwarding and saving */
  @SerializedName("protect_content")
  public Boolean protectContent;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ForwardMessagesParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageThreadId, other.messageThreadId)
        && Objects.equals(fromChatId, other.fromChatId)
        && Objects.equals(messageIds, other.messageIds)
        && Objects.equals(disableNotification, other.disableNotification)
        && Objects.equals(protectContent, other.protectContent);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chatId, messageThreadId, fromChatId, messageIds, disableNotification, protectContent);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ForwardMessagesParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
        .append(", fromChatId=")
        .append(fromChatId)
        .append(", messageIds=")
        .append(messageIds)
        .append(", disableNotification=")
        .append(disableNotification)
        .append(", protectContent=")
        .append(protectContent)
        .append("]");
    return builder.toString();
  }
}
