package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to promote or demote a user in a supergroup or a channel. The bot must be an
 * administrator in the chat for this to work and must have the appropriate administrator rights.
 * Pass False for all boolean parameters to demote a user. Returns True on success.
 */
public final class PromoteChatMemberParameters {

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** Unique identifier of the target user */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  /** Pass True if the administrator's presence in the chat is hidden */
  @SerializedName("is_anonymous")
  public Boolean isAnonymous;

  /**
   * Pass True if the administrator can access the chat event log, get boost list, see hidden
   * supergroup and channel members, report spam messages and ignore slow mode. Implied by any other
   * administrator privilege.
   */
  @SerializedName("can_manage_chat")
  public Boolean canManageChat;

  /** Pass True if the administrator can delete messages of other users */
  @SerializedName("can_delete_messages")
  public Boolean canDeleteMessages;

  /** Pass True if the administrator can manage video chats */
  @SerializedName("can_manage_video_chats")
  public Boolean canManageVideoChats;

  /**
   * Pass True if the administrator can restrict, ban or unban chat members, or access supergroup
   * statistics
   */
  @SerializedName("can_restrict_members")
  public Boolean canRestrictMembers;

  /**
   * Pass True if the administrator can add new administrators with a subset of their own privileges
   * or demote administrators that they have promoted, directly or indirectly (promoted by
   * administrators that were appointed by him)
   */
  @SerializedName("can_promote_members")
  public Boolean canPromoteMembers;

  /** Pass True if the administrator can change chat title, photo and other settings */
  @SerializedName("can_change_info")
  public Boolean canChangeInfo;

  /** Pass True if the administrator can invite new users to the chat */
  @SerializedName("can_invite_users")
  public Boolean canInviteUsers;

  /** Pass True if the administrator can post stories to the chat */
  @SerializedName("can_post_stories")
  public Boolean canPostStories;

  /** Pass True if the administrator can edit stories posted by other users */
  @SerializedName("can_edit_stories")
  public Boolean canEditStories;

  /** Pass True if the administrator can delete stories posted by other users */
  @SerializedName("can_delete_stories")
  public Boolean canDeleteStories;

  /**
   * Pass True if the administrator can post messages in the channel, or access channel statistics;
   * for channels only
   */
  @SerializedName("can_post_messages")
  public Boolean canPostMessages;

  /**
   * Pass True if the administrator can edit messages of other users and can pin messages; for
   * channels only
   */
  @SerializedName("can_edit_messages")
  public Boolean canEditMessages;

  /** Pass True if the administrator can pin messages; for supergroups only */
  @SerializedName("can_pin_messages")
  public Boolean canPinMessages;

  /**
   * Pass True if the user is allowed to create, rename, close, and reopen forum topics; for
   * supergroups only
   */
  @SerializedName("can_manage_topics")
  public Boolean canManageTopics;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PromoteChatMemberParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && userId == other.userId
        && Objects.equals(isAnonymous, other.isAnonymous)
        && Objects.equals(canManageChat, other.canManageChat)
        && Objects.equals(canDeleteMessages, other.canDeleteMessages)
        && Objects.equals(canManageVideoChats, other.canManageVideoChats)
        && Objects.equals(canRestrictMembers, other.canRestrictMembers)
        && Objects.equals(canPromoteMembers, other.canPromoteMembers)
        && Objects.equals(canChangeInfo, other.canChangeInfo)
        && Objects.equals(canInviteUsers, other.canInviteUsers)
        && Objects.equals(canPostStories, other.canPostStories)
        && Objects.equals(canEditStories, other.canEditStories)
        && Objects.equals(canDeleteStories, other.canDeleteStories)
        && Objects.equals(canPostMessages, other.canPostMessages)
        && Objects.equals(canEditMessages, other.canEditMessages)
        && Objects.equals(canPinMessages, other.canPinMessages)
        && Objects.equals(canManageTopics, other.canManageTopics);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chatId,
        userId,
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
        .append("PromoteChatMemberParameters[chatId=")
        .append(chatId)
        .append(", userId=")
        .append(userId)
        .append(", isAnonymous=")
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
