package jarkz.tbot.types.stickers;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.document.PhotoSize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a sticker set.
 *
 * @author Pavel Bialiauski
 */
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

  /** Default constructor. */
  public StickerSet() {}

  /**
   * Sticker set name.
   *
   * @return name as String.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the sticker set name.
   *
   * @param name the sticker set name as String.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Sticker set title.
   *
   * @return title as String.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the sticker set title.
   *
   * @param title the sticker set title as String.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Type of stickers in the set, currently one of “regular”, “mask”, “custom_emoji”.
   *
   * @return sticker_type as String.
   */
  public String getStickerType() {
    return stickerType;
  }

  /**
   * Sets the type of stickers in the set, currently one of “regular”, “mask”, “custom_emoji”.
   *
   * @param stickerType the type of stickers in the set, currently one of “regular”, “mask”,
   *     “custom_emoji”, as String.
   */
  public void setStickerType(String stickerType) {
    this.stickerType = stickerType;
  }

  /**
   * <i>True</i>, if the sticker set contains <a
   * href="https://telegram.org/blog/animated-stickers">animated stickers</a>.
   *
   * @return is_animated as boolean.
   */
  public boolean isAnimated() {
    return isAnimated;
  }

  /**
   * <i>True</i>, if the sticker set contains <a
   * href="https://telegram.org/blog/animated-stickers">animated stickers</a>.
   *
   * @param isAnimated true if the sticker set contains animated stickers, otherwise - false.
   */
  public void setAnimated(boolean isAnimated) {
    this.isAnimated = isAnimated;
  }

  /**
   * <i>True</i>, if the sticker set contains <a
   * href="https://telegram.org/blog/video-stickers-better-reactions">video stickers</a>.
   *
   * @return is_video as boolean.
   */
  public boolean isVideo() {
    return isVideo;
  }

  /**
   * <i>True</i>, if the sticker set contains <a
   * href="https://telegram.org/blog/video-stickers-better-reactions">video stickers</a>.
   *
   * @param isVideo true if the sticker set contains video stickers, otherwise - false.
   */
  public void setVideo(boolean isVideo) {
    this.isVideo = isVideo;
  }

  /**
   * List of all set stickers.
   *
   * @return stickers as {@link List}&lt;{@link Sticker}&gt;.
   */
  public List<Sticker> getStickers() {
    return stickers;
  }

  /**
   * Sets the list of all set stickers.
   *
   * @param stickers the list of all set stickers as {@link List}&lt;{@link Sticker}&gt;.
   */
  public void setStickers(List<Sticker> stickers) {
    this.stickers = stickers;
  }

  /**
   * <i>Optional.</i> Sticker set thumbnail in the .WEBP, .TGS, or .WEBM format.
   *
   * @return an optional value of thumbnail as {@link PhotoSize}.
   */
  public Optional<PhotoSize> getThumbnail() {
    return Optional.ofNullable(thumbnail);
  }

  /**
   * Sets the sticker set thumbnail in the .WEBP, .TGS, or .WEBM format.
   *
   * @param thumbnail the sticker set thumbnail in the .WEBP, .TGS, or .WEBM format, as {@link
   *     PhotoSize} or null if it is not required.
   */
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
