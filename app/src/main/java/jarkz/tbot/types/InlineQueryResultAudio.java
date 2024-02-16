package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Represents a link to an MP3 audio file. By default, this audio file will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the specified content
 * instead of the audio.
 */
public final class InlineQueryResultAudio implements InlineQueryResult {

  /** Type of the result, must be audio */
  @NotNull public String type;

  /** Unique identifier for this result, 1-64 bytes */
  @NotNull public String id;

  /** A valid URL for the audio file */
  @NotNull
  @SerializedName("audio_url")
  public String audioUrl;

  /** Title */
  @NotNull public String title;

  /** Optional. Caption, 0-1024 characters after entities parsing */
  public String caption;

  /**
   * Optional. Mode for parsing entities in the audio caption. See formatting options for more
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

  /** Optional. Performer */
  public String performer;

  /** Optional. Audio duration in seconds */
  @SerializedName("audio_duration")
  public Integer audioDuration;

  /** Optional. Inline keyboard attached to the message */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  /** Optional. Content of the message to be sent instead of the audio */
  @SerializedName("input_message_content")
  public InputMessageContent inputMessageContent;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultAudio other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(audioUrl, other.audioUrl)
        && Objects.equals(title, other.title)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(performer, other.performer)
        && Objects.equals(audioDuration, other.audioDuration)
        && Objects.equals(replyMarkup, other.replyMarkup)
        && Objects.equals(inputMessageContent, other.inputMessageContent);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        type,
        id,
        audioUrl,
        title,
        caption,
        parseMode,
        captionEntities,
        performer,
        audioDuration,
        replyMarkup,
        inputMessageContent);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("InlineQueryResultAudio[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", audioUrl=")
        .append(audioUrl)
        .append(", title=")
        .append(title)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", performer=")
        .append(performer)
        .append(", audioDuration=")
        .append(audioDuration)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append(", inputMessageContent=")
        .append(inputMessageContent)
        .append("]");
    return builder.toString();
  }
}
