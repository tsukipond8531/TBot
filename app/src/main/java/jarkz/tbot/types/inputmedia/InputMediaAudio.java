package jarkz.tbot.types.inputmedia;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InputFile;
import jarkz.tbot.types.MessageEntity;

public class InputMediaAudio implements InputMedia {

	protected static final String TYPE = "audio";

	private final String type = InputMediaAudio.TYPE;

	@NotNull
	private String media;

	private InputFile thumbnail;

	private String caption;

	@SerializedName("parse_mode")
	private String parseMode;

	@SerializedName("caption_entities")
	private List<MessageEntity> captionEntities;

	private Integer duration;

	private String performer;

	private String title;

	public InputMediaAudio() {
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

	public Optional<Integer> getDuration() {
		return Optional.of(duration);
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Optional<String> getPerformer() {
		return Optional.of(performer);
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}

	public Optional<String> getTitle() {
		return Optional.of(title);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, media, thumbnail, caption, parseMode, captionEntities, duration, performer, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InputMediaAudio other))
			return false;
		return Objects.equals(type, other.type)
				&& Objects.equals(media, other.media)
				&& Objects.equals(thumbnail, other.thumbnail)
				&& Objects.equals(caption, other.caption)
				&& Objects.equals(parseMode, other.parseMode)
				&& Objects.equals(captionEntities, other.captionEntities)
				&& Objects.equals(duration, other.duration)
				&& Objects.equals(performer, other.performer)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InputMediaAudio[type=").append(type)
				.append(", media=").append(media)
				.append(", thumbnail=").append(thumbnail)
				.append(", caption=").append(caption)
				.append(", parseMode=").append(parseMode)
				.append(", captionEntities=").append(captionEntities)
				.append(", duration=").append(duration)
				.append(", performer=").append(performer)
				.append(", title=").append(title).append("]");
		return builder.toString();
	}
}
