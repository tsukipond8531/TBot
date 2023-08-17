package jarkz.tbot.types.chat;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import java.util.Objects;
import java.util.Optional;

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

  public ChatJoinRequest() {}

  public Chat getChat() {
    return chat;
  }

  public void setChat(Chat chat) {
    this.chat = chat;
  }

  public User getFrom() {
    return from;
  }

  public void setFrom(User from) {
    this.from = from;
  }

  public long getUserChatId() {
    return userChatId;
  }

  public void setUserChatId(long userChatId) {
    this.userChatId = userChatId;
  }

  public long getDate() {
    return date;
  }

  public void setDate(long date) {
    this.date = date;
  }

  public Optional<String> getBio() {
    return Optional.of(bio);
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public Optional<ChatInviteLink> getInviteLink() {
    return Optional.of(inviteLink);
  }

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
