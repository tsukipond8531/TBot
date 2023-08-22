package jarkz.tbot.types.chat;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents an invite link for a chat.
 *
 * @author Pavel Bialiauski
 */
public class ChatInviteLink {

  @SerializedName("invite_link")
  @NotNull
  private String inviteLink;

  @NotNull private User creator;

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

  /**
   * Default constructor.
   */
  public ChatInviteLink() {}

  /**
   * The invite link. If the link was created by another chat administrator, then the second part of
   * the link will be replaced with “…”.
   *
   * @return invite_link as String.
   */
  public String getInviteLink() {
    return inviteLink;
  }

  /**
   * Sets the invite link. If the link was created by another chat administrator, then the second
   * part of the link will be replaced with “…”.
   *
   * @param inviteLink the invite link as String.
   */
  public void setInviteLink(String inviteLink) {
    this.inviteLink = inviteLink;
  }

  /**
   * Creator of the link.
   *
   * @return creator as {@link User}.
   */
  public User getCreator() {
    return creator;
  }

  /**
   * Sets the creator of the link.
   *
   * @param creator the creator of the link as {@link User}.
   */
  public void setCreator(User creator) {
    this.creator = creator;
  }

  /**
   * <i>True</i>, if users joining the chat via the link need to be approved by chat administrators.
   *
   * @return creates_join_request as boolean.
   */
  public boolean isCreatesJoinRequest() {
    return createsJoinRequest;
  }

  /**
   * Sets whether users joining the chat via the link need to be approved by chat administrators.
   *
   * @param createsJoinRequest true if user joining the chat via the link need to be approved by
   *     chat administrators, otherwise - false.
   */
  public void setCreatesJoinRequest(boolean createsJoinRequest) {
    this.createsJoinRequest = createsJoinRequest;
  }

  /**
   * <i>True</i>, if the link is primary.
   *
   * @return is_primary as boolean.
   */
  public boolean isPrimary() {
    return isPrimary;
  }

  /**
   * Sets whether the link is primary.
   *
   * @param isPrimary true if the link is primary, otherwise - false.
   */
  public void setPrimary(boolean isPrimary) {
    this.isPrimary = isPrimary;
  }

  /**
   * <i>True</i>, if the link is revoked.
   *
   * @return is_revoked as boolean.
   */
  public boolean isRevoked() {
    return isRevoked;
  }

  /**
   * Sets whether the link is revoked.
   *
   * @param isRevoked true if the linke is revoked, otherwise - false.
   */
  public void setRevoked(boolean isRevoked) {
    this.isRevoked = isRevoked;
  }

  /**
   * <i>Optional.</i> Invite link name.
   *
   * @return an optional value of name as String.
   */
  public Optional<String> getName() {
    return Optional.of(name);
  }

  /**
   * Sets the invite link name.
   *
   * @param name the invite link name as String or null if it doesn't provided.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * <i>Optional.</i> Point in time (Unix timestamp) when the link will expire or has been expired.
   *
   * @return an optional value of expire_date as Long.
   */
  public Optional<Long> getExpireDate() {
    return Optional.of(expireDate);
  }

  /**
   * Sets the point in time (Unix timestamp) when the link will expire or has been expired.
   *
   * @param expireDate the point in time (Unix timestamp) when the link will expire or has been
   *     expired as Long or null if link won't expire.
   */
  public void setExpireDate(Long expireDate) {
    this.expireDate = expireDate;
  }

  /**
   * <i>Optional.</i> The maximum number of users that can be members of the chat simultaneously
   * after joining the chat via this invite link; 1-99999.
   *
   * @return an optional value of member_limit as Integer.
   */
  public Optional<Integer> getMemberLimit() {
    return Optional.of(memberLimit);
  }

  /**
   * Sets the maximum number of users that can be members of the chat simultaneously after joining
   * the chat via this invite link; 1-99999.
   *
   * @param memberLimit the maximum number of users that can be members of the chat simultaneously
   *     after joining the chat via this invite link (1-99999) as Integer or null if it not
   *     necessary.
   */
  public void setMemberLimit(Integer memberLimit) {
    this.memberLimit = memberLimit;
  }

  /**
   * <i>Optional.</i> Number of pending join requests created using this link.
   *
   * @return an optional value of pending_join_request_count as Integer.
   */
  public Optional<Integer> getPendingJoinRequestCount() {
    return Optional.of(pendingJoinRequestCount);
  }

  /**
   * Sets the number of pending join requests created using this link.
   *
   * @param pendingJoinRequestCount the number of pending join requests using this link as Integer
   *     or null if it doesn't provided.
   */
  public void setPendingJoinRequestCount(Integer pendingJoinRequestCount) {
    this.pendingJoinRequestCount = pendingJoinRequestCount;
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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
