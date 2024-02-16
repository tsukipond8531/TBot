package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Represents a link to a photo. By default, this photo will be sent by the user with optional
 * caption. Alternatively, you can use input_message_content to send a message with the specified
 * content instead of the photo.
 */
public final class InlineQueryResultPhoto implements InlineQueryResult {

  /** Type of the result, must be photo */
  @NotNull public String type;

  /** Unique identifier for this result, 1-64 bytes */
  @NotNull public String id;

  /** A valid URL of the photo. Photo must be in JPEG format. Photo size must not exceed 5MB */
  @NotNull
  @SerializedName("photo_url")
  public String photoUrl;

  /** URL of the thumbnail for the photo */
  @NotNull
  @SerializedName("thumbnail_url")
  public String thumbnailUrl;

  /** Optional. Width of the photo */
  @SerializedName("photo_width")
  public Integer photoWidth;

  /** Optional. Height of the photo */
  @SerializedName("photo_height")
  public Integer photoHeight;

  /** Optional. Title for the result */
  public String title;

  /** Optional. Short description of the result */
  public String description;

  /** Optional. Caption of the photo to be sent, 0-1024 characters after entities parsing */
  public String caption;

  /**
   * Optional. Mode for parsing entities in the photo caption. See formatting options for more
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

  /** Optional. Inline keyboard attached to the message */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  /** Optional. Content of the message to be sent instead of the photo */
  @SerializedName("input_message_content")
  public InputMessageContent inputMessageContent;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultPhoto other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(photoUrl, other.photoUrl)
        && Objects.equals(thumbnailUrl, other.thumbnailUrl)
        && Objects.equals(photoWidth, other.photoWidth)
        && Objects.equals(photoHeight, other.photoHeight)
        && Objects.equals(title, other.title)
        && Objects.equals(description, other.description)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(replyMarkup, other.replyMarkup)
        && Objects.equals(inputMessageContent, other.inputMessageContent);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        type,
        id,
        photoUrl,
        thumbnailUrl,
        photoWidth,
        photoHeight,
        title,
        description,
        caption,
        parseMode,
        captionEntities,
        replyMarkup,
        inputMessageContent);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("InlineQueryResultPhoto[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", photoUrl=")
        .append(photoUrl)
        .append(", thumbnailUrl=")
        .append(thumbnailUrl)
        .append(", photoWidth=")
        .append(photoWidth)
        .append(", photoHeight=")
        .append(photoHeight)
        .append(", title=")
        .append(title)
        .append(", description=")
        .append(description)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append(", inputMessageContent=")
        .append(inputMessageContent)
        .append("]");
    return builder.toString();
  }
}
