package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object contains information about a chat boost. */
public final class ChatBoost {

  /** Unique identifier of the boost */
  @NotNull
  @SerializedName("boost_id")
  public String boostId;

  /** Point in time (Unix timestamp) when the chat was boosted */
  @NotNull
  @SerializedName("add_date")
  public int addDate;

  /**
   * Point in time (Unix timestamp) when the boost will automatically expire, unless the booster's
   * Telegram Premium subscription is prolonged
   */
  @NotNull
  @SerializedName("expiration_date")
  public int expirationDate;

  /** Source of the added boost */
  @NotNull public ChatBoostSource source;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatBoost other)) return false;
    return Objects.equals(boostId, other.boostId)
        && addDate == other.addDate
        && expirationDate == other.expirationDate
        && Objects.equals(source, other.source);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(boostId, addDate, expirationDate, source);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatBoost[boostId=")
        .append(boostId)
        .append(", addDate=")
        .append(addDate)
        .append(", expirationDate=")
        .append(expirationDate)
        .append(", source=")
        .append(source)
        .append("]");
    return builder.toString();
  }
}
