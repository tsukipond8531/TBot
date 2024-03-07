package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents one row of the high scores table for a game. */
public final class GameHighScore {

  /** Position in high score table for the game */
  @NotNull public int position;

  /** User */
  @NotNull public User user;

  /** Score */
  @NotNull public int score;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GameHighScore other)) return false;
    return position == other.position && Objects.equals(user, other.user) && score == other.score;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(position, user, score);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("GameHighScore[position=")
        .append(position)
        .append(", user=")
        .append(user)
        .append(", score=")
        .append(score)
        .append("]");
    return builder.toString();
  }
}
