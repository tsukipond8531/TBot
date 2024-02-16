package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a sticker. */
public final class Sticker {

  /** Identifier for this file, which can be used to download or reuse the file */
  @NotNull
  @SerializedName("file_id")
  public String fileId;

  /**
   * Unique identifier for this file, which is supposed to be the same over time and for different
   * bots. Can't be used to download or reuse the file.
   */
  @SerializedName("file_unique_id")
  @NotNull
  public String fileUniqueId;

  /**
   * Type of the sticker, currently one of "regular", "mask", "custom_emoji". The type of the
   * sticker is independent from its format, which is determined by the fields is_animated and
   * is_video.
   */
  @NotNull public String type;

  /** Sticker width */
  @NotNull public int width;

  /** Sticker height */
  @NotNull public int height;

  /** True, if the sticker is animated */
  @NotNull
  @SerializedName("is_animated")
  public boolean isAnimated;

  /** True, if the sticker is a video sticker */
  @NotNull
  @SerializedName("is_video")
  public boolean isVideo;

  /** Optional. Sticker thumbnail in the .WEBP or .JPG format */
  public PhotoSize thumbnail;

  /** Optional. Emoji associated with the sticker */
  public String emoji;

  /** Optional. Name of the sticker set to which the sticker belongs */
  @SerializedName("set_name")
  public String setName;

  /** Optional. For premium regular stickers, premium animation for the sticker */
  @SerializedName("premium_animation")
  public File premiumAnimation;

  /** Optional. For mask stickers, the position where the mask should be placed */
  @SerializedName("mask_position")
  public MaskPosition maskPosition;

  /** Optional. For custom emoji stickers, unique identifier of the custom emoji */
  @SerializedName("custom_emoji_id")
  public String customEmojiId;

  /**
   * Optional. True, if the sticker must be repainted to a text color in messages, the color of the
   * Telegram Premium badge in emoji status, white color on chat photos, or another appropriate
   * color in other places
   */
  @SerializedName("needs_repainting")
  public Boolean needsRepainting;

  /** Optional. File size in bytes */
  @SerializedName("file_size")
  public Integer fileSize;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Sticker other)) return false;
    return Objects.equals(fileId, other.fileId)
        && Objects.equals(fileUniqueId, other.fileUniqueId)
        && Objects.equals(type, other.type)
        && width == other.width
        && height == other.height
        && isAnimated == other.isAnimated
        && isVideo == other.isVideo
        && Objects.equals(thumbnail, other.thumbnail)
        && Objects.equals(emoji, other.emoji)
        && Objects.equals(setName, other.setName)
        && Objects.equals(premiumAnimation, other.premiumAnimation)
        && Objects.equals(maskPosition, other.maskPosition)
        && Objects.equals(customEmojiId, other.customEmojiId)
        && Objects.equals(needsRepainting, other.needsRepainting)
        && Objects.equals(fileSize, other.fileSize);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        fileId,
        fileUniqueId,
        type,
        width,
        height,
        isAnimated,
        isVideo,
        thumbnail,
        emoji,
        setName,
        premiumAnimation,
        maskPosition,
        customEmojiId,
        needsRepainting,
        fileSize);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("Sticker[fileId=")
        .append(fileId)
        .append(", fileUniqueId=")
        .append(fileUniqueId)
        .append(", type=")
        .append(type)
        .append(", width=")
        .append(width)
        .append(", height=")
        .append(height)
        .append(", isAnimated=")
        .append(isAnimated)
        .append(", isVideo=")
        .append(isVideo)
        .append(", thumbnail=")
        .append(thumbnail)
        .append(", emoji=")
        .append(emoji)
        .append(", setName=")
        .append(setName)
        .append(", premiumAnimation=")
        .append(premiumAnimation)
        .append(", maskPosition=")
        .append(maskPosition)
        .append(", customEmojiId=")
        .append(customEmojiId)
        .append(", needsRepainting=")
        .append(needsRepainting)
        .append(", fileSize=")
        .append(fileSize)
        .append("]");
    return builder.toString();
  }
}
