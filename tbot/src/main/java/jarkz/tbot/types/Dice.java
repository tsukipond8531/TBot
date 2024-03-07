package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents an animated emoji that displays a random value. */
public final class Dice {

  public static final class Builder {

    private Dice buildingType;

    public Builder() {
      buildingType = new Dice();
    }

    public Builder setEmoji(String emoji) {
      buildingType.emoji = emoji;
      return this;
    }

    public Builder setValue(int value) {
      buildingType.value = value;
      return this;
    }

    public Dice build() {
      return buildingType;
    }
  }

  /** Emoji on which the dice throw animation is based */
  @NotNull public String emoji;

  /**
   * Value of the dice, 1-6 for "🎲", "🎯" and "🎳" base emoji, 1-5 for "🏀" and "⚽" base emoji,
   * 1-64 for "🎰" base emoji
   */
  @NotNull public int value;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Dice other)) return false;
    return Objects.equals(emoji, other.emoji) && value == other.value;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(emoji, value);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("Dice[emoji=").append(emoji).append(", value=").append(value).append("]");
    return builder.toString();
  }
}
