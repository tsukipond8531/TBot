package jarkz.tbot.types.chatmember;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;

public class ChatMemberBanned implements ChatMember {

	protected static final String STATUS = "kicked";

	private final String status = ChatMemberBanned.STATUS;

	@NotNull
	private User user;

	@SerializedName("until_date")
	@NotNull
	private long untilDate;

	public ChatMemberBanned() {
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

	public long getUntilDate() {
		return untilDate;
	}

	public void setUntilDate(long untilDate) {
		this.untilDate = untilDate;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(status, user, untilDate);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ChatMemberBanned other))
			return false;
		return Objects.equals(status, other.status)
				&& Objects.equals(user, other.user)
				&& untilDate == other.untilDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChatMemberBanned[status=").append(status)
				.append(", user=").append(user)
				.append(", untilDate=").append(untilDate).append("]");
		return builder.toString();
	}
}
