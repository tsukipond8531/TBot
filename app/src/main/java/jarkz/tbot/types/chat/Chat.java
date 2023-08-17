package jarkz.tbot.types.chat;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Message;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

  public Chat() {}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Optional<String> getTitle() {
    return Optional.of(title);
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Optional<String> getUsername() {
    return Optional.of(username);
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Optional<String> getFirstName() {
    return Optional.of(firstName);
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Optional<String> getLastName() {
    return Optional.of(lastName);
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Optional<Boolean> getIsForum() {
    return Optional.of(isForum);
  }

  public void setIsForum(Boolean isForum) {
    this.isForum = isForum;
  }

  public Optional<ChatPhoto> getPhoto() {
    return Optional.of(photo);
  }

  public void setPhoto(ChatPhoto photo) {
    this.photo = photo;
  }

  public Optional<List<String>> getActiveUsernames() {
    return Optional.of(activeUsernames);
  }

  public void setActiveUsernames(List<String> activeUsernames) {
    this.activeUsernames = activeUsernames;
  }

  public Optional<String> getEmojiStatusCustomEmojiId() {
    return Optional.of(emojiStatusCustomEmojiId);
  }

  public void setEmojiStatusCustomEmojiId(String emojiStatusCustomEmojiId) {
    this.emojiStatusCustomEmojiId = emojiStatusCustomEmojiId;
  }

  public Optional<String> getBio() {
    return Optional.of(bio);
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public Optional<Boolean> getHasPrivateForwards() {
    return Optional.of(hasPrivateForwards);
  }

  public void setHasPrivateForwards(Boolean hasPrivateForwards) {
    this.hasPrivateForwards = hasPrivateForwards;
  }

  public Optional<Boolean> getHasRestrictedVoiceAndVideoMessages() {
    return Optional.of(hasRestrictedVoiceAndVideoMessages);
  }

  public void setHasRestrictedVoiceAndVideoMessages(Boolean hasRestrictedVoiceAndVideoMessages) {
    this.hasRestrictedVoiceAndVideoMessages = hasRestrictedVoiceAndVideoMessages;
  }

  public Optional<Boolean> getJoinToSendMessages() {
    return Optional.of(joinToSendMessages);
  }

  public void setJoinToSendMessages(Boolean joinToSendMessages) {
    this.joinToSendMessages = joinToSendMessages;
  }

  public Optional<Boolean> getJoinByRequest() {
    return Optional.of(joinByRequest);
  }

  public void setJoinByRequest(Boolean joinByRequest) {
    this.joinByRequest = joinByRequest;
  }

  public Optional<String> getDescription() {
    return Optional.of(description);
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Optional<String> getInviteLink() {
    return Optional.of(inviteLink);
  }

  public void setInviteLink(String inviteLink) {
    this.inviteLink = inviteLink;
  }

  public Optional<Message> getPinnedMessage() {
    return Optional.of(pinnedMessage);
  }

  public void setPinnedMessage(Message pinnedMessage) {
    this.pinnedMessage = pinnedMessage;
  }

  public Optional<ChatPermissions> getPermissions() {
    return Optional.of(permissions);
  }

  public void setPermissions(ChatPermissions permissions) {
    this.permissions = permissions;
  }

  public Optional<Integer> getSlowModeDelay() {
    return Optional.of(slowModeDelay);
  }

  public void setSlowModeDelay(Integer slowModeDelay) {
    this.slowModeDelay = slowModeDelay;
  }

  public Optional<Integer> getMessageAutoDeleteTime() {
    return Optional.of(messageAutoDeleteTime);
  }

  public void setMessageAutoDeleteTime(Integer messageAutoDeleteTime) {
    this.messageAutoDeleteTime = messageAutoDeleteTime;
  }

  public Optional<Boolean> getHasAggressiveAntiSpamEnabled() {
    return Optional.of(hasAggressiveAntiSpamEnabled);
  }

  public void setHasAggressiveAntiSpamEnabled(Boolean hasAggressiveAntiSpamEnabled) {
    this.hasAggressiveAntiSpamEnabled = hasAggressiveAntiSpamEnabled;
  }

  public Optional<Boolean> getHasHiddenMembers() {
    return Optional.of(hasHiddenMembers);
  }

  public void setHasHiddenMembers(Boolean hasHiddenMembers) {
    this.hasHiddenMembers = hasHiddenMembers;
  }

  public Optional<Boolean> getHasProtectedContent() {
    return Optional.of(hasProtectedContent);
  }

  public void setHasProtectedContent(Boolean hasProtectedContent) {
    this.hasProtectedContent = hasProtectedContent;
  }

  public Optional<String> getStickerSetName() {
    return Optional.of(stickerSetName);
  }

  public void setStickerSetName(String stickerSetName) {
    this.stickerSetName = stickerSetName;
  }

  public Optional<Boolean> getCanSetStickerSet() {
    return Optional.of(canSetStickerSet);
  }

  public void setCanSetStickerSet(Boolean canSetStickerSet) {
    this.canSetStickerSet = canSetStickerSet;
  }

  public Optional<Long> getLinkedChatId() {
    return Optional.of(linkedChatId);
  }

  public void setLinkedChatId(Long linkedChatId) {
    this.linkedChatId = linkedChatId;
  }

  public Optional<ChatLocation> getLocation() {
    return Optional.of(location);
  }

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
