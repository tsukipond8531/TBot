package jarkz.tbot.types.inlinemode;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class InlineQueryResultGame implements InlineQueryResult {

	protected static final String TYPE = "game";

	private final String type = InlineQueryResultGame.TYPE;

	@NotNull
	private String id;

	@SerializedName("game_short_name")
	@NotNull
	private String gameShortName;

	@SerializedName("reply_markup")
	private InlineKeyboardMarkup replyMarkup;

	public InlineQueryResultGame() {
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

	public String getGameShortName() {
		return gameShortName;
	}

	public void setGameShortName(String gameShortName) {
		this.gameShortName = gameShortName;
	}

	public Optional<InlineKeyboardMarkup> getReplyMarkup() {
		return Optional.of(replyMarkup);
	}

	public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
		this.replyMarkup = replyMarkup;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(type, id, gameShortName, replyMarkup);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InlineQueryResultGame other))
			return false;
		return Objects.equals(type, other.type)
				&& Objects.equals(id, other.id)
				&& Objects.equals(gameShortName, other.gameShortName)
				&& Objects.equals(replyMarkup, other.replyMarkup);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InlineQueryResultGame[type=").append(type)
				.append(", id=").append(id)
				.append(", gameShortName=").append(gameShortName)
				.append(", replyMarkup=").append(replyMarkup).append("]");
		return builder.toString();
	}
}
