package jarkz.tbot.types.keyboardbutton;

import java.util.Objects;
import java.util.Optional;

public class KeyboardButtonPollType {

	private String type;

	public KeyboardButtonPollType(){
	}

	public Optional<String> getType() {
		return Optional.of(type);
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(type);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof KeyboardButtonPollType other))
			return false;
		return Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KeyboardButtonPollType[type=").append(type).append("]");
		return builder.toString();
	}
}
