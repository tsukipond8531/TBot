package jarkz.tbot.types.chat;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents the rights of an administrator in a chat.
 *
 * @author Pavel Bialiauski
 */
public class ChatAdministratorRights {

  @SerializedName("is_anonymous")
  @NotNull
  private boolean isAnonymous;

  @SerializedName("can_manage_chat")
  @NotNull
  private boolean canManageChat;

  @SerializedName("can_delete_messages")
  @NotNull
  private boolean canDeleteMessages;

  @SerializedName("can_manage_video_chats")
  @NotNull
  private boolean canManageVideoChats;

  @SerializedName("can_restrict_members")
  @NotNull
  private boolean canRestrictMembers;

  @SerializedName("can_promote_members")
  @NotNull
  private boolean canPromoteMembers;

  @SerializedName("can_change_info")
  @NotNull
  private boolean canChangeInfo;

  @SerializedName("can_invite_users")
  @NotNull
  private boolean canInviteUsers;

  @SerializedName("can_post_messages")
  private Boolean canPostMessages;

  @SerializedName("can_edit_messages")
  private Boolean canEditMessages;

  @SerializedName("can_pin_messages")
  private Boolean canPinMessages;

  @SerializedName("can_manage_topics")
  private Boolean canManageTopics;

  /**
   * Default constructor.
   */
  public ChatAdministratorRights() {}

  /**
   * <i>True</i>, if the user's presence in the chat is hidden.
   *
   * @return is_anonymous as boolean.
   */
  public boolean isAnonymous() {
    return isAnonymous;
  }

  /**
   * Sets whether the user's presence in the chat is hidden.
   *
   * @param isAnonymous true if the user's presence in the chat is hidden, otherwise - false.
   */
  public void setAnonymous(boolean isAnonymous) {
    this.isAnonymous = isAnonymous;
  }

  /**
   * <i>True</i>, if the administrator can access the chat event log, chat statistics, message
   * statistics in channels, see channel members, see anonymous administrators in supergroups and
   * ignore slow mode. Implied by any other administrator privilege.
   *
   * @return can_manage_chat as boolean.
   */
  public boolean isCanManageChat() {
    return canManageChat;
  }

  /**
   * Sets whether the administrator can access the chat event log, chat statistics, message
   * statistics in channels, see channel members, see anonymous administrators in supergroups and
   * ignore slow mode. Implied by any other administrator privilege.
   *
   * @param canManageChat if the administrator can access the chat event log, chat statistics,
   *     message statistics in channels, see channel members, see anonymous administrators in
   *     supergroups and ignore slow mode, otherwise - false.
   */
  public void setCanManageChat(boolean canManageChat) {
    this.canManageChat = canManageChat;
  }

  /**
   * <i>True</i>, if the administrator can delete messages of other users.
   *
   * @return can_delete_messages as boolean.
   */
  public boolean isCanDeleteMessages() {
    return canDeleteMessages;
  }

  /**
   * Sets whether the administrator can delete messages of other users.
   *
   * @param canDeleteMessages true if the administrator can delete messages of other user, otherwise
   *     - false.
   */
  public void setCanDeleteMessages(boolean canDeleteMessages) {
    this.canDeleteMessages = canDeleteMessages;
  }

  /**
   * <i>True</i>, if the administrator can manage video chats.
   *
   * @return can_manage_video_chats as boolean.
   */
  public boolean isCanManageVideoChats() {
    return canManageVideoChats;
  }

  /**
   * Sets whether the administrator can manage video chats.
   *
   * @param canManageVideoChats true if the administrator can manage video chats, otherwise - false.
   */
  public void setCanManageVideoChats(boolean canManageVideoChats) {
    this.canManageVideoChats = canManageVideoChats;
  }

  /**
   * <i>True</i>, if the administrator can restrict, ban or unban chat members.
   *
   * @return can_restrict_members as boolean.
   */
  public boolean isCanRestrictMembers() {
    return canRestrictMembers;
  }

  /**
   * Sets whether the administrator can restrict, ban or unban chat members.
   *
   * @param canRestrictMembers true if the administrator can restrict, ban or unban chat members,
   *     otherwise - false.
   */
  public void setCanRestrictMembers(boolean canRestrictMembers) {
    this.canRestrictMembers = canRestrictMembers;
  }

  /**
   * <i>True</i>, if the administrator can add new administrators with a subset of their own
   * privileges or demote administrators that they have promoted, directly or indirectly (promoted
   * by administrators that were appointed by the user).
   *
   * @return can_promote_members as boolean.
   */
  public boolean isCanPromoteMembers() {
    return canPromoteMembers;
  }

  /**
   * Sets whether the administrator can add new administrators with a subset of their own privileges
   * or demote administrators that they have promoted, directly or indirectly (promoted by
   * administrators that were appointed by the user).
   *
   * @param canPromoteMembers true if the administartor can promote or demote privivlegies,
   *     otherwise - false.
   */
  public void setCanPromoteMembers(boolean canPromoteMembers) {
    this.canPromoteMembers = canPromoteMembers;
  }

  /**
   * <i>True</i>, if the user is allowed to change the chat title, photo and other settings.
   *
   * @return can_change_info as boolean.
   */
  public boolean isCanChangeInfo() {
    return canChangeInfo;
  }

  /**
   * Sets whether the user is allowed to change the chat title, photo and other settings.
   *
   * @param canChangeInfo true if the user is allowed to change the chat title, photo and other
   *     settings, otherwise - false.
   */
  public void setCanChangeInfo(boolean canChangeInfo) {
    this.canChangeInfo = canChangeInfo;
  }

  /**
   * <i>True</i>, if the user is allowed to invite new users to the chat.
   *
   * @return can_invite_users as boolean.
   */
  public boolean isCanInviteUsers() {
    return canInviteUsers;
  }

  /**
   * Sets whether the user is allowed to invite new users to the chat.
   *
   * @param canInviteUsers true if the user is allowed to invite new users to the chat, otherwise -
   *     false.
   */
  public void setCanInviteUsers(boolean canInviteUsers) {
    this.canInviteUsers = canInviteUsers;
  }

  /**
   * <i>Optional.</i> <i>True</i>, if the administrator can post in the channel; channels only.
   *
   * @return an optional value of can_post_messages as Boolean.
   */
  public Optional<Boolean> getCanPostMessages() {
    return Optional.of(canPostMessages);
  }

  /**
   * Sets whether the administrator can post in the channel; channels only.
   *
   * @param canPostMessages true if the administrator can post in the channel, false if he can't,
   *     null if the chat is not channel.
   */
  public void setCanPostMessages(Boolean canPostMessages) {
    this.canPostMessages = canPostMessages;
  }

  /**
   * <i>Optional.</i> <i>True</i>, if the administrator can edit messages of other users and can pin
   * messages; channels only.
   *
   * @return an optional value of can_edit_messages as Boolean.
   */
  public Optional<Boolean> getCanEditMessages() {
    return Optional.of(canEditMessages);
  }

  /**
   * Sets whether the administrator can edit messages of other users and can pin messages; channels
   * only.
   *
   * @param canEditMessages true if the administrator can edit messages of other users and can pin
   *     messages, false if he can't, null if the chat is not channel.
   */
  public void setCanEditMessages(Boolean canEditMessages) {
    this.canEditMessages = canEditMessages;
  }

  /**
   * <i>Optional.</i> <i>True</i>, if the user is allowed to pin messages; groups and supergroups
   * only.
   *
   * @return an optional value of can_pin_messages as Boolean.
   */
  public Optional<Boolean> getCanPinMessages() {
    return Optional.of(canPinMessages);
  }

  /**
   * Sets whether the user is allowed to pin messages; groups and supergroups only.
   *
   * @param canPinMessages true if the user is allowed to pin messages, false if he can't, null if
   *     the chat is not group or supergroup.
   */
  public void setCanPinMessages(Boolean canPinMessages) {
    this.canPinMessages = canPinMessages;
  }

  /**
   * <i>Optional.</i> <i>True</i>, if the user is allowed to create, rename, close, and reopen forum
   * topics; supergroups only.
   *
   * @return an optional value of can_manage_topics as Boolean.
   */
  public Optional<Boolean> getCanManageTopics() {
    return Optional.of(canManageTopics);
  }

  /**
   * Sets whether the user is allowed to create, rename, close, and reopen forum topics; supergroups
   * only.
   *
   * @param canManageTopics true if the user is allowed to create, rename, close, and reopen forum
   *     topics, false if he can't, null if the chat is not supegroup.
   */
  public void setCanManageTopics(Boolean canManageTopics) {
    this.canManageTopics = canManageTopics;
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
        canPostMessages,
        canEditMessages,
        canPinMessages,
        canManageTopics);
  }

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
        && Objects.equals(canPostMessages, other.canPostMessages)
        && Objects.equals(canEditMessages, other.canEditMessages)
        && Objects.equals(canPinMessages, other.canPinMessages)
        && Objects.equals(canManageTopics, other.canManageTopics);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
