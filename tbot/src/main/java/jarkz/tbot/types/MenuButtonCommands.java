package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents a menu button, which opens the bot's list of commands. */
public final class MenuButtonCommands implements MenuButton {

  public static final class Builder {

    private MenuButtonCommands buildingType;

    public Builder() {
      buildingType = new MenuButtonCommands();
    }

    public MenuButtonCommands build() {
      return buildingType;
    }
  }

  public static final String TYPE = "commands";

  /** Type of the button, must be commands */
  @NotNull public final String type = TYPE;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MenuButtonCommands other)) return false;
    return Objects.equals(type, other.type);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("MenuButtonCommands[type=").append(type).append("]");
    return builder.toString();
  }
}
