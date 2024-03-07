package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents a chat member that was banned in the chat and can't return to the chat or view chat
 * messages.
 */
public final class ChatMemberBanned implements ChatMember {

  public static final class Builder {

    private ChatMemberBanned buildingType;

    public Builder() {
      buildingType = new ChatMemberBanned();
    }

    public Builder setUser(User user) {
      buildingType.user = user;
      return this;
    }

    public Builder setUntilDate(int untilDate) {
      buildingType.untilDate = untilDate;
      return this;
    }

    public ChatMemberBanned build() {
      return buildingType;
    }
  }

  public static final String STATUS = "kicked";

  /** The member's status in the chat, always "kicked" */
  @NotNull public final String status = STATUS;

  /** Information about the user */
  @NotNull public User user;

  /**
   * Date when restrictions will be lifted for this user; Unix time. If 0, then the user is banned
   * forever
   */
  @NotNull
  @SerializedName("until_date")
  public int untilDate;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatMemberBanned other)) return false;
    return Objects.equals(status, other.status)
        && Objects.equals(user, other.user)
        && untilDate == other.untilDate;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(status, user, untilDate);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
