package jarkz.tbot.types.poll;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object contains information about one answer option in a poll.
 *
 * @author Pavel Bialiauski
 */
public class PollOption {

  @NotNull private String text;

  @SerializedName("voter_count")
  @NotNull
  private int voterCount;

  /** Default constructor. */
  public PollOption() {}

  /**
   * Option text, 1-100 characters.
   *
   * @return text as String.
   */
  public String getText() {
    return text;
  }

  /**
   * Sets the option text, 1-100 characters.
   *
   * @param text the option text, 1-100 characters, as String.
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Number of users that voted for this option.
   *
   * @return voter_count as int.
   */
  public int getVoterCount() {
    return voterCount;
  }

  /**
   * Sets the number of users that voted for this option.
   *
   * @param voterCount the number of users that voted for this option as int.
   */
  public void setVoterCount(int voterCount) {
    this.voterCount = voterCount;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(text, voterCount);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PollOption other)) return false;
    return Objects.equals(text, other.text) && voterCount == other.voterCount;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("PollOption[text=")
        .append(text)
        .append(", voterCount=")
        .append(voterCount)
        .append("]");
    return builder.toString();
  }
}
