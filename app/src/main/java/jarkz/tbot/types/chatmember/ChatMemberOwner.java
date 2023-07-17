package jarkz.tbot.types.chatmember;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;

public class ChatMemberOwner implements ChatMember {

	protected static final String STATUS = "owner";

	private final String status = ChatMemberOwner.STATUS;

	@NotNull
	private User user;

	@SerializedName("is_anonymous")
	@NotNull
	private boolean isAnonymous;

	@SerializedName("custom_title")
	private String customTitle;

	public ChatMemberOwner() {
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

	public boolean isAnonymous() {
		return isAnonymous;
	}

	public void setAnonymous(boolean isAnonymous) {
		this.isAnonymous = isAnonymous;
	}

	public Optional<String> getCustomTitle() {
		return Optional.of(customTitle);
	}

	public void setCustomTitle(String customTitle) {
		this.customTitle = customTitle;
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, user, isAnonymous, customTitle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ChatMemberOwner other))
			return false;
		return Objects.equals(status, other.status)
				&& Objects.equals(user, other.user)
				&& isAnonymous == other.isAnonymous
				&& Objects.equals(customTitle, other.customTitle);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChatMemberOwner[status=").append(status)
				.append(", user=").append(user)
				.append(", isAnonymous=").append(isAnonymous)
				.append(", customTitle=").append(customTitle).append("]");
		return builder.toString();
	}
}
