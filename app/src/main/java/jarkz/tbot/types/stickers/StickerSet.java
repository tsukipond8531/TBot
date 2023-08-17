package jarkz.tbot.types.stickers;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.document.PhotoSize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class StickerSet {

  @NotNull private String name;

  @NotNull private String title;

  @SerializedName("sticker_type")
  @NotNull
  private String stickerType;

  @SerializedName("is_animated")
  @NotNull
  private boolean isAnimated;

  @SerializedName("is_video")
  @NotNull
  private boolean isVideo;

  @NotNull private List<Sticker> stickers;

  private PhotoSize thumbnail;

  public StickerSet() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getStickerType() {
    return stickerType;
  }

  public void setStickerType(String stickerType) {
    this.stickerType = stickerType;
  }

  public boolean isAnimated() {
    return isAnimated;
  }

  public void setAnimated(boolean isAnimated) {
    this.isAnimated = isAnimated;
  }

  public boolean isVideo() {
    return isVideo;
  }

  public void setVideo(boolean isVideo) {
    this.isVideo = isVideo;
  }

  public List<Sticker> getStickers() {
    return stickers;
  }

  public void setStickers(List<Sticker> stickers) {
    this.stickers = stickers;
  }

  public Optional<PhotoSize> getThumbnail() {
    return Optional.of(thumbnail);
  }

  public void setThumbnail(PhotoSize thumbnail) {
    this.thumbnail = thumbnail;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name, title, stickerType, isAnimated, isVideo, stickers, thumbnail);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof StickerSet other)) return false;
    return Objects.equals(name, other.name)
        && Objects.equals(title, other.title)
        && Objects.equals(stickerType, other.stickerType)
        && Objects.equals(isAnimated, other.isAnimated)
        && Objects.equals(isVideo, other.isVideo)
        && Objects.equals(stickers, other.stickers)
        && Objects.equals(thumbnail, other.thumbnail);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("StickerSet[name=")
        .append(name)
        .append(", title=")
        .append(title)
        .append(", stickerType=")
        .append(stickerType)
        .append(", isAnimated=")
        .append(isAnimated)
        .append(", isVideo=")
        .append(isVideo)
        .append(", stickers=")
        .append(stickers)
        .append(", thumbnail=")
        .append(thumbnail)
        .append("]");
    return builder.toString();
  }
}
