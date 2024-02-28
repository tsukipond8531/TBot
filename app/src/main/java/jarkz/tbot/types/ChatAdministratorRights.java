package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents the rights of an administrator in a chat. */
public final class ChatAdministratorRights {

  /** True, if the user's presence in the chat is hidden */
  @NotNull
  @SerializedName("is_anonymous")
  public boolean isAnonymous;

  /**
   * True, if the administrator can access the chat event log, get boost list, see hidden supergroup
   * and channel members, report spam messages and ignore slow mode. Implied by any other
   * administrator privilege.
   */
  @NotNull
  @SerializedName("can_manage_chat")
  public boolean canManageChat;

  /** True, if the administrator can delete messages of other users */
  @NotNull
  @SerializedName("can_delete_messages")
  public boolean canDeleteMessages;

  /** True, if the administrator can manage video chats */
  @NotNull
  @SerializedName("can_manage_video_chats")
  public boolean canManageVideoChats;

  /**
   * True, if the administrator can restrict, ban or unban chat members, or access supergroup
   * statistics
   */
  @NotNull
  @SerializedName("can_restrict_members")
  public boolean canRestrictMembers;

  /**
   * True, if the administrator can add new administrators with a subset of their own privileges or
   * demote administrators that they have promoted, directly or indirectly (promoted by
   * administrators that were appointed by the user)
   */
  @NotNull
  @SerializedName("can_promote_members")
  public boolean canPromoteMembers;

  /** True, if the user is allowed to change the chat title, photo and other settings */
  @NotNull
  @SerializedName("can_change_info")
  public boolean canChangeInfo;

  /** True, if the user is allowed to invite new users to the chat */
  @NotNull
  @SerializedName("can_invite_users")
  public boolean canInviteUsers;

  /** True, if the administrator can post stories to the chat */
  @NotNull
  @SerializedName("can_post_stories")
  public boolean canPostStories;

  /** True, if the administrator can edit stories posted by other users */
  @NotNull
  @SerializedName("can_edit_stories")
  public boolean canEditStories;

  /** True, if the administrator can delete stories posted by other users */
  @NotNull
  @SerializedName("can_delete_stories")
  public boolean canDeleteStories;

  /**
   * Optional. True, if the administrator can post messages in the channel, or access channel
   * statistics; channels only
   */
  @SerializedName("can_post_messages")
  public Boolean canPostMessages;

  /**
   * Optional. True, if the administrator can edit messages of other users and can pin messages;
   * channels only
   */
  @SerializedName("can_edit_messages")
  public Boolean canEditMessages;

  /** Optional. True, if the user is allowed to pin messages; groups and supergroups only */
  @SerializedName("can_pin_messages")
  public Boolean canPinMessages;

  /**
   * Optional. True, if the user is allowed to create, rename, close, and reopen forum topics;
   * supergroups only
   */
  @SerializedName("can_manage_topics")
  public Boolean canManageTopics;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatAdministratorRights other)) return false;
    return isAnonymous == other.isAnonymous
        && canManageChat == other.canManageChat
        && canDeleteMessages == other.canDeleteMessages
        && canManageVideoChats == other.canManageVideoChats
        && canRestrictMembers == other.canRestrictMembers
        && canPromoteMembers == other.canPromoteMembers
        && canChangeInfo == other.canChangeInfo
        && canInviteUsers == other.canInviteUsers
        && canPostStories == other.canPostStories
        && canEditStories == other.canEditStories
        && canDeleteStories == other.canDeleteStories
        && Objects.equals(canPostMessages, other.canPostMessages)
        && Objects.equals(canEditMessages, other.canEditMessages)
        && Objects.equals(canPinMessages, other.canPinMessages)
        && Objects.equals(canManageTopics, other.canManageTopics);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        isAnonymous,
        canManageChat,
        canDeleteMessages,
        canManageVideoChats,
        canRestrictMembers,
        canPromoteMembers,
        canChangeInfo,
        canInviteUsers,
        canPostStories,
        canEditStories,
        canDeleteStories,
        canPostMessages,
        canEditMessages,
        canPinMessages,
        canManageTopics);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatAdministratorRights[isAnonymous=")
        .append(isAnonymous)
        .append(", canManageChat=")
        .append(canManageChat)
        .append(", canDeleteMessages=")
        .append(canDeleteMessages)
        .append(", canManageVideoChats=")
        .append(canManageVideoChats)
        .append(", canRestrictMembers=")
        .append(canRestrictMembers)
        .append(", canPromoteMembers=")
        .append(canPromoteMembers)
        .append(", canChangeInfo=")
        .append(canChangeInfo)
        .append(", canInviteUsers=")
        .append(canInviteUsers)
        .append(", canPostStories=")
        .append(canPostStories)
        .append(", canEditStories=")
        .append(canEditStories)
        .append(", canDeleteStories=")
        .append(canDeleteStories)
        .append(", canPostMessages=")
        .append(canPostMessages)
        .append(", canEditMessages=")
        .append(canEditMessages)
        .append(", canPinMessages=")
        .append(canPinMessages)
        .append(", canManageTopics=")
        .append(canManageTopics)
        .append("]");
    return builder.toString();
  }
}
