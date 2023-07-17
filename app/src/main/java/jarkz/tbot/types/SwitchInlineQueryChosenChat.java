package jarkz.tbot.types;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

public class SwitchInlineQueryChosenChat {

	private String query;

	@SerializedName("allow_user_chats")
	private Boolean allowUserChats;

	@SerializedName("allow_bot_chats")
	private Boolean allowBotChats;

	@SerializedName("allow_group_chats")
	private Boolean allowGroupChats;

	@SerializedName("allow_channel_chats")
	private Boolean allowChannelChats;

	public SwitchInlineQueryChosenChat() {
	}

	public Optional<String> getQuery() {
		return Optional.of(query);
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Optional<Boolean> isAllowUserChats() {
		return Optional.of(allowUserChats);
	}

	public void setAllowUserChats(Boolean allowUserChats) {
		this.allowUserChats = allowUserChats;
	}

	public Optional<Boolean> isAllowBotChats() {
		return Optional.of(allowBotChats);
	}

	public void setAllowBotChats(Boolean allowBotChats) {
		this.allowBotChats = allowBotChats;
	}

	public Optional<Boolean> isAllowGroupChats() {
		return Optional.of(allowGroupChats);
	}

	public void setAllowGroupChats(Boolean allowGroupChats) {
		this.allowGroupChats = allowGroupChats;
	}

	public Optional<Boolean> isAllowChannelChats() {
		return Optional.of(allowChannelChats);
	}

	public void setAllowChannelChats(Boolean allowChannelChats) {
		this.allowChannelChats = allowChannelChats;
	}

	@Override
	public int hashCode() {
		return Objects.hash(query, allowUserChats, allowBotChats, allowGroupChats, allowChannelChats);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SwitchInlineQueryChosenChat other))
			return false;
		return Objects.equals(query, other.query)
				&& Objects.equals(allowUserChats, other.allowUserChats)
				&& Objects.equals(allowBotChats, other.allowBotChats)
				&& Objects.equals(allowGroupChats, other.allowGroupChats)
				&& Objects.equals(allowChannelChats, other.allowChannelChats);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SwitchInlineQueryChosenChat[query=").append(query)
				.append(", allowUserChats=").append(allowUserChats)
				.append(", allowBotChats=").append(allowBotChats)
				.append(", allowGroupChats=").append(allowGroupChats)
				.append(", allowChannelChats=").append(allowChannelChats).append("]");
		return builder.toString();
	}
}
