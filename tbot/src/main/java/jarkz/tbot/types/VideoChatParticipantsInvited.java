package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object represents a service message about new members invited to a video chat. */
public final class VideoChatParticipantsInvited {

  public static final class Builder {

    private VideoChatParticipantsInvited buildingType;

    public Builder() {
      buildingType = new VideoChatParticipantsInvited();
    }

    public Builder setUsers(List<User> users) {
      buildingType.users = users;
      return this;
    }

    public VideoChatParticipantsInvited build() {
      return buildingType;
    }
  }

  /** New members that were invited to the video chat */
  @NotNull public List<User> users;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof VideoChatParticipantsInvited other)) return false;
    return Objects.equals(users, other.users);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(users);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("VideoChatParticipantsInvited[users=").append(users).append("]");
    return builder.toString();
  }
}
