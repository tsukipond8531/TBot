package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** Describes reply parameters for the message that is being sent. */
public final class ReplyParameters {

  /**
   * Identifier of the message that will be replied to in the current chat, or in the chat chat_id
   * if it is specified
   */
  @NotNull
  @SerializedName("message_id")
  public int messageId;

  /**
   * Optional. If the message to be replied to is from a different chat, unique identifier for the
   * chat or username of the channel (in the format @channelusername)
   */
  @SerializedName("chat_id")
  public String chatId;

  /**
   * Optional. Pass True if the message should be sent even if the specified message to be replied
   * to is not found; can be used only for replies in the same chat and forum topic.
   */
  @SerializedName("allow_sending_without_reply")
  public Boolean allowSendingWithoutReply;

  /**
   * Optional. Quoted part of the message to be replied to; 0-1024 characters after entities
   * parsing. The quote must be an exact substring of the message to be replied to, including bold,
   * italic, underline, strikethrough, spoiler, and custom_emoji entities. The message will fail to
   * send if the quote isn't found in the original message.
   */
  public String quote;

  /** Optional. Mode for parsing entities in the quote. See formatting options for more details. */
  @SerializedName("quote_parse_mode")
  public String quoteParseMode;

  /**
   * Optional. A JSON-serialized list of special entities that appear in the quote. It can be
   * specified instead of quote_parse_mode.
   */
  @SerializedName("quote_entities")
  public List<MessageEntity> quoteEntities;

  /** Optional. Position of the quote in the original message in UTF-16 code units */
  @SerializedName("quote_position")
  public Integer quotePosition;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ReplyParameters other)) return false;
    return messageId == other.messageId
        && Objects.equals(chatId, other.chatId)
        && Objects.equals(allowSendingWithoutReply, other.allowSendingWithoutReply)
        && Objects.equals(quote, other.quote)
        && Objects.equals(quoteParseMode, other.quoteParseMode)
        && Objects.equals(quoteEntities, other.quoteEntities)
        && Objects.equals(quotePosition, other.quotePosition);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        messageId,
        chatId,
        allowSendingWithoutReply,
        quote,
        quoteParseMode,
        quoteEntities,
        quotePosition);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ReplyParameters[messageId=")
        .append(messageId)
        .append(", chatId=")
        .append(chatId)
        .append(", allowSendingWithoutReply=")
        .append(allowSendingWithoutReply)
        .append(", quote=")
        .append(quote)
        .append(", quoteParseMode=")
        .append(quoteParseMode)
        .append(", quoteEntities=")
        .append(quoteEntities)
        .append(", quotePosition=")
        .append(quotePosition)
        .append("]");
    return builder.toString();
  }
}
