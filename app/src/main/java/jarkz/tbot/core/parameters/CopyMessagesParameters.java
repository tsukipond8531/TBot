package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to copy messages of any kind. If some of the specified messages can't be found or
 * copied, they are skipped. Service messages, giveaway messages, giveaway winners messages, and
 * invoice messages can't be copied. A quiz poll can be copied only if the value of the field
 * correct_option_id is known to the bot. The method is analogous to the method forwardMessages, but
 * the copied messages don't have a link to the original message. Album grouping is kept for copied
 * messages. On success, an array of MessageId of the sent messages is returned.
 */
public final class CopyMessagesParameters {

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

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
  public Id fromChatId;

  /**
   * Identifiers of 1-100 messages in the chat from_chat_id to copy. The identifiers must be
   * specified in a strictly increasing order.
   */
  @NotNull
  @SerializedName("message_ids")
  public List<Integer> messageIds;

  /** Sends the messages silently. Users will receive a notification with no sound. */
  @SerializedName("disable_notification")
  public Boolean disableNotification;

  /** Protects the contents of the sent messages from forwarding and saving */
  @SerializedName("protect_content")
  public Boolean protectContent;

  /** Pass True to copy the messages without their captions */
  @SerializedName("remove_caption")
  public Boolean removeCaption;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof CopyMessagesParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageThreadId, other.messageThreadId)
        && Objects.equals(fromChatId, other.fromChatId)
        && Objects.equals(messageIds, other.messageIds)
        && Objects.equals(disableNotification, other.disableNotification)
        && Objects.equals(protectContent, other.protectContent)
        && Objects.equals(removeCaption, other.removeCaption);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chatId,
        messageThreadId,
        fromChatId,
        messageIds,
        disableNotification,
        protectContent,
        removeCaption);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("CopyMessagesParameters[chatId=")
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
        .append(", removeCaption=")
        .append(removeCaption)
        .append("]");
    return builder.toString();
  }
}
