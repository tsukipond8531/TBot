package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Represents a link to a video animation (H.264/MPEG-4 AVC video without sound). By default, this
 * animated MPEG-4 file will be sent by the user with optional caption. Alternatively, you can use
 * input_message_content to send a message with the specified content instead of the animation.
 */
public final class InlineQueryResultMpeg4Gif implements InlineQueryResult {

  public static final class Builder {

    private InlineQueryResultMpeg4Gif buildingType;

    public Builder() {
      buildingType = new InlineQueryResultMpeg4Gif();
    }

    public Builder setId(String id) {
      buildingType.id = id;
      return this;
    }

    public Builder setMpeg4Url(String mpeg4Url) {
      buildingType.mpeg4Url = mpeg4Url;
      return this;
    }

    public Builder setMpeg4Width(Integer mpeg4Width) {
      buildingType.mpeg4Width = mpeg4Width;
      return this;
    }

    public Builder setMpeg4Height(Integer mpeg4Height) {
      buildingType.mpeg4Height = mpeg4Height;
      return this;
    }

    public Builder setMpeg4Duration(Integer mpeg4Duration) {
      buildingType.mpeg4Duration = mpeg4Duration;
      return this;
    }

    public Builder setThumbnailUrl(String thumbnailUrl) {
      buildingType.thumbnailUrl = thumbnailUrl;
      return this;
    }

    public Builder setThumbnailMimeType(String thumbnailMimeType) {
      buildingType.thumbnailMimeType = thumbnailMimeType;
      return this;
    }

    public Builder setTitle(String title) {
      buildingType.title = title;
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

    public Builder setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      buildingType.replyMarkup = replyMarkup;
      return this;
    }

    public Builder setInputMessageContent(InputMessageContent inputMessageContent) {
      buildingType.inputMessageContent = inputMessageContent;
      return this;
    }

    public InlineQueryResultMpeg4Gif build() {
      return buildingType;
    }
  }

  public static final String TYPE = "mpeg4_gif";

  /** Type of the result, must be mpeg4_gif */
  @NotNull public final String type = TYPE;

  /** Unique identifier for this result, 1-64 bytes */
  @NotNull public String id;

  /** A valid URL for the MPEG4 file. File size must not exceed 1MB */
  @NotNull
  @SerializedName("mpeg4_url")
  public String mpeg4Url;

  /** Optional. Video width */
  @SerializedName("mpeg4_width")
  public Integer mpeg4Width;

  /** Optional. Video height */
  @SerializedName("mpeg4_height")
  public Integer mpeg4Height;

  /** Optional. Video duration in seconds */
  @SerializedName("mpeg4_duration")
  public Integer mpeg4Duration;

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

  /** Optional. Caption of the MPEG-4 file to be sent, 0-1024 characters after entities parsing */
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

  /** Optional. Content of the message to be sent instead of the video animation */
  @SerializedName("input_message_content")
  public InputMessageContent inputMessageContent;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultMpeg4Gif other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(mpeg4Url, other.mpeg4Url)
        && Objects.equals(mpeg4Width, other.mpeg4Width)
        && Objects.equals(mpeg4Height, other.mpeg4Height)
        && Objects.equals(mpeg4Duration, other.mpeg4Duration)
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
        mpeg4Url,
        mpeg4Width,
        mpeg4Height,
        mpeg4Duration,
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
        .append("InlineQueryResultMpeg4Gif[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", mpeg4Url=")
        .append(mpeg4Url)
        .append(", mpeg4Width=")
        .append(mpeg4Width)
        .append(", mpeg4Height=")
        .append(mpeg4Height)
        .append(", mpeg4Duration=")
        .append(mpeg4Duration)
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
