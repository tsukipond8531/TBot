package jarkz.tbot.types.document;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

public class Dice {

  @NotNull private String emoji;

  @NotNull private int value;

  public Dice() {}

  public String getEmoji() {
    return emoji;
  }

  public void setEmoji(String emoji) {
    this.emoji = emoji;
  }

  public int getValue() {
    return value;
  }

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
