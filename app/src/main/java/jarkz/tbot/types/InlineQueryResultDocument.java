package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Represents a link to a file. By default, this file will be sent by the user with an optional
 * caption. Alternatively, you can use input_message_content to send a message with the specified
 * content instead of the file. Currently, only .PDF and .ZIP files can be sent using this method.
 */
public final class InlineQueryResultDocument implements InlineQueryResult {

  /** Type of the result, must be document */
  @NotNull public String type;

  /** Unique identifier for this result, 1-64 bytes */
  @NotNull public String id;

  /** Title for the result */
  @NotNull public String title;

  /** Optional. Caption of the document to be sent, 0-1024 characters after entities parsing */
  public String caption;

  /**
   * Optional. Mode for parsing entities in the document caption. See formatting options for more
   * details.
   */
  @SerializedName("parse_mode")
  public String parseMode;

  /**
   * Optional. List of special entities that appear in the caption, which can be specified instead
   * of parse_mode
   */
  @SerializedName("caption_entities")
  public List<MessageEntity> captionEntities;

  /** A valid URL for the file */
  @NotNull
  @SerializedName("document_url")
  public String documentUrl;

  /** MIME type of the content of the file, either "application/pdf" or "application/zip" */
  @NotNull
  @SerializedName("mime_type")
  public String mimeType;

  /** Optional. Short description of the result */
  public String description;

  /** Optional. Inline keyboard attached to the message */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  /** Optional. Content of the message to be sent instead of the file */
  @SerializedName("input_message_content")
  public InputMessageContent inputMessageContent;

  /** Optional. URL of the thumbnail (JPEG only) for the file */
  @SerializedName("thumbnail_url")
  public String thumbnailUrl;

  /** Optional. Thumbnail width */
  @SerializedName("thumbnail_width")
  public Integer thumbnailWidth;

  /** Optional. Thumbnail height */
  @SerializedName("thumbnail_height")
  public Integer thumbnailHeight;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultDocument other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(title, other.title)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(documentUrl, other.documentUrl)
        && Objects.equals(mimeType, other.mimeType)
        && Objects.equals(description, other.description)
        && Objects.equals(replyMarkup, other.replyMarkup)
        && Objects.equals(inputMessageContent, other.inputMessageContent)
        && Objects.equals(thumbnailUrl, other.thumbnailUrl)
        && Objects.equals(thumbnailWidth, other.thumbnailWidth)
        && Objects.equals(thumbnailHeight, other.thumbnailHeight);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        type,
        id,
        title,
        caption,
        parseMode,
        captionEntities,
        documentUrl,
        mimeType,
        description,
        replyMarkup,
        inputMessageContent,
        thumbnailUrl,
        thumbnailWidth,
        thumbnailHeight);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("InlineQueryResultDocument[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", title=")
        .append(title)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", documentUrl=")
        .append(documentUrl)
        .append(", mimeType=")
        .append(mimeType)
        .append(", description=")
        .append(description)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append(", inputMessageContent=")
        .append(inputMessageContent)
        .append(", thumbnailUrl=")
        .append(thumbnailUrl)
        .append(", thumbnailWidth=")
        .append(thumbnailWidth)
        .append(", thumbnailHeight=")
        .append(thumbnailHeight)
        .append("]");
    return builder.toString();
  }
}
