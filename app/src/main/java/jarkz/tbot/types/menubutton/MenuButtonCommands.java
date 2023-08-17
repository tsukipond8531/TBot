package jarkz.tbot.types.menubutton;

import java.util.Objects;

public class MenuButtonCommands implements MenuButton {

	protected static final String TYPE = "commands";

	private final String type = MenuButtonCommands.TYPE;

	public MenuButtonCommands() {
	}

	public String getType() {
		return type;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(type);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MenuButtonCommands other))
			return false;
		return Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MenuButtonCommands[type=").append(type).append("]");
		return builder.toString();
	}
}
