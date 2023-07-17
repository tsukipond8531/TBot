package jarkz.tbot.types.stickers;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.document.File;
import jarkz.tbot.types.document.PhotoSize;

public class Sticker {

	@SerializedName("file_id")
	@NotNull
	private String fileId;

	@SerializedName("file_unique_id")
	@NotNull
	private String fileUniqueId;

	@NotNull
	private String type;

	@NotNull
	private Integer width;
	@NotNull
	private Integer height;

	@SerializedName("is_animated")
	@NotNull
	private Boolean isAnimated;

	@SerializedName("is_video")
	@NotNull
	private Boolean isVideo;

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

	@SerializedName("need_repainting")
	private Boolean needRepainting;

	@SerializedName("file_size")
	private Integer fileSize;

	public Sticker() {
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileUniqueId() {
		return fileUniqueId;
	}

	public void setFileUniqueId(String fileUniqueId) {
		this.fileUniqueId = fileUniqueId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Boolean getIsAnimated() {
		return isAnimated;
	}

	public void setIsAnimated(Boolean isAnimated) {
		this.isAnimated = isAnimated;
	}

	public Boolean getIsVideo() {
		return isVideo;
	}

	public void setIsVideo(Boolean isVideo) {
		this.isVideo = isVideo;
	}

	public Optional<PhotoSize> getThumbnail() {
		return Optional.of(thumbnail);
	}

	public void setThumbnail(PhotoSize thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Optional<String> getEmoji() {
		return Optional.of(emoji);
	}

	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}

	public Optional<String> getSetName() {
		return Optional.of(setName);
	}

	public void setSetName(String setName) {
		this.setName = setName;
	}

	public Optional<File> getPremiumAnimation() {
		return Optional.of(premiumAnimation);
	}

	public void setPremiumAnimation(File premiumAnimation) {
		this.premiumAnimation = premiumAnimation;
	}

	public Optional<MaskPosition> getMaskPosition() {
		return Optional.of(maskPosition);
	}

	public void setMaskPosition(MaskPosition maskPosition) {
		this.maskPosition = maskPosition;
	}

	public Optional<String> getCustomEmojiId() {
		return Optional.of(customEmojiId);
	}

	public void setCustomEmojiId(String customEmojiId) {
		this.customEmojiId = customEmojiId;
	}

	public Optional<Boolean> getNeedRepainting() {
		return Optional.of(needRepainting);
	}

	public void setNeedRepainting(Boolean needRepainting) {
		this.needRepainting = needRepainting;
	}

	public Optional<Integer> getFileSize() {
		return Optional.of(fileSize);
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fileId,
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
				needRepainting,
				fileSize);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Sticker other))
			return false;
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
				&& Objects.equals(needRepainting, other.needRepainting)
				&& Objects.equals(fileSize, other.fileSize);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sticker[fileId=").append(fileId)
				.append(", fileUniqueId=").append(fileUniqueId)
				.append(", type=").append(type)
				.append(", width=").append(width)
				.append(", height=").append(height)
				.append(", isAnimated=").append(isAnimated)
				.append(", isVideo=").append(isVideo)
				.append(", thumbnail=").append(thumbnail)
				.append(", emoji=").append(emoji)
				.append(", setName=").append(setName)
				.append(", premiumAnimation=").append(premiumAnimation)
				.append(", maskPosition=").append(maskPosition)
				.append(", customEmojiId=").append(customEmojiId)
				.append(", needRepainting=").append(needRepainting)
				.append(", fileSize=").append(fileSize).append("]");
		return builder.toString();
	}
}
