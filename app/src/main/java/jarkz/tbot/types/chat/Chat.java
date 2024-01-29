package jarkz.tbot.types.chat;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Message;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a chat in Telegram API.
 *
 * @author Pavel Bialiauski
 */
public class Chat {

  @NotNull private long id;

  @NotNull private String type;

  private String title;

  private String username;

  @SerializedName("first_name")
  private String firstName;

  @SerializedName("last_name")
  private String lastName;

  @SerializedName("is_forum")
  private Boolean isForum;

  private ChatPhoto photo;

  @SerializedName("active_usernames")
  private List<String> activeUsernames;

  @SerializedName("emoji_status_custom_emoji_id")
  private String emojiStatusCustomEmojiId;

  private String bio;

  @SerializedName("has_private_forwards")
  private Boolean hasPrivateForwards;

  @SerializedName("has_restricted_voice_and_video_messages")
  private Boolean hasRestrictedVoiceAndVideoMessages;

  @SerializedName("join_to_send_messages")
  private Boolean joinToSendMessages;

  @SerializedName("join_by_request")
  private Boolean joinByRequest;

  private String description;

  @SerializedName("invite_link")
  private String inviteLink;

  @SerializedName("pinned_message")
  private Message pinnedMessage;

  private ChatPermissions permissions;

  @SerializedName("slow_mode_delay")
  private Integer slowModeDelay;

  @SerializedName("message_auto_delete_time")
  private Integer messageAutoDeleteTime;

  @SerializedName("has_aggressive_anti_spam_enabled")
  private Boolean hasAggressiveAntiSpamEnabled;

  @SerializedName("has_hidden_members")
  private Boolean hasHiddenMembers;

  @SerializedName("has_protected_content")
  private Boolean hasProtectedContent;

  @SerializedName("sticker_set_name")
  private String stickerSetName;

  @SerializedName("can_set_sticker_set")
  private Boolean canSetStickerSet;

  @SerializedName("linked_chat_id")
  private Long linkedChatId;

  private ChatLocation location;

  /** Default constructor. */
  public Chat() {}

  /**
   * Unique identifier for this chat.
   *
   * @return chat identifier as long value.
   */
  public long getId() {
    return id;
  }

  /**
   * Sets the unique identifier for this chat.
   *
   * @param id the unique identifier for this chat as long value.
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * Type of chat, can be either “private”, “group”, “supergroup” or “channel”.
   *
   * @return type of chat as String.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the type of chat. Can be either “private”, “group”, “supergroup” or “channel”.
   *
   * @param type the type of chat as String.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * <i>Optional.</i> Title, for supergroups, channels and group chats.
   *
   * @return an optional value of title as String.
   */
  public Optional<String> getTitle() {
    return Optional.ofNullable(title);
  }

  /**
   * Sets the title, for supergroups, channels and group chats.
   *
   * @param title the title as String or null if it not of supergroups, channels and group chats.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * <i>Optional.</i> Username, for private chats, supergroups and channels if available.
   *
   * @return an optional value of username as String.
   */
  public Optional<String> getUsername() {
    return Optional.ofNullable(username);
  }

  /**
   * Sets the username, for private chats, supergroups and channels if available.
   *
   * @param username the username as String or null if it not for private chats, supergroups and
   *     channels.
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * <i>Optional.</i> First name of the other party in a private chat.
   *
   * @return an optional value of first_name as String.
   */
  public Optional<String> getFirstName() {
    return Optional.ofNullable(firstName);
  }

  /**
   * Sets the first name of the other party in a private chat.
   *
   * @param firstName the first name of the other party in a private chat as String or null if the
   *     chat is not private.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * <i>Optional.</i> Last name of the other party in a private chat.
   *
   * @return an optional value of last_name as String.
   */
  public Optional<String> getLastName() {
    return Optional.ofNullable(lastName);
  }

  /**
   * Sets the last name of the other party in a private chat.
   *
   * @param lastName the last name of the other party in a private chat as String or null if the
   *     other party doesn't contains it or the chat is not private.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * <i>Optional.</i> True, if the supergroup chat is a forum (has <a href=
   * "https://telegram.org/blog/topics-in-groups-collectible-usernames#topics-in-groups">topics</a>
   * enabled).
   *
   * @return an optional value of is_forum as Boolean.
   */
  public Optional<Boolean> getIsForum() {
    return Optional.ofNullable(isForum);
  }

  /**
   * Sets wheter the supergroup chat is a forum (has <a href=
   * "https://telegram.org/blog/topics-in-groups-collectible-usernames#topics-in-groups">topics</a>
   * enabled).
   *
   * @param isForum true if the supregroup chat is a forum, otherwise - false or null.
   */
  public void setIsForum(Boolean isForum) {
    this.isForum = isForum;
  }

  /**
   * <i>Optional.</i> Chat photo. Returned only in getChat.
   *
   * @return an optional value of photo as {@link ChatPhoto}.
   */
  public Optional<ChatPhoto> getPhoto() {
    return Optional.ofNullable(photo);
  }

  /**
   * Sets the chat photo.
   *
   * @param photo the chat photo as {@link ChatPhoto} or null if the chat doesn't contains it.
   */
  public void setPhoto(ChatPhoto photo) {
    this.photo = photo;
  }

  /**
   * <i>Optional.</i> If non-empty, the list of all active chat usernames; for private chats,
   * supergroups and channels. Returned only in getChat.
   *
   * @return an optional value of active_usernames as {@link List}&lt;String&gt;.
   */
  public Optional<List<String>> getActiveUsernames() {
    return Optional.ofNullable(activeUsernames);
  }

  /**
   * Sets the list of all active chat usernames; for private chats, supergroups and channels.
   *
   * @param activeUsernames the list of all active chat usernames as {@link List}&lt;String&gt; or
   *     null if the chat is not private, supertroup or channel, or the list is empty.
   */
  public void setActiveUsernames(List<String> activeUsernames) {
    this.activeUsernames = activeUsernames;
  }

  /**
   * <i>Optional.</i> Custom emoji identifier of emoji status of the other party in a private chat.
   * Returned only in getChat.
   *
   * @return an optional value of emoji_status_custom_emoji_id as String.
   */
  public Optional<String> getEmojiStatusCustomEmojiId() {
    return Optional.ofNullable(emojiStatusCustomEmojiId);
  }

  /**
   * Sets the custom emoji identifier of emoji status of the other party in a private chat.
   *
   * @param emojiStatusCustomEmojiId the custom emoji identifier of emoji status of the other party
   *     in a private chat as String or null if the chat is not private or the other party doesn't
   *     have emoji status.
   */
  public void setEmojiStatusCustomEmojiId(String emojiStatusCustomEmojiId) {
    this.emojiStatusCustomEmojiId = emojiStatusCustomEmojiId;
  }

  /**
   * <i>Optional.</i> Bio of the other party in a private chat. Returned only in getChat.
   *
   * @return an optional value of bio as String.
   */
  public Optional<String> getBio() {
    return Optional.ofNullable(bio);
  }

  /**
   * Sets the bio of the other party in a private chat.
   *
   * @param bio the bio of the other party in a private chat as String or null if the chat is not
   *     private or the other party doesn't have it.
   */
  public void setBio(String bio) {
    this.bio = bio;
  }

  /**
   * <i>Optional.</i> True if privacy settings of the other party in the private chat allows to use
   * tg://user?id=&lt;user_id&gt; links only in chats with the user. Returned only in getChat.
   *
   * @return an optional value of has_private_forwards as Boolean.
   */
  public Optional<Boolean> getHasPrivateForwards() {
    return Optional.ofNullable(hasPrivateForwards);
  }

  /**
   * Sets wheter privacy settings of the other party in the private chat allows to use
   * tg://user?id=&lt;user_id&gt; links only in chats with the user.
   *
   * @param hasPrivateForwards true if privacy settings of the other party in the private chats
   *     allows to use specific links only in chats whith the user, otherwise - false or null.
   */
  public void setHasPrivateForwards(Boolean hasPrivateForwards) {
    this.hasPrivateForwards = hasPrivateForwards;
  }

  /**
   * <i>Optional.</i> True if the privacy settings of the other party restrict sending voice and
   * video note messages in the private chat. Returned only in getChat.
   *
   * @return an optional value of has_restricted_voice_and_video_messages as Boolean.
   */
  public Optional<Boolean> getHasRestrictedVoiceAndVideoMessages() {
    return Optional.ofNullable(hasRestrictedVoiceAndVideoMessages);
  }

  /**
   * Sets whether the privacy settings of the other party restrict sending the voice and video note
   * messges in the private chat.
   *
   * @param hasRestrictedVoiceAndVideoMessages true if the privacy settings of the other party
   *     restrict sending voice and video note messages in the private chat, otherwise - false or
   *     null.
   */
  public void setHasRestrictedVoiceAndVideoMessages(Boolean hasRestrictedVoiceAndVideoMessages) {
    this.hasRestrictedVoiceAndVideoMessages = hasRestrictedVoiceAndVideoMessages;
  }

  /**
   * <i>Optional.</i> True if users need to join the supergroup before they can send messages.
   * Returned only in getChat.
   *
   * @return an optional value of join_to_send_messages as Boolean.
   */
  public Optional<Boolean> getJoinToSendMessages() {
    return Optional.ofNullable(joinToSendMessages);
  }

  /**
   * Sets whether users need to join the supegroup before they can send messages.
   *
   * @param joinToSendMessages true if users need to jooin the supegroup before they can send
   *     messages, otherwise - false or null.
   */
  public void setJoinToSendMessages(Boolean joinToSendMessages) {
    this.joinToSendMessages = joinToSendMessages;
  }

  /**
   * <i>Optional.</i> True if all users directly joining the supergroup need to be approved by
   * supergroup administrators. Returned only in getChat.
   *
   * @return an optional value of join_by_request as Boolean.
   */
  public Optional<Boolean> getJoinByRequest() {
    return Optional.ofNullable(joinByRequest);
  }

  /**
   * Sets whether all users directly joining the supegroup neeed to be approved by supegroup
   * administrators.
   *
   * @param joinByRequest true if all users directly joining the supergroup need to be approved by
   *     supegroup administrators, otherwise - false or null.
   */
  public void setJoinByRequest(Boolean joinByRequest) {
    this.joinByRequest = joinByRequest;
  }

  /**
   * <i>Optional.</i> Description, for groups, supergroups and channel chats. Returned only in
   * getChat.
   *
   * @return an optional value of description as String.
   */
  public Optional<String> getDescription() {
    return Optional.ofNullable(description);
  }

  /**
   * Sets the description for groups, supegroups and channel chats.
   *
   * @param description the description as String or null if the chat is not group, supergroup or
   *     channel.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * <i>Optional.</i> Primary invite link, for groups, supergroups and channel chats. Returned only
   * in getChat.
   *
   * @return an optional value of invite_link as String.
   */
  public Optional<String> getInviteLink() {
    return Optional.ofNullable(inviteLink);
  }

  /**
   * Sets the primary invite link for groups, supregroups and channel chats.
   *
   * @param inviteLink the primary invite link as String or null if the chat is not group,
   *     supergroup or channel.
   */
  public void setInviteLink(String inviteLink) {
    this.inviteLink = inviteLink;
  }

  /**
   * <i>Optional.</i> The most recent pinned message (by sending date). Returned only in getChat.
   *
   * @return an optional value of pinned_message as {@link Message}.
   */
  public Optional<Message> getPinnedMessage() {
    return Optional.ofNullable(pinnedMessage);
  }

  /**
   * Sets the most recent pinned message (by sending data).
   *
   * @param pinnedMessage the most recent pinned message (by sending data) as {@link Message} or
   *     null if the chat doesn't contains a pin.
   */
  public void setPinnedMessage(Message pinnedMessage) {
    this.pinnedMessage = pinnedMessage;
  }

  /**
   * <i>Optional.</i> Default chat member permissions, for groups and supergroups. Returned only in
   * getChat.
   *
   * @return an optional value of permissions as {@link ChatPermissions}.
   */
  public Optional<ChatPermissions> getPermissions() {
    return Optional.ofNullable(permissions);
  }

  /**
   * Sets the overriden chat member permissions for groups and supergroups.
   *
   * @param permissions the overriden chat member permissions as {@link ChatPermissions} or null if
   *     the chat is not group or supegroup.
   */
  public void setPermissions(ChatPermissions permissions) {
    this.permissions = permissions;
  }

  /**
   * <i>Optional.</i> For supergroups, the minimum allowed delay between consecutive messages sent
   * by each unpriviledged user; in seconds. Returned only in getChat.
   *
   * @return an optional value of slow_mode_delay as Integer.
   */
  public Optional<Integer> getSlowModeDelay() {
    return Optional.ofNullable(slowModeDelay);
  }

  /**
   * Sets the slow mode delay for supegroups in seconds.
   *
   * <p>Slow mode delay - the minimum allowed delay between consecutive messages sent by each
   * unprivilidged user.
   *
   * @param slowModeDelay the slow mode delay in seconds as Integer or null if the chat is not
   *     supergroup.
   */
  public void setSlowModeDelay(Integer slowModeDelay) {
    this.slowModeDelay = slowModeDelay;
  }

  /**
   * <i>Optional.</i> The time after which all messages sent to the chat will be automatically
   * deleted; in seconds. Returned only in getChat.
   *
   * @return an optional value of message_auto_delete_time as Integer.
   */
  public Optional<Integer> getMessageAutoDeleteTime() {
    return Optional.ofNullable(messageAutoDeleteTime);
  }

  /**
   * Sets the time after which all messages sent to the chat will be automatically deleted; in
   * seconds.
   *
   * @param messageAutoDeleteTime the time after which all messages sent to the chat will be
   *     automatically deleted (in seconds) as Integer or null if it is not required.
   */
  public void setMessageAutoDeleteTime(Integer messageAutoDeleteTime) {
    this.messageAutoDeleteTime = messageAutoDeleteTime;
  }

  /**
   * <i>Optional.</i> True if aggressive anti-spam checks are enabled in the supergroup. The field
   * is only available to chat administrators. Returned only in getChat.
   *
   * @return an optional value of has_agressive_anti_spam_enabled as Boolean.
   */
  public Optional<Boolean> getHasAggressiveAntiSpamEnabled() {
    return Optional.ofNullable(hasAggressiveAntiSpamEnabled);
  }

  /**
   * Sets whether agressive anti-spam check are enabled in supegroup. The field is only available to
   * caht administrators.
   *
   * @param hasAggressiveAntiSpamEnabled true if agressive anti-spam check are enabled in
   *     supergroup, otherwise - false or null.
   */
  public void setHasAggressiveAntiSpamEnabled(Boolean hasAggressiveAntiSpamEnabled) {
    this.hasAggressiveAntiSpamEnabled = hasAggressiveAntiSpamEnabled;
  }

  /**
   * <i>Optional.</i> True if non-administrators can only get the list of bots and administrators in
   * the chat. Returned only in getChat.
   *
   * @return an optional value of has_hidden_members as Boolean.
   */
  public Optional<Boolean> getHasHiddenMembers() {
    return Optional.ofNullable(hasHiddenMembers);
  }

  /**
   * Sets whether non-administrators can only get the list of bots and administrators in the chat.
   *
   * @param hasHiddenMembers true if non-administrators can only get the list of bots and
   *     administrators in the chat, otherwise - false or null.
   */
  public void setHasHiddenMembers(Boolean hasHiddenMembers) {
    this.hasHiddenMembers = hasHiddenMembers;
  }

  /**
   * <i>Optional.</i> True if messages from the chat can't be forwarded to other chats. Returned
   * only in getChat.
   *
   * @return an optional value of has_protected_content as Boolean.
   */
  public Optional<Boolean> getHasProtectedContent() {
    return Optional.ofNullable(hasProtectedContent);
  }

  /**
   * Sets whether messages from the chat can't be forwarded to other chats.
   *
   * @param hasProtectedContent true if messages from the chat can't be forwarded to other chats,
   *     otherwise - false or null.
   */
  public void setHasProtectedContent(Boolean hasProtectedContent) {
    this.hasProtectedContent = hasProtectedContent;
  }

  /**
   * <i>Optional.</i> For supergroups, name of group sticker set. Returned only in getChat.
   *
   * @return an optional value of sticker_set_name as String.
   */
  public Optional<String> getStickerSetName() {
    return Optional.ofNullable(stickerSetName);
  }

  /**
   * Sets the name of group sticker set for supergroups.
   *
   * @param stickerSetName the name of group sticker set as String or null if the chat is not
   *     supegroup.
   */
  public void setStickerSetName(String stickerSetName) {
    this.stickerSetName = stickerSetName;
  }

  /**
   * <i>Optional.</i> True if the bot can change the group sticker set. Returned only in getChat.
   *
   * @return an optional value of can_set_sticker_set as Boolean.
   */
  public Optional<Boolean> getCanSetStickerSet() {
    return Optional.ofNullable(canSetStickerSet);
  }

  /**
   * Sets whether the bot can change the group sticker set.
   *
   * @param canSetStickerSet true if the bot can change the group sticker set, otherwise - false or
   *     null.
   */
  public void setCanSetStickerSet(Boolean canSetStickerSet) {
    this.canSetStickerSet = canSetStickerSet;
  }

  /**
   * <i>Optional.</i> Unique identifier for the linked chat, i.e. the discussion group identifier
   * for a channel and vice versa; for supergroups and channel chats. Returned only in getChat.
   *
   * @return an optional value of linked_chat_id as Long.
   */
  public Optional<Long> getLinkedChatId() {
    return Optional.ofNullable(linkedChatId);
  }

  /**
   * Sets the unique identifier for the linked chat, i.e. the discussion group identifier for a
   * channel and vice versa; for supergroups and channel chats.
   *
   * @param linkedChatId the unique identifier for the linked chat as Long or null if the chat is
   *     not supergroup or channel.
   */
  public void setLinkedChatId(Long linkedChatId) {
    this.linkedChatId = linkedChatId;
  }

  /**
   * <i>Optional.</i> For supergroups, the location to which the supergroup is connected. Returned
   * only in getChat.
   *
   * @return an optional value of location as {@link ChatLocation}.
   */
  public Optional<ChatLocation> getLocation() {
    return Optional.ofNullable(location);
  }

  /**
   * Sets the location to which the supergroup is connected. Only for supegroups.
   *
   * @param location the location to which the supegroup is connected as {@link ChatLocation} or
   *     null if the chat is not supergroup.
   */
  public void setLocation(ChatLocation location) {
    this.location = location;
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
        emojiStatusCustomEmojiId,
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
        messageAutoDeleteTime,
        hasAggressiveAntiSpamEnabled,
        hasHiddenMembers,
        hasProtectedContent,
        stickerSetName,
        canSetStickerSet,
        linkedChatId,
        location);
  }

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
        && Objects.equals(emojiStatusCustomEmojiId, other.emojiStatusCustomEmojiId)
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
        && Objects.equals(messageAutoDeleteTime, other.messageAutoDeleteTime)
        && Objects.equals(hasAggressiveAntiSpamEnabled, other.hasAggressiveAntiSpamEnabled)
        && Objects.equals(hasHiddenMembers, other.hasHiddenMembers)
        && Objects.equals(hasProtectedContent, other.hasProtectedContent)
        && Objects.equals(stickerSetName, other.stickerSetName)
        && Objects.equals(canSetStickerSet, other.canSetStickerSet)
        && Objects.equals(linkedChatId, other.linkedChatId)
        && Objects.equals(location, other.location);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
        .append(", emojiStatusCustomEmojiId=")
        .append(emojiStatusCustomEmojiId)
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
        .append(", messageAutoDeleteTime=")
        .append(messageAutoDeleteTime)
        .append(", hasAggressiveAntiSpamEnabled=")
        .append(hasAggressiveAntiSpamEnabled)
        .append(", hasHiddenMembers=")
        .append(hasHiddenMembers)
        .append(", hasProtectedContent=")
        .append(hasProtectedContent)
        .append(", stickerSetName=")
        .append(stickerSetName)
        .append(", canSetStickerSet=")
        .append(canSetStickerSet)
        .append(", linkedChatId=")
        .append(linkedChatId)
        .append(", location=")
        .append(location)
        .append("]");
    return builder.toString();
  }
}
