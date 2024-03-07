package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object contains information about one answer option in a poll. */
public final class PollOption {

  public static final class Builder {

    private PollOption buildingType;

    public Builder() {
      buildingType = new PollOption();
    }

    public Builder setText(String text) {
      buildingType.text = text;
      return this;
    }

    public Builder setVoterCount(int voterCount) {
      buildingType.voterCount = voterCount;
      return this;
    }

    public PollOption build() {
      return buildingType;
    }
  }

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
