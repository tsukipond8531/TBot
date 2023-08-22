package jarkz.tbot.types.chatmember;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import jarkz.tbot.types.chat.Chat;
import jarkz.tbot.types.chat.ChatInviteLink;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents changes in the status of a chat member.
 *
 * @author Pavel Bialiauski
 */
public class ChatMemberUpdated {

  @NotNull private Chat chat;

  @NotNull private User from;

  @NotNull private long date;

  @SerializedName("old_chat_member")
  @NotNull
  private ChatMember oldChatMember;

  @SerializedName("new_chat_member")
  @NotNull
  private ChatMember newChatMember;

  @SerializedName("invite_link")
  private ChatInviteLink inviteLink;

  @SerializedName("via_chat_folder_invite_link")
  private Boolean viaChatFolderInviteLink;

  /** Default constructor. */
  public ChatMemberUpdated() {}

  /**
   * Chat the user belongs to.
   *
   * @return chat as {@link Chat}.
   */
  public Chat getChat() {
    return chat;
  }

  /**
   * Sets the chat the user belongs to.
   *
   * @param chat the chat the user belongs to as {@link Chat}.
   */
  public void setChat(Chat chat) {
    this.chat = chat;
  }

  /**
   * Performer of the action, which resulted in the change.
   *
   * @return from as {@link User}.
   */
  public User getFrom() {
    return from;
  }

  /**
   * Sets the performer of the action, which resulted in the change.
   *
   * @param from the performer of the action, which resulted in the change, as {@link User}.
   */
  public void setFrom(User from) {
    this.from = from;
  }

  /**
   * Date the change was done in Unix time.
   *
   * @return date as long.
   */
  public long getDate() {
    return date;
  }

  /**
   * Sets the date the change was done in Unix time.
   *
   * @param date the date the change was done in Unix time as long.
   */
  public void setDate(long date) {
    this.date = date;
  }

  /**
   * Previous information about the chat member.
   *
   * @return old_chat_member as {@link ChatMember}.
   */
  public ChatMember getOldChatMember() {
    return oldChatMember;
  }

  /**
   * Sets the previous information about the chat member.
   *
   * @param oldChatMember the previous information about the chat member as {@link ChatMember}.
   */
  public void setOldChatMember(ChatMember oldChatMember) {
    this.oldChatMember = oldChatMember;
  }

  /**
   * New information about the chat member.
   *
   * @return new_chat_member as {@link ChatMember}.
   */
  public ChatMember getNewChatMember() {
    return newChatMember;
  }

  /**
   * Sets the new information about the chat member.
   *
   * @param newChatMember the new information about the chat member as {@link ChatMember}.
   */
  public void setNewChatMember(ChatMember newChatMember) {
    this.newChatMember = newChatMember;
  }

  /**
   * <i>Optional.</i> Chat invite link, which was used by the user to join the chat; for joining by
   * invite link events only.
   *
   * @return an optional value of invite_link as {@link ChatInviteLink}.
   */
  public Optional<ChatInviteLink> getInviteLink() {
    return Optional.of(inviteLink);
  }

  /**
   * Sets the chat invite link, which was used by the user to join the chat; for joining by invite
   * link events only.
   *
   * @param inviteLink the chat invite link, which was used by the user to join the chat, as {@link
   *     ChatInviteLink} or null if it is not for joining by invite linke event.
   */
  public void setInviteLink(ChatInviteLink inviteLink) {
    this.inviteLink = inviteLink;
  }

  /**
   * <i>Optional.</i> True, if the user joined the chat via a chat folder invite link.
   *
   * @return an optional value of via_chat_folder_invite_link as Boolean.
   */
  public Optional<Boolean> getViaChatFolderInviteLink() {
    return Optional.of(viaChatFolderInviteLink);
  }

  /**
   * Sets whether the user joined the chat via a chat folder invite link.
   *
   * @param viaChatFolderInviteLink true if the user joined the chat via a chat folder invite link,
   *     otherwise - false or null.
   */
  public void setViaChatFolderInviteLink(Boolean viaChatFolderInviteLink) {
    this.viaChatFolderInviteLink = viaChatFolderInviteLink;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chat, from, date, oldChatMember, newChatMember, inviteLink, viaChatFolderInviteLink);
  }

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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
