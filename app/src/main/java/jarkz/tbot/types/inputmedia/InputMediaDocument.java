package jarkz.tbot.types.inputmedia;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InputFile;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class InputMediaDocument implements InputMedia {

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

  public InputMediaDocument() {}

  public String getType() {
    return type;
  }

  public String getMedia() {
    return media;
  }

  public void setMedia(String media) {
    this.media = media;
  }

  public Optional<InputFile> getThumbnail() {
    return Optional.of(thumbnail);
  }

  public void setThumbnail(InputFile thumbnail) {
    this.thumbnail = thumbnail;
  }

  public Optional<String> getCaption() {
    return Optional.of(caption);
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public Optional<String> getParseMode() {
    return Optional.of(parseMode);
  }

  public void setParseMode(String parseMode) {
    this.parseMode = parseMode;
  }

  public Optional<List<MessageEntity>> getCaptionEntities() {
    return Optional.of(captionEntities);
  }

  public void setCaptionEntities(List<MessageEntity> captionEntities) {
    this.captionEntities = captionEntities;
  }

  public Optional<Boolean> getDisableContentTypeDetection() {
    return Optional.of(disableContentTypeDetection);
  }

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
