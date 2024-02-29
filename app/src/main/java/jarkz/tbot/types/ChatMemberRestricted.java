package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents a chat member that is under certain restrictions in the chat. Supergroups only. */
public final class ChatMemberRestricted implements ChatMember {

  public static final String STATUS = "restricted";

  /** The member's status in the chat, always "restricted" */
  @NotNull public final String status = STATUS;

  /** Information about the user */
  @NotNull public User user;

  /** True, if the user is a member of the chat at the moment of the request */
  @NotNull
  @SerializedName("is_member")
  public boolean isMember;

  /**
   * True, if the user is allowed to send text messages, contacts, giveaways, giveaway winners,
   * invoices, locations and venues
   */
  @NotNull
  @SerializedName("can_send_messages")
  public boolean canSendMessages;

  /** True, if the user is allowed to send audios */
  @NotNull
  @SerializedName("can_send_audios")
  public boolean canSendAudios;

  /** True, if the user is allowed to send documents */
  @NotNull
  @SerializedName("can_send_documents")
  public boolean canSendDocuments;

  /** True, if the user is allowed to send photos */
  @NotNull
  @SerializedName("can_send_photos")
  public boolean canSendPhotos;

  /** True, if the user is allowed to send videos */
  @NotNull
  @SerializedName("can_send_videos")
  public boolean canSendVideos;

  /** True, if the user is allowed to send video notes */
  @NotNull
  @SerializedName("can_send_video_notes")
  public boolean canSendVideoNotes;

  /** True, if the user is allowed to send voice notes */
  @NotNull
  @SerializedName("can_send_voice_notes")
  public boolean canSendVoiceNotes;

  /** True, if the user is allowed to send polls */
  @NotNull
  @SerializedName("can_send_polls")
  public boolean canSendPolls;

  /** True, if the user is allowed to send animations, games, stickers and use inline bots */
  @NotNull
  @SerializedName("can_send_other_messages")
  public boolean canSendOtherMessages;

  /** True, if the user is allowed to add web page previews to their messages */
  @NotNull
  @SerializedName("can_add_web_page_previews")
  public boolean canAddWebPagePreviews;

  /** True, if the user is allowed to change the chat title, photo and other settings */
  @NotNull
  @SerializedName("can_change_info")
  public boolean canChangeInfo;

  /** True, if the user is allowed to invite new users to the chat */
  @NotNull
  @SerializedName("can_invite_users")
  public boolean canInviteUsers;

  /** True, if the user is allowed to pin messages */
  @NotNull
  @SerializedName("can_pin_messages")
  public boolean canPinMessages;

  /** True, if the user is allowed to create forum topics */
  @NotNull
  @SerializedName("can_manage_topics")
  public boolean canManageTopics;

  /**
   * Date when restrictions will be lifted for this user; Unix time. If 0, then the user is
   * restricted forever
   */
  @NotNull
  @SerializedName("until_date")
  public int untilDate;

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
  public final String toString() {
    var builder = new StringBuilder();
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
