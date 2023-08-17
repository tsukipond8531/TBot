package jarkz.tbot.types.inlinemode;

import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class InlineKeyboardMarkup {

	@SerializedName("inline_keyboard")
	@NotNull
	private List<List<InlineKeyboardButton>> inlineKeyboard;

	public InlineKeyboardMarkup() {
	}

	public List<List<InlineKeyboardButton>> getInlineKeyboard() {
		return inlineKeyboard;
	}

	public void setInlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
		this.inlineKeyboard = inlineKeyboard;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(inlineKeyboard);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InlineKeyboardMarkup other))
			return false;
		return Objects.equals(inlineKeyboard, other.inlineKeyboard);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InlineKeyboardMarkup[inlineKeyboard=").append(inlineKeyboard).append("]");
		return builder.toString();
	}
}
