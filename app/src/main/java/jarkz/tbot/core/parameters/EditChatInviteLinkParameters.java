package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Use this method to edit a non-primary invite link created by the bot. The bot must be an
 * administrator in the chat for this to work and must have the appropriate administrator rights.
 * Returns the edited invite link as a ChatInviteLink object.
 */
public final class EditChatInviteLinkParameters {

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public String chatId;

  /** The invite link to edit */
  @NotNull
  @SerializedName("invite_link")
  public String inviteLink;

  /** Invite link name; 0-32 characters */
  public String name;

  /** Point in time (Unix timestamp) when the link will expire */
  @SerializedName("expire_date")
  public Integer expireDate;

  /**
   * The maximum number of users that can be members of the chat simultaneously after joining the
   * chat via this invite link; 1-99999
   */
  @SerializedName("member_limit")
  public Integer memberLimit;

  /**
   * True, if users joining the chat via the link need to be approved by chat administrators. If
   * True, member_limit can't be specified
   */
  @SerializedName("creates_join_request")
  public Boolean createsJoinRequest;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof EditChatInviteLinkParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(inviteLink, other.inviteLink)
        && Objects.equals(name, other.name)
        && Objects.equals(expireDate, other.expireDate)
        && Objects.equals(memberLimit, other.memberLimit)
        && Objects.equals(createsJoinRequest, other.createsJoinRequest);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, inviteLink, name, expireDate, memberLimit, createsJoinRequest);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("EditChatInviteLinkParameters[chatId=")
        .append(chatId)
        .append(", inviteLink=")
        .append(inviteLink)
        .append(", name=")
        .append(name)
        .append(", expireDate=")
        .append(expireDate)
        .append(", memberLimit=")
        .append(memberLimit)
        .append(", createsJoinRequest=")
        .append(createsJoinRequest)
        .append("]");
    return builder.toString();
  }
}
