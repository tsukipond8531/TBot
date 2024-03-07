package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** Represents a photo to be sent. */
public final class InputMediaPhoto implements InputMedia, Media {

  public static final class Builder {

    private InputMediaPhoto buildingType;

    public Builder() {
      buildingType = new InputMediaPhoto();
    }

    public Builder setMedia(InputFile media) {
      buildingType.media = media;
      return this;
    }

    public Builder setCaption(String caption) {
      buildingType.caption = caption;
      return this;
    }

    public Builder setParseMode(String parseMode) {
      buildingType.parseMode = parseMode;
      return this;
    }

    public Builder setCaptionEntities(List<MessageEntity> captionEntities) {
      buildingType.captionEntities = captionEntities;
      return this;
    }

    public Builder setHasSpoiler(Boolean hasSpoiler) {
      buildingType.hasSpoiler = hasSpoiler;
      return this;
    }

    public InputMediaPhoto build() {
      return buildingType;
    }
  }

  public static final String TYPE = "photo";

  /** Type of the result, must be photo */
  @NotNull public final String type = TYPE;

  /**
   * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
   * pass an HTTP URL for Telegram to get a file from the Internet, or pass
   * "attach://<file_attach_name>" to upload a new one using multipart/form-data under
   * <file_attach_name> name. More information on Sending Files:
   * https://core.telegram.org/bots/api#sending-files
   */
  @NotNull public InputFile media;

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

  /** Optional. Pass True if the photo needs to be covered with a spoiler animation */
  @SerializedName("has_spoiler")
  public Boolean hasSpoiler;

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
  public final int hashCode() {
    return Objects.hash(type, media, caption, parseMode, captionEntities, hasSpoiler);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
