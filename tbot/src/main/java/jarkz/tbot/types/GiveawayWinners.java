package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object represents a message about the completion of a giveaway with public winners. */
public final class GiveawayWinners {

  public static final class Builder {

    private GiveawayWinners buildingType;

    public Builder() {
      buildingType = new GiveawayWinners();
    }

    public Builder setChat(Chat chat) {
      buildingType.chat = chat;
      return this;
    }

    public Builder setGiveawayMessageId(int giveawayMessageId) {
      buildingType.giveawayMessageId = giveawayMessageId;
      return this;
    }

    public Builder setWinnersSelectionDate(int winnersSelectionDate) {
      buildingType.winnersSelectionDate = winnersSelectionDate;
      return this;
    }

    public Builder setWinnerCount(int winnerCount) {
      buildingType.winnerCount = winnerCount;
      return this;
    }

    public Builder setWinners(List<User> winners) {
      buildingType.winners = winners;
      return this;
    }

    public Builder setAdditionalChatCount(Integer additionalChatCount) {
      buildingType.additionalChatCount = additionalChatCount;
      return this;
    }

    public Builder setPremiumSubscriptionMonthCount(Integer premiumSubscriptionMonthCount) {
      buildingType.premiumSubscriptionMonthCount = premiumSubscriptionMonthCount;
      return this;
    }

    public Builder setUnclaimedPrizeCount(Integer unclaimedPrizeCount) {
      buildingType.unclaimedPrizeCount = unclaimedPrizeCount;
      return this;
    }

    public Builder setOnlyNewMembers(Boolean onlyNewMembers) {
      buildingType.onlyNewMembers = onlyNewMembers;
      return this;
    }

    public Builder setWasRefunded(Boolean wasRefunded) {
      buildingType.wasRefunded = wasRefunded;
      return this;
    }

    public Builder setPrizeDescription(String prizeDescription) {
      buildingType.prizeDescription = prizeDescription;
      return this;
    }

    public GiveawayWinners build() {
      return buildingType;
    }
  }

  /** The chat that created the giveaway */
  @NotNull public Chat chat;

  /** Identifier of the message with the giveaway in the chat */
  @NotNull
  @SerializedName("giveaway_message_id")
  public int giveawayMessageId;

  /** Point in time (Unix timestamp) when winners of the giveaway were selected */
  @NotNull
  @SerializedName("winners_selection_date")
  public int winnersSelectionDate;

  /** Total number of winners in the giveaway */
  @NotNull
  @SerializedName("winner_count")
  public int winnerCount;

  /** List of up to 100 winners of the giveaway */
  @NotNull public List<User> winners;

  /**
   * Optional. The number of other chats the user had to join in order to be eligible for the
   * giveaway
   */
  @SerializedName("additional_chat_count")
  public Integer additionalChatCount;

  /**
   * Optional. The number of months the Telegram Premium subscription won from the giveaway will be
   * active for
   */
  @SerializedName("premium_subscription_month_count")
  public Integer premiumSubscriptionMonthCount;

  /** Optional. Number of undistributed prizes */
  @SerializedName("unclaimed_prize_count")
  public Integer unclaimedPrizeCount;

  /**
   * Optional. True, if only users who had joined the chats after the giveaway started were eligible
   * to win
   */
  @SerializedName("only_new_members")
  public Boolean onlyNewMembers;

  /** Optional. True, if the giveaway was canceled because the payment for it was refunded */
  @SerializedName("was_refunded")
  public Boolean wasRefunded;

  /** Optional. Description of additional giveaway prize */
  @SerializedName("prize_description")
  public String prizeDescription;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GiveawayWinners other)) return false;
    return Objects.equals(chat, other.chat)
        && giveawayMessageId == other.giveawayMessageId
        && winnersSelectionDate == other.winnersSelectionDate
        && winnerCount == other.winnerCount
        && Objects.equals(winners, other.winners)
        && Objects.equals(additionalChatCount, other.additionalChatCount)
        && Objects.equals(premiumSubscriptionMonthCount, other.premiumSubscriptionMonthCount)
        && Objects.equals(unclaimedPrizeCount, other.unclaimedPrizeCount)
        && Objects.equals(onlyNewMembers, other.onlyNewMembers)
        && Objects.equals(wasRefunded, other.wasRefunded)
        && Objects.equals(prizeDescription, other.prizeDescription);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chat,
        giveawayMessageId,
        winnersSelectionDate,
        winnerCount,
        winners,
        additionalChatCount,
        premiumSubscriptionMonthCount,
        unclaimedPrizeCount,
        onlyNewMembers,
        wasRefunded,
        prizeDescription);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("GiveawayWinners[chat=")
        .append(chat)
        .append(", giveawayMessageId=")
        .append(giveawayMessageId)
        .append(", winnersSelectionDate=")
        .append(winnersSelectionDate)
        .append(", winnerCount=")
        .append(winnerCount)
        .append(", winners=")
        .append(winners)
        .append(", additionalChatCount=")
        .append(additionalChatCount)
        .append(", premiumSubscriptionMonthCount=")
        .append(premiumSubscriptionMonthCount)
        .append(", unclaimedPrizeCount=")
        .append(unclaimedPrizeCount)
        .append(", onlyNewMembers=")
        .append(onlyNewMembers)
        .append(", wasRefunded=")
        .append(wasRefunded)
        .append(", prizeDescription=")
        .append(prizeDescription)
        .append("]");
    return builder.toString();
  }
}
