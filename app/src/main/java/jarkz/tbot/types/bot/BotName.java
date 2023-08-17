package jarkz.tbot.types.bot;

import java.util.Objects;

import jakarta.validation.constraints.NotNull;

public class BotName {

	@NotNull
	private String name;

	public BotName() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BotName other))
			return false;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BotName[name=").append(name).append("]");
		return builder.toString();
	}
}
