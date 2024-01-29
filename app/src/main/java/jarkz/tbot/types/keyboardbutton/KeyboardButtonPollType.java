package jarkz.tbot.types.keyboardbutton;

import java.util.Objects;
import java.util.Optional;

/**
 * This object represents type of a poll, which is allowed to be created and sent when the
 * corresponding button is pressed.
 *
 * @author Pavel Bialiauski
 */
public class KeyboardButtonPollType {

  private String type;

  /** Default constructor. */
  public KeyboardButtonPollType() {}

  /**
   * <i>Optional.</i> If <i>quiz</i> is passed, the user will be allowed to create only polls in the
   * quiz mode. If <i>regular</i> is passed, only regular polls will be allowed. Otherwise, the user
   * will be allowed to create a poll of any type.
   *
   * @return an optional value of type as String.
   */
  public Optional<String> getType() {
    return Optional.ofNullable(type);
  }

  /**
   * If <i>quiz</i> is passed, the user will be allowed to create only polls in the quiz mode. If
   * <i>regular</i> is passed, only regular polls will be allowed. Otherwise, the user will be
   * allowed to create a poll of any type.
   *
   * @param type the poll type ("quiz" or "regular") as String or null if any poll type.
   */
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof KeyboardButtonPollType other)) return false;
    return Objects.equals(type, other.type);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("KeyboardButtonPollType[type=").append(type).append("]");
    return builder.toString();
  }
}
