package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to ban a user in a group, a supergroup or a channel. In the case of supergroups
 * and channels, the user will not be able to return to the chat on their own using invite links,
 * etc., unless unbanned first. The bot must be an administrator in the chat for this to work and
 * must have the appropriate administrator rights. Returns True on success.
 */
public final class BanChatMemberParameters {

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

  /**
   * Date when the user will be unbanned; Unix time. If user is banned for more than 366 days or
   * less than 30 seconds from the current time they are considered to be banned forever. Applied
   * for supergroups and channels only.
   */
  @SerializedName("until_date")
  public Integer untilDate;

  /**
   * Pass True to delete all messages from the chat for the user that is being removed. If False,
   * the user will be able to see messages in the group that were sent before the user was removed.
   * Always True for supergroups and channels.
   */
  @SerializedName("revoke_messages")
  public Boolean revokeMessages;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BanChatMemberParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && userId == other.userId
        && Objects.equals(untilDate, other.untilDate)
        && Objects.equals(revokeMessages, other.revokeMessages);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, userId, untilDate, revokeMessages);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("BanChatMemberParameters[chatId=")
        .append(chatId)
        .append(", userId=")
        .append(userId)
        .append(", untilDate=")
        .append(untilDate)
        .append(", revokeMessages=")
        .append(revokeMessages)
        .append("]");
    return builder.toString();
  }
}
