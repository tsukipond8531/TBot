package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents changes in the status of a chat member. */
public final class ChatMemberUpdated {

  /** Chat the user belongs to */
  @NotNull public Chat chat;

  /** Performer of the action, which resulted in the change */
  @NotNull public User from;

  /** Date the change was done in Unix time */
  @NotNull public int date;

  /** Previous information about the chat member */
  @NotNull
  @SerializedName("old_chat_member")
  public ChatMember oldChatMember;

  /** New information about the chat member */
  @NotNull
  @SerializedName("new_chat_member")
  public ChatMember newChatMember;

  /**
   * Optional. Chat invite link, which was used by the user to join the chat; for joining by invite
   * link events only.
   */
  @SerializedName("invite_link")
  public ChatInviteLink inviteLink;

  /** Optional. True, if the user joined the chat via a chat folder invite link */
  @SerializedName("via_chat_folder_invite_link")
  public Boolean viaChatFolderInviteLink;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatMemberUpdated other)) return false;
    return Objects.equals(chat, other.chat)
        && Objects.equals(from, other.from)
        && date == other.date
        && Objects.equals(oldChatMember, other.oldChatMember)
        && Objects.equals(newChatMember, other.newChatMember)
        && Objects.equals(inviteLink, other.inviteLink)
        && Objects.equals(viaChatFolderInviteLink, other.viaChatFolderInviteLink);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chat, from, date, oldChatMember, newChatMember, inviteLink, viaChatFolderInviteLink);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatMemberUpdated[chat=")
        .append(chat)
        .append(", from=")
        .append(from)
        .append(", date=")
        .append(date)
        .append(", oldChatMember=")
        .append(oldChatMember)
        .append(", newChatMember=")
        .append(newChatMember)
        .append(", inviteLink=")
        .append(inviteLink)
        .append(", viaChatFolderInviteLink=")
        .append(viaChatFolderInviteLink)
        .append("]");
    return builder.toString();
  }
}
