package jarkz.tbot.types.chatmember;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import java.util.Objects;

public class ChatMemberMember implements ChatMember {

  protected static final String STATUS = "member";

  private final String status = ChatMemberMember.STATUS;

  @NotNull private User user;

  public ChatMemberMember() {}

  public String getStatus() {
    return status;
  }

  public User getUser() {
    return user;
  }

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
    if (!(obj instanceof ChatMemberMember other)) return false;
    return Objects.equals(status, other.status) && Objects.equals(user, other.user);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ChatMemberMember[status=")
        .append(status)
        .append(", user=")
        .append(user)
        .append("]");
    return builder.toString();
  }
}
