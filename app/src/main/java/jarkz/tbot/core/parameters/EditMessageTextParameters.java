package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to edit text and game messages. On success, if the edited message is not an
 * inline message, the edited Message is returned, otherwise True is returned.
 */
public final class EditMessageTextParameters {

  /**
   * Required if inline_message_id is not specified. Unique identifier for the target chat or
   * username of the target channel (in the format @channelusername)
   */
  @SerializedName("chat_id")
  public String chatId;

  /** Required if inline_message_id is not specified. Identifier of the message to edit */
  @SerializedName("message_id")
  public Integer messageId;

  /** Required if chat_id and message_id are not specified. Identifier of the inline message */
  @SerializedName("inline_message_id")
  public String inlineMessageId;

  /** New text of the message, 1-4096 characters after entities parsing */
  @NotNull public String text;

  /** Mode for parsing entities in the message text. See formatting options for more details. */
  @SerializedName("parse_mode")
  public String parseMode;

  /**
   * A JSON-serialized list of special entities that appear in message text, which can be specified
   * instead of parse_mode
   */
  public List<MessageEntity> entities;

  /** Link preview generation options for the message */
  @SerializedName("link_preview_options")
  public LinkPreviewOptions linkPreviewOptions;

  /** A JSON-serialized object for an inline keyboard. */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof EditMessageTextParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageId, other.messageId)
        && Objects.equals(inlineMessageId, other.inlineMessageId)
        && Objects.equals(text, other.text)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(entities, other.entities)
        && Objects.equals(linkPreviewOptions, other.linkPreviewOptions)
        && Objects.equals(replyMarkup, other.replyMarkup);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chatId,
        messageId,
        inlineMessageId,
        text,
        parseMode,
        entities,
        linkPreviewOptions,
        replyMarkup);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("EditMessageTextParameters[chatId=")
        .append(chatId)
        .append(", messageId=")
        .append(messageId)
        .append(", inlineMessageId=")
        .append(inlineMessageId)
        .append(", text=")
        .append(text)
        .append(", parseMode=")
        .append(parseMode)
        .append(", entities=")
        .append(entities)
        .append(", linkPreviewOptions=")
        .append(linkPreviewOptions)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append("]");
    return builder.toString();
  }
}
