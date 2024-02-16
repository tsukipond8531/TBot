package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** Represents the content of a text message to be sent as the result of an inline query. */
public final class InputTextMessageContent implements InputMessageContent {

  /** Text of the message to be sent, 1-4096 characters */
  @NotNull
  @SerializedName("message_text")
  public String messageText;

  /**
   * Optional. Mode for parsing entities in the message text. See formatting options for more
   * details.
   */
  @SerializedName("parse_mode")
  public String parseMode;

  /**
   * Optional. List of special entities that appear in message text, which can be specified instead
   * of parse_mode
   */
  public List<MessageEntity> entities;

  /** Optional. Link preview generation options for the message */
  @SerializedName("link_preview_options")
  public LinkPreviewOptions linkPreviewOptions;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputTextMessageContent other)) return false;
    return Objects.equals(messageText, other.messageText)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(entities, other.entities)
        && Objects.equals(linkPreviewOptions, other.linkPreviewOptions);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(messageText, parseMode, entities, linkPreviewOptions);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("InputTextMessageContent[messageText=")
        .append(messageText)
        .append(", parseMode=")
        .append(parseMode)
        .append(", entities=")
        .append(entities)
        .append(", linkPreviewOptions=")
        .append(linkPreviewOptions)
        .append("]");
    return builder.toString();
  }
}
