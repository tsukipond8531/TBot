package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object defines the criteria used to request suitable users. The identifiers of the selected
 * users will be shared with the bot when the corresponding button is pressed. More about requesting
 * users: https://core.telegram.org/bots/features#chat-and-user-selection
 */
public final class KeyboardButtonRequestUsers {

  /**
   * Signed 32-bit identifier of the request that will be received back in the UsersShared object.
   * Must be unique within the message
   */
  @NotNull
  @SerializedName("request_id")
  public int requestId;

  /**
   * Optional. Pass True to request bots, pass False to request regular users. If not specified, no
   * additional restrictions are applied.
   */
  @SerializedName("user_is_bot")
  public Boolean userIsBot;

  /**
   * Optional. Pass True to request premium users, pass False to request non-premium users. If not
   * specified, no additional restrictions are applied.
   */
  @SerializedName("user_is_premium")
  public Boolean userIsPremium;

  /** Optional. The maximum number of users to be selected; 1-10. Defaults to 1. */
  @SerializedName("max_quantity")
  public Integer maxQuantity;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof KeyboardButtonRequestUsers other)) return false;
    return requestId == other.requestId
        && Objects.equals(userIsBot, other.userIsBot)
        && Objects.equals(userIsPremium, other.userIsPremium)
        && Objects.equals(maxQuantity, other.maxQuantity);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(requestId, userIsBot, userIsPremium, maxQuantity);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("KeyboardButtonRequestUsers[requestId=")
        .append(requestId)
        .append(", userIsBot=")
        .append(userIsBot)
        .append(", userIsPremium=")
        .append(userIsPremium)
        .append(", maxQuantity=")
        .append(maxQuantity)
        .append("]");
    return builder.toString();
  }
}
