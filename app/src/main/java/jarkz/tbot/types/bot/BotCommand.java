package jarkz.tbot.types.bot;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a bot command.
 *
 * @author Pavel Bialiauski
 */
public class BotCommand {

  @NotNull private String command;

  @NotNull private String description;

  /** Default constructor. */
  public BotCommand() {}

  /**
   * Text of the command; 1-32 characters. Can contain only lowercase English letters, digits and
   * underscores.
   *
   * @return command as String.
   */
  public String getCommand() {
    return command;
  }

  /**
   * Sets the text of the command; 1-32 characters. Can contain only lowercase English letters,
   * digits and underscores.
   *
   * @param command the text of the command (1-32 characters), which can conatain only lowercase
   *     English letters, digits and underscore, as String.
   */
  public void setCommand(String command) {
    this.command = command;
  }

  /**
   * Description of the command; 1-256 characters.
   *
   * @return description as String.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the description of the command; 1-256 characters.
   *
   * @param description the description of the command (1-256 characters) as String.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(command, description);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotCommand other)) return false;
    return Objects.equals(command, other.command) && Objects.equals(description, other.description);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("BotCommand[command=")
        .append(command)
        .append(", description=")
        .append(description)
        .append("]");
    return builder.toString();
  }
}
