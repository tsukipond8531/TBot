package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a bot command. */
public final class BotCommand {

  /**
   * Text of the command; 1-32 characters. Can contain only lowercase English letters, digits and
   * underscores.
   */
  @NotNull public String command;

  /** Description of the command; 1-256 characters. */
  @NotNull public String description;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotCommand other)) return false;
    return Objects.equals(command, other.command) && Objects.equals(description, other.description);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(command, description);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("BotCommand[command=")
        .append(command)
        .append(", description=")
        .append(description)
        .append("]");
    return builder.toString();
  }
}
