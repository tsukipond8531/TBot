package jarkz.tbot.types.videochat;

import jarkz.tbot.types.User;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class VideoChatParticipantsInvited {

  private List<User> users;

  public VideoChatParticipantsInvited() {}

  public Optional<List<User>> getUsers() {
    return Optional.of(users);
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(users);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof VideoChatParticipantsInvited other)) return false;
    return Objects.equals(users, other.users);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("VideoChatParticipantsInvited[users=").append(users).append("]");
    return builder.toString();
  }
}
