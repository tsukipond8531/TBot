package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Represents a link to a page containing an embedded video player or a video file. By default, this
 * video file will be sent by the user with an optional caption. Alternatively, you can use
 * input_message_content to send a message with the specified content instead of the video.
 */
public final class InlineQueryResultVideo implements InlineQueryResult {

  public static final String TYPE = "video";

  /** Type of the result, must be video */
  @NotNull public final String type = TYPE;

  /** Unique identifier for this result, 1-64 bytes */
  @NotNull public String id;

  /** A valid URL for the embedded video player or video file */
  @NotNull
  @SerializedName("video_url")
  public String videoUrl;

  /** MIME type of the content of the video URL, "text/html" or "video/mp4" */
  @NotNull
  @SerializedName("mime_type")
  public String mimeType;

  /** URL of the thumbnail (JPEG only) for the video */
  @NotNull
  @SerializedName("thumbnail_url")
  public String thumbnailUrl;

  /** Title for the result */
  @NotNull public String title;

  /** Optional. Caption of the video to be sent, 0-1024 characters after entities parsing */
  public String caption;

  /**
   * Optional. Mode for parsing entities in the video caption. See formatting options for more
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

  /** Optional. Video width */
  @SerializedName("video_width")
  public Integer videoWidth;

  /** Optional. Video height */
  @SerializedName("video_height")
  public Integer videoHeight;

  /** Optional. Video duration in seconds */
  @SerializedName("video_duration")
  public Integer videoDuration;

  /** Optional. Short description of the result */
  public String description;

  /** Optional. Inline keyboard attached to the message */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  /**
   * Optional. Content of the message to be sent instead of the video. This field is required if
   * InlineQueryResultVideo is used to send an HTML-page as a result (e.g., a YouTube video).
   */
  @SerializedName("input_message_content")
  public InputMessageContent inputMessageContent;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultVideo other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(videoUrl, other.videoUrl)
        && Objects.equals(mimeType, other.mimeType)
        && Objects.equals(thumbnailUrl, other.thumbnailUrl)
        && Objects.equals(title, other.title)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(videoWidth, other.videoWidth)
        && Objects.equals(videoHeight, other.videoHeight)
        && Objects.equals(videoDuration, other.videoDuration)
        && Objects.equals(description, other.description)
        && Objects.equals(replyMarkup, other.replyMarkup)
        && Objects.equals(inputMessageContent, other.inputMessageContent);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        type,
        id,
        videoUrl,
        mimeType,
        thumbnailUrl,
        title,
        caption,
        parseMode,
        captionEntities,
        videoWidth,
        videoHeight,
        videoDuration,
        description,
        replyMarkup,
        inputMessageContent);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("InlineQueryResultVideo[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", videoUrl=")
        .append(videoUrl)
        .append(", mimeType=")
        .append(mimeType)
        .append(", thumbnailUrl=")
        .append(thumbnailUrl)
        .append(", title=")
        .append(title)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", videoWidth=")
        .append(videoWidth)
        .append(", videoHeight=")
        .append(videoHeight)
        .append(", videoDuration=")
        .append(videoDuration)
        .append(", description=")
        .append(description)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append(", inputMessageContent=")
        .append(inputMessageContent)
        .append("]");
    return builder.toString();
  }
}
