package jarkz.tbot.types.games;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import java.util.Objects;

/**
 * This object represents one row of the high scores table for a game.
 *
 * @author Pavel Bialiauski
 */
public class GameHighScore {

  @NotNull private int position;

  @NotNull private User user;

  @NotNull private int score;

  /** Default constructor. */
  public GameHighScore() {}

  /**
   * Position in high score table for the game.
   *
   * @return position as int.
   */
  public int getPosition() {
    return position;
  }

  /**
   * Sets the position in high score table for the game.
   *
   * @param position the position in high score table for the game as int.
   */
  public void setPosition(int position) {
    this.position = position;
  }

  /**
   * User.
   *
   * @return user as {@link User}.
   */
  public User getUser() {
    return user;
  }

  /**
   * Sets the user.
   *
   * @param user the user as {@link User}.
   */
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * Score.
   *
   * @return score as int.
   */
  public int getScore() {
    return score;
  }

  /**
   * Sets the score.
   *
   * @param score the score as int.
   */
  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(position, user, score);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GameHighScore other)) return false;
    return position == other.position && Objects.equals(user, other.user) && score == other.score;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
