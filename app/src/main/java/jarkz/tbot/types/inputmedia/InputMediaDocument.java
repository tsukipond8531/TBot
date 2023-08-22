package jarkz.tbot.types.inputmedia;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InputFile;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a general file to be sent.
 *
 * @author Pavel Bialiauski
 */
public class InputMediaDocument implements InputMedia {

  /**
   * Type of {@link InputMedia}. Always "document".
   */
  protected static final String TYPE = "document";

  private final String type = InputMediaDocument.TYPE;

  @NotNull private String media;

  private InputFile thumbnail;

  private String caption;

  @SerializedName("parse_mode")
  private String parseMode;

  @SerializedName("caption_entities")
  private List<MessageEntity> captionEntities;

  @SerializedName("disable_content_type_detection")
  private Boolean disableContentTypeDetection;

  /** Default constructor. */
  public InputMediaDocument() {}

  /**
   * Type of the result, must be <i>document</i>.
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
   * <i>Optional.</i> Caption of the document to be sent, 0-1024 characters after entities parsing.
   *
   * @return an optional value of caption as String.
   */
  public Optional<String> getCaption() {
    return Optional.of(caption);
  }

  /**
   * Sets the caption of the document to be sent, 0-1024 characters after entities parsing.
   *
   * @param caption the caption of the document to be sent (0-1024 characters after entities parsing)
   *     as String or null if it is not required.
   */
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * <i>Optional.</i> Mode for parsing entities in the document caption.
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
   * Sets the mode for parsing entities in the document caption.
   *
   * <p>See <a href="https://core.telegram.org/bots/api#formatting-options">formatting options</a>
   * for more details.
   *
   * @param parseMode the mode for parsing entities in the document caption as String or null if
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
   * <i>Optional.</i> Disables automatic server-side content type detection for files uploaded using
   * multipart/form-data. Always <i>True</i>, if the document is sent as part of an album.
   *
   * @return an optional value of disable_content_type_detection as Boolean.
   */
  public Optional<Boolean> getDisableContentTypeDetection() {
    return Optional.of(disableContentTypeDetection);
  }

  /**
   * Sets the disabling automatic server-side content type detection for files uploaded using
   * multipart/form-data. Always <i>True</i>, if the document is sent as part of an album.
   *
   * @param disableContentTypeDetection true if disable automatic server-side content type detection
   *     for files, otherwise - false or null.
   */
  public void setDisableContentTypeDetection(Boolean disableContentTypeDetection) {
    this.disableContentTypeDetection = disableContentTypeDetection;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        type, media, thumbnail, caption, parseMode, captionEntities, disableContentTypeDetection);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputMediaDocument other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(media, other.media)
        && Objects.equals(thumbnail, other.thumbnail)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(disableContentTypeDetection, other.disableContentTypeDetection);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InputMediaDocument[type=")
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
        .append(", disableContentTypeDetection=")
        .append(disableContentTypeDetection)
        .append("]");
    return builder.toString();
  }
}
