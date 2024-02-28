package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InlineKeyboardMarkup;
import jarkz.tbot.types.InputMedia;
import java.util.Objects;

/**
 * Use this method to edit animation, audio, document, photo, or video messages. If a message is
 * part of a message album, then it can be edited only to an audio for audio albums, only to a
 * document for document albums and to a photo or a video otherwise. When an inline message is
 * edited, a new file can't be uploaded; use a previously uploaded file via its file_id or specify a
 * URL. On success, if the edited message is not an inline message, the edited Message is returned,
 * otherwise True is returned.
 */
public final class EditMessageMediaParameters {

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

  /** A JSON-serialized object for a new media content of the message */
  @NotNull public InputMedia media;

  /** A JSON-serialized object for a new inline keyboard. */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof EditMessageMediaParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageId, other.messageId)
        && Objects.equals(inlineMessageId, other.inlineMessageId)
        && Objects.equals(media, other.media)
        && Objects.equals(replyMarkup, other.replyMarkup);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, messageId, inlineMessageId, media, replyMarkup);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("EditMessageMediaParameters[chatId=")
        .append(chatId)
        .append(", messageId=")
        .append(messageId)
        .append(", inlineMessageId=")
        .append(inlineMessageId)
        .append(", media=")
        .append(media)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append("]");
    return builder.toString();
  }
}
