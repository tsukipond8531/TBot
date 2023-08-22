package jarkz.tbot.types.inputmedia;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a photo to be sent.
 *
 * @author Pavel Bialiauski
 */
public class InputMediaPhoto implements InputMedia {

  /**
   * Type of {@link InputMedia}. Always "photo".
   */
  protected static final String TYPE = "photo";

  private final String type = InputMediaPhoto.TYPE;

  @NotNull private String media;

  private String caption;

  @SerializedName("parse_mode")
  private String parseMode;

  @SerializedName("caption_entities")
  private List<MessageEntity> captionEntities;

  @SerializedName("has_spoiler")
  private Boolean hasSpoiler;

  /** Default constructor. */
  public InputMediaPhoto() {}

  /**
   * Type of the result, must be <i>photo</i>.
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
   * <i>Optional.</i> Caption of the photo to be sent, 0-1024 characters after entities parsing.
   *
   * @return an optional value of caption as String.
   */
  public Optional<String> getCaption() {
    return Optional.of(caption);
  }

  /**
   * Sets the caption of the photo to be sent, 0-1024 characters after entities parsing.
   *
   * @param caption the caption of the photo to be sent (0-1024 characters after entities parsing)
   *     as String or null if it doesn't exists.
   */
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * <i>Optional.</i> Mode for parsing entities in the photo caption.
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
   * Sets the mode for parsing entities in the photo caption.
   *
   * <p>See <a href="https://core.telegram.org/bots/api#formatting-options">formatting options</a>
   * for more details.
   *
   * @param parseMode the mode for parsing entities in the photo caption as String or null if
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
   * <i>Optional.</i> <i>True</i> if the photo needs to be covered with a spoiler animation.
   *
   * @return an optional value of has_spoiler as Boolean.
   */
  public Optional<Boolean> getHasSpoiler() {
    return Optional.of(hasSpoiler);
  }

  /**
   * Pass <i>True</i> if the photo needs to be covered with a spoiler animation.
   *
   * @param hasSpoiler true if the photo needs to be covered with a spoiler animation, otherwise -
   *     false or null.
   */
  public void setHasSpoiler(Boolean hasSpoiler) {
    this.hasSpoiler = hasSpoiler;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, media, caption, parseMode, captionEntities, hasSpoiler);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputMediaPhoto other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(media, other.media)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(hasSpoiler, other.hasSpoiler);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InputMediaPhoto[type=")
        .append(type)
        .append(", media=")
        .append(media)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", hasSpoiler=")
        .append(hasSpoiler)
        .append("]");
    return builder.toString();
  }
}
