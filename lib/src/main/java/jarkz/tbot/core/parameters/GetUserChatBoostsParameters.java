package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to get the list of boosts added to a chat by a user. Requires administrator
 * rights in the chat. Returns a UserChatBoosts object.
 */
public final class GetUserChatBoostsParameters {

  /** Unique identifier for the chat or username of the channel (in the format @channelusername) */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** Unique identifier of the target user */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetUserChatBoostsParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && userId == other.userId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, userId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("GetUserChatBoostsParameters[chatId=")
        .append(chatId)
        .append(", userId=")
        .append(userId)
        .append("]");
    return builder.toString();
  }
}
