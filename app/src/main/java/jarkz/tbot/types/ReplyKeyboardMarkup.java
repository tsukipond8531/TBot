package jarkz.tbot.types;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.keyboardbutton.KeyboardButton;

public class ReplyKeyboardMarkup {

	@NotNull
	private List<List<KeyboardButton>> keyboard;

	@SerializedName("is_persistent")
	private Boolean isPersistent;

	@SerializedName("resize_keyboard")
	private Boolean resizeKeyboard;

	@SerializedName("one_time_keyboard")
	private Boolean oneTimeKeyboard;

	@SerializedName("input_field_placeholder")
	private String inputFieldPlaceholder;

	private Boolean selective;

	public ReplyKeyboardMarkup() {
	}

	public List<List<KeyboardButton>> getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(List<List<KeyboardButton>> keyboard) {
		this.keyboard = keyboard;
	}

	public Optional<Boolean> isPersistent() {
		return Optional.of(isPersistent);
	}

	public void setPersistent(Boolean isPersistent) {
		this.isPersistent = isPersistent;
	}

	public Optional<Boolean> isResizeKeyboard() {
		return Optional.of(resizeKeyboard);
	}

	public void setResizeKeyboard(Boolean resizeKeyboard) {
		this.resizeKeyboard = resizeKeyboard;
	}

	public Optional<Boolean> isOneTimeKeyboard() {
		return Optional.of(oneTimeKeyboard);
	}

	public void setOneTimeKeyboard(Boolean oneTimeKeyboard) {
		this.oneTimeKeyboard = oneTimeKeyboard;
	}

	public Optional<String> getInputFieldPlaceholder() {
		return Optional.of(inputFieldPlaceholder);
	}

	public void setInputFieldPlaceholder(String inputFieldPlaceholder) {
		this.inputFieldPlaceholder = inputFieldPlaceholder;
	}

	public Optional<Boolean> isSelective() {
		return Optional.of(selective);
	}

	public void setSelective(Boolean selective) {
		this.selective = selective;
	}

	@Override
	public int hashCode() {
		return Objects.hash(keyboard, isPersistent, resizeKeyboard, oneTimeKeyboard, inputFieldPlaceholder, selective);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ReplyKeyboardMarkup other))
			return false;
		return Objects.equals(keyboard, other.keyboard)
				&& Objects.equals(isPersistent, other.isPersistent)
				&& Objects.equals(resizeKeyboard, other.resizeKeyboard)
				&& Objects.equals(oneTimeKeyboard, other.oneTimeKeyboard)
				&& Objects.equals(inputFieldPlaceholder, other.inputFieldPlaceholder)
				&& Objects.equals(selective, other.selective);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReplyKeyboardMarkup[keyboard=").append(keyboard)
				.append(", isPersistent=").append(isPersistent)
				.append(", resizeKeyboard=").append(resizeKeyboard)
				.append(", oneTimeKeyboard=").append(oneTimeKeyboard)
				.append(", inputFieldPlaceholder=").append(inputFieldPlaceholder)
				.append(", selective=").append(selective).append("]");
		return builder.toString();
	}
}
