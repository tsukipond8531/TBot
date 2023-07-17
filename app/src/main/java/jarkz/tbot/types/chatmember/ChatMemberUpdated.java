package jarkz.tbot.types.chatmember;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import jarkz.tbot.types.chat.Chat;
import jarkz.tbot.types.chat.ChatInviteLink;

public class ChatMemberUpdated {

	@NotNull
	private Chat chat;

	@NotNull
	private User from;

	@NotNull
	private long date;

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

	public ChatMemberUpdated() {
	}

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

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public ChatMember getOldChatMember() {
		return oldChatMember;
	}

	public void setOldChatMember(ChatMember oldChatMember) {
		this.oldChatMember = oldChatMember;
	}

	public ChatMember getNewChatMember() {
		return newChatMember;
	}

	public void setNewChatMember(ChatMember newChatMember) {
		this.newChatMember = newChatMember;
	}

	public Optional<ChatInviteLink> getInviteLink() {
		return Optional.of(inviteLink);
	}

	public void setInviteLink(ChatInviteLink inviteLink) {
		this.inviteLink = inviteLink;
	}

	public Optional<Boolean> isViaChatFolderInviteLink() {
		return Optional.of(viaChatFolderInviteLink);
	}

	public void setViaChatFolderInviteLink(Boolean viaChatFolderInviteLink) {
		this.viaChatFolderInviteLink = viaChatFolderInviteLink;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chat, from, date, oldChatMember, newChatMember, inviteLink, viaChatFolderInviteLink);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ChatMemberUpdated other))
			return false;
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
		builder.append("ChatMemberUpdated[chat=").append(chat)
				.append(", from=").append(from)
				.append(", date=").append(date)
				.append(", oldChatMember=").append(oldChatMember)
				.append(", newChatMember=").append(newChatMember)
				.append(", inviteLink=").append(inviteLink)
				.append(", viaChatFolderInviteLink=").append(viaChatFolderInviteLink).append("]");
		return builder.toString();
	}
}
