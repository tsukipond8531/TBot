package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents a chat member that isn't currently a member of the chat, but may join it themselves.
 */
public final class ChatMemberLeft implements ChatMember {

  public static final class Builder {

    private ChatMemberLeft buildingType;

    public Builder() {
      buildingType = new ChatMemberLeft();
    }

    public Builder setUser(User user) {
      buildingType.user = user;
      return this;
    }

    public ChatMemberLeft build() {
      return buildingType;
    }
  }

  public static final String STATUS = "left";

  /** The member's status in the chat, always "left" */
  @NotNull public final String status = STATUS;

  /** Information about the user */
  @NotNull public User user;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatMemberLeft other)) return false;
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
        .append("ChatMemberLeft[status=")
        .append(status)
        .append(", user=")
        .append(user)
        .append("]");
    return builder.toString();
  }
}
