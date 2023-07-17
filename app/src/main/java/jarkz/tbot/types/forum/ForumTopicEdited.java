package jarkz.tbot.types.forum;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

public class ForumTopicEdited {

	private String name;

	@SerializedName("icon_custom_emoji_id")
	private String iconCustomEmojiId;

	public ForumTopicEdited() {
	}

	public Optional<String> getName() {
		return Optional.of(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<String> getIconCustomEmojiId() {
		return Optional.of(iconCustomEmojiId);
	}

	public void setIconCustomEmojiId(String iconCustomEmojiId) {
		this.iconCustomEmojiId = iconCustomEmojiId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, iconCustomEmojiId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ForumTopicEdited other))
			return false;
		return Objects.equals(name, other.name) && Objects.equals(iconCustomEmojiId, other.iconCustomEmojiId);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ForumTopicEdited[name=").append(name)
				.append(", iconCustomEmojiId=").append(iconCustomEmojiId).append("]");
		return builder.toString();
	}
}
