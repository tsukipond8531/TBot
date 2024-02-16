package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object represents a message about a scheduled giveaway. */
public final class Giveaway {

  /** The list of chats which the user must join to participate in the giveaway */
  @NotNull public List<Chat> chats;

  /** Point in time (Unix timestamp) when winners of the giveaway will be selected */
  @SerializedName("winners_selection_date")
  @NotNull
  public int winnersSelectionDate;

  /** The number of users which are supposed to be selected as winners of the giveaway */
  @NotNull
  @SerializedName("winner_count")
  public int winnerCount;

  /**
   * Optional. True, if only users who join the chats after the giveaway started should be eligible
   * to win
   */
  @SerializedName("only_new_members")
  public Boolean onlyNewMembers;

  /** Optional. True, if the list of giveaway winners will be visible to everyone */
  @SerializedName("has_public_winners")
  public Boolean hasPublicWinners;

  /** Optional. Description of additional giveaway prize */
  @SerializedName("prize_description")
  public String prizeDescription;

  /**
   * Optional. A list of two-letter ISO 3166-1 alpha-2 country codes indicating the countries from
   * which eligible users for the giveaway must come. If empty, then all users can participate in
   * the giveaway. Users with a phone number that was bought on Fragment can always participate in
   * giveaways.
   */
  @SerializedName("country_codes")
  public List<String> countryCodes;

  /**
   * Optional. The number of months the Telegram Premium subscription won from the giveaway will be
   * active for
   */
  @SerializedName("premium_subscription_month_count")
  public Integer premiumSubscriptionMonthCount;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Giveaway other)) return false;
    return Objects.equals(chats, other.chats)
        && winnersSelectionDate == other.winnersSelectionDate
        && winnerCount == other.winnerCount
        && Objects.equals(onlyNewMembers, other.onlyNewMembers)
        && Objects.equals(hasPublicWinners, other.hasPublicWinners)
        && Objects.equals(prizeDescription, other.prizeDescription)
        && Objects.equals(countryCodes, other.countryCodes)
        && Objects.equals(premiumSubscriptionMonthCount, other.premiumSubscriptionMonthCount);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chats,
        winnersSelectionDate,
        winnerCount,
        onlyNewMembers,
        hasPublicWinners,
        prizeDescription,
        countryCodes,
        premiumSubscriptionMonthCount);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("Giveaway[chats=")
        .append(chats)
        .append(", winnersSelectionDate=")
        .append(winnersSelectionDate)
        .append(", winnerCount=")
        .append(winnerCount)
        .append(", onlyNewMembers=")
        .append(onlyNewMembers)
        .append(", hasPublicWinners=")
        .append(hasPublicWinners)
        .append(", prizeDescription=")
        .append(prizeDescription)
        .append(", countryCodes=")
        .append(countryCodes)
        .append(", premiumSubscriptionMonthCount=")
        .append(premiumSubscriptionMonthCount)
        .append("]");
    return builder.toString();
  }
}
