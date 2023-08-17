package jarkz.tbot.types.chatmember;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import java.util.Objects;
import java.util.Optional;

public class ChatMemberAdministrator implements ChatMember {

  protected static final String STATUS = "administrator";

  private final String status = ChatMemberAdministrator.STATUS;

  @NotNull private User user;

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

  @SerializedName("custom_title")
  private String customTitle;

  public ChatMemberAdministrator() {}

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

  public boolean isCanManageChat() {
    return canManageChat;
  }

  public void setCanManageChat(boolean canManageChat) {
    this.canManageChat = canManageChat;
  }

  public boolean isCanDeleteMessages() {
    return canDeleteMessages;
  }

  public void setCanDeleteMessages(boolean canDeleteMessages) {
    this.canDeleteMessages = canDeleteMessages;
  }

  public boolean isCanManageVideoChats() {
    return canManageVideoChats;
  }

  public void setCanManageVideoChats(boolean canManageVideoChats) {
    this.canManageVideoChats = canManageVideoChats;
  }

  public boolean isCanRestrictMembers() {
    return canRestrictMembers;
  }

  public void setCanRestrictMembers(boolean canRestrictMembers) {
    this.canRestrictMembers = canRestrictMembers;
  }

  public boolean isCanPromoteMembers() {
    return canPromoteMembers;
  }

  public void setCanPromoteMembers(boolean canPromoteMembers) {
    this.canPromoteMembers = canPromoteMembers;
  }

  public boolean isCanChangeInfo() {
    return canChangeInfo;
  }

  public void setCanChangeInfo(boolean canChangeInfo) {
    this.canChangeInfo = canChangeInfo;
  }

  public boolean isCanInviteUsers() {
    return canInviteUsers;
  }

  public void setCanInviteUsers(boolean canInviteUsers) {
    this.canInviteUsers = canInviteUsers;
  }

  public Optional<Boolean> getCanPostMessages() {
    return Optional.of(canPostMessages);
  }

  public void setCanPostMessages(Boolean canPostMessages) {
    this.canPostMessages = canPostMessages;
  }

  public Optional<Boolean> getCanEditMessages() {
    return Optional.of(canEditMessages);
  }

  public void setCanEditMessages(Boolean canEditMessages) {
    this.canEditMessages = canEditMessages;
  }

  public Optional<Boolean> getCanPinMessages() {
    return Optional.of(canPinMessages);
  }

  public void setCanPinMessages(Boolean canPinMessages) {
    this.canPinMessages = canPinMessages;
  }

  public Optional<Boolean> getCanManageTopics() {
    return Optional.of(canManageTopics);
  }

  public void setCanManageTopics(Boolean canManageTopics) {
    this.canManageTopics = canManageTopics;
  }

  public Optional<String> getCustomTitle() {
    return Optional.of(customTitle);
  }

  public void setCustomTitle(String customTitle) {
    this.customTitle = customTitle;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        status,
        user,
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
        canManageTopics,
        customTitle);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatMemberAdministrator other)) return false;
    return Objects.equals(status, other.status)
        && Objects.equals(user, other.user)
        && isAnonymous == other.isAnonymous
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
        && Objects.equals(canManageTopics, other.canManageTopics)
        && Objects.equals(customTitle, other.customTitle);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ChatMemberAdministrator[status=")
        .append(status)
        .append(", user=")
        .append(user)
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
        .append(", canPostMessages=")
        .append(canPostMessages)
        .append(", canEditMessages=")
        .append(canEditMessages)
        .append(", canPinMessages=")
        .append(canPinMessages)
        .append(", canManageTopics=")
        .append(canManageTopics)
        .append(", customTitle=")
        .append(customTitle)
        .append("]");
    return builder.toString();
  }
}
