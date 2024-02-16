package jarkz.tbot.types;

import java.util.Objects;

/**
 * This object represents type of a poll, which is allowed to be created and sent when the
 * corresponding button is pressed.
 */
public final class KeyboardButtonPollType {

  /**
   * Optional. If quiz is passed, the user will be allowed to create only polls in the quiz mode. If
   * regular is passed, only regular polls will be allowed. Otherwise, the user will be allowed to
   * create a poll of any type.
   */
  public String type;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof KeyboardButtonPollType other)) return false;
    return Objects.equals(type, other.type);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("KeyboardButtonPollType[type=").append(type).append("]");
    return builder.toString();
  }
}
