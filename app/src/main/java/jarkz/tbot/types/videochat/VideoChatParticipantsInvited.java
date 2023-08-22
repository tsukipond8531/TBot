package jarkz.tbot.types.videochat;

import jarkz.tbot.types.User;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a service message about new members invited to a video chat.
 *
 * @author Pavel Bialiauski
 */
public class VideoChatParticipantsInvited {

  private List<User> users;

  /** Default constructor. */
  public VideoChatParticipantsInvited() {}

  /**
   * New members that were invited to the video chat.
   *
   * @return users as {@link List}&lt;{@link User}&gt;.
   */
  public Optional<List<User>> getUsers() {
    return Optional.of(users);
  }

  /**
   * Sets the new members that were invited to the video chat.
   *
   * @param users the new members that were invited to the video chat as {@link List}&lt;{@link
   *     User}&gt; or null if there are no new members.
   */
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
