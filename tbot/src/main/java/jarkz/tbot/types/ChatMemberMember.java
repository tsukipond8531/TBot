package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents a chat member that has no additional privileges or restrictions. */
public final class ChatMemberMember implements ChatMember {

  public static final class Builder {

    private ChatMemberMember buildingType;

    public Builder() {
      buildingType = new ChatMemberMember();
    }

    public Builder setUser(User user) {
      buildingType.user = user;
      return this;
    }

    public ChatMemberMember build() {
      return buildingType;
    }
  }

  public static final String STATUS = "member";

  /** The member's status in the chat, always "member" */
  @NotNull public final String status = STATUS;

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
