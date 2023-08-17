package jarkz.tbot.types.chatmember;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import java.util.Objects;

public class ChatMemberRestricted implements ChatMember {

  protected static final String STATUS = "restricted";

  private final String status = ChatMemberRestricted.STATUS;

  @NotNull private User user;

  @SerializedName("is_member")
  @NotNull
  private boolean isMember;

  @SerializedName("can_send_messages")
  @NotNull
  private boolean canSendMessages;

  @SerializedName("can_send_audios")
  @NotNull
  private boolean canSendAudios;

  @SerializedName("can_send_documents")
  @NotNull
  private boolean canSendDocuments;

  @SerializedName("can_send_photos")
  @NotNull
  private boolean canSendPhotos;

  @SerializedName("can_send_videos")
  @NotNull
  private boolean canSendVideos;

  @SerializedName("can_send_video_notes")
  @NotNull
  private boolean canSendVideoNotes;

  @SerializedName("can_send_voice_notes")
  @NotNull
  private boolean canSendVoiceNotes;

  @SerializedName("can_send_polls")
  @NotNull
  private boolean canSendPolls;

  @SerializedName("can_send_other_messages")
  @NotNull
  private boolean canSendOtherMessages;

  @SerializedName("can_add_web_page_previews")
  @NotNull
  private boolean canAddWebPagePreviews;

  @SerializedName("can_change_info")
  @NotNull
  private boolean canChangeInfo;

  @SerializedName("can_invite_users")
  @NotNull
  private boolean canInviteUsers;

  @SerializedName("can_pin_messages")
  @NotNull
  private boolean canPinMessages;

  @SerializedName("can_manage_topics")
  @NotNull
  private boolean canManageTopics;

  @SerializedName("until_date")
  @NotNull
  private long untilDate;

  public ChatMemberRestricted() {}

  public String getStatus() {
    return status;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public boolean isMember() {
    return isMember;
  }

  public void setMember(boolean isMember) {
    this.isMember = isMember;
  }

  public boolean isCanSendMessages() {
    return canSendMessages;
  }

  public void setCanSendMessages(boolean canSendMessages) {
    this.canSendMessages = canSendMessages;
  }

  public boolean isCanSendAudios() {
    return canSendAudios;
  }

  public void setCanSendAudios(boolean canSendAudios) {
    this.canSendAudios = canSendAudios;
  }

  public boolean isCanSendDocuments() {
    return canSendDocuments;
  }

  public void setCanSendDocuments(boolean canSendDocuments) {
    this.canSendDocuments = canSendDocuments;
  }

  public boolean isCanSendPhotos() {
    return canSendPhotos;
  }

  public void setCanSendPhotos(boolean canSendPhotos) {
    this.canSendPhotos = canSendPhotos;
  }

  public boolean isCanSendVideos() {
    return canSendVideos;
  }

  public void setCanSendVideos(boolean canSendVideos) {
    this.canSendVideos = canSendVideos;
  }

  public boolean isCanSendVideoNotes() {
    return canSendVideoNotes;
  }

  public void setCanSendVideoNotes(boolean canSendVideoNotes) {
    this.canSendVideoNotes = canSendVideoNotes;
  }

  public boolean isCanSendVoiceNotes() {
    return canSendVoiceNotes;
  }

  public void setCanSendVoiceNotes(boolean canSendVoiceNotes) {
    this.canSendVoiceNotes = canSendVoiceNotes;
  }

  public boolean isCanSendPolls() {
    return canSendPolls;
  }

  public void setCanSendPolls(boolean canSendPolls) {
    this.canSendPolls = canSendPolls;
  }

  public boolean isCanSendOtherMessages() {
    return canSendOtherMessages;
  }

  public void setCanSendOtherMessages(boolean canSendOtherMessages) {
    this.canSendOtherMessages = canSendOtherMessages;
  }

  public boolean isCanAddWebPagePreviews() {
    return canAddWebPagePreviews;
  }

  public void setCanAddWebPagePreviews(boolean canAddWebPagePreviews) {
    this.canAddWebPagePreviews = canAddWebPagePreviews;
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

  public boolean isCanPinMessages() {
    return canPinMessages;
  }

  public void setCanPinMessages(boolean canPinMessages) {
    this.canPinMessages = canPinMessages;
  }

  public boolean isCanManageTopics() {
    return canManageTopics;
  }

  public void setCanManageTopics(boolean canManageTopics) {
    this.canManageTopics = canManageTopics;
  }

  public long getUntilDate() {
    return untilDate;
  }

  public void setUntilDate(long untilDate) {
    this.untilDate = untilDate;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        status,
        user,
        isMember,
        canSendMessages,
        canSendAudios,
        canSendDocuments,
        canSendPhotos,
        canSendVideos,
        canSendVideoNotes,
        canSendVoiceNotes,
        canSendPolls,
        canSendOtherMessages,
        canAddWebPagePreviews,
        canChangeInfo,
        canInviteUsers,
        canPinMessages,
        canManageTopics,
        untilDate);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatMemberRestricted other)) return false;
    return Objects.equals(status, other.status)
        && Objects.equals(user, other.user)
        && isMember == other.isMember
        && canSendMessages == other.canSendMessages
        && canSendAudios == other.canSendAudios
        && canSendDocuments == other.canSendDocuments
        && canSendPhotos == other.canSendPhotos
        && canSendVideos == other.canSendVideos
        && canSendVideoNotes == other.canSendVideoNotes
        && canSendVoiceNotes == other.canSendVoiceNotes
        && canSendPolls == other.canSendPolls
        && canSendOtherMessages == other.canSendOtherMessages
        && canAddWebPagePreviews == other.canAddWebPagePreviews
        && canChangeInfo == other.canChangeInfo
        && canInviteUsers == other.canInviteUsers
        && canPinMessages == other.canPinMessages
        && canManageTopics == other.canManageTopics
        && untilDate == other.untilDate;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ChatMemberRestricted[status=")
        .append(status)
        .append(", user=")
        .append(user)
        .append(", isMember=")
        .append(isMember)
        .append(", canSendMessages=")
        .append(canSendMessages)
        .append(", canSendAudios=")
        .append(canSendAudios)
        .append(", canSendDocuments=")
        .append(canSendDocuments)
        .append(", canSendPhotos=")
        .append(canSendPhotos)
        .append(", canSendVideos=")
        .append(canSendVideos)
        .append(", canSendVideoNotes=")
        .append(canSendVideoNotes)
        .append(", canSendVoiceNotes=")
        .append(canSendVoiceNotes)
        .append(", canSendPolls=")
        .append(canSendPolls)
        .append(", canSendOtherMessages=")
        .append(canSendOtherMessages)
        .append(", canAddWebPagePreviews=")
        .append(canAddWebPagePreviews)
        .append(", canChangeInfo=")
        .append(canChangeInfo)
        .append(", canInviteUsers=")
        .append(canInviteUsers)
        .append(", canPinMessages=")
        .append(canPinMessages)
        .append(", canManageTopics=")
        .append(canManageTopics)
        .append(", untilDate=")
        .append(untilDate)
        .append("]");
    return builder.toString();
  }
}
