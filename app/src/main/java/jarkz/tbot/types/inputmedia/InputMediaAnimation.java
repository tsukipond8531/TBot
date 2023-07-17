package jarkz.tbot.types.inputmedia;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InputFile;
import jarkz.tbot.types.MessageEntity;

public class InputMediaAnimation implements InputMedia {

	protected static final String TYPE = "animation";

	private final String type = InputMediaAnimation.TYPE;

	@NotNull
	private String media;

	private InputFile thumbnail;

	private String caption;

	@SerializedName("parse_mode")
	private String parseMode;

	@SerializedName("caption_entities")
	private List<MessageEntity> captionEntities;

	private Integer width;

	private Integer height;

	private Integer duration;

	@SerializedName("has_spoiler")
	private Boolean hasSpoiler;

	public InputMediaAnimation() {
	}

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

	public Optional<Integer> getWidth() {
		return Optional.of(width);
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Optional<Integer> getHeight() {
		return Optional.of(height);
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Optional<Integer> getDuration() {
		return Optional.of(duration);
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Optional<Boolean> isHasSpoiler() {
		return Optional.of(hasSpoiler);
	}

	public void setHasSpoiler(Boolean hasSpoiler) {
		this.hasSpoiler = hasSpoiler;
	}

	@Override
	public int hashCode() {
		return Objects.hash(type,
				media,
				thumbnail,
				caption,
				parseMode,
				captionEntities,
				width,
				height,
				duration,
				hasSpoiler);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InputMediaAnimation other))
			return false;
		return Objects.equals(type, other.type)
				&& Objects.equals(media, other.media)
				&& Objects.equals(thumbnail, other.thumbnail)
				&& Objects.equals(caption, other.caption)
				&& Objects.equals(parseMode, other.parseMode)
				&& Objects.equals(captionEntities, other.captionEntities)
				&& Objects.equals(width, other.width)
				&& Objects.equals(height, other.height)
				&& Objects.equals(duration, other.duration)
				&& Objects.equals(hasSpoiler, other.hasSpoiler);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InputMediaAnimation[type=").append(type)
				.append(", media=").append(media)
				.append(", thumbnail=").append(thumbnail)
				.append(", caption=").append(caption)
				.append(", parseMode=").append(parseMode)
				.append(", captionEntities=").append(captionEntities)
				.append(", width=").append(width)
				.append(", height=").append(height)
				.append(", duration=").append(duration)
				.append(", hasSpoiler=").append(hasSpoiler).append("]");
		return builder.toString();
	}
}
