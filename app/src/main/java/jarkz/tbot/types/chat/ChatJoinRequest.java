package jarkz.tbot.types.chat;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a join request sent to a chat.
 *
 * @author Pavel Bialiauski
 */
public class ChatJoinRequest {

  @NotNull private Chat chat;

  @NotNull private User from;

  @SerializedName("user_chat_id")
  @NotNull
  private long userChatId;

  @NotNull private long date;

  private String bio;

  @SerializedName("invite_link")
  private ChatInviteLink inviteLink;

  /** Default constructor. */
  public ChatJoinRequest() {}

  /**
   * Chat to which the request was sent.
   *
   * @return chat as {@link Chat}.
   */
  public Chat getChat() {
    return chat;
  }

  /**
   * Sets the chat to which the request was sent.
   *
   * @param chat the chat to which the request was sent as {@link Chat}.
   */
  public void setChat(Chat chat) {
    this.chat = chat;
  }

  /**
   * User that sent the join request.
   *
   * @return from as {@link User}.
   */
  public User getFrom() {
    return from;
  }

  /**
   * Sets the user that sent the join request.
   *
   * @param from the user that sent the join request as {@link User}.
   */
  public void setFrom(User from) {
    this.from = from;
  }

  /**
   * Identifier of a private chat with the user who sent the join request. The bot can use this
   * identifier for 24 hours to send messages until the join request is processed, assuming no other
   * administrator contacted the user.
   *
   * @return user_chat_id as long.
   */
  public long getUserChatId() {
    return userChatId;
  }

  /**
   * Sets the identifier of a private chat with the user who sent the join request. The bot can use
   * this identifier for 24 hours to send messages until the join request is processed, assuming no
   * other administrator contacted the user.
   *
   * @param userChatId the identifier of a private chat with the user who sent the join request as
   *     long.
   */
  public void setUserChatId(long userChatId) {
    this.userChatId = userChatId;
  }

  /**
   * Date the request was sent in Unix time.
   *
   * @return date as long.
   */
  public long getDate() {
    return date;
  }

  /**
   * Sets the date the request was sent in Unix time.
   *
   * @param date the date the request was sent in Unix time as long.
   */
  public void setDate(long date) {
    this.date = date;
  }

  /**
   * <i>Optional.</i> Bio of the user.
   *
   * @return an optional value of bio as String.
   */
  public Optional<String> getBio() {
    return Optional.of(bio);
  }

  /**
   * Sets the bio of the user.
   *
   * @param bio the bio of the user as String or null if he doesn't have bio.
   */
  public void setBio(String bio) {
    this.bio = bio;
  }

  /**
   * <i>Optional.</i> Chat invite link that was used by the user to send the join request.
   *
   * @return an optional value of invite_link as {@link ChatInviteLink}.
   */
  public Optional<ChatInviteLink> getInviteLink() {
    return Optional.of(inviteLink);
  }

  /**
   * Sets the chat invite link that was used by the user to send the join request.
   *
   * @param inviteLink the chat invite link that was used by the user to send the join request as
   *     {@link ChatInviteLink} or null if he join not via invite link.
   */
  public void setInviteLink(ChatInviteLink inviteLink) {
    this.inviteLink = inviteLink;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chat, from, userChatId, date, bio, inviteLink);
  }

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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
