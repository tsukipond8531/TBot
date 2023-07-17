package jarkz.tbot.types.bot;

import java.util.Objects;

import jakarta.validation.constraints.NotNull;

public class BotCommand {

	@NotNull
	private String command;

	@NotNull
	private String description;

	public BotCommand() {
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		return Objects.hash(command, description);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BotCommand other))
			return false;
		return Objects.equals(command, other.command) && Objects.equals(description, other.description);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BotCommand[command=").append(command).append(", description=").append(description).append("]");
		return builder.toString();
	}
}
