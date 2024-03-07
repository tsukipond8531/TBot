package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents a reaction added to a message along with the number of times it was added. */
public final class ReactionCount {

  public static final class Builder {

    private ReactionCount buildingType;

    public Builder() {
      buildingType = new ReactionCount();
    }

    public Builder setType(ReactionType type) {
      buildingType.type = type;
      return this;
    }

    public Builder setTotalCount(int totalCount) {
      buildingType.totalCount = totalCount;
      return this;
    }

    public ReactionCount build() {
      return buildingType;
    }
  }

  /** Type of the reaction */
  @NotNull public ReactionType type;

  /** Number of times the reaction was added */
  @NotNull
  @SerializedName("total_count")
  public int totalCount;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ReactionCount other)) return false;
    return Objects.equals(type, other.type) && totalCount == other.totalCount;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, totalCount);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ReactionCount[type=")
        .append(type)
        .append(", totalCount=")
        .append(totalCount)
        .append("]");
    return builder.toString();
  }
}
