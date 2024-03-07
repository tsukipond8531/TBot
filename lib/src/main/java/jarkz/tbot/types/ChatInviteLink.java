package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents an invite link for a chat. */
public final class ChatInviteLink {

  /**
   * The invite link. If the link was created by another chat administrator, then the second part of
   * the link will be replaced with "...".
   */
  @NotNull
  @SerializedName("invite_link")
  public String inviteLink;

  /** Creator of the link */
  @NotNull public User creator;

  /** True, if users joining the chat via the link need to be approved by chat administrators */
  @NotNull
  @SerializedName("creates_join_request")
  public boolean createsJoinRequest;

  /** True, if the link is primary */
  @NotNull
  @SerializedName("is_primary")
  public boolean isPrimary;

  /** True, if the link is revoked */
  @NotNull
  @SerializedName("is_revoked")
  public boolean isRevoked;

  /** Optional. Invite link name */
  public String name;

  /** Optional. Point in time (Unix timestamp) when the link will expire or has been expired */
  @SerializedName("expire_date")
  public Integer expireDate;

  /**
   * Optional. The maximum number of users that can be members of the chat simultaneously after
   * joining the chat via this invite link; 1-99999
   */
  @SerializedName("member_limit")
  public Integer memberLimit;

  /** Optional. Number of pending join requests created using this link */
  @SerializedName("pending_join_request_count")
  public Integer pendingJoinRequestCount;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatInviteLink other)) return false;
    return Objects.equals(inviteLink, other.inviteLink)
        && Objects.equals(creator, other.creator)
        && createsJoinRequest == other.createsJoinRequest
        && isPrimary == other.isPrimary
        && isRevoked == other.isRevoked
        && Objects.equals(name, other.name)
        && Objects.equals(expireDate, other.expireDate)
        && Objects.equals(memberLimit, other.memberLimit)
        && Objects.equals(pendingJoinRequestCount, other.pendingJoinRequestCount);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        inviteLink,
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
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatInviteLink[inviteLink=")
        .append(inviteLink)
        .append(", creator=")
        .append(creator)
        .append(", createsJoinRequest=")
        .append(createsJoinRequest)
        .append(", isPrimary=")
        .append(isPrimary)
        .append(", isRevoked=")
        .append(isRevoked)
        .append(", name=")
        .append(name)
        .append(", expireDate=")
        .append(expireDate)
        .append(", memberLimit=")
        .append(memberLimit)
        .append(", pendingJoinRequestCount=")
        .append(pendingJoinRequestCount)
        .append("]");
    return builder.toString();
  }
}
