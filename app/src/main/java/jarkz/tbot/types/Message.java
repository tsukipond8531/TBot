package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

import jarkz.tbot.types.chat.Chat;
import jarkz.tbot.types.chat.ChatShared;
import jarkz.tbot.types.document.Animation;
import jarkz.tbot.types.document.Audio;
import jarkz.tbot.types.document.Contact;
import jarkz.tbot.types.document.Dice;
import jarkz.tbot.types.document.Document;
import jarkz.tbot.types.document.PhotoSize;
import jarkz.tbot.types.document.Venue;
import jarkz.tbot.types.document.Video;
import jarkz.tbot.types.document.VideoNote;
import jarkz.tbot.types.document.Voice;
import jarkz.tbot.types.forum.ForumTopicClosed;
import jarkz.tbot.types.forum.ForumTopicCreated;
import jarkz.tbot.types.forum.ForumTopicEdited;
import jarkz.tbot.types.forum.ForumTopicReopened;
import jarkz.tbot.types.forum.GeneralForumTopicHidden;
import jarkz.tbot.types.forum.GeneralForumTopicUnhidden;
import jarkz.tbot.types.games.Game;
import jarkz.tbot.types.inlinemode.InlineKeyboardMarkup;
import jarkz.tbot.types.passport.PassportData;
import jarkz.tbot.types.payment.Invoice;
import jarkz.tbot.types.payment.SuccessfulPayment;
import jarkz.tbot.types.poll.Poll;
import jarkz.tbot.types.stickers.Sticker;
import jarkz.tbot.types.videochat.VideoChatEnded;
import jarkz.tbot.types.videochat.VideoChatParticipantsInvited;
import jarkz.tbot.types.videochat.VideoChatScheduled;
import jarkz.tbot.types.videochat.VideoChatStarted;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Message {

	@SerializedName("message_id")
	@NotNull
	private long messageId;

	@SerializedName("message_thread_id")
	private Long messageThreadId;

	private User from;

	@SerializedName("sender_chat")
	private Chat senderChat;

	@NotNull
	private long date;

	@NotNull
	private Chat chat;

	@SerializedName("forward_from")
	private User forwardFrom;

	@SerializedName("forward_from_chat")
	private Chat forwardFromChat;

	@SerializedName("forward_from_message_id")
	private Long forwardFromMessageId;

	@SerializedName("forward_signature")
	private String forwardSignature;

	@SerializedName("forward_sender_name")
	private String forwardSenderName;

	@SerializedName("forward_date")
	private Long forwardDate;

	@SerializedName("is_topic_message")
	private Boolean isTopicMessage;

	@SerializedName("is_automatic_forward")
	private Boolean isAutomaticForward;

	@SerializedName("reply_to_message")
	private Message replyToMessage;

	@SerializedName("via_bot")
	private User viaBot;

	@SerializedName("edit_date")
	private Long editDate;

	@SerializedName("has_protected_content")
	private Boolean hasProtectedContent;

	@SerializedName("media_group_id")
	private String mediaGroupId;

	@SerializedName("author_signature")
	private String authorSignature;

	private String text;

	private List<MessageEntity> entities;

	private Animation animation;

	private Audio audio;

	private Document document;

	private List<PhotoSize> photo;

	private Sticker sticker;

	private Video video;

	@SerializedName("video_note")
	private VideoNote videoNote;

	private Voice voice;

	private String caption;

	@SerializedName("caption_entities")
	private List<MessageEntity> captionEntities;

	@SerializedName("has_media_spoiler")
	private Boolean hasMediaSpoiler;

	private Contact contact;

	private Dice dice;

	private Game game;

	private Poll poll;

	private Venue venue;

	private Location location;

	@SerializedName("new_chat_members")
	private List<User> newChatMembers;

	@SerializedName("left_chat_member")
	private User leftChatMember;

	@SerializedName("new_chat_title")
	private String newChatTitle;

	@SerializedName("new_chat_photo")
	private List<PhotoSize> newChatPhoto;

	@SerializedName("delete_chat_photo")
	private Boolean deleteChatPhoto;

	@SerializedName("group_chat_created")
	private Boolean groupChatCreated;

	@SerializedName("supergroup_chat_created")
	private Boolean supergroupChatCreated;

	@SerializedName("channel_chat_created")
	private Boolean channelChatCreated;

	@SerializedName("message_auto_delete_timer_changed")
	private MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;

	@SerializedName("migrate_to_chat_id")
	private Long migrateToChatId;

	@SerializedName("migrate_from_chat_id")
	private Long migrateFromChatId;

	@SerializedName("pinned_message")
	private Message pinnedMessage;

	private Invoice invoice;

	@SerializedName("successful_payment")
	private SuccessfulPayment successfulPayment;

	@SerializedName("user_shared")
	private UserShared userShared;

	@SerializedName("chat_shared")
	private ChatShared chatShared;

	@SerializedName("connected_website")
	private String connectedWebsite;

	@SerializedName("write_access_allowed")
	private WriteAccessAllowed writeAccessAllowed;

	@SerializedName("passport_data")
	private PassportData passportData;

	@SerializedName("proximity_alert_triggered")
	private ProximityAlertTriggered proximityAlertTriggered;

	@SerializedName("forum_topic_created")
	private ForumTopicCreated forumTopicCreated;

	@SerializedName("forum_topic_edited")
	private ForumTopicEdited forumTopicEdited;

	@SerializedName("forum_topic_closed")
	private ForumTopicClosed forumTopicClosed;

	@SerializedName("forum_topic_reopened")
	private ForumTopicReopened forumTopicReopened;

	@SerializedName("general_forum_topic_hidden")
	private GeneralForumTopicHidden generalForumTopicHidden;

	@SerializedName("general_forum_topic_unhidden")
	private GeneralForumTopicUnhidden generalForumTopicUnhidden;

	@SerializedName("video_chat_scheduled")
	private VideoChatScheduled videoChatScheduled;

	@SerializedName("video_chat_started")
	private VideoChatStarted videoChatStarted;

	@SerializedName("video_chat_ended")
	private VideoChatEnded videoChatEnded;

	@SerializedName("video_chat_participants_invited")
	private VideoChatParticipantsInvited videoChatParticipantsInvited;

	@SerializedName("web_app_data")
	private WebAppData webAppData;

	@SerializedName("reply_markup")
	private InlineKeyboardMarkup replyMarkup;

	public Message() {
	}

	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public Optional<Long> getMessageThreadId() {
		return Optional.of(messageThreadId);
	}

	public void setMessageThreadId(Long messageThreadId) {
		this.messageThreadId = messageThreadId;
	}

	public Optional<User> getFrom() {
		return Optional.of(from);
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public Optional<Chat> getSenderChat() {
		return Optional.of(senderChat);
	}

	public void setSenderChat(Chat senderChat) {
		this.senderChat = senderChat;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public Optional<User> getForwardFrom() {
		return Optional.of(forwardFrom);
	}

	public void setForwardFrom(User forwardFrom) {
		this.forwardFrom = forwardFrom;
	}

	public Optional<Chat> getForwardFromChat() {
		return Optional.of(forwardFromChat);
	}

	public void setForwardFromChat(Chat forwardFromChat) {
		this.forwardFromChat = forwardFromChat;
	}

	public Optional<Long> getForwardFromMessageId() {
		return Optional.of(forwardFromMessageId);
	}

	public void setForwardFromMessageId(Long forwardFromMessageId) {
		this.forwardFromMessageId = forwardFromMessageId;
	}

	public Optional<String> getForwardSignature() {
		return Optional.of(forwardSignature);
	}

	public void setForwardSignature(String forwardSignature) {
		this.forwardSignature = forwardSignature;
	}

	public Optional<String> getForwardSenderName() {
		return Optional.of(forwardSenderName);
	}

	public void setForwardSenderName(String forwardSenderName) {
		this.forwardSenderName = forwardSenderName;
	}

	public Optional<Long> getForwardDate() {
		return Optional.of(forwardDate);
	}

	public void setForwardDate(Long forwardDate) {
		this.forwardDate = forwardDate;
	}

	public Optional<Boolean> getIsTopicMessage() {
		return Optional.of(isTopicMessage);
	}

	public void setIsTopicMessage(Boolean isTopicMessage) {
		this.isTopicMessage = isTopicMessage;
	}

	public Optional<Boolean> getIsAutomaticForward() {
		return Optional.of(isAutomaticForward);
	}

	public void setIsAutomaticForward(Boolean isAutomaticForward) {
		this.isAutomaticForward = isAutomaticForward;
	}

	public Optional<Message> getReplyToMessage() {
		return Optional.of(replyToMessage);
	}

	public void setReplyToMessage(Message replyToMessage) {
		this.replyToMessage = replyToMessage;
	}

	public Optional<User> getViaBot() {
		return Optional.of(viaBot);
	}

	public void setViaBot(User viaBot) {
		this.viaBot = viaBot;
	}

	public Optional<Long> getEditDate() {
		return Optional.of(editDate);
	}

	public void setEditDate(Long editDate) {
		this.editDate = editDate;
	}

	public Optional<Boolean> getHasProtectedContent() {
		return Optional.of(hasProtectedContent);
	}

	public void setHasProtectedContent(Boolean hasProtectedContent) {
		this.hasProtectedContent = hasProtectedContent;
	}

	public Optional<String> getMediaGroupId() {
		return Optional.of(mediaGroupId);
	}

	public void setMediaGroupId(String mediaGroupId) {
		this.mediaGroupId = mediaGroupId;
	}

	public Optional<String> getAuthorSignature() {
		return Optional.of(authorSignature);
	}

	public void setAuthorSignature(String authorSignature) {
		this.authorSignature = authorSignature;
	}

	public Optional<String> getText() {
		return Optional.of(text);
	}

	public void setText(String text) {
		this.text = text;
	}

	public Optional<List<MessageEntity>> getEntities() {
		return Optional.of(entities);
	}

	public void setEntities(List<MessageEntity> entities) {
		this.entities = entities;
	}

	public Optional<Animation> getAnimation() {
		return Optional.of(animation);
	}

	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

	public Optional<Audio> getAudio() {
		return Optional.of(audio);
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}

	public Optional<Document> getDocument() {
		return Optional.of(document);
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Optional<List<PhotoSize>> getPhoto() {
		return Optional.of(photo);
	}

	public void setPhoto(List<PhotoSize> photo) {
		this.photo = photo;
	}

	public Optional<Sticker> getSticker() {
		return Optional.of(sticker);
	}

	public void setSticker(Sticker sticker) {
		this.sticker = sticker;
	}

	public Optional<Video> getVideo() {
		return Optional.of(video);
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Optional<VideoNote> getVideoNote() {
		return Optional.of(videoNote);
	}

	public void setVideoNote(VideoNote videoNote) {
		this.videoNote = videoNote;
	}

	public Optional<Voice> getVoice() {
		return Optional.of(voice);
	}

	public void setVoice(Voice voice) {
		this.voice = voice;
	}

	public Optional<String> getCaption() {
		return Optional.of(caption);
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Optional<List<MessageEntity>> getCaptionEntities() {
		return Optional.of(captionEntities);
	}

	public void setCaptionEntities(List<MessageEntity> captionEntities) {
		this.captionEntities = captionEntities;
	}

	public Optional<Boolean> getHasMediaSpoiler() {
		return Optional.of(hasMediaSpoiler);
	}

	public void setHasMediaSpoiler(Boolean hasMediaSpoiler) {
		this.hasMediaSpoiler = hasMediaSpoiler;
	}

	public Optional<Contact> getContact() {
		return Optional.of(contact);
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Optional<Dice> getDice() {
		return Optional.of(dice);
	}

	public void setDice(Dice dice) {
		this.dice = dice;
	}

	public Optional<Game> getGame() {
		return Optional.of(game);
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Optional<Poll> getPoll() {
		return Optional.of(poll);
	}

	public void setPoll(Poll poll) {
		this.poll = poll;
	}

	public Optional<Venue> getVenue() {
		return Optional.of(venue);
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public Optional<Location> getLocation() {
		return Optional.of(location);
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Optional<List<User>> getNewChatMembers() {
		return Optional.of(newChatMembers);
	}

	public void setNewChatMembers(List<User> newChatMembers) {
		this.newChatMembers = newChatMembers;
	}

	public Optional<User> getLeftChatMember() {
		return Optional.of(leftChatMember);
	}

	public void setLeftChatMember(User leftChatMember) {
		this.leftChatMember = leftChatMember;
	}

	public Optional<String> getNewChatTitle() {
		return Optional.of(newChatTitle);
	}

	public void setNewChatTitle(String newChatTitle) {
		this.newChatTitle = newChatTitle;
	}

	public Optional<List<PhotoSize>> getNewChatPhoto() {
		return Optional.of(newChatPhoto);
	}

	public void setNewChatPhoto(List<PhotoSize> newChatPhoto) {
		this.newChatPhoto = newChatPhoto;
	}

	public Optional<Boolean> getDeleteChatPhoto() {
		return Optional.of(deleteChatPhoto);
	}

	public void setDeleteChatPhoto(Boolean deleteChatPhoto) {
		this.deleteChatPhoto = deleteChatPhoto;
	}

	public Optional<Boolean> getGroupChatCreated() {
		return Optional.of(groupChatCreated);
	}

	public void setGroupChatCreated(Boolean groupChatCreated) {
		this.groupChatCreated = groupChatCreated;
	}

	public Optional<Boolean> getSupergroupChatCreated() {
		return Optional.of(supergroupChatCreated);
	}

	public void setSupergroupChatCreated(Boolean supergroupChatCreated) {
		this.supergroupChatCreated = supergroupChatCreated;
	}

	public Optional<Boolean> getChannelChatCreated() {
		return Optional.of(channelChatCreated);
	}

	public void setChannelChatCreated(Boolean channelChatCreated) {
		this.channelChatCreated = channelChatCreated;
	}

	public Optional<MessageAutoDeleteTimerChanged> getMessageAutoDeleteTimerChanged() {
		return Optional.of(messageAutoDeleteTimerChanged);
	}

	public void setMessageAutoDeleteTimerChanged(
			MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged) {
		this.messageAutoDeleteTimerChanged = messageAutoDeleteTimerChanged;
	}

	public Optional<Long> getMigrateToChatId() {
		return Optional.of(migrateToChatId);
	}

	public void setMigrateToChatId(Long migrateToChatId) {
		this.migrateToChatId = migrateToChatId;
	}

	public Optional<Long> getMigrateFromChatId() {
		return Optional.of(migrateFromChatId);
	}

	public void setMigrateFromChatId(Long migrateFromChatId) {
		this.migrateFromChatId = migrateFromChatId;
	}

	public Optional<Message> getPinnedMessage() {
		return Optional.of(pinnedMessage);
	}

	public void setPinnedMessage(Message pinnedMessage) {
		this.pinnedMessage = pinnedMessage;
	}

	public Optional<Invoice> getInvoice() {
		return Optional.of(invoice);
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Optional<SuccessfulPayment> getSuccessfulPayment() {
		return Optional.of(successfulPayment);
	}

	public void setSuccessfulPayment(SuccessfulPayment successfulPayment) {
		this.successfulPayment = successfulPayment;
	}

	public Optional<UserShared> getUserShared() {
		return Optional.of(userShared);
	}

	public void setUserShared(UserShared userShared) {
		this.userShared = userShared;
	}

	public Optional<ChatShared> getChatShared() {
		return Optional.of(chatShared);
	}

	public void setChatShared(ChatShared chatShared) {
		this.chatShared = chatShared;
	}

	public Optional<String> getConnectedWebsite() {
		return Optional.of(connectedWebsite);
	}

	public void setConnectedWebsite(String connectedWebsite) {
		this.connectedWebsite = connectedWebsite;
	}

	public Optional<WriteAccessAllowed> getWriteAccessAllowed() {
		return Optional.of(writeAccessAllowed);
	}

	public void setWriteAccessAllowed(WriteAccessAllowed writeAccessAllowed) {
		this.writeAccessAllowed = writeAccessAllowed;
	}

	public Optional<PassportData> getPassportData() {
		return Optional.of(passportData);
	}

	public void setPassportData(PassportData passportData) {
		this.passportData = passportData;
	}

	public Optional<ProximityAlertTriggered> getProximityAlertTriggered() {
		return Optional.of(proximityAlertTriggered);
	}

	public void setProximityAlertTriggered(ProximityAlertTriggered proximityAlertTriggered) {
		this.proximityAlertTriggered = proximityAlertTriggered;
	}

	public Optional<ForumTopicCreated> getForumTopicCreated() {
		return Optional.of(forumTopicCreated);
	}

	public void setForumTopicCreated(ForumTopicCreated forumTopicCreated) {
		this.forumTopicCreated = forumTopicCreated;
	}

	public Optional<ForumTopicEdited> getForumTopicEdited() {
		return Optional.of(forumTopicEdited);
	}

	public void setForumTopicEdited(ForumTopicEdited forumTopicEdited) {
		this.forumTopicEdited = forumTopicEdited;
	}

	public Optional<ForumTopicClosed> getForumTopicClosed() {
		return Optional.of(forumTopicClosed);
	}

	public void setForumTopicClosed(ForumTopicClosed forumTopicClosed) {
		this.forumTopicClosed = forumTopicClosed;
	}

	public Optional<ForumTopicReopened> getForumTopicReopened() {
		return Optional.of(forumTopicReopened);
	}

	public void setForumTopicReopened(ForumTopicReopened forumTopicReopened) {
		this.forumTopicReopened = forumTopicReopened;
	}

	public Optional<GeneralForumTopicHidden> getGeneralForumTopicHidden() {
		return Optional.of(generalForumTopicHidden);
	}

	public void setGeneralForumTopicHidden(GeneralForumTopicHidden generalForumTopicHidden) {
		this.generalForumTopicHidden = generalForumTopicHidden;
	}

	public Optional<GeneralForumTopicUnhidden> getGeneralForumTopicUnhidden() {
		return Optional.of(generalForumTopicUnhidden);
	}

	public void setGeneralForumTopicUnhidden(GeneralForumTopicUnhidden generalForumTopicUnhidden) {
		this.generalForumTopicUnhidden = generalForumTopicUnhidden;
	}

	public Optional<VideoChatScheduled> getVideoChatScheduled() {
		return Optional.of(videoChatScheduled);
	}

	public void setVideoChatScheduled(VideoChatScheduled videoChatScheduled) {
		this.videoChatScheduled = videoChatScheduled;
	}

	public Optional<VideoChatStarted> getVideoChatStarted() {
		return Optional.of(videoChatStarted);
	}

	public void setVideoChatStarted(VideoChatStarted videoChatStarted) {
		this.videoChatStarted = videoChatStarted;
	}

	public Optional<VideoChatEnded> getVideoChatEnded() {
		return Optional.of(videoChatEnded);
	}

	public void setVideoChatEnded(VideoChatEnded videoChatEnded) {
		this.videoChatEnded = videoChatEnded;
	}

	public Optional<VideoChatParticipantsInvited> getVideoChatParticipantsInvited() {
		return Optional.of(videoChatParticipantsInvited);
	}

	public void setVideoChatParticipantsInvited(
			VideoChatParticipantsInvited videoChatParticipantsInvited) {
		this.videoChatParticipantsInvited = videoChatParticipantsInvited;
	}

	public Optional<WebAppData> getWebAppData() {
		return Optional.of(webAppData);
	}

	public void setWebAppData(WebAppData webAppData) {
		this.webAppData = webAppData;
	}

	public Optional<InlineKeyboardMarkup> getReplyMarkup() {
		return Optional.of(replyMarkup);
	}

	public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
		this.replyMarkup = replyMarkup;
	}

	@Override
	public final int hashCode() {
		return Objects.hash(
				messageId,
				messageThreadId,
				from,
				senderChat,
				date,
				chat,
				forwardFrom,
				forwardFromChat,
				forwardFromMessageId,
				forwardSignature,
				forwardSenderName,
				forwardDate,
				isTopicMessage,
				isAutomaticForward,
				replyToMessage,
				viaBot,
				editDate,
				hasProtectedContent,
				mediaGroupId,
				authorSignature,
				text,
				entities,
				animation,
				audio,
				document,
				photo,
				sticker,
				video,
				videoNote,
				voice,
				caption,
				captionEntities,
				hasMediaSpoiler,
				contact,
				dice,
				game,
				poll,
				venue,
				location,
				newChatMembers,
				leftChatMember,
				newChatTitle,
				newChatPhoto,
				deleteChatPhoto,
				groupChatCreated,
				supergroupChatCreated,
				channelChatCreated,
				messageAutoDeleteTimerChanged,
				migrateToChatId,
				migrateFromChatId,
				pinnedMessage,
				invoice,
				successfulPayment,
				userShared,
				chatShared,
				connectedWebsite,
				writeAccessAllowed,
				passportData,
				proximityAlertTriggered,
				forumTopicCreated,
				forumTopicEdited,
				forumTopicClosed,
				forumTopicReopened,
				generalForumTopicHidden,
				generalForumTopicUnhidden,
				videoChatScheduled,
				videoChatStarted,
				videoChatEnded,
				videoChatParticipantsInvited,
				webAppData,
				replyMarkup);
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Message other))
			return false;
		return messageId == other.messageId
				&& Objects.equals(messageThreadId, other.messageThreadId)
				&& Objects.equals(from, other.from)
				&& Objects.equals(senderChat, other.senderChat)
				&& date == other.date
				&& Objects.equals(chat, other.chat)
				&& Objects.equals(forwardFrom, other.forwardFrom)
				&& Objects.equals(forwardFromChat, other.forwardFromChat)
				&& Objects.equals(forwardFromMessageId, other.forwardFromMessageId)
				&& Objects.equals(forwardSignature, other.forwardSignature)
				&& Objects.equals(forwardSenderName, other.forwardSenderName)
				&& Objects.equals(forwardDate, other.forwardDate)
				&& Objects.equals(isTopicMessage, other.isTopicMessage)
				&& Objects.equals(isAutomaticForward, other.isAutomaticForward)
				&& Objects.equals(replyToMessage, other.replyToMessage)
				&& Objects.equals(viaBot, other.viaBot)
				&& Objects.equals(editDate, other.editDate)
				&& Objects.equals(hasProtectedContent, other.hasProtectedContent)
				&& Objects.equals(mediaGroupId, other.mediaGroupId)
				&& Objects.equals(authorSignature, other.authorSignature)
				&& Objects.equals(text, other.text)
				&& Objects.equals(entities, other.entities)
				&& Objects.equals(animation, other.animation)
				&& Objects.equals(audio, other.audio)
				&& Objects.equals(document, other.document)
				&& Objects.equals(photo, other.photo)
				&& Objects.equals(sticker, other.sticker)
				&& Objects.equals(video, other.video)
				&& Objects.equals(videoNote, other.videoNote)
				&& Objects.equals(voice, other.voice)
				&& Objects.equals(caption, other.caption)
				&& Objects.equals(captionEntities, other.captionEntities)
				&& Objects.equals(hasMediaSpoiler, other.hasMediaSpoiler)
				&& Objects.equals(contact, other.contact)
				&& Objects.equals(dice, other.dice)
				&& Objects.equals(game, other.game)
				&& Objects.equals(poll, other.poll)
				&& Objects.equals(venue, other.venue)
				&& Objects.equals(location, other.location)
				&& Objects.equals(newChatMembers, other.newChatMembers)
				&& Objects.equals(leftChatMember, other.leftChatMember)
				&& Objects.equals(newChatTitle, other.newChatTitle)
				&& Objects.equals(newChatPhoto, other.newChatPhoto)
				&& Objects.equals(deleteChatPhoto, other.deleteChatPhoto)
				&& Objects.equals(groupChatCreated, other.groupChatCreated)
				&& Objects.equals(supergroupChatCreated, other.supergroupChatCreated)
				&& Objects.equals(channelChatCreated, other.channelChatCreated)
				&& Objects.equals(
						messageAutoDeleteTimerChanged, other.messageAutoDeleteTimerChanged)
				&& Objects.equals(migrateToChatId, other.migrateToChatId)
				&& Objects.equals(migrateFromChatId, other.migrateFromChatId)
				&& Objects.equals(pinnedMessage, other.pinnedMessage)
				&& Objects.equals(invoice, other.invoice)
				&& Objects.equals(successfulPayment, other.successfulPayment)
				&& Objects.equals(userShared, other.userShared)
				&& Objects.equals(chatShared, other.chatShared)
				&& Objects.equals(connectedWebsite, other.connectedWebsite)
				&& Objects.equals(writeAccessAllowed, other.writeAccessAllowed)
				&& Objects.equals(passportData, other.passportData)
				&& Objects.equals(proximityAlertTriggered, other.proximityAlertTriggered)
				&& Objects.equals(forumTopicCreated, other.forumTopicCreated)
				&& Objects.equals(forumTopicEdited, other.forumTopicEdited)
				&& Objects.equals(forumTopicClosed, other.forumTopicClosed)
				&& Objects.equals(forumTopicReopened, other.forumTopicReopened)
				&& Objects.equals(generalForumTopicHidden, other.generalForumTopicHidden)
				&& Objects.equals(generalForumTopicUnhidden, other.generalForumTopicUnhidden)
				&& Objects.equals(videoChatScheduled, other.videoChatScheduled)
				&& Objects.equals(videoChatStarted, other.videoChatStarted)
				&& Objects.equals(videoChatEnded, other.videoChatEnded)
				&& Objects.equals(videoChatParticipantsInvited, other.videoChatParticipantsInvited)
				&& Objects.equals(webAppData, other.webAppData)
				&& Objects.equals(replyMarkup, other.replyMarkup);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Message[messageId=")
				.append(messageId)
				.append(", messageThreadId=")
				.append(messageThreadId)
				.append(", from=")
				.append(from)
				.append(", senderChat=")
				.append(senderChat)
				.append(", date=")
				.append(date)
				.append(", chat=")
				.append(chat)
				.append(", forwardFrom=")
				.append(forwardFrom)
				.append(", forwardFromChat=")
				.append(forwardFromChat)
				.append(", forwardFromMessageId=")
				.append(forwardFromMessageId)
				.append(", forwardSignature=")
				.append(forwardSignature)
				.append(", forwardSenderName=")
				.append(forwardSenderName)
				.append(", forwardDate=")
				.append(forwardDate)
				.append(", isTopicMessage=")
				.append(isTopicMessage)
				.append(", isAutomaticForward=")
				.append(isAutomaticForward)
				.append(", replyToMessage=")
				.append(replyToMessage)
				.append(", viaBot=")
				.append(viaBot)
				.append(", editDate=")
				.append(editDate)
				.append(", hasProtectedContent=")
				.append(hasProtectedContent)
				.append(", mediaGroupId=")
				.append(mediaGroupId)
				.append(", authorSignature=")
				.append(authorSignature)
				.append(", text=")
				.append(text)
				.append(", entities=")
				.append(entities)
				.append(", animation=")
				.append(animation)
				.append(", audio=")
				.append(audio)
				.append(", document=")
				.append(document)
				.append(", photo=")
				.append(photo)
				.append(", sticker=")
				.append(sticker)
				.append(", video=")
				.append(video)
				.append(", videoNote=")
				.append(videoNote)
				.append(", voice=")
				.append(voice)
				.append(", caption=")
				.append(caption)
				.append(", captionEntities=")
				.append(captionEntities)
				.append(", hasMediaSpoiler=")
				.append(hasMediaSpoiler)
				.append(", contact=")
				.append(contact)
				.append(", dice=")
				.append(dice)
				.append(", game=")
				.append(game)
				.append(", poll=")
				.append(poll)
				.append(", venue=")
				.append(venue)
				.append(", location=")
				.append(location)
				.append(", newChatMembers=")
				.append(newChatMembers)
				.append(", leftChatMember=")
				.append(leftChatMember)
				.append(", newChatTitle=")
				.append(newChatTitle)
				.append(", newChatPhoto=")
				.append(newChatPhoto)
				.append(", deleteChatPhoto=")
				.append(deleteChatPhoto)
				.append(", groupChatCreated=")
				.append(groupChatCreated)
				.append(", supergroupChatCreated=")
				.append(supergroupChatCreated)
				.append(", channelChatCreated=")
				.append(channelChatCreated)
				.append(", messageAutoDeleteTimerChanged=")
				.append(messageAutoDeleteTimerChanged)
				.append(", migrateToChatId=")
				.append(migrateToChatId)
				.append(", migrateFromChatId=")
				.append(migrateFromChatId)
				.append(", pinnedMessage=")
				.append(pinnedMessage)
				.append(", invoice=")
				.append(invoice)
				.append(", successfulPayment=")
				.append(successfulPayment)
				.append(", userShared=")
				.append(userShared)
				.append(", chatShared=")
				.append(chatShared)
				.append(", connectedWebsite=")
				.append(connectedWebsite)
				.append(", writeAccessAllowed=")
				.append(writeAccessAllowed)
				.append(", passportData=")
				.append(passportData)
				.append(", proximityAlertTriggered=")
				.append(proximityAlertTriggered)
				.append(", forumTopicCreated=")
				.append(forumTopicCreated)
				.append(", forumTopicEdited=")
				.append(forumTopicEdited)
				.append(", forumTopicClosed=")
				.append(forumTopicClosed)
				.append(", forumTopicReopened=")
				.append(forumTopicReopened)
				.append(", generalForumTopicHidden=")
				.append(generalForumTopicHidden)
				.append(", generalForumTopicUnhidden=")
				.append(generalForumTopicUnhidden)
				.append(", videoChatScheduled=")
				.append(videoChatScheduled)
				.append(", videoChatStarted=")
				.append(videoChatStarted)
				.append(", videoChatEnded=")
				.append(videoChatEnded)
				.append(", videoChatParticipantsInvited=")
				.append(videoChatParticipantsInvited)
				.append(", webAppData=")
				.append(webAppData)
				.append(", replyMarkup=")
				.append(replyMarkup)
				.append("]");
		return builder.toString();
	}
}
