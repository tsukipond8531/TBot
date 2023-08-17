package jarkz.tbot.types.chat;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;

public class ChatInviteLink {

	@SerializedName("invite_link")
	@NotNull
	private String inviteLink;

	@NotNull
	private User creator;

	@SerializedName("creates_join_request")
	@NotNull
	private boolean createsJoinRequest;

	@SerializedName("is_primary")
	@NotNull
	private boolean isPrimary;

	@SerializedName("is_revoked")
	@NotNull
	private boolean isRevoked;

	private String name;

	@SerializedName("expire_date")
	private Long expireDate;

	@SerializedName("member_limit")
	private Integer memberLimit;

	@SerializedName("pending_join_request_count")
	private Integer pendingJoinRequestCount;

	public ChatInviteLink() {
	}

	public String getInviteLink() {
		return inviteLink;
	}

	public void setInviteLink(String inviteLink) {
		this.inviteLink = inviteLink;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public boolean isCreatesJoinRequest() {
		return createsJoinRequest;
	}

	public void setCreatesJoinRequest(boolean createsJoinRequest) {
		this.createsJoinRequest = createsJoinRequest;
	}

	public boolean isPrimary() {
		return isPrimary;
	}

	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public boolean isRevoked() {
		return isRevoked;
	}

	public void setRevoked(boolean isRevoked) {
		this.isRevoked = isRevoked;
	}

	public Optional<String> getName() {
		return Optional.of(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<Long> getExpireDate() {
		return Optional.of(expireDate);
	}

	public void setExpireDate(Long expireDate) {
		this.expireDate = expireDate;
	}

	public Optional<Integer> getMemberLimit() {
		return Optional.of(memberLimit);
	}

	public void setMemberLimit(Integer memberLimit) {
		this.memberLimit = memberLimit;
	}

	public Optional<Integer> getPendingJoinRequestCount() {
		return Optional.of(pendingJoinRequestCount);
	}

	public void setPendingJoinRequestCount(Integer pendingJoinRequestCount) {
		this.pendingJoinRequestCount = pendingJoinRequestCount;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(inviteLink,
				creator,
				createsJoinRequest,
				isPrimary,
				isRevoked,
				name,
				expireDate,
				memberLimit,
				pendingJoinRequestCount);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ChatInviteLink other))
			return false;
		return Objects.equals(inviteLink, other.inviteLink)
				&& Objects.equals(creator, other.creator)
				&& createsJoinRequest == other.createsJoinRequest
				&& isPrimary == other.isPrimary
				&& isRevoked == other.isRevoked
				&& Objects.equals(name, other.name)
				&& Objects.equals(expireDate,other.expireDate)
				&& Objects.equals(memberLimit, other.memberLimit)
				&& Objects.equals(pendingJoinRequestCount, other.pendingJoinRequestCount);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChatInviteLink[inviteLink=").append(inviteLink)
				.append(", creator=").append(creator)
				.append(", createsJoinRequest=").append(createsJoinRequest)
				.append(", isPrimary=").append(isPrimary)
				.append(", isRevoked=").append(isRevoked)
				.append(", name=").append(name)
				.append(", expireDate=").append(expireDate)
				.append(", memberLimit=").append(memberLimit)
				.append(", pendingJoinRequestCount=").append(pendingJoinRequestCount).append("]");
		return builder.toString();
	}
}
