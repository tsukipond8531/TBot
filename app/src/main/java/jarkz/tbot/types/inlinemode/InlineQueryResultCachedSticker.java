package jarkz.tbot.types.inlinemode;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class InlineQueryResultCachedSticker implements InlineQueryResult {

	protected static final String TYPE = "sticker";

	private final String type = InlineQueryResultCachedSticker.TYPE;

	@NotNull
	private String id;

	@SerializedName("sticker_file_id")
	@NotNull
	private String stickerFileId;

	@SerializedName("reply_markup")
	private InlineKeyboardMarkup replyMarkup;

	@SerializedName("input_message_content")
	private InputMessageContent inputMessageContent;

	public InlineQueryResultCachedSticker() {
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

	public String getStickerFileId() {
		return stickerFileId;
	}

	public void setStickerFileId(String stickerFileId) {
		this.stickerFileId = stickerFileId;
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
		return Objects.hash(type, id, stickerFileId, replyMarkup, inputMessageContent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InlineQueryResultCachedSticker other))
			return false;
		return Objects.equals(type, other.type)
				&& Objects.equals(id, other.id)
				&& Objects.equals(stickerFileId, other.stickerFileId)
				&& Objects.equals(replyMarkup, other.replyMarkup)
				&& Objects.equals(inputMessageContent, other.inputMessageContent);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InlineQueryResultCachedSticker[type=").append(type)
				.append(", id=").append(id)
				.append(", stickerFileId=").append(stickerFileId)
				.append(", replyMarkup=").append(replyMarkup)
				.append(", inputMessageContent=").append(inputMessageContent).append("]");
		return builder.toString();
	}
}
