package jarkz.tbot.types.menubutton;

import java.util.Objects;

public class MenuButtonDefault implements MenuButton {

  protected static final String TYPE = "default";

  private final String type = MenuButtonDefault.TYPE;

  public MenuButtonDefault() {}

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
    if (!(obj instanceof MenuButtonDefault other)) return false;
    return Objects.equals(type, other.type);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("MenuButtonDefault[type=").append(type).append("]");
    return builder.toString();
  }
}
