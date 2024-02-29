package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to unban a previously banned user in a supergroup or channel. The user will not
 * return to the group or channel automatically, but will be able to join via link, etc. The bot
 * must be an administrator for this to work. By default, this method guarantees that after the call
 * the user is not a member of the chat, but will be able to join it. So if the user is a member of
 * the chat they will also be removed from the chat. If you don't want this, use the parameter
 * only_if_banned. Returns True on success.
 */
public final class UnbanChatMemberParameters {

  /**
   * Unique identifier for the target group or username of the target supergroup or channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** Unique identifier of the target user */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  /** Do nothing if the user is not banned */
  @SerializedName("only_if_banned")
  public Boolean onlyIfBanned;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof UnbanChatMemberParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && userId == other.userId
        && Objects.equals(onlyIfBanned, other.onlyIfBanned);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, userId, onlyIfBanned);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("UnbanChatMemberParameters[chatId=")
        .append(chatId)
        .append(", userId=")
        .append(userId)
        .append(", onlyIfBanned=")
        .append(onlyIfBanned)
        .append("]");
    return builder.toString();
  }
}
