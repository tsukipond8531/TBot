package jarkz.tbot.types.inputmedia;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class InputMediaPhoto implements InputMedia {

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

  public InputMediaPhoto() {}

  public String getType() {
    return type;
  }

  public String getMedia() {
    return media;
  }

  public void setMedia(String media) {
    this.media = media;
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

  public Optional<Boolean> getHasSpoiler() {
    return Optional.of(hasSpoiler);
  }

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
