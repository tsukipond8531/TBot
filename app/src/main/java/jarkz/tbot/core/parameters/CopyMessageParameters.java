package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to copy messages of any kind. Service messages, giveaway messages, giveaway
 * winners messages, and invoice messages can't be copied. A quiz poll can be copied only if the
 * value of the field correct_option_id is known to the bot. The method is analogous to the method
 * forwardMessage, but the copied message doesn't have a link to the original message. Returns the
 * MessageId of the sent message on success.
 */
public final class CopyMessageParameters {

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
   * Unique identifier for the chat where the original message was sent (or channel username in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("from_chat_id")
  public String fromChatId;

  /** Message identifier in the chat specified in from_chat_id */
  @NotNull
  @SerializedName("message_id")
  public int messageId;

  /**
   * New caption for media, 0-1024 characters after entities parsing. If not specified, the original
   * caption is kept
   */
  public String caption;

  /** Mode for parsing entities in the new caption. See formatting options for more details. */
  @SerializedName("parse_mode")
  public String parseMode;

  /**
   * A JSON-serialized list of special entities that appear in the new caption, which can be
   * specified instead of parse_mode
   */
  @SerializedName("caption_entities")
  public List<MessageEntity> captionEntities;

  /** Sends the message silently. Users will receive a notification with no sound. */
  @SerializedName("disable_notification")
  public Boolean disableNotification;

  /** Protects the contents of the sent message from forwarding and saving */
  @SerializedName("protect_content")
  public Boolean protectContent;

  /** Description of the message to reply to */
  @SerializedName("reply_parameters")
  public ReplyParameters replyParameters;

  /**
   * Additional interface options. A JSON-serialized object for an inline keyboard, custom reply
   * keyboard, instructions to remove reply keyboard or to force a reply from the user.
   */
  @SerializedName("reply_markup")
  public ReplyMarkup replyMarkup;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof CopyMessageParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageThreadId, other.messageThreadId)
        && Objects.equals(fromChatId, other.fromChatId)
        && messageId == other.messageId
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(disableNotification, other.disableNotification)
        && Objects.equals(protectContent, other.protectContent)
        && Objects.equals(replyParameters, other.replyParameters)
        && Objects.equals(replyMarkup, other.replyMarkup);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chatId,
        messageThreadId,
        fromChatId,
        messageId,
        caption,
        parseMode,
        captionEntities,
        disableNotification,
        protectContent,
        replyParameters,
        replyMarkup);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("CopyMessageParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
        .append(", fromChatId=")
        .append(fromChatId)
        .append(", messageId=")
        .append(messageId)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", disableNotification=")
        .append(disableNotification)
        .append(", protectContent=")
        .append(protectContent)
        .append(", replyParameters=")
        .append(replyParameters)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append("]");
    return builder.toString();
  }
}
