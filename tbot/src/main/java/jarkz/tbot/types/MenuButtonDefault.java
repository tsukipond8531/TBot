package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Describes that no specific value for the menu button was set. */
public final class MenuButtonDefault implements MenuButton {

  public static final class Builder {

    private MenuButtonDefault buildingType;

    public Builder() {
      buildingType = new MenuButtonDefault();
    }

    public MenuButtonDefault build() {
      return buildingType;
    }
  }

  public static final String TYPE = "default";

  /** Type of the button, must be default */
  @NotNull public final String type = TYPE;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MenuButtonDefault other)) return false;
    return Objects.equals(type, other.type);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("MenuButtonDefault[type=").append(type).append("]");
    return builder.toString();
  }
}
