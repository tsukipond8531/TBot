package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * The boost was obtained by the creation of a Telegram Premium giveaway. This boosts the chat 4
 * times for the duration of the corresponding Telegram Premium subscription.
 */
public final class ChatBoostSourceGiveaway implements ChatBoostSource {

  public static final class Builder {

    private ChatBoostSourceGiveaway buildingType;

    public Builder() {
      buildingType = new ChatBoostSourceGiveaway();
    }

    public Builder setGiveawayMessageId(int giveawayMessageId) {
      buildingType.giveawayMessageId = giveawayMessageId;
      return this;
    }

    public Builder setUser(User user) {
      buildingType.user = user;
      return this;
    }

    public Builder setIsUnclaimed(Boolean isUnclaimed) {
      buildingType.isUnclaimed = isUnclaimed;
      return this;
    }

    public ChatBoostSourceGiveaway build() {
      return buildingType;
    }
  }

  public static final String SOURCE = "giveaway";

  /** Source of the boost, always "giveaway" */
  @NotNull public final String source = SOURCE;

  /**
   * Identifier of a message in the chat with the giveaway; the message could have been deleted
   * already. May be 0 if the message isn't sent yet.
   */
  @NotNull
  @SerializedName("giveaway_message_id")
  public int giveawayMessageId;

  /** Optional. User that won the prize in the giveaway if any */
  public User user;

  /** Optional. True, if the giveaway was completed, but there was no user to win the prize */
  @SerializedName("is_unclaimed")
  public Boolean isUnclaimed;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatBoostSourceGiveaway other)) return false;
    return Objects.equals(source, other.source)
        && giveawayMessageId == other.giveawayMessageId
        && Objects.equals(user, other.user)
        && Objects.equals(isUnclaimed, other.isUnclaimed);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(source, giveawayMessageId, user, isUnclaimed);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatBoostSourceGiveaway[source=")
        .append(source)
        .append(", giveawayMessageId=")
        .append(giveawayMessageId)
        .append(", user=")
        .append(user)
        .append(", isUnclaimed=")
        .append(isUnclaimed)
        .append("]");
    return builder.toString();
  }
}
