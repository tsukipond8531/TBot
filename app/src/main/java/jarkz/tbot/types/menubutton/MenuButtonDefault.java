package jarkz.tbot.types.menubutton;

import java.util.Objects;

/**
 * Describes that no specific value for the menu button was set.
 *
 * @author Pavel Bialiauski
 */
public class MenuButtonDefault implements MenuButton {

  /** Type of {@link MenuButton}. Always "default". */
  protected static final String TYPE = "default";

  private final String type = MenuButtonDefault.TYPE;

  /** Default constructor. */
  public MenuButtonDefault() {}

  /**
   * Type of the button, must be <i>default</i>.
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
