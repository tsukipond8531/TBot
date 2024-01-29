package jarkz.tbot.types.stickers;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.document.File;
import jarkz.tbot.types.document.PhotoSize;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a sticker.
 *
 * @author Pavel Bialiauski
 */
public class Sticker {

  @SerializedName("file_id")
  @NotNull
  private String fileId;

  @SerializedName("file_unique_id")
  @NotNull
  private String fileUniqueId;

  @NotNull private String type;

  @NotNull private int width;
  @NotNull private int height;

  @SerializedName("is_animated")
  @NotNull
  private boolean isAnimated;

  @SerializedName("is_video")
  @NotNull
  private boolean isVideo;

  private PhotoSize thumbnail;

  private String emoji;

  @SerializedName("set_name")
  private String setName;

  @SerializedName("premium_animation")
  private File premiumAnimation;

  @SerializedName("mask_position")
  private MaskPosition maskPosition;

  @SerializedName("custom_emoji_id")
  private String customEmojiId;

  @SerializedName("needs_repainting")
  private Boolean needsRepainting;

  @SerializedName("file_size")
  private Integer fileSize;

  /** Default constructor. */
  public Sticker() {}

  /**
   * Identifier for this file, which can be used to download or reuse the file.
   *
   * @return file_id as String.
   */
  public String getFileId() {
    return fileId;
  }

  /**
   * Sets the identifier for this file, which can be used to download or reuse the file.
   *
   * @param fileId the identifier for this file, which can be used to download or reuse the file, as
   *     String.
   */
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  /**
   * Unique identifier for this file, which is supposed to be the same over time and for different
   * bots. Can't be used to download or reuse the file.
   *
   * @return file_unique_id as String.
   */
  public String getFileUniqueId() {
    return fileUniqueId;
  }

  /**
   * Sets the unique identifier for this file, which is supposed to be the same over time and for
   * different bots. Can't be used to download or reuse the file.
   *
   * @param fileUniqueId the unique identifier for this file, which is supposed to be the same over
   *     time and for different bots, as String.
   */
  public void setFileUniqueId(String fileUniqueId) {
    this.fileUniqueId = fileUniqueId;
  }

  /**
   * Type of the sticker, currently one of “regular”, “mask”, “custom_emoji”. The type of the
   * sticker is independent from its format, which is determined by the fields <i>is_animated</i>
   * and <i>is_video</i>.
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the type of the sticker, currently one of “regular”, “mask”, “custom_emoji”. The type of
   * the sticker is independent from its format, which is determined by the fields
   * <i>is_animated</i> and <i>is_video</i>.
   *
   * @param type the type of the sticker, currently one of “regular”, “mask”, “custom_emoji”, as
   *     String.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Sticker width.
   *
   * @return width as int.
   */
  public int getWidth() {
    return width;
  }

  /**
   * Sets the sticker width.
   *
   * @param width the sticker width as int.
   */
  public void setWidth(int width) {
    this.width = width;
  }

  /**
   * Sticker height.
   *
   * @return height as int.
   */
  public int getHeight() {
    return height;
  }

  /**
   * Sets the sticker height.
   *
   * @param height the sticker height as int.
   */
  public void setHeight(int height) {
    this.height = height;
  }

  /**
   * <i>True</i>, if the sticker is <a
   * href="https://telegram.org/blog/animated-stickers">animated</a>.
   *
   * @return is_animated as boolean.
   */
  public boolean isAnimated() {
    return isAnimated;
  }

  /**
   * <i>True</i>, if the sticker is <a
   * href="https://telegram.org/blog/animated-stickers">animated</a>.
   *
   * @param isAnimated true if the sticker is animated, otherwise - false.
   */
  public void setAnimated(boolean isAnimated) {
    this.isAnimated = isAnimated;
  }

  /**
   * <i>True</i>, if the sticker is a <a
   * href="https://telegram.org/blog/video-stickers-better-reactions">video sticker</a>.
   *
   * @return is_video as boolean.
   */
  public boolean isVideo() {
    return isVideo;
  }

  /**
   * <i>True</i>, if the sticker is a <a
   * href="https://telegram.org/blog/video-stickers-better-reactions">video sticker</a>.
   *
   * @param isVideo true if the sticker is a video, otherwise - false.
   */
  public void setVideo(boolean isVideo) {
    this.isVideo = isVideo;
  }

  /**
   * <i>Optional.</i> Sticker thumbnail in the .WEBP or .JPG format.
   *
   * @return an optional value of thumbnail as {@link PhotoSize}.
   */
  public Optional<PhotoSize> getThumbnail() {
    return Optional.ofNullable(thumbnail);
  }

  /**
   * Sets the sticker thumbnail in the .WEBP or .JPG format.
   *
   * @param thumbnail the sticker thumbnail in the .WEBP or .JPG as {@link PhotoSize}.
   */
  public void setThumbnail(PhotoSize thumbnail) {
    this.thumbnail = thumbnail;
  }

  /**
   * <i>Optional.</i> Emoji associated with the sticker.
   *
   * @return an optional value of emoji as String.
   */
  public Optional<String> getEmoji() {
    return Optional.ofNullable(emoji);
  }

  /**
   * Sets the emoji associated with the sticker.
   *
   * @param emoji the emoji associated with the sticker as String.
   */
  public void setEmoji(String emoji) {
    this.emoji = emoji;
  }

  /**
   * <i>Optional.</i> Name of the sticker set to which the sticker belongs.
   *
   * @return an optional value of set_name as String.
   */
  public Optional<String> getSetName() {
    return Optional.ofNullable(setName);
  }

  /**
   * Sets the name of the sticker set to which the sticker belongs.
   *
   * @param setName the name of the sticker set to which the sticker belongs as String.
   */
  public void setSetName(String setName) {
    this.setName = setName;
  }

  /**
   * <i>Optional.</i> For premium regular stickers, premium animation for the sticker.
   *
   * @return an optional value of premium_animation as {@link File}.
   */
  public Optional<File> getPremiumAnimation() {
    return Optional.ofNullable(premiumAnimation);
  }

  /**
   * Sets the premium animation for the sticker; for premium regular stickers.
   *
   * @param premiumAnimation the premium for the sticker as {@link File}.
   */
  public void setPremiumAnimation(File premiumAnimation) {
    this.premiumAnimation = premiumAnimation;
  }

  /**
   * <i>Optional.</i> For mask stickers, the position where the mask should be placed.
   *
   * @return an optional value of mask_position as {@link MaskPosition}.
   */
  public Optional<MaskPosition> getMaskPosition() {
    return Optional.ofNullable(maskPosition);
  }

  /**
   * Sets the position where the mask should be placed; for mask stickers.
   *
   * @param maskPosition the position where the mask should be placed as {@link MaskPosition}.
   */
  public void setMaskPosition(MaskPosition maskPosition) {
    this.maskPosition = maskPosition;
  }

  /**
   * <i>Optional.</i> For custom emoji stickers, unique identifier of the custom emoji.
   *
   * @return an optional value of custom_emoji_id as String.
   */
  public Optional<String> getCustomEmojiId() {
    return Optional.ofNullable(customEmojiId);
  }

  /**
   * Sets the unique identifier of the custom emoji; for custom emoji stickers.
   *
   * @param customEmojiId the unique identifier of the custom emoji as String.
   */
  public void setCustomEmojiId(String customEmojiId) {
    this.customEmojiId = customEmojiId;
  }

  /**
   * <i>Optional.</i> <i>True</i>, if the sticker must be repainted to a text color in messages, the
   * color of the Telegram Premium badge in emoji status, white color on chat photos, or another
   * appropriate color in other places.
   *
   * @return an optional value of needs_repainting as Boolean.
   */
  public Optional<Boolean> getNeedRepainting() {
    return Optional.ofNullable(needsRepainting);
  }

  /**
   * <i>True</i>, if the sticker must be repainted to a text color in messages, the color of the
   * Telegram Premium badge in emoji status, white color on chat photos, or another appropriate
   * color in other places.
   *
   * @param needsRepainting true if the sticker must be repainted to a text color in messages,
   *     otherwise - false or null.
   */
  public void setNeedsRepainting(Boolean needsRepainting) {
    this.needsRepainting = needsRepainting;
  }

  /**
   * <i>Optional.</i> File size in bytes.
   *
   * @return an optional value of file_size as Integer.
   */
  public Optional<Integer> getFileSize() {
    return Optional.ofNullable(fileSize);
  }

  /**
   * Sets the file size in bytes.
   *
   * @param fileSize the file size in bytes as Integer or null if it doesn't provided.
   */
  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
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
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Sticker other)) return false;
    return Objects.equals(fileId, other.fileId)
        && Objects.equals(fileUniqueId, other.fileUniqueId)
        && Objects.equals(type, other.type)
        && Objects.equals(width, other.width)
        && Objects.equals(height, other.height)
        && Objects.equals(isAnimated, other.isAnimated)
        && Objects.equals(isVideo, other.isVideo)
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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
