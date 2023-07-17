package jarkz.tbot.types.forum;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class ForumTopic {

	@SerializedName("message_thread_id")
	@NotNull
	private int messageThreadId;

	@NotNull
	private String name;

	@SerializedName("icon_color")
	@NotNull
	private int iconColor;

	@SerializedName("icon_custom_emoji_id")
	private String iconCustomEmojiId;

	public ForumTopic() {
	}

	public int getMessageThreadId() {
		return messageThreadId;
	}

	public void setMessageThreadId(int messageThreadId) {
		this.messageThreadId = messageThreadId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIconColor() {
		return iconColor;
	}

	public void setIconColor(int iconColor) {
		this.iconColor = iconColor;
	}

	public Optional<String> getIconCustomEmojiId() {
		return Optional.of(iconCustomEmojiId);
	}

	public void setIconCustomEmojiId(String iconCustomEmojiId) {
		this.iconCustomEmojiId = iconCustomEmojiId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(messageThreadId, name, iconColor, iconCustomEmojiId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ForumTopic other))
			return false;
		return messageThreadId == other.messageThreadId
				&& Objects.equals(name, other.name)
				&& iconColor == other.iconColor
				&& Objects.equals(iconCustomEmojiId, other.iconCustomEmojiId);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ForumTopic[messageThreadId=").append(messageThreadId)
				.append(", name=").append(name)
				.append(", iconColor=").append(iconColor)
				.append(", iconCustomEmojiId=").append(iconCustomEmojiId).append("]");
		return builder.toString();
	}
}
