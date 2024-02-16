package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents a chat member that has no additional privileges or restrictions. */
public final class ChatMemberMember implements ChatMember {

  /** The member's status in the chat, always "member" */
  @NotNull public String status;

  /** Information about the user */
  @NotNull public User user;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatMemberMember other)) return false;
    return Objects.equals(status, other.status) && Objects.equals(user, other.user);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(status, user);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatMemberMember[status=")
        .append(status)
        .append(", user=")
        .append(user)
        .append("]");
    return builder.toString();
  }
}
