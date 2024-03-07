package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents a link to a sticker stored on the Telegram servers. By default, this sticker will be
 * sent by the user. Alternatively, you can use input_message_content to send a message with the
 * specified content instead of the sticker.
 */
public final class InlineQueryResultCachedSticker implements InlineQueryResult {

  public static final class Builder {

    private InlineQueryResultCachedSticker buildingType;

    public Builder() {
      buildingType = new InlineQueryResultCachedSticker();
    }

    public Builder setId(String id) {
      buildingType.id = id;
      return this;
    }

    public Builder setStickerFileId(String stickerFileId) {
      buildingType.stickerFileId = stickerFileId;
      return this;
    }

    public Builder setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      buildingType.replyMarkup = replyMarkup;
      return this;
    }

    public Builder setInputMessageContent(InputMessageContent inputMessageContent) {
      buildingType.inputMessageContent = inputMessageContent;
      return this;
    }

    public InlineQueryResultCachedSticker build() {
      return buildingType;
    }
  }

  public static final String TYPE = "sticker";

  /** Type of the result, must be sticker */
  @NotNull public final String type = TYPE;

  /** Unique identifier for this result, 1-64 bytes */
  @NotNull public String id;

  /** A valid file identifier of the sticker */
  @NotNull
  @SerializedName("sticker_file_id")
  public String stickerFileId;

  /** Optional. Inline keyboard attached to the message */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  /** Optional. Content of the message to be sent instead of the sticker */
  @SerializedName("input_message_content")
  public InputMessageContent inputMessageContent;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultCachedSticker other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(stickerFileId, other.stickerFileId)
        && Objects.equals(replyMarkup, other.replyMarkup)
        && Objects.equals(inputMessageContent, other.inputMessageContent);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, id, stickerFileId, replyMarkup, inputMessageContent);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("InlineQueryResultCachedSticker[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", stickerFileId=")
        .append(stickerFileId)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append(", inputMessageContent=")
        .append(inputMessageContent)
        .append("]");
    return builder.toString();
  }
}
