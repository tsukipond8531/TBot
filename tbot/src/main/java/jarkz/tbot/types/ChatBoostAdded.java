package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a service message about a user boosting a chat. */
public final class ChatBoostAdded {

  public static final class Builder {

    private ChatBoostAdded buildingType;

    public Builder() {
      buildingType = new ChatBoostAdded();
    }

    public Builder setBoostCount(int boostCount) {
      buildingType.boostCount = boostCount;
      return this;
    }

    public ChatBoostAdded build() {
      return buildingType;
    }
  }

  /** Number of boosts added by the user */
  @NotNull
  @SerializedName("boost_count")
  public int boostCount;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatBoostAdded other)) return false;
    return boostCount == other.boostCount;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(boostCount);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("ChatBoostAdded[boostCount=").append(boostCount).append("]");
    return builder.toString();
  }
}
