package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.core.parameters.Media;
import java.util.List;
import java.util.Objects;

/** Represents an audio file to be treated as music to be sent. */
public final class InputMediaAudio implements InputMedia, Media {

  /** Type of the result, must be audio */
  @NotNull public String type;

  /**
   * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
   * pass an HTTP URL for Telegram to get a file from the Internet, or pass
   * "attach://<file_attach_name>" to upload a new one using multipart/form-data under
   * <file_attach_name> name. More information on Sending Files:
   * https://core.telegram.org/bots/api#sending-files
   */
  @NotNull public String media;

  /**
   * Optional. Thumbnail of the file sent; can be ignored if thumbnail generation for the file is
   * supported server-side. The thumbnail should be in JPEG format and less than 200 kB in size. A
   * thumbnail's width and height should not exceed 320. Ignored if the file is not uploaded using
   * multipart/form-data. Thumbnails can't be reused and can be only uploaded as a new file, so you
   * can pass "attach://<file_attach_name>" if the thumbnail was uploaded using multipart/form-data
   * under <file_attach_name>. More information on Sending Files:
   * https://core.telegram.org/bots/api#sending-files
   */
  public InputFile thumbnail;

  /** Optional. Caption of the audio to be sent, 0-1024 characters after entities parsing */
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

  /** Optional. Duration of the audio in seconds */
  public Integer duration;

  /** Optional. Performer of the audio */
  public String performer;

  /** Optional. Title of the audio */
  public String title;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputMediaAudio other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(media, other.media)
        && Objects.equals(thumbnail, other.thumbnail)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(duration, other.duration)
        && Objects.equals(performer, other.performer)
        && Objects.equals(title, other.title);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        type, media, thumbnail, caption, parseMode, captionEntities, duration, performer, title);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("InputMediaAudio[type=")
        .append(type)
        .append(", media=")
        .append(media)
        .append(", thumbnail=")
        .append(thumbnail)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", duration=")
        .append(duration)
        .append(", performer=")
        .append(performer)
        .append(", title=")
        .append(title)
        .append("]");
    return builder.toString();
  }
}
