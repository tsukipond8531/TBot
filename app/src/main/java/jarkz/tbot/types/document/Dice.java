package jarkz.tbot.types.document;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents an animated emoji that displays a random value.
 *
 * @author Pavel Bialiauski
 */
public class Dice {

  @NotNull private String emoji;

  @NotNull private int value;

  /** Default constructor. */
  public Dice() {}

  /**
   * Emoji on which the dice throw animation is based.
   *
   * @return emoji as String.
   */
  public String getEmoji() {
    return emoji;
  }

  /**
   * Sets the emoji on which the dice throw animation is based.
   *
   * @param emoji the emoji on which the dice throw animation is based as String.
   */
  public void setEmoji(String emoji) {
    this.emoji = emoji;
  }

  /**
   * Value of the dice, 1-6 for “<img alt="🎲" class="emoji" height="20" src=
   * "https://telegram.org/img/emoji/40/F09F8EB2.png" width="20"/>”, “<img alt="🎯" class="emoji"
   * height="20" src= "https://telegram.org/img/emoji/40/F09F8EAF.png" width= "20"/>” and “<img
   * alt="🎳" class="emoji" height="20" src= "https://telegram.org/img/emoji/40/F09F8EB3.png"
   * width="20"/>” base emoji, 1-5 for “<img alt="🏀" class="emoji" height="20" src=
   * "https://telegram.org/img/emoji/40/F09F8F80.png" width="20"/>” and “<img alt="⚽" class="emoji"
   * height="20" src= "https://telegram.org/img/emoji/40/E29ABD.png" width="20"/>” base emoji, 1-64
   * for “<img alt="🎰" class="emoji" height="20" src=
   * "https://telegram.org/img/emoji/40/F09F8EB0.png" width="20"/>” base emoji.
   *
   * @return value as int.
   */
  public int getValue() {
    return value;
  }

  /**
   * Sets the value of the dice, 1-6 for “<img alt="🎲" class="emoji" height="20" src=
   * "https://telegram.org/img/emoji/40/F09F8EB2.png" width="20"/>”, “<img alt="🎯" class="emoji"
   * height="20" src= "https://telegram.org/img/emoji/40/F09F8EAF.png" width= "20"/>” and “<img
   * alt="🎳" class="emoji" height="20" src= "https://telegram.org/img/emoji/40/F09F8EB3.png"
   * width="20"/>” base emoji, 1-5 for “<img alt="🏀" class="emoji" height="20" src=
   * "https://telegram.org/img/emoji/40/F09F8F80.png" width="20"/>” and “<img alt="⚽" class="emoji"
   * height="20" src= "https://telegram.org/img/emoji/40/E29ABD.png" width="20"/>” base emoji, 1-64
   * for “<img alt="🎰" class="emoji" height="20" src=
   * "https://telegram.org/img/emoji/40/F09F8EB0.png" width="20"/>” base emoji.
   *
   * @param value the value of the dice as int.
   */
  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(emoji, value);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Dice other)) return false;
    return Objects.equals(emoji, other.emoji) && value == other.value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Dice[emoji=").append(emoji).append(", value=").append(value).append("]");
    return builder.toString();
  }
}
