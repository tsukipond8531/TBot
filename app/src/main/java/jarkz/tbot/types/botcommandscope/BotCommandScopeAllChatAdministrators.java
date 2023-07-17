package jarkz.tbot.types.botcommandscope;

import java.util.Objects;

public class BotCommandScopeAllChatAdministrators implements BotCommandScope{

	protected static final String TYPE = "all_chat_administrators";

	private final String type = BotCommandScopeAllChatAdministrators.TYPE;

	public BotCommandScopeAllChatAdministrators() {
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
		if (!(obj instanceof BotCommandScopeAllChatAdministrators other))
			return false;
		return Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BotCommandScopeAllChatAdministrators[type=").append(type).append("]");
		return builder.toString();
	}
}
