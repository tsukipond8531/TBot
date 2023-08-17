package jarkz.tbot.types.botcommandscope;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class BotCommandScopeChatMember implements BotCommandScope {

	protected static final String TYPE = "chat_member";

	private final String type = BotCommandScopeChatMember.TYPE;

	@SerializedName("chat_id")
	@NotNull
	private String chatId;

	public BotCommandScopeChatMember() {
	}

	public String getType() {
		return type;
	}

	public String getChatId() {
		return chatId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(type, chatId);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BotCommandScopeChatMember other))
			return false;
		return Objects.equals(type, other.type) && Objects.equals(chatId, other.chatId);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BotCommandScopeChatMember[type=").append(type).append(", chatId=").append(chatId).append("]");
		return builder.toString();
	}
}
