package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object contains information about one answer option in a poll. */
public final class PollOption {

  /** Option text, 1-100 characters */
  @NotNull public String text;

  /** Number of users that voted for this option */
  @NotNull
  @SerializedName("voter_count")
  public int voterCount;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PollOption other)) return false;
    return Objects.equals(text, other.text) && voterCount == other.voterCount;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(text, voterCount);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("PollOption[text=")
        .append(text)
        .append(", voterCount=")
        .append(voterCount)
        .append("]");
    return builder.toString();
  }
}
