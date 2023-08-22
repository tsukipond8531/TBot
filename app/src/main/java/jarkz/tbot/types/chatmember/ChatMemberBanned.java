package jarkz.tbot.types.chatmember;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import java.util.Objects;

/**
 * Represents a <a href="https://core.telegram.org/bots/api#chatmember">chat member</a> that was
 * banned in the chat and can't return to the chat or view chat messages.
 *
 * @author Pavel Bialiauski
 */
public class ChatMemberBanned implements ChatMember {

  /**
   * Status of {@link ChatMember}. Always "kicked".
   */
  protected static final String STATUS = "kicked";

  private final String status = ChatMemberBanned.STATUS;

  @NotNull private User user;

  @SerializedName("until_date")
  @NotNull
  private long untilDate;

  /**
   * Default constructor.
   */
  public ChatMemberBanned() {}

  /**
   * The member's status in the chat, always “kicked”.
   *
   * @return status as String.
   */
  public String getStatus() {
    return status;
  }

  /**
   * Information about the user.
   *
   * @return user as {@link User}.
   */
  public User getUser() {
    return user;
  }

  /**
   * Sets the information about the user.
   *
   * @param user the information about the user as {@link User}.
   */
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * Date when restrictions will be lifted for this user; unix time. If 0, then the user is banned
   * forever.
   *
   * @return until_date as long.
   */
  public long getUntilDate() {
    return untilDate;
  }

  /**
   * Sets the date when restrictions will be lifted for this user; unix time. If 0, then the user is
   * banned forever.
   *
   * @param untilDate the date when restrictions will be lifted for this user (unix time) as long (0
   *     – forever).
   */
  public void setUntilDate(long untilDate) {
    this.untilDate = untilDate;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(status, user, untilDate);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatMemberBanned other)) return false;
    return Objects.equals(status, other.status)
        && Objects.equals(user, other.user)
        && untilDate == other.untilDate;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ChatMemberBanned[status=")
        .append(status)
        .append(", user=")
        .append(user)
        .append(", untilDate=")
        .append(untilDate)
        .append("]");
    return builder.toString();
  }
}
