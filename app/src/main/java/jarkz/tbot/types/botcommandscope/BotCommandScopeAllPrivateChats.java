package jarkz.tbot.types.botcommandscope;

import java.util.Objects;

public class BotCommandScopeAllPrivateChats implements BotCommandScope {

	protected static final String TYPE = "all_private_chats";

	private final String type = BotCommandScopeAllPrivateChats.TYPE;

	public BotCommandScopeAllPrivateChats() {
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
		if (!(obj instanceof BotCommandScopeAllPrivateChats other))
			return false;
		return Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BotCommandScopeAllPrivateChats[type=").append(type).append("]");
		return builder.toString();
	}
}
