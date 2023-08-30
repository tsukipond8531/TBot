package jarkz.tbot.types.inputmedia;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InputFile;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a video to be sent.
 *
 * @author Pavel Bialiauski
 */
public class InputMediaVideo implements InputMedia {

  /** Type of {@link InputMedia}. Always "video". */
  protected static final String TYPE = "video";

  private final String type = InputMediaVideo.TYPE;

  @NotNull private String media;

  private InputFile thumbnail;

  private String caption;

  @SerializedName("parse_mode")
  private String parseMode;

  @SerializedName("caption_entities")
  private List<MessageEntity> captionEntities;

  private Integer width;

  private Integer height;

  private Integer duration;

  @SerializedName("supports_streaming")
  private Boolean supportsStreaming;

  @SerializedName("has_spoiler")
  private Boolean hasSpoiler;

  /** Default constructor. */
  public InputMediaVideo() {}

  /**
   * Type of the result, must be <i>video</i>.
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  /**
   * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
   * pass an HTTP URL for Telegram to get a file from the Internet, or pass
   * “attach://&lt;file_attach_name&gt;” to upload a new one using multipart/form-data under
   * &lt;file_attach_name&gt; name.
   *
   * <p><a href="https://core.telegram.org/bots/api#sending-files">More information on Sending Files
   * »</a>.
   *
   * @return media as String.
   */
  public String getMedia() {
    return media;
  }

  /**
   * Sets the file to send. Pass a file_id to send a file that exists on the Telegram servers
   * (recommended), pass an HTTP URL for Telegram to get a file from the Internet, or pass
   * “attach://&lt;file_attach_name&gt;” to upload a new one using multipart/form-data under
   * &lt;file_attach_name&gt; name.
   *
   * <p><a href="https://core.telegram.org/bots/api#sending-files">More information on Sending Files
   * »</a>.
   *
   * @param media the file to send as String.
   */
  public void setMedia(String media) {
    this.media = media;
  }

  /**
   * <i>Optional.</i> Thumbnail of the file sent; can be ignored if thumbnail generation for the
   * file is supported server-side.
   *
   * <p>The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's width and
   * height should not exceed 320. Ignored if the file is not uploaded using multipart/form-data.
   * Thumbnails can't be reused and can be only uploaded as a new file, so you can pass
   * “attach://&lt;file_attach_name&gt;” if the thumbnail was uploaded using multipart/form-data
   * under &lt;file_attach_name&gt;.
   *
   * <p><a href="https://core.telegram.org/bots/api#sending-files">More information on Sending Files
   * »</a>.
   *
   * @return an optional value of thumbnail as {@link InputFile}.
   */
  public Optional<InputFile> getThumbnail() {
    return Optional.of(thumbnail);
  }

  /**
   * Sets the thumbnail of the file sent; can be ignored if thumbnail generation for the file is
   * supported server-side.
   *
   * <p>The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's width and
   * height should not exceed 320. Ignored if the file is not uploaded using multipart/form-data.
   * Thumbnails can't be reused and can be only uploaded as a new file, so you can pass
   * “attach://&lt;file_attach_name&gt;” if the thumbnail was uploaded using multipart/form-data
   * under &lt;file_attach_name&gt;.
   *
   * <p><a href="https://core.telegram.org/bots/api#sending-files">More information on Sending Files
   * »</a>.
   *
   * @param thumbnail the thumbnail of the file sent as {@link InputFile} or null if thumbnail
   *     generation for the file is supported server-side.
   */
  public void setThumbnail(InputFile thumbnail) {
    this.thumbnail = thumbnail;
  }

  /**
   * <i>Optional.</i> Caption of the video to be sent, 0-1024 characters after entities parsing.
   *
   * @return an optional value of caption as String.
   */
  public Optional<String> getCaption() {
    return Optional.of(caption);
  }

  /**
   * Sets the caption of the video to be sent, 0-1024 characters after entities parsing.
   *
   * @param caption the caption of the video to be sent (0-1024 characters after entities parsing)
   *     as String or null if it is not required.
   */
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * <i>Optional.</i> Mode for parsing entities in the video caption.
   *
   * <p>See <a href="https://core.telegram.org/bots/api#formatting-options">formatting options</a>
   * for more details.
   *
   * @return an optional value of parse_mode as String.
   */
  public Optional<String> getParseMode() {
    return Optional.of(parseMode);
  }

  /**
   * Sets the mode for parsing entities in the video caption.
   *
   * <p>See <a href="https://core.telegram.org/bots/api#formatting-options">formatting options</a>
   * for more details.
   *
   * @param parseMode the mode for parsing entities in the video caption as String or null if
   *     captions doesn't exists.
   */
  public void setParseMode(String parseMode) {
    this.parseMode = parseMode;
  }

  /**
   * <i>Optional.</i> List of special entities that appear in the caption, which can be specified
   * instead of <i>parse_mode</i>.
   *
   * @return an optional value of caption_entities as {@link List}&lt;{@link MessageEntity}&gt;.
   */
  public Optional<List<MessageEntity>> getCaptionEntities() {
    return Optional.of(captionEntities);
  }

  /**
   * Sets the list of special entities that appear in the caption, which can be specified instead of
   * <i>parse_mode</i>.
   *
   * @param captionEntities the list of special entities that appear in the caption as {@link
   *     List}&lt;{@link MessageEntity}&gt; or null if captions doesn't exists or parse mode is
   *     provided.
   */
  public void setCaptionEntities(List<MessageEntity> captionEntities) {
    this.captionEntities = captionEntities;
  }

  /**
   * <i>Optional.</i> Video width.
   *
   * @return an optional value of width as Integer.
   */
  public Optional<Integer> getWidth() {
    return Optional.of(width);
  }

  /**
   * Sets the video width.
   *
   * @param width the video width as Integer or null if it doesn't provided.
   */
  public void setWidth(Integer width) {
    this.width = width;
  }

  /**
   * <i>Optional.</i> Video height.
   *
   * @return an optional value of height as Integer.
   */
  public Optional<Integer> getHeight() {
    return Optional.of(height);
  }

  /**
   * Sets the video height.
   *
   * @param height the video height as Integer or null if it doesn't provided.
   */
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * <i>Optional.</i> Video duration in seconds.
   *
   * @return an optional value of duration as Integer.
   */
  public Optional<Integer> getDuration() {
    return Optional.of(duration);
  }

  /**
   * Sets the video duration in seconds.
   *
   * @param duration the video duration in seconds as Integer or null if it doesn't provided.
   */
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  /**
   * <i>Optional.</i> <i>True</i> if the uploaded video is suitable for streaming.
   *
   * @return an optional value of supports_streaming as Boolean.
   */
  public Optional<Boolean> getSupportsStreaming() {
    return Optional.of(supportsStreaming);
  }

  /**
   * Pass <i>True</i> if the uploaded video is suitable for streaming.
   *
   * @param supportsStreaming true if the uploaded video is suitable for streaming, otherwise -
   *     false or null.
   */
  public void setSupportsStreaming(Boolean supportsStreaming) {
    this.supportsStreaming = supportsStreaming;
  }

  /**
   * <i>Optional.</i> <i>True</i> if the video needs to be covered with a spoiler animation.
   *
   * @return an optional value of has_spoiler as Boolean.
   */
  public Optional<Boolean> getHasSpoiler() {
    return Optional.of(hasSpoiler);
  }

  /**
   * Pass <i>True</i> if the video needs to be covered with a spoiler animation.
   *
   * @param hasSpoiler true if the video needs to be covered with a spoiler animation, otherwise -
   *     false or null.
   */
  public void setHasSpoiler(Boolean hasSpoiler) {
    this.hasSpoiler = hasSpoiler;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        type,
        media,
        thumbnail,
        caption,
        parseMode,
        captionEntities,
        width,
        height,
        duration,
        supportsStreaming,
        hasSpoiler);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputMediaVideo other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(media, other.media)
        && Objects.equals(thumbnail, other.thumbnail)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(width, other.width)
        && Objects.equals(height, other.height)
        && Objects.equals(duration, other.duration)
        && Objects.equals(supportsStreaming, other.supportsStreaming)
        && Objects.equals(hasSpoiler, other.hasSpoiler);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InputMediaVideo[type=")
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
        .append(", width=")
        .append(width)
        .append(", height=")
        .append(height)
        .append(", duration=")
        .append(duration)
        .append(", supportsStreaming=")
        .append(supportsStreaming)
        .append(", hasSpoiler=")
        .append(hasSpoiler)
        .append("]");
    return builder.toString();
  }
}
