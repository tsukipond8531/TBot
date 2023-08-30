package jarkz.tbot.types.chatmember;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import java.util.Objects;

/**
 * Represents a <a href="https://core.telegram.org/bots/api#chatmember">chat member</a> that isn't
 * currently a member of the chat, but may join it themselves.
 *
 * @author Pavel Bialiauski
 */
public class ChatMemberLeft implements ChatMember {

  /** Status of {@link ChatMember}. Always "left". */
  protected static final String STATUS = "left";

  private final String status = ChatMemberLeft.STATUS;

  @NotNull private User user;

  /** Default constructor. */
  public ChatMemberLeft() {}

  /**
   * The member's status in the chat, always “left”.
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

  @Override
  public final int hashCode() {
    return Objects.hash(status, user);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatMemberLeft other)) return false;
    return Objects.equals(status, other.status) && Objects.equals(user, other.user);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ChatMemberLeft[status=")
        .append(status)
        .append(", user=")
        .append(user)
        .append("]");
    return builder.toString();
  }
}
