package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** Describes actions that a non-administrator user is allowed to take in a chat. */
public final class ChatPermissions {

  /**
   * Optional. True, if the user is allowed to send text messages, contacts, giveaways, giveaway
   * winners, invoices, locations and venues
   */
  @SerializedName("can_send_messages")
  public Boolean canSendMessages;

  /** Optional. True, if the user is allowed to send audios */
  @SerializedName("can_send_audios")
  public Boolean canSendAudios;

  /** Optional. True, if the user is allowed to send documents */
  @SerializedName("can_send_documents")
  public Boolean canSendDocuments;

  /** Optional. True, if the user is allowed to send photos */
  @SerializedName("can_send_photos")
  public Boolean canSendPhotos;

  /** Optional. True, if the user is allowed to send videos */
  @SerializedName("can_send_videos")
  public Boolean canSendVideos;

  /** Optional. True, if the user is allowed to send video notes */
  @SerializedName("can_send_video_notes")
  public Boolean canSendVideoNotes;

  /** Optional. True, if the user is allowed to send voice notes */
  @SerializedName("can_send_voice_notes")
  public Boolean canSendVoiceNotes;

  /** Optional. True, if the user is allowed to send polls */
  @SerializedName("can_send_polls")
  public Boolean canSendPolls;

  /**
   * Optional. True, if the user is allowed to send animations, games, stickers and use inline bots
   */
  @SerializedName("can_send_other_messages")
  public Boolean canSendOtherMessages;

  /** Optional. True, if the user is allowed to add web page previews to their messages */
  @SerializedName("can_add_web_page_previews")
  public Boolean canAddWebPagePreviews;

  /**
   * Optional. True, if the user is allowed to change the chat title, photo and other settings.
   * Ignored in public supergroups
   */
  @SerializedName("can_change_info")
  public Boolean canChangeInfo;

  /** Optional. True, if the user is allowed to invite new users to the chat */
  @SerializedName("can_invite_users")
  public Boolean canInviteUsers;

  /** Optional. True, if the user is allowed to pin messages. Ignored in public supergroups */
  @SerializedName("can_pin_messages")
  public Boolean canPinMessages;

  /**
   * Optional. True, if the user is allowed to create forum topics. If omitted defaults to the value
   * of can_pin_messages
   */
  @SerializedName("can_manage_topics")
  public Boolean canManageTopics;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatPermissions other)) return false;
    return Objects.equals(canSendMessages, other.canSendMessages)
        && Objects.equals(canSendAudios, other.canSendAudios)
        && Objects.equals(canSendDocuments, other.canSendDocuments)
        && Objects.equals(canSendPhotos, other.canSendPhotos)
        && Objects.equals(canSendVideos, other.canSendVideos)
        && Objects.equals(canSendVideoNotes, other.canSendVideoNotes)
        && Objects.equals(canSendVoiceNotes, other.canSendVoiceNotes)
        && Objects.equals(canSendPolls, other.canSendPolls)
        && Objects.equals(canSendOtherMessages, other.canSendOtherMessages)
        && Objects.equals(canAddWebPagePreviews, other.canAddWebPagePreviews)
        && Objects.equals(canChangeInfo, other.canChangeInfo)
        && Objects.equals(canInviteUsers, other.canInviteUsers)
        && Objects.equals(canPinMessages, other.canPinMessages)
        && Objects.equals(canManageTopics, other.canManageTopics);
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
  public final String toString() {
    var builder = new StringBuilder();
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
