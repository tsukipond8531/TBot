package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** The reaction is based on an emoji. */
public final class ReactionTypeEmoji implements ReactionType {

  /** Type of the reaction, always "emoji" */
  @NotNull public String type;

  /**
   * Reaction emoji. Currently, it can be one of "👍", "👎", "❤", "🔥", "🥰", "👏", "😁", "🤔",
   * "🤯", "😱", "🤬", "😢", "🎉", "🤩", "🤮", "💩", "🙏", "👌", "🕊", "🤡", "🥱", "🥴", "😍", "🐳",
   * "❤‍🔥", "🌚", "🌭", "💯", "🤣", "⚡", "🍌", "🏆", "💔", "🤨", "😐", "🍓", "🍾", "💋", "🖕",
   * "😈", "😴", "😭", "🤓", "👻", "👨‍💻", "👀", "🎃", "🙈", "😇", "😨", "🤝", "✍", "🤗", "🫡",
   * "🎅", "🎄", "☃", "💅", "🤪", "🗿", "🆒", "💘", "🙉", "🦄", "😘", "💊", "🙊", "😎", "👾",
   * "🤷‍♂", "🤷", "🤷‍♀", "😡"
   */
  @NotNull public String emoji;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ReactionTypeEmoji other)) return false;
    return Objects.equals(type, other.type) && Objects.equals(emoji, other.emoji);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, emoji);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ReactionTypeEmoji[type=")
        .append(type)
        .append(", emoji=")
        .append(emoji)
        .append("]");
    return builder.toString();
  }
}
