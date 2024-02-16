package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Represents a link to an animated GIF file. By default, this animated GIF file will be sent by the
 * user with optional caption. Alternatively, you can use input_message_content to send a message
 * with the specified content instead of the animation.
 */
public final class InlineQueryResultGif implements InlineQueryResult {

  /** Type of the result, must be gif */
  @NotNull public String type;

  /** Unique identifier for this result, 1-64 bytes */
  @NotNull public String id;

  /** A valid URL for the GIF file. File size must not exceed 1MB */
  @NotNull
  @SerializedName("gif_url")
  public String gifUrl;

  /** Optional. Width of the GIF */
  @SerializedName("gif_width")
  public Integer gifWidth;

  /** Optional. Height of the GIF */
  @SerializedName("gif_height")
  public Integer gifHeight;

  /** Optional. Duration of the GIF in seconds */
  @SerializedName("gif_duration")
  public Integer gifDuration;

  /** URL of the static (JPEG or GIF) or animated (MPEG4) thumbnail for the result */
  @NotNull
  @SerializedName("thumbnail_url")
  public String thumbnailUrl;

  /**
   * Optional. MIME type of the thumbnail, must be one of "image/jpeg", "image/gif", or "video/mp4".
   * Defaults to "image/jpeg"
   */
  @SerializedName("thumbnail_mime_type")
  public String thumbnailMimeType;

  /** Optional. Title for the result */
  public String title;

  /** Optional. Caption of the GIF file to be sent, 0-1024 characters after entities parsing */
  public String caption;

  /**
   * Optional. Mode for parsing entities in the caption. See formatting options for more details.
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

  /** Optional. Content of the message to be sent instead of the GIF animation */
  @SerializedName("input_message_content")
  public InputMessageContent inputMessageContent;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultGif other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(gifUrl, other.gifUrl)
        && Objects.equals(gifWidth, other.gifWidth)
        && Objects.equals(gifHeight, other.gifHeight)
        && Objects.equals(gifDuration, other.gifDuration)
        && Objects.equals(thumbnailUrl, other.thumbnailUrl)
        && Objects.equals(thumbnailMimeType, other.thumbnailMimeType)
        && Objects.equals(title, other.title)
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
        gifUrl,
        gifWidth,
        gifHeight,
        gifDuration,
        thumbnailUrl,
        thumbnailMimeType,
        title,
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
        .append("InlineQueryResultGif[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", gifUrl=")
        .append(gifUrl)
        .append(", gifWidth=")
        .append(gifWidth)
        .append(", gifHeight=")
        .append(gifHeight)
        .append(", gifDuration=")
        .append(gifDuration)
        .append(", thumbnailUrl=")
        .append(thumbnailUrl)
        .append(", thumbnailMimeType=")
        .append(thumbnailMimeType)
        .append(", title=")
        .append(title)
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
