package jarkz.tbot.types.inlinemode;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;

public class InlineQueryResultMpeg4Gif implements InlineQueryResult {

	protected static final String TYPE = "mpeg4_gif";

	private final String type = InlineQueryResultMpeg4Gif.TYPE;

	@NotNull
	private String id;

	@SerializedName("mpeg4_url")
	@NotNull
	private String mpeg4Url;

	@SerializedName("mpeg4_width")
	private Integer mpeg4Width;

	@SerializedName("mpeg4_height")
	private Integer mpeg4Height;

	@SerializedName("mpeg4_duration")
	private Integer mpeg4Duration;

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

	public InlineQueryResultMpeg4Gif() {
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

	public String getMpeg4Url() {
		return mpeg4Url;
	}

	public void setMpeg4Url(String mpeg4Url) {
		this.mpeg4Url = mpeg4Url;
	}

	public Optional<Integer> getMpeg4Width() {
		return Optional.of(mpeg4Width);
	}

	public void setMpeg4Width(Integer mpeg4Width) {
		this.mpeg4Width = mpeg4Width;
	}

	public Optional<Integer> getMpeg4Height() {
		return Optional.of(mpeg4Height);
	}

	public void setMpeg4Height(Integer mpeg4Height) {
		this.mpeg4Height = mpeg4Height;
	}

	public Optional<Integer> getMpeg4Duration() {
		return Optional.of(mpeg4Duration);
	}

	public void setMpeg4Duration(Integer mpeg4Duration) {
		this.mpeg4Duration = mpeg4Duration;
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
	public int hashCode() {
		return Objects.hash(type,
				id,
				mpeg4Url,
				mpeg4Width,
				mpeg4Height,
				mpeg4Duration,
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InlineQueryResultMpeg4Gif other))
			return false;
		return Objects.equals(type, other.type)
				&& Objects.equals(id, other.id)
				&& Objects.equals(mpeg4Url, other.mpeg4Url)
				&& Objects.equals(mpeg4Width, other.mpeg4Width)
				&& Objects.equals(mpeg4Height, other.mpeg4Height)
				&& Objects.equals(mpeg4Duration, other.mpeg4Duration)
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
		builder.append("InlineQueryResultMpeg4Gif[type=").append(type)
				.append(", id=").append(id)
				.append(", mpeg4Url=").append(mpeg4Url)
				.append(", mpeg4Width=").append(mpeg4Width)
				.append(", mpeg4Height=").append(mpeg4Height)
				.append(", mpeg4Duration=").append(mpeg4Duration)
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
