package jarkz.tbot.types.menubutton;

import java.util.Objects;

/**
 * Represents a menu button, which opens the bot's list of commands.
 *
 * @author Pavel Bialiauski
 */
public class MenuButtonCommands implements MenuButton {

  /**
   * Type of {@link MenuButton}. Always "commands".
   */
  protected static final String TYPE = "commands";

  private final String type = MenuButtonCommands.TYPE;

  /** Default constructor. */
  public MenuButtonCommands() {}

  /**
   * Type of the button, must be <i>commands</i>.
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MenuButtonCommands other)) return false;
    return Objects.equals(type, other.type);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("MenuButtonCommands[type=").append(type).append("]");
    return builder.toString();
  }
}
