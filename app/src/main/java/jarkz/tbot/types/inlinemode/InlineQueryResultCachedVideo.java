package jarkz.tbot.types.inlinemode;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;

public class InlineQueryResultCachedVideo implements InlineQueryResult {

	protected static final String TYPE = "video";

	protected static boolean isCached(JsonObject jsonObject) {
		final String keyToCheck = "video_file_id";
		return jsonObject.get(keyToCheck) != null;
	}

	private final String type = InlineQueryResultCachedVideo.TYPE;

	@NotNull
	private String id;

	@SerializedName("video_file_id")
	@NotNull
	private String videoFileId;

	@NotNull
	private String title;

	private String description;

	private String caption;

	@SerializedName("parse_mode")
	private String parseMode;

	@SerializedName("caption_entities")
	private List<MessageEntity> captionEntities;

	@SerializedName("reply_markup")
	private InlineKeyboardMarkup replyMarkup;

	@SerializedName("input_message_content")
	private InputMessageContent inputMessageContent;

	public InlineQueryResultCachedVideo() {
	}

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVideoFileId() {
		return videoFileId;
	}

	public void setVideoFileId(String videoFileId) {
		this.videoFileId = videoFileId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Optional<String> getDescription() {
		return Optional.of(description);
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Optional<InlineKeyboardMarkup> getReplyMarkup() {
		return Optional.of(replyMarkup);
	}

	public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
		this.replyMarkup = replyMarkup;
	}

	public Optional<InputMessageContent> getInputMessageContent() {
		return Optional.of(inputMessageContent);
	}

	public void setInputMessageContent(InputMessageContent inputMessageContent) {
		this.inputMessageContent = inputMessageContent;
	}

	@Override
	public int hashCode() {
		return Objects.hash(type,
				id,
				videoFileId,
				title,
				description,
				caption,
				parseMode,
				captionEntities,
				replyMarkup,
				inputMessageContent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InlineQueryResultCachedVideo other))
			return false;
		return Objects.equals(type, other.type)
				&& Objects.equals(id, other.id)
				&& Objects.equals(videoFileId, other.videoFileId)
				&& Objects.equals(title, other.title)
				&& Objects.equals(description, other.description)
				&& Objects.equals(caption, other.caption)
				&& Objects.equals(parseMode, other.parseMode)
				&& Objects.equals(captionEntities, other.captionEntities)
				&& Objects.equals(replyMarkup, other.replyMarkup)
				&& Objects.equals(inputMessageContent, other.inputMessageContent);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InlineQueryResultCachedVideo[type=").append(type)
				.append(", id=").append(id)
				.append(", videoFileId=").append(videoFileId)
				.append(", title=").append(title)
				.append(", description=").append(description)
				.append(", caption=").append(caption)
				.append(", parseMode=").append(parseMode)
				.append(", captionEntities=").append(captionEntities)
				.append(", replyMarkup=").append(replyMarkup)
				.append(", inputMessageContent=").append(inputMessageContent).append("]");
		return builder.toString();
	}
}
