package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Represents a link to a video file stored on the Telegram servers. By default, this video file
 * will be sent by the user with an optional caption. Alternatively, you can use
 * input_message_content to send a message with the specified content instead of the video.
 */
public final class InlineQueryResultCachedVideo implements InlineQueryResult {

  /** Type of the result, must be video */
  @NotNull public String type;

  /** Unique identifier for this result, 1-64 bytes */
  @NotNull public String id;

  /** A valid file identifier for the video file */
  @SerializedName("video_file_id")
  @NotNull
  public String videoFileId;

  /** Title for the result */
  @NotNull public String title;

  /** Optional. Short description of the result */
  public String description;

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

  /** Optional. Inline keyboard attached to the message */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  /** Optional. Content of the message to be sent instead of the video */
  @SerializedName("input_message_content")
  public InputMessageContent inputMessageContent;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultCachedVideo other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(videoFileId, other.videoFileId)
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
        videoFileId,
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
        .append("InlineQueryResultCachedVideo[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", videoFileId=")
        .append(videoFileId)
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
