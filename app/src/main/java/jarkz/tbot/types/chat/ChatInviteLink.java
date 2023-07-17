package jarkz.tbot.types.chat;

import java.util.Objects;

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
	private long expireData;

	@SerializedName("member_limit")
	private int memberLimit;

	@SerializedName("pending_join_request_count")
	private int pendingJoinRequestCount;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getExpireData() {
		return expireData;
	}

	public void setExpireData(long expireData) {
		this.expireData = expireData;
	}

	public int getMemberLimit() {
		return memberLimit;
	}

	public void setMemberLimit(int memberLimit) {
		this.memberLimit = memberLimit;
	}

	public int getPendingJoinRequestCount() {
		return pendingJoinRequestCount;
	}

	public void setPendingJoinRequestCount(int pendingJoinRequestCount) {
		this.pendingJoinRequestCount = pendingJoinRequestCount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(inviteLink,
				creator,
				createsJoinRequest,
				isPrimary,
				isRevoked,
				name,
				expireData,
				memberLimit,
				pendingJoinRequestCount);
	}

	@Override
	public boolean equals(Object obj) {
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
				&& expireData == other.expireData
				&& memberLimit == other.memberLimit
				&& pendingJoinRequestCount == other.pendingJoinRequestCount;
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
				.append(", expireData=").append(expireData)
				.append(", memberLimit=").append(memberLimit)
				.append(", pendingJoinRequestCount=").append(pendingJoinRequestCount).append("]");
		return builder.toString();
	}
}
