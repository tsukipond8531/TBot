package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Use this method to approve a chat join request. The bot must be an administrator in the chat for
 * this to work and must have the can_invite_users administrator right. Returns True on success.
 */
public final class ApproveChatJoinRequestParameters {

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public String chatId;

  /** Unique identifier of the target user */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ApproveChatJoinRequestParameters other)) return false;
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
        .append("ApproveChatJoinRequestParameters[chatId=")
        .append(chatId)
        .append(", userId=")
        .append(userId)
        .append("]");
    return builder.toString();
  }
}
