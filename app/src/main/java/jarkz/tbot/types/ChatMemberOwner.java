package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents a chat member that owns the chat and has all administrator privileges. */
public final class ChatMemberOwner implements ChatMember {

  /** The member's status in the chat, always "creator" */
  @NotNull public String status;

  /** Information about the user */
  @NotNull public User user;

  /** True, if the user's presence in the chat is hidden */
  @NotNull
  @SerializedName("is_anonymous")
  public boolean isAnonymous;

  /** Optional. Custom title for this user */
  @SerializedName("custom_title")
  public String customTitle;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatMemberOwner other)) return false;
    return Objects.equals(status, other.status)
        && Objects.equals(user, other.user)
        && isAnonymous == other.isAnonymous
        && Objects.equals(customTitle, other.customTitle);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(status, user, isAnonymous, customTitle);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatMemberOwner[status=")
        .append(status)
        .append(", user=")
        .append(user)
        .append(", isAnonymous=")
        .append(isAnonymous)
        .append(", customTitle=")
        .append(customTitle)
        .append("]");
    return builder.toString();
  }
}
