package jarkz.tbot.types;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class CallbackQuery {

	@NotNull
	private String id;

	@NotNull
	private User from;

	private Message message;

	@SerializedName("inline_message_id")
	private String inlineMessageId;

	@SerializedName("chat_instance")
	@NotNull
	private String chatInstance;

	private String data;

	@SerializedName("game_short_name")
	private String gameShortName;

	public CallbackQuery() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public Optional<Message> getMessage() {
		return Optional.of(message);
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public Optional<String> getInlineMessageId() {
		return Optional.of(inlineMessageId);
	}

	public void setInlineMessageId(String inlineMessageId) {
		this.inlineMessageId = inlineMessageId;
	}

	public String getChatInstance() {
		return chatInstance;
	}

	public void setChatInstance(String chatInstance) {
		this.chatInstance = chatInstance;
	}

	public Optional<String> getData() {
		return Optional.of(data);
	}

	public void setData(String data) {
		this.data = data;
	}

	public Optional<String> getGameShortName() {
		return Optional.of(gameShortName);
	}

	public void setGameShortName(String gameShortName) {
		this.gameShortName = gameShortName;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(id, from, message, inlineMessageId, chatInstance, data, gameShortName);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CallbackQuery other))
			return false;
		return Objects.equals(id, other.id)
				&& Objects.equals(from, other.from)
				&& Objects.equals(message, other.message)
				&& Objects.equals(inlineMessageId, other.inlineMessageId)
				&& Objects.equals(chatInstance, other.chatInstance)
				&& Objects.equals(data, other.data)
				&& Objects.equals(gameShortName, other.gameShortName);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CallbackQuery[id=").append(id)
				.append(", from=").append(from)
				.append(", message=").append(message)
				.append(", inlineMessageId=").append(inlineMessageId)
				.append(", chatInstance=").append(chatInstance)
				.append(", data=").append(data)
				.append(", gameShortName=").append(gameShortName).append("]");
		return builder.toString();
	}
}
