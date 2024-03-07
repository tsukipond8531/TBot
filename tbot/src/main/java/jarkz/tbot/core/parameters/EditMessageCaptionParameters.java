package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jarkz.tbot.types.Id;
import jarkz.tbot.types.InlineKeyboardMarkup;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to edit captions of messages. On success, if the edited message is not an inline
 * message, the edited Message is returned, otherwise True is returned.
 */
public final class EditMessageCaptionParameters {

  public static final class Builder {

    private EditMessageCaptionParameters buildingType;

    public Builder() {
      buildingType = new EditMessageCaptionParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageId(Integer messageId) {
      buildingType.messageId = messageId;
      return this;
    }

    public Builder setInlineMessageId(String inlineMessageId) {
      buildingType.inlineMessageId = inlineMessageId;
      return this;
    }

    public Builder setCaption(String caption) {
      buildingType.caption = caption;
      return this;
    }

    public Builder setParseMode(String parseMode) {
      buildingType.parseMode = parseMode;
      return this;
    }

    public Builder setCaptionEntities(List<MessageEntity> captionEntities) {
      buildingType.captionEntities = captionEntities;
      return this;
    }

    public Builder setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      buildingType.replyMarkup = replyMarkup;
      return this;
    }

    public EditMessageCaptionParameters build() {
      return buildingType;
    }
  }

  /**
   * Required if inline_message_id is not specified. Unique identifier for the target chat or
   * username of the target channel (in the format @channelusername)
   */
  @SerializedName("chat_id")
  public Id chatId;

  /** Required if inline_message_id is not specified. Identifier of the message to edit */
  @SerializedName("message_id")
  public Integer messageId;

  /** Required if chat_id and message_id are not specified. Identifier of the inline message */
  @SerializedName("inline_message_id")
  public String inlineMessageId;

  /** New caption of the message, 0-1024 characters after entities parsing */
  public String caption;

  /** Mode for parsing entities in the message caption. See formatting options for more details. */
  @SerializedName("parse_mode")
  public String parseMode;

  /**
   * A JSON-serialized list of special entities that appear in the caption, which can be specified
   * instead of parse_mode
   */
  @SerializedName("caption_entities")
  public List<MessageEntity> captionEntities;

  /** A JSON-serialized object for an inline keyboard. */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof EditMessageCaptionParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageId, other.messageId)
        && Objects.equals(inlineMessageId, other.inlineMessageId)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(replyMarkup, other.replyMarkup);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chatId, messageId, inlineMessageId, caption, parseMode, captionEntities, replyMarkup);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("EditMessageCaptionParameters[chatId=")
        .append(chatId)
        .append(", messageId=")
        .append(messageId)
        .append(", inlineMessageId=")
        .append(inlineMessageId)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append("]");
    return builder.toString();
  }
}
