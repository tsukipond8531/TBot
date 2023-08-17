package jarkz.tbot.types;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class MessageEntity {

	@NotNull
	private String type;

	@NotNull
	private int offset;

	@NotNull
	private int length;

	private String url;

	private User user;

	private String language;

	@SerializedName("custom_emoji_id")
	private String customEmojiId;

	public MessageEntity() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Optional<String> getUrl() {
		return Optional.of(url);
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Optional<User> getUser() {
		return Optional.of(user);
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Optional<String> getLanguage() {
		return Optional.of(language);
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Optional<String> getCustomEmojiId() {
		return Optional.of(customEmojiId);
	}

	public void setCustomEmojiId(String customEmojiId) {
		this.customEmojiId = customEmojiId;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(type, offset, length, url, user, language, customEmojiId);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MessageEntity other))
			return false;
		return Objects.equals(type, other.type)
				&& offset == other.offset
				&& length == other.length
				&& Objects.equals(url, other.url)
				&& Objects.equals(user, other.user)
				&& Objects.equals(language, other.language)
				&& Objects.equals(customEmojiId, other.customEmojiId);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MessageEntity[type=").append(type)
				.append(", offset=").append(offset)
				.append(", length=").append(length)
				.append(", url=").append(url)
				.append(", user=").append(user)
				.append(", language=").append(language)
				.append(", customEmojiId=").append(customEmojiId).append("]");
		return builder.toString();
	}
}
