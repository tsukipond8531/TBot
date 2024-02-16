package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents a join request sent to a chat. */
public final class ChatJoinRequest {

  /** Chat to which the request was sent */
  @NotNull public Chat chat;

  /** User that sent the join request */
  @NotNull public User from;

  /**
   * Identifier of a private chat with the user who sent the join request. This number may have more
   * than 32 significant bits and some programming languages may have difficulty/silent defects in
   * interpreting it. But it has at most 52 significant bits, so a 64-bit integer or
   * double-precision float type are safe for storing this identifier. The bot can use this
   * identifier for 5 minutes to send messages until the join request is processed, assuming no
   * other administrator contacted the user.
   */
  @NotNull
  @SerializedName("user_chat_id")
  public int userChatId;

  /** Date the request was sent in Unix time */
  @NotNull public int date;

  /** Optional. Bio of the user. */
  public String bio;

  /** Optional. Chat invite link that was used by the user to send the join request */
  @SerializedName("invite_link")
  public ChatInviteLink inviteLink;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatJoinRequest other)) return false;
    return Objects.equals(chat, other.chat)
        && Objects.equals(from, other.from)
        && userChatId == other.userChatId
        && date == other.date
        && Objects.equals(bio, other.bio)
        && Objects.equals(inviteLink, other.inviteLink);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chat, from, userChatId, date, bio, inviteLink);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatJoinRequest[chat=")
        .append(chat)
        .append(", from=")
        .append(from)
        .append(", userChatId=")
        .append(userChatId)
        .append(", date=")
        .append(date)
        .append(", bio=")
        .append(bio)
        .append(", inviteLink=")
        .append(inviteLink)
        .append("]");
    return builder.toString();
  }
}
