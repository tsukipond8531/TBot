package jarkz.tbot.types.chatmember;

import java.util.Objects;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;

public class ChatMemberLeft implements ChatMember {

	protected static final String STATUS = "left";

	private final String status = ChatMemberLeft.STATUS;

	@NotNull
	private User user;

	public ChatMemberLeft() {
	}

	public String getStatus() {
		return status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ChatMemberLeft other))
			return false;
		return Objects.equals(status, other.status) && Objects.equals(user, other.user);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChatMemberLeft[status=").append(status).append(", user=").append(user).append("]");
		return builder.toString();
	}
}
