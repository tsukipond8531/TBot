package jarkz.tbot.types.chat;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Describes actions that a non-administrator user is allowed to take in a chat.
 *
 * @author Pavel Bialiauski
 */
public class ChatPermissions {

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

  /** Default constructor. */
  public ChatPermissions() {}

  /**
   * <i>True</i>, if the user is allowed to send text messages, contacts, invoices, locations and
   * venues.
   *
   * @return can_send_messages as boolean.
   */
  public boolean isCanSendMessages() {
    return canSendMessages;
  }

  /**
   * Sets whether the user is allowed to send text messages, contacts, invoices, locations and
   * venues.
   *
   * @param canSendMessages true if the user is allowed to send text messages, contacts, invoices,
   *     locations and venues, otherwise - false.
   */
  public void setCanSendMessages(boolean canSendMessages) {
    this.canSendMessages = canSendMessages;
  }

  /**
   * <i>True</i>, if the user is allowed to send audios.
   *
   * @return can_send_audios as boolean.
   */
  public boolean isCanSendAudios() {
    return canSendAudios;
  }

  /**
   * Sets whether the user is allowed to send audios.
   *
   * @param canSendAudios true if the user is allowed to send audios, otherwise - false.
   */
  public void setCanSendAudios(boolean canSendAudios) {
    this.canSendAudios = canSendAudios;
  }

  /**
   * <i>True</i>, if the user is allowed to send documents.
   *
   * @return can_send_documents as boolean.
   */
  public boolean isCanSendDocuments() {
    return canSendDocuments;
  }

  /**
   * Sets whether the user is allowed to send documents.
   *
   * @param canSendDocuments true if the user is allowed to send documents.
   */
  public void setCanSendDocuments(boolean canSendDocuments) {
    this.canSendDocuments = canSendDocuments;
  }

  /**
   * <i>True</i>, if the user is allowed to send photos.
   *
   * @return can_send_photos as boolean.
   */
  public boolean isCanSendPhotos() {
    return canSendPhotos;
  }

  /**
   * Sets whether the user is allowed to send photos.
   *
   * @param canSendPhotos true if the user is allowed to send photos, otherwise - false.
   */
  public void setCanSendPhotos(boolean canSendPhotos) {
    this.canSendPhotos = canSendPhotos;
  }

  /**
   * <i>True</i>, if the user is allowed to send videos.
   *
   * @return can_send_videos as boolean.
   */
  public boolean isCanSendVideos() {
    return canSendVideos;
  }

  /**
   * Sets whether the user is allowed to send videos.
   *
   * @param canSendVideos true if the user is allowed to send videos, otherwise - false.
   */
  public void setCanSendVideos(boolean canSendVideos) {
    this.canSendVideos = canSendVideos;
  }

  /**
   * <i>True</i>, if the user is allowed to send video notes.
   *
   * @return can_send_video_notes as boolean.
   */
  public boolean isCanSendVideoNotes() {
    return canSendVideoNotes;
  }

  /**
   * Sets whether the user is allowed to send video notes.
   *
   * @param canSendVideoNotes true if the user is allowed to send video notes, otherwise - false.
   */
  public void setCanSendVideoNotes(boolean canSendVideoNotes) {
    this.canSendVideoNotes = canSendVideoNotes;
  }

  /**
   * <i>True</i>, if the user is allowed to send voice notes.
   *
   * @return can_send_voice_notes as boolean.
   */
  public boolean isCanSendVoiceNotes() {
    return canSendVoiceNotes;
  }

  /**
   * Sets whether the user is allowed to send voice notes.
   *
   * @param canSendVoiceNotes true if the user is allowed to send voice notes, otherwise - false.
   */
  public void setCanSendVoiceNotes(boolean canSendVoiceNotes) {
    this.canSendVoiceNotes = canSendVoiceNotes;
  }

  /**
   * <i>True</i>, if the user is allowed to send polls.
   *
   * @return can_send_polls as boolean.
   */
  public boolean isCanSendPolls() {
    return canSendPolls;
  }

  /**
   * Sets whether the user is allowed to send polls.
   *
   * @param canSendPolls true if the user is allowed to send polls, otherwise - false.
   */
  public void setCanSendPolls(boolean canSendPolls) {
    this.canSendPolls = canSendPolls;
  }

  /**
   * <i>True</i>, if the user is allowed to send animations, games, stickers and use inline bots.
   *
   * @return can_send_other_messages as boolean.
   */
  public boolean isCanSendOtherMessages() {
    return canSendOtherMessages;
  }

  /**
   * Sets whether the user is allowed to send animations, games, stickers and use inline bots.
   *
   * @param canSendOtherMessages true if the user is allowed to send animations, games, stickers and
   *     use inline bots, otherwise - false.
   */
  public void setCanSendOtherMessages(boolean canSendOtherMessages) {
    this.canSendOtherMessages = canSendOtherMessages;
  }

  /**
   * <i>True</i>, if the user is allowed to add web page previews to their messages.
   *
   * @return can_add_web_page_previews as boolean.
   */
  public boolean isCanAddWebPagePreviews() {
    return canAddWebPagePreviews;
  }

  /**
   * Sets whether the user is allowed to add web page previews to their messages.
   *
   * @param canAddWebPagePreviews true if the user is allowed to add web page previews to their
   *     messages, otherwise - false.
   */
  public void setCanAddWebPagePreviews(boolean canAddWebPagePreviews) {
    this.canAddWebPagePreviews = canAddWebPagePreviews;
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
   * <i>True</i>, if the user is allowed to pin messages.
   *
   * @return can_pin_messages as boolean.
   */
  public boolean isCanPinMessages() {
    return canPinMessages;
  }

  /**
   * Sets whether the user is allowed to pin messages.
   *
   * @param canPinMessages true if the user is allowed to pin messages.
   */
  public void setCanPinMessages(boolean canPinMessages) {
    this.canPinMessages = canPinMessages;
  }

  /**
   * <i>True</i>, if the user is allowed to create forum topics.
   *
   * @return can_manage_topics as boolean.
   */
  public boolean isCanManageTopics() {
    return canManageTopics;
  }

  /**
   * Sets whether the user is allowed to create forum topics.
   *
   * @param canManageTopics true if the user is allowed to create forum topics, otherwise - false.
   */
  public void setCanManageTopics(boolean canManageTopics) {
    this.canManageTopics = canManageTopics;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
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
        canManageTopics);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatPermissions other)) return false;
    return canSendMessages == other.canSendMessages
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
        && canManageTopics == other.canManageTopics;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ChatPermissions[canSendMessages=")
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
        .append("]");
    return builder.toString();
  }
}
