package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object represents a chat. */
public final class Chat {

  /**
   * Unique identifier for this chat. This number may have more than 32 significant bits and some
   * programming languages may have difficulty/silent defects in interpreting it. But it has at most
   * 52 significant bits, so a signed 64-bit integer or double-precision float type are safe for
   * storing this identifier.
   */
  @NotNull public long id;

  /** Type of chat, can be either "private", "group", "supergroup" or "channel" */
  @NotNull public String type;

  /** Optional. Title, for supergroups, channels and group chats */
  public String title;

  /** Optional. Username, for private chats, supergroups and channels if available */
  public String username;

  /** Optional. First name of the other party in a private chat */
  @SerializedName("first_name")
  public String firstName;

  /** Optional. Last name of the other party in a private chat */
  @SerializedName("last_name")
  public String lastName;

  /** Optional. True, if the supergroup chat is a forum (has topics enabled) */
  @SerializedName("is_forum")
  public Boolean isForum;

  /** Optional. Chat photo. Returned only in getChat. */
  public ChatPhoto photo;

  /**
   * Optional. If non-empty, the list of all active chat usernames; for private chats, supergroups
   * and channels. Returned only in getChat.
   */
  @SerializedName("active_usernames")
  public List<String> activeUsernames;

  /**
   * Optional. List of available reactions allowed in the chat. If omitted, then all emoji reactions
   * are allowed. Returned only in getChat.
   */
  @SerializedName("available_reactions")
  public List<ReactionType> availableReactions;

  /**
   * Optional. Identifier of the accent color for the chat name and backgrounds of the chat photo,
   * reply header, and link preview. See accent colors for more details. Returned only in getChat.
   * Always returned in getChat.
   */
  @SerializedName("accent_color_id")
  public Integer accentColorId;

  /**
   * Optional. Custom emoji identifier of emoji chosen by the chat for the reply header and link
   * preview background. Returned only in getChat.
   */
  @SerializedName("background_custom_emoji_id")
  public String backgroundCustomEmojiId;

  /**
   * Optional. Identifier of the accent color for the chat's profile background. See profile accent
   * colors for more details. Returned only in getChat.
   */
  @SerializedName("profile_accent_color_id")
  public Integer profileAccentColorId;

  /**
   * Optional. Custom emoji identifier of the emoji chosen by the chat for its profile background.
   * Returned only in getChat.
   */
  @SerializedName("profile_background_custom_emoji_id")
  public String profileBackgroundCustomEmojiId;

  /**
   * Optional. Custom emoji identifier of the emoji status of the chat or the other party in a
   * private chat. Returned only in getChat.
   */
  @SerializedName("emoji_status_custom_emoji_id")
  public String emojiStatusCustomEmojiId;

  /**
   * Optional. Expiration date of the emoji status of the chat or the other party in a private chat,
   * in Unix time, if any. Returned only in getChat.
   */
  @SerializedName("emoji_status_expiration_date")
  public Integer emojiStatusExpirationDate;

  /** Optional. Bio of the other party in a private chat. Returned only in getChat. */
  public String bio;

  /**
   * Optional. True, if privacy settings of the other party in the private chat allows to use
   * tg://user?id=<user_id> links only in chats with the user. Returned only in getChat.
   */
  @SerializedName("has_private_forwards")
  public Boolean hasPrivateForwards;

  /**
   * Optional. True, if the privacy settings of the other party restrict sending voice and video
   * note messages in the private chat. Returned only in getChat.
   */
  @SerializedName("has_restricted_voice_and_video_messages")
  public Boolean hasRestrictedVoiceAndVideoMessages;

  /**
   * Optional. True, if users need to join the supergroup before they can send messages. Returned
   * only in getChat.
   */
  @SerializedName("join_to_send_messages")
  public Boolean joinToSendMessages;

  /**
   * Optional. True, if all users directly joining the supergroup need to be approved by supergroup
   * administrators. Returned only in getChat.
   */
  @SerializedName("join_by_request")
  public Boolean joinByRequest;

  /** Optional. Description, for groups, supergroups and channel chats. Returned only in getChat. */
  public String description;

  /**
   * Optional. Primary invite link, for groups, supergroups and channel chats. Returned only in
   * getChat.
   */
  @SerializedName("invite_link")
  public String inviteLink;

  /** Optional. The most recent pinned message (by sending date). Returned only in getChat. */
  @SerializedName("pinned_message")
  public Message pinnedMessage;

  /**
   * Optional. Default chat member permissions, for groups and supergroups. Returned only in
   * getChat.
   */
  public ChatPermissions permissions;

  /**
   * Optional. For supergroups, the minimum allowed delay between consecutive messages sent by each
   * unprivileged user; in seconds. Returned only in getChat.
   */
  @SerializedName("slow_mode_delay")
  public Integer slowModeDelay;

  /**
   * Optional. For supergroups, the minimum number of boosts that a non-administrator user needs to
   * add in order to ignore slow mode and chat permissions. Returned only in getChat.
   */
  @SerializedName("unrestrict_boost_count")
  public Integer unrestrictBoostCount;

  /**
   * Optional. The time after which all messages sent to the chat will be automatically deleted; in
   * seconds. Returned only in getChat.
   */
  @SerializedName("message_auto_delete_time")
  public Integer messageAutoDeleteTime;

  /**
   * Optional. True, if aggressive anti-spam checks are enabled in the supergroup. The field is only
   * available to chat administrators. Returned only in getChat.
   */
  @SerializedName("has_aggressive_anti_spam_enabled")
  public Boolean hasAggressiveAntiSpamEnabled;

  /**
   * Optional. True, if non-administrators can only get the list of bots and administrators in the
   * chat. Returned only in getChat.
   */
  @SerializedName("has_hidden_members")
  public Boolean hasHiddenMembers;

  /**
   * Optional. True, if messages from the chat can't be forwarded to other chats. Returned only in
   * getChat.
   */
  @SerializedName("has_protected_content")
  public Boolean hasProtectedContent;

  /**
   * Optional. True, if new chat members will have access to old messages; available only to chat
   * administrators. Returned only in getChat.
   */
  @SerializedName("has_visible_history")
  public Boolean hasVisibleHistory;

  /** Optional. For supergroups, name of group sticker set. Returned only in getChat. */
  @SerializedName("sticker_set_name")
  public String stickerSetName;

  /** Optional. True, if the bot can change the group sticker set. Returned only in getChat. */
  @SerializedName("can_set_sticker_set")
  public Boolean canSetStickerSet;

  /**
   * Optional. For supergroups, the name of the group's custom emoji sticker set. Custom emoji from
   * this set can be used by all users and bots in the group. Returned only in getChat.
   */
  @SerializedName("custom_emoji_sticker_set_name")
  public String customEmojiStickerSetName;

  /**
   * Optional. Unique identifier for the linked chat, i.e. the discussion group identifier for a
   * channel and vice versa; for supergroups and channel chats. This identifier may be greater than
   * 32 bits and some programming languages may have difficulty/silent defects in interpreting it.
   * But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float type are
   * safe for storing this identifier. Returned only in getChat.
   */
  @SerializedName("linked_chat_id")
  public Long linkedChatId;

  /**
   * Optional. For supergroups, the location to which the supergroup is connected. Returned only in
   * getChat.
   */
  public ChatLocation location;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Chat other)) return false;
    return id == other.id
        && Objects.equals(type, other.type)
        && Objects.equals(title, other.title)
        && Objects.equals(username, other.username)
        && Objects.equals(firstName, other.firstName)
        && Objects.equals(lastName, other.lastName)
        && Objects.equals(isForum, other.isForum)
        && Objects.equals(photo, other.photo)
        && Objects.equals(activeUsernames, other.activeUsernames)
        && Objects.equals(availableReactions, other.availableReactions)
        && Objects.equals(accentColorId, other.accentColorId)
        && Objects.equals(backgroundCustomEmojiId, other.backgroundCustomEmojiId)
        && Objects.equals(profileAccentColorId, other.profileAccentColorId)
        && Objects.equals(profileBackgroundCustomEmojiId, other.profileBackgroundCustomEmojiId)
        && Objects.equals(emojiStatusCustomEmojiId, other.emojiStatusCustomEmojiId)
        && Objects.equals(emojiStatusExpirationDate, other.emojiStatusExpirationDate)
        && Objects.equals(bio, other.bio)
        && Objects.equals(hasPrivateForwards, other.hasPrivateForwards)
        && Objects.equals(
            hasRestrictedVoiceAndVideoMessages, other.hasRestrictedVoiceAndVideoMessages)
        && Objects.equals(joinToSendMessages, other.joinToSendMessages)
        && Objects.equals(joinByRequest, other.joinByRequest)
        && Objects.equals(description, other.description)
        && Objects.equals(inviteLink, other.inviteLink)
        && Objects.equals(pinnedMessage, other.pinnedMessage)
        && Objects.equals(permissions, other.permissions)
        && Objects.equals(slowModeDelay, other.slowModeDelay)
        && Objects.equals(unrestrictBoostCount, other.unrestrictBoostCount)
        && Objects.equals(messageAutoDeleteTime, other.messageAutoDeleteTime)
        && Objects.equals(hasAggressiveAntiSpamEnabled, other.hasAggressiveAntiSpamEnabled)
        && Objects.equals(hasHiddenMembers, other.hasHiddenMembers)
        && Objects.equals(hasProtectedContent, other.hasProtectedContent)
        && Objects.equals(hasVisibleHistory, other.hasVisibleHistory)
        && Objects.equals(stickerSetName, other.stickerSetName)
        && Objects.equals(canSetStickerSet, other.canSetStickerSet)
        && Objects.equals(customEmojiStickerSetName, other.customEmojiStickerSetName)
        && Objects.equals(linkedChatId, other.linkedChatId)
        && Objects.equals(location, other.location);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        id,
        type,
        title,
        username,
        firstName,
        lastName,
        isForum,
        photo,
        activeUsernames,
        availableReactions,
        accentColorId,
        backgroundCustomEmojiId,
        profileAccentColorId,
        profileBackgroundCustomEmojiId,
        emojiStatusCustomEmojiId,
        emojiStatusExpirationDate,
        bio,
        hasPrivateForwards,
        hasRestrictedVoiceAndVideoMessages,
        joinToSendMessages,
        joinByRequest,
        description,
        inviteLink,
        pinnedMessage,
        permissions,
        slowModeDelay,
        unrestrictBoostCount,
        messageAutoDeleteTime,
        hasAggressiveAntiSpamEnabled,
        hasHiddenMembers,
        hasProtectedContent,
        hasVisibleHistory,
        stickerSetName,
        canSetStickerSet,
        customEmojiStickerSetName,
        linkedChatId,
        location);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("Chat[id=")
        .append(id)
        .append(", type=")
        .append(type)
        .append(", title=")
        .append(title)
        .append(", username=")
        .append(username)
        .append(", firstName=")
        .append(firstName)
        .append(", lastName=")
        .append(lastName)
        .append(", isForum=")
        .append(isForum)
        .append(", photo=")
        .append(photo)
        .append(", activeUsernames=")
        .append(activeUsernames)
        .append(", availableReactions=")
        .append(availableReactions)
        .append(", accentColorId=")
        .append(accentColorId)
        .append(", backgroundCustomEmojiId=")
        .append(backgroundCustomEmojiId)
        .append(", profileAccentColorId=")
        .append(profileAccentColorId)
        .append(", profileBackgroundCustomEmojiId=")
        .append(profileBackgroundCustomEmojiId)
        .append(", emojiStatusCustomEmojiId=")
        .append(emojiStatusCustomEmojiId)
        .append(", emojiStatusExpirationDate=")
        .append(emojiStatusExpirationDate)
        .append(", bio=")
        .append(bio)
        .append(", hasPrivateForwards=")
        .append(hasPrivateForwards)
        .append(", hasRestrictedVoiceAndVideoMessages=")
        .append(hasRestrictedVoiceAndVideoMessages)
        .append(", joinToSendMessages=")
        .append(joinToSendMessages)
        .append(", joinByRequest=")
        .append(joinByRequest)
        .append(", description=")
        .append(description)
        .append(", inviteLink=")
        .append(inviteLink)
        .append(", pinnedMessage=")
        .append(pinnedMessage)
        .append(", permissions=")
        .append(permissions)
        .append(", slowModeDelay=")
        .append(slowModeDelay)
        .append(", unrestrictBoostCount=")
        .append(unrestrictBoostCount)
        .append(", messageAutoDeleteTime=")
        .append(messageAutoDeleteTime)
        .append(", hasAggressiveAntiSpamEnabled=")
        .append(hasAggressiveAntiSpamEnabled)
        .append(", hasHiddenMembers=")
        .append(hasHiddenMembers)
        .append(", hasProtectedContent=")
        .append(hasProtectedContent)
        .append(", hasVisibleHistory=")
        .append(hasVisibleHistory)
        .append(", stickerSetName=")
        .append(stickerSetName)
        .append(", canSetStickerSet=")
        .append(canSetStickerSet)
        .append(", customEmojiStickerSetName=")
        .append(customEmojiStickerSetName)
        .append(", linkedChatId=")
        .append(linkedChatId)
        .append(", location=")
        .append(location)
        .append("]");
    return builder.toString();
  }
}
