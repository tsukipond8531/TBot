package jarkz.tbot.types.botcommandscope;

import java.util.Objects;

public class BotCommandScopeAllGroupChats implements BotCommandScope {

	protected static final String TYPE = "all_group_chats";

	private final String type = BotCommandScopeAllGroupChats.TYPE;

	public BotCommandScopeAllGroupChats() {
	}

	public String getType() {
		return type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BotCommandScopeAllGroupChats other))
			return false;
		return Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BotCommandScopeAllGroupChats[type=").append(type).append("]");
		return builder.toString();
	}
}
