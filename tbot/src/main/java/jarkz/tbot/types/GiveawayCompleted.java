package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a service message about the completion of a giveaway without public
 * winners.
 */
public final class GiveawayCompleted {

  /** Number of winners in the giveaway */
  @NotNull
  @SerializedName("winner_count")
  public int winnerCount;

  /** Optional. Number of undistributed prizes */
  @SerializedName("unclaimed_prize_count")
  public Integer unclaimedPrizeCount;

  /** Optional. Message with the giveaway that was completed, if it wasn't deleted */
  @SerializedName("giveaway_message")
  public Message giveawayMessage;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GiveawayCompleted other)) return false;
    return winnerCount == other.winnerCount
        && Objects.equals(unclaimedPrizeCount, other.unclaimedPrizeCount)
        && Objects.equals(giveawayMessage, other.giveawayMessage);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(winnerCount, unclaimedPrizeCount, giveawayMessage);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("GiveawayCompleted[winnerCount=")
        .append(winnerCount)
        .append(", unclaimedPrizeCount=")
        .append(unclaimedPrizeCount)
        .append(", giveawayMessage=")
        .append(giveawayMessage)
        .append("]");
    return builder.toString();
  }
}
