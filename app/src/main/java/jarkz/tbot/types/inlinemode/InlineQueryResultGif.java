package jarkz.tbot.types.inlinemode;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;

public class InlineQueryResultGif implements InlineQueryResult {

	protected static final String TYPE = "gif";

	private final String type = InlineQueryResultGif.TYPE;

	@NotNull
	private String id;

	@SerializedName("gif_url")
	@NotNull
	private String gifUrl;

	@SerializedName("gif_width")
	private Integer gifWidth;

	@SerializedName("gif_height")
	private Integer gifHeight;

	@SerializedName("gif_duration")
	private Integer gifDuration;

	@SerializedName("thumbnail_url")
	@NotNull
	private String thumbnailUrl;

	@SerializedName("thumbnail_mime_type")
	private String thumbnailMimeType;

	private String title;

	private String caption;

	@SerializedName("parse_mode")
	private String parseMode;

	@SerializedName("caption_entities")
	private List<MessageEntity> captionEntities;

	@SerializedName("reply_markup")
	private InlineKeyboardMarkup replyMarkup;

	@SerializedName("input_message_content")
	private InputMessageContent inputMessageContent;

	public InlineQueryResultGif() {
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

	public String getGifUrl() {
		return gifUrl;
	}

	public void setGifUrl(String gifUrl) {
		this.gifUrl = gifUrl;
	}

	public Optional<Integer> getGifWidth() {
		return Optional.of(gifWidth);
	}

	public void setGifWidth(Integer gifWidth) {
		this.gifWidth = gifWidth;
	}

	public Optional<Integer> getGifHeight() {
		return Optional.of(gifHeight);
	}

	public void setGifHeight(Integer gifHeight) {
		this.gifHeight = gifHeight;
	}

	public Optional<Integer> getGifDuration() {
		return Optional.of(gifDuration);
	}

	public void setGifDuration(Integer gifDuration) {
		this.gifDuration = gifDuration;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public Optional<String> getThumbnailMimeType() {
		return Optional.of(thumbnailMimeType);
	}

	public void setThumbnailMimeType(String thumbnailMimeType) {
		this.thumbnailMimeType = thumbnailMimeType;
	}

	public Optional<String> getTitle() {
		return Optional.of(title);
	}

	public void setTitle(String title) {
		this.title = title;
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
	final public int hashCode() {
		return Objects.hash(type,
				id,
				gifUrl,
				gifWidth,
				gifHeight,
				gifDuration,
				thumbnailUrl,
				thumbnailMimeType,
				title,
				caption,
				parseMode,
				captionEntities,
				replyMarkup,
				inputMessageContent);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InlineQueryResultGif other))
			return false;
		return Objects.equals(type, other.type)
				&& Objects.equals(id, other.id)
				&& Objects.equals(gifUrl, other.gifUrl)
				&& Objects.equals(gifWidth, other.gifWidth)
				&& Objects.equals(gifHeight, other.gifHeight)
				&& Objects.equals(gifDuration, other.gifDuration)
				&& Objects.equals(thumbnailUrl, other.thumbnailUrl)
				&& Objects.equals(thumbnailMimeType, other.thumbnailMimeType)
				&& Objects.equals(title, other.title)
				&& Objects.equals(caption, other.caption)
				&& Objects.equals(parseMode, other.parseMode)
				&& Objects.equals(captionEntities, other.captionEntities)
				&& Objects.equals(replyMarkup, other.replyMarkup)
				&& Objects.equals(inputMessageContent, other.inputMessageContent);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InlineQueryResultGif[type=").append(type)
				.append(", id=").append(id)
				.append(", gifUrl=").append(gifUrl)
				.append(", gifWidth=").append(gifWidth)
				.append(", gifHeight=").append(gifHeight)
				.append(", gifDuration=").append(gifDuration)
				.append(", thumbnailUrl=").append(thumbnailUrl)
				.append(", thumbnailMimeType=").append(thumbnailMimeType)
				.append(", title=").append(title)
				.append(", caption=").append(caption)
				.append(", parseMode=").append(parseMode)
				.append(", captionEntities=").append(captionEntities)
				.append(", replyMarkup=").append(replyMarkup)
				.append(", inputMessageContent=").append(inputMessageContent).append("]");
		return builder.toString();
	}
}
