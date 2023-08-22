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

/**
 * This object represents a message.
 *
 * @author Pavel Bialiauski
 */
public class Message {

  @SerializedName("message_id")
  @NotNull
  private long messageId;

  @SerializedName("message_thread_id")
  private Long messageThreadId;

  private User from;

  @SerializedName("sender_chat")
  private Chat senderChat;

  @NotNull private long date;

  @NotNull private Chat chat;

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

  /** Default constructor. */
  public Message() {}

  /**
   * Unique message identifier inside this chat.
   *
   * @return unique message identifier.
   */
  public long getMessageId() {
    return messageId;
  }

  /**
   * Sets the unique message identifier inside this chat.
   *
   * @param messageId the unique message identifier inside this chat as long value.
   */
  public void setMessageId(long messageId) {
    this.messageId = messageId;
  }

  /**
   * <i>Optional.</i> Unique identifier of a message thread to which the message belongs; for
   * supergroups only.
   *
   * @return an optional value of message_thread_id as Long.
   */
  public Optional<Long> getMessageThreadId() {
    return Optional.of(messageThreadId);
  }

  /**
   * Sets the unique identifier of a message thread to which the message belongs; for supergroups
   * only.
   *
   * @param messageThreadId the unique identifier of a message thread, to which the message belongs,
   *     as Long or null if it is not for a supergroup.
   */
  public void setMessageThreadId(Long messageThreadId) {
    this.messageThreadId = messageThreadId;
  }

  /**
   * <i>Optional.</i> Sender of the message; empty for messages sent to channels. For backward
   * compatibility, the field contains a fake sender user in non-channel chats, if the message was
   * sent on behalf of a chat.
   *
   * @return an optional value of from as {@link User}.
   */
  public Optional<User> getFrom() {
    return Optional.of(from);
  }

  /**
   * Sets the sender of the message; empty for messages sent to channels. For backward
   * compatibility, the field contains a fake sender user in non-channel chats, if the message was
   * sent on behalf of a chat.
   *
   * @param from the sender of the message as {@link User} or null if it is sent to a channel.
   */
  public void setFrom(User from) {
    this.from = from;
  }

  /**
   * <i>Optional.</i> Sender of the message, sent on behalf of a chat.
   *
   * <p>For example, the channel itself for channel posts, the supergroup itself for messages from
   * anonymous group administrators, the linked channel for messages automatically forwarded to the
   * discussion group. For backward compatibility, the field <i>from</i> contains a fake sender user
   * in non-channel chats, if the message was sent on behalf of a chat.
   *
   * @return an optional value of sender_chat as {@link Chat}.
   */
  public Optional<Chat> getSenderChat() {
    return Optional.of(senderChat);
  }

  /**
   * Sets the sender of the message, sent on behalf of a chat.
   *
   * <p>For example, the channel itself for channel posts, the supergroup itself for messages from
   * anonymous group administrators, the linked channel for messages automatically forwarded to the
   * discussion group. For backward compatibility, the field <i>from</i> contains a fake sender user
   * in non-channel chats, if the message was sent on behalf of a chat.
   *
   * @param senderChat the sender of the message as {@link Chat} or null if it is not sent on behalf
   *     of a chat.
   */
  public void setSenderChat(Chat senderChat) {
    this.senderChat = senderChat;
  }

  /**
   * Date the message was sent in Unix time.
   *
   * @return the date the message was sent in Unix time as long value.
   */
  public long getDate() {
    return date;
  }

  /**
   * Sets the date the message was sent in Unix time.
   *
   * @param date the date the message was sent in Unix time as long value.
   */
  public void setDate(long date) {
    this.date = date;
  }

  /**
   * Conversation the message belongs to.
   *
   * @return conversation as {@link Chat}.
   */
  public Chat getChat() {
    return chat;
  }

  /**
   * Sets the conversation the message belongs to.
   *
   * @param chat the conversation the message belongs to as {@link Chat}.
   */
  public void setChat(Chat chat) {
    this.chat = chat;
  }

  /**
   * <i>Optional.</i> For forwarded messages, sender of the original message.
   *
   * @return an optional value of forward_from as {@link User}.
   */
  public Optional<User> getForwardFrom() {
    return Optional.of(forwardFrom);
  }

  /**
   * Sets the sender of the original message for the forwarded messages.
   *
   * @param forwardFrom the sender of the original message for the forwarded messages or null if it
   *     is not forwarded message.
   */
  public void setForwardFrom(User forwardFrom) {
    this.forwardFrom = forwardFrom;
  }

  /**
   * <i>Optional.</i> For messages forwarded from channels or from anonymous administrators,
   * information about the original sender chat.
   *
   * @return an optional value of forward_from as {@link Chat}.
   */
  public Optional<Chat> getForwardFromChat() {
    return Optional.of(forwardFromChat);
  }

  /**
   * Sets the original sender chat for messages forwarded from channels or from anonymous
   * administrators.
   *
   * @param forwardFromChat the original sender chat as {@link Chat} or null if the message is not
   *     forwarded from channel or anonymous administrators.
   */
  public void setForwardFromChat(Chat forwardFromChat) {
    this.forwardFromChat = forwardFromChat;
  }

  /**
   * <i>Optional.</i> For messages forwarded from channels, identifier of the original message in
   * the channel
   *
   * @return an optional value of forward_from_message_id as Long.
   */
  public Optional<Long> getForwardFromMessageId() {
    return Optional.of(forwardFromMessageId);
  }

  /**
   * Sets the original messages unique identifier in the channel, from which forwarded.
   *
   * @param forwardFromMessageId the original message unique identifier in the channel as Long or
   *     null if the message is not forwarded from the channel.
   */
  public void setForwardFromMessageId(Long forwardFromMessageId) {
    this.forwardFromMessageId = forwardFromMessageId;
  }

  /**
   * <i>Optional.</i> For forwarded messages that were originally sent in channels or by an
   * anonymous chat administrator, signature of the message sender if present
   *
   * @return an optional value of forward_signature as String.
   */
  public Optional<String> getForwardSignature() {
    return Optional.of(forwardSignature);
  }

  /**
   * Sets the signature of the forwarded message sender if present, which is sent from channels or
   * by an anonymous chat administrator.
   *
   * @param forwardSignature the signature of the forwarded message sender as String if present and
   *     is sent from channels or by an anonymous chat administrator, otherwise - null.
   */
  public void setForwardSignature(String forwardSignature) {
    this.forwardSignature = forwardSignature;
  }

  /**
   * <i>Optional.</i> Sender's name for messages forwarded from users who disallow adding a link to
   * their account in forwarded messages.
   *
   * @return an optional value of forward_sender_name as String.
   */
  public Optional<String> getForwardSenderName() {
    return Optional.of(forwardSenderName);
  }

  /**
   * Sets the sender's name for messages forwarded from users who disallow adding a link to their
   * account in forwarded messages.
   *
   * @param forwardSenderName the sender's name as String or null if the message is not forwarded
   *     from users who disallow adding a link to their account.
   */
  public void setForwardSenderName(String forwardSenderName) {
    this.forwardSenderName = forwardSenderName;
  }

  /**
   * <i>Optional.</i> For forwarded messages, date the original message was sent in Unix time
   *
   * @return an optional value of forward_date as Long.
   */
  public Optional<Long> getForwardDate() {
    return Optional.of(forwardDate);
  }

  /**
   * Sets the date the original message was sent in Unix time for forwarded messages.
   *
   * @param forwardDate the date the original message was sent in Unix time as Long or null if it is
   *     not the forwarded message.
   */
  public void setForwardDate(Long forwardDate) {
    this.forwardDate = forwardDate;
  }

  /**
   * <i>Optional.</i> True if the message is sent to a forum topic.
   *
   * @return an optional value of is_topic_message as Boolean.
   */
  public Optional<Boolean> getIsTopicMessage() {
    return Optional.of(isTopicMessage);
  }

  /**
   * Sets whether the message is sent to a forum topic.
   *
   * @param isTopicMessage true if the message is sent to a forum topic, otherwise - false or null.
   */
  public void setIsTopicMessage(Boolean isTopicMessage) {
    this.isTopicMessage = isTopicMessage;
  }

  /**
   * <i>Optional.</i> True if the message is a channel post that was automatically forwarded to the
   * connected discussion group.
   *
   * @return an optional value of is_automatic_forward as Boolean.
   */
  public Optional<Boolean> getIsAutomaticForward() {
    return Optional.of(isAutomaticForward);
  }

  /**
   * Sets whether the message is a channel post that was automatically forwarded to the connected
   * discussion group.
   *
   * @param isAutomaticForward true if the message is a channel post that was automatically
   *     forwarded to the connected discussion group, otherwise - false or null.
   */
  public void setIsAutomaticForward(Boolean isAutomaticForward) {
    this.isAutomaticForward = isAutomaticForward;
  }

  /**
   * <i>Optional.</i> For replies, the original message.
   *
   * <p>Note that the Message object in this field will not contain further reply_to_message fields
   * even if it itself is a reply.
   *
   * @return an optional value of reply_to_message as {@link Message}.
   */
  public Optional<Message> getReplyToMessage() {
    return Optional.of(replyToMessage);
  }

  /**
   * Sets the original message; for replies.
   *
   * <p>Note that the Message object in this field will not contain further reply_to_message fields
   * even if it itself is a reply.
   *
   * @param replyToMessage the original messages as {@link Message} or null if it is not for
   *     replies.
   */
  public void setReplyToMessage(Message replyToMessage) {
    this.replyToMessage = replyToMessage;
  }

  /**
   * <i>Optional.</i> Bot through which the message was sent.
   *
   * @return an optional value of via_bot as {@link User}.
   */
  public Optional<User> getViaBot() {
    return Optional.of(viaBot);
  }

  /**
   * Sets the bot through which the message was sent.
   *
   * @param viaBot the bot as {@link User} or null if the message is not sent through the bot.
   */
  public void setViaBot(User viaBot) {
    this.viaBot = viaBot;
  }

  /**
   * <i>Optional.</i> Date the message was last edited in Unix time.
   *
   * @return an optional value of edit_date as Long.
   */
  public Optional<Long> getEditDate() {
    return Optional.of(editDate);
  }

  /**
   * Sets the date of the message was last edited in Unix time.
   *
   * @param editDate the date of the message was last edited in Unix time as Long or null if the
   *     message is not edited.
   */
  public void setEditDate(Long editDate) {
    this.editDate = editDate;
  }

  /**
   * <i>Optional.</i> True if the message can't be forwarded.
   *
   * @return an optional value of has_protected_content as Boolean.
   */
  public Optional<Boolean> getHasProtectedContent() {
    return Optional.of(hasProtectedContent);
  }

  /**
   * Sets whether the message can't be forwarded.
   *
   * @param hasProtectedContent true if message can't be forwarded, otherwise - false or null.
   */
  public void setHasProtectedContent(Boolean hasProtectedContent) {
    this.hasProtectedContent = hasProtectedContent;
  }

  /**
   * <i>Optional.</i> The unique identifier of a media message group this message belongs to.
   *
   * @return an optional value of media_group_id as String.
   */
  public Optional<String> getMediaGroupId() {
    return Optional.of(mediaGroupId);
  }

  /**
   * Sets the unique identifier of the media message group this message belongs to.
   *
   * @param mediaGroupId the unique identifier of the media message group this message belongs to as
   *     String or null if the media message group is doesn't exists.
   */
  public void setMediaGroupId(String mediaGroupId) {
    this.mediaGroupId = mediaGroupId;
  }

  /**
   * <i>Optional.</i> Signature of the post author for messages in channels, or the custom title of
   * an anonymous group administrator.
   *
   * @return an optional value of author_signature as String.
   */
  public Optional<String> getAuthorSignature() {
    return Optional.of(authorSignature);
  }

  /**
   * Sets the signature of the post author for messages in channel, or the custom title of an
   * anonymous group administrator.
   *
   * @param authorSignature the signature of the post author for messages in channel, or the custom
   *     title of an anonymous group administrator, as String or null if the message is not sent
   *     from author in channel or by an anonymous group administrator.
   */
  public void setAuthorSignature(String authorSignature) {
    this.authorSignature = authorSignature;
  }

  /**
   * <i>Optional.</i> For text messages, the actual UTF-8 text of the message.
   *
   * @return an optional value of text as String.
   */
  public Optional<String> getText() {
    return Optional.of(text);
  }

  /**
   * Sets the text of the message. Needs actual UTF-8 text of the message.
   *
   * @param text the text of the message as String or null if the message doesn't contains a text.
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * <i>Optional.</i> For text messages, special entities like usernames, URLs, bot commands, etc.
   * that appear in the text.
   *
   * @return an optional value of entities as {@link List}&lt;{@link MessageEntity}&gt;.
   */
  public Optional<List<MessageEntity>> getEntities() {
    return Optional.of(entities);
  }

  /**
   * Sets the special entities like usernames, URLs, bot cmommands, etc. that appear in the text;
   * for text messages.
   *
   * @param entities the special entities like usernames, URLs, bot commands, etc. that appear in
   *     the text as {@link List}&lt;{@link MessageEntity}&gt; or null if message doesn't contains a
   *     text or entities.
   */
  public void setEntities(List<MessageEntity> entities) {
    this.entities = entities;
  }

  /**
   * <i>Optional.</i> Message is an animation, information about the animation. For backward
   * compatibility, when this field is set, the document field will also be set.
   *
   * @return an optional value of animation as {@link Animation}.
   */
  public Optional<Animation> getAnimation() {
    return Optional.of(animation);
  }

  /**
   * Sets the animation as the message, information about the animation. For backward compatibility,
   * when this field is set, the document field will also be set.
   *
   * @param animation the animation as message as {@link Animation} or null if the message is not
   *     the animation.
   */
  public void setAnimation(Animation animation) {
    this.animation = animation;
  }

  /**
   * <i>Optional.</i> Message is an audio file, information about the file.
   *
   * @return an optional value of audio as {@link Audio}.
   */
  public Optional<Audio> getAudio() {
    return Optional.of(audio);
  }

  /**
   * Sets the audio file as the message, information about the file.
   *
   * @param audio the audio file as the message as {@link Audio} or null if the message is not the
   *     audio.
   */
  public void setAudio(Audio audio) {
    this.audio = audio;
  }

  /**
   * <i>Optional.</i> Message is a general file, information about the file.
   *
   * @return an optional value of document as {@link Document}.
   */
  public Optional<Document> getDocument() {
    return Optional.of(document);
  }

  /**
   * Sets the general file as the message, information about the file.
   *
   * @param document the general file as the message as {@link Document} or null if the message is
   *     not the general file.
   */
  public void setDocument(Document document) {
    this.document = document;
  }

  /**
   * <i>Optional.</i> Message is a photo, available sizes of the photo.
   *
   * @return an optional value of photo as {@link List}&lt;{@link PhotoSize}&gt;.
   */
  public Optional<List<PhotoSize>> getPhoto() {
    return Optional.of(photo);
  }

  /**
   * Sets the photo as the message, available sizes of the photo.
   *
   * @param photo the photo as the message as {@link List}&lt;{@link PhotoSize}&gt; or null if the
   *     message is not the photo.
   */
  public void setPhoto(List<PhotoSize> photo) {
    this.photo = photo;
  }

  /**
   * <i>Optional.</i> Message is a sticker, information about the sticker.
   *
   * @return an optional value of sticker as {@link Sticker}.
   */
  public Optional<Sticker> getSticker() {
    return Optional.of(sticker);
  }

  /**
   * Sets the sticker as the message, information about the sticker.
   *
   * @param sticker the sticker as the message as {@link Sticker} or null if the message is not the
   *     sticker.
   */
  public void setSticker(Sticker sticker) {
    this.sticker = sticker;
  }

  /**
   * <i>Optional</i>. Message is a video, information about the video.
   *
   * @return an optional value of video as {@link Video}.
   */
  public Optional<Video> getVideo() {
    return Optional.of(video);
  }

  /**
   * Sets the video as the message, information about the video.
   *
   * @param video the video as the message as {@link Video} or null if the message is not the video.
   */
  public void setVideo(Video video) {
    this.video = video;
  }

  /**
   * <i>Optional.</i> Message is a <a
   * href="https://telegram.org/blog/video-messages-and-telescope">video note</a>, information about
   * the video message.
   *
   * @return an optional value of video_note as {@link VideoNote}.
   */
  public Optional<VideoNote> getVideoNote() {
    return Optional.of(videoNote);
  }

  /**
   * Sets the video note as the message, information about the video message.
   *
   * @param videoNote the video note as the message as {@link VideoNote} or null if the message is
   *     not the video note.
   */
  public void setVideoNote(VideoNote videoNote) {
    this.videoNote = videoNote;
  }

  /**
   * <i>Optional.</i> Message is a voice message, information about the file.
   *
   * @return an optional value of voice as {@link Voice}.
   */
  public Optional<Voice> getVoice() {
    return Optional.of(voice);
  }

  /**
   * Sets the voice as the message, information about the file.
   *
   * @param voice the voice as the message as {@link Voice} or null if the message is not the voice.
   */
  public void setVoice(Voice voice) {
    this.voice = voice;
  }

  /**
   * <i>Optional.</i> Caption for the animation, audio, document, photo, video or voice.
   *
   * @return an optional value of caption as {@link String}.
   */
  public Optional<String> getCaption() {
    return Optional.of(caption);
  }

  /**
   * Sets the caption for the animation, audio, document, photo, video or voice.
   *
   * @param caption the caption for the animation, audio, document, photo, video or voice, as String
   *     or null if the captions is not provided or the message is not a mediafile.
   */
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * <i>Optional.</i> For messages with a caption, special entities like usernames, URLs, bot
   * commands, etc. that appear in the caption.
   *
   * @return an optional value of caption_entities as {@link List}&lt;{@link MessageEntity}&gt;.
   */
  public Optional<List<MessageEntity>> getCaptionEntities() {
    return Optional.of(captionEntities);
  }

  /**
   * Sets the special entities like usernames, URLs, bot commands, etc. that appear in the caption;
   * for the messages with a caption.
   *
   * @param captionEntities the special entities like usernames, URLs, bot commands, etc. that
   *     appear in the caption, as {@link List}&lt;{@link MessageEntity}&gt; or null if the captions
   *     is not provided or it doesn't contains entities.
   */
  public void setCaptionEntities(List<MessageEntity> captionEntities) {
    this.captionEntities = captionEntities;
  }

  /**
   * <i>Optional.</i> True if the message media is covered by a spoiler animation.
   *
   * @return an optional value of has_media_spoiler as Boolean.
   */
  public Optional<Boolean> getHasMediaSpoiler() {
    return Optional.of(hasMediaSpoiler);
  }

  /**
   * Sets whether the message media is covered by a spoiler animation.
   *
   * @param hasMediaSpoiler true if the message is covered by a spoiler animation, otherwise - false
   *     or null.
   */
  public void setHasMediaSpoiler(Boolean hasMediaSpoiler) {
    this.hasMediaSpoiler = hasMediaSpoiler;
  }

  /**
   * <i>Optional.</i> Message is a shared contact, information about the contact.
   *
   * @return an optional value of contact as {@link Contact}.
   */
  public Optional<Contact> getContact() {
    return Optional.of(contact);
  }

  /**
   * Sets the shared contact as the message, information about the contact.
   *
   * @param contact the shared contact as the message as {@link Contact} or null if the message is
   *     not the shared contact.
   */
  public void setContact(Contact contact) {
    this.contact = contact;
  }

  /**
   * <i>Optional.</i> Message is a dice with random value.
   *
   * @return an optional value of dice as {@link Dice}.
   */
  public Optional<Dice> getDice() {
    return Optional.of(dice);
  }

  /**
   * Sets the dice with random value as the message.
   *
   * @param dice the dice with random value as the message as {@link Dice} or null if the message is
   *     not the dice.
   */
  public void setDice(Dice dice) {
    this.dice = dice;
  }

  /**
   * <i>Optional.</i> Message is a game, information about the game.
   *
   * <p><a href="https://core.telegram.org/bots/api#games">More about games »</a>
   *
   * @return an optional value of game as {@link Game}.
   */
  public Optional<Game> getGame() {
    return Optional.of(game);
  }

  /**
   * Sets the game as the message, information about the game.
   *
   * @param game the game as the message as {@link Game} or null if the message is not the game.
   */
  public void setGame(Game game) {
    this.game = game;
  }

  /**
   * <i>Optional.</i> Message is a native poll, information about the poll.
   *
   * @return an optional value of poll as {@link Poll}.
   */
  public Optional<Poll> getPoll() {
    return Optional.of(poll);
  }

  /**
   * Sets the native poll as the message, information about the poll.
   *
   * @param poll the native poll as the message as {@link Poll} or null if the message is not the
   *     poll.
   */
  public void setPoll(Poll poll) {
    this.poll = poll;
  }

  /**
   * <i>Optional.</i> Message is a venue, information about the venue. For backward compatibility,
   * when this field is set, the location field will also be set.
   *
   * @return an optional value of venue as {@link Venue}.
   */
  public Optional<Venue> getVenue() {
    return Optional.of(venue);
  }

  /**
   * Sets the venue as the message, information about the venue.
   *
   * @param venue the venue as the message as {@link Venue} or null if the message is not the venue.
   */
  public void setVenue(Venue venue) {
    this.venue = venue;
  }

  /**
   * <i>Optional.</i> Message is a shared location, information about the location.
   *
   * @return an optional value of location as {@link Location}.
   */
  public Optional<Location> getLocation() {
    return Optional.of(location);
  }

  /**
   * Sets the shared location as the message, information about the location.
   *
   * @param location the shared location as the message as {@link Location} or null if the message
   *     is not the shared location.
   */
  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * <i>Optional.</i> New members that were added to the group or supergroup and information about
   * them (the bot itself may be one of these members).
   *
   * @return an optional value of new_chat_members as {@link List}&lt;{@link User}&gt;.
   */
  public Optional<List<User>> getNewChatMembers() {
    return Optional.of(newChatMembers);
  }

  /**
   * Sets new members that were added to the group or supergroup and information about them (the bot
   * itself may be one of these members).
   *
   * @param newChatMembers new members that were added to the group or supergroup as {@link
   *     List}&lt;{@link User}&gt; or null if not new members or the message is not from group or
   *     supergroup.
   */
  public void setNewChatMembers(List<User> newChatMembers) {
    this.newChatMembers = newChatMembers;
  }

  /**
   * <i>Optional.</i> A member was removed from the group, information about them (this member may
   * be the bot itself).
   *
   * @return an optional value of left_chat_member as {@link User}.
   */
  public Optional<User> getLeftChatMember() {
    return Optional.of(leftChatMember);
  }

  /**
   * Sets the member, which was removed from the group, information about them (this member may be
   * the bot itself).
   *
   * @param leftChatMember the member, which was removed from the group, as {@link User} or null if
   *     not removed members.
   */
  public void setLeftChatMember(User leftChatMember) {
    this.leftChatMember = leftChatMember;
  }

  /**
   * <i>Optional.</i> A chat title was changed to this value.
   *
   * @return an optional value of new_chat_title as String.
   */
  public Optional<String> getNewChatTitle() {
    return Optional.of(newChatTitle);
  }

  /**
   * Sets the chat title, which was changed to this value.
   *
   * @param newChatTitle the chat title, which was changed to this value, as String or null if the
   *     chat title is not changed.
   */
  public void setNewChatTitle(String newChatTitle) {
    this.newChatTitle = newChatTitle;
  }

  /**
   * <i>Optional.</i> A chat photo was change to this value.
   *
   * @return an optional value of new_chat_photo as {@link List}&lt;{@link PhotoSize}&gt;.
   */
  public Optional<List<PhotoSize>> getNewChatPhoto() {
    return Optional.of(newChatPhoto);
  }

  /**
   * Sets the chat photo, which was changed to this value.
   *
   * @param newChatPhoto the chat photo, which was changed to this value, as {@link List}&lt;{@link
   *     PhotoSize}&gt; or null if the chat photo is not changed.
   */
  public void setNewChatPhoto(List<PhotoSize> newChatPhoto) {
    this.newChatPhoto = newChatPhoto;
  }

  /**
   * <i>Optional.</i> Service message: the chat photo was deleted.
   *
   * @return an optional value of delete_chat_photo as Boolean.
   */
  public Optional<Boolean> getDeleteChatPhoto() {
    return Optional.of(deleteChatPhoto);
  }

  /**
   * Sets the service message: the chat photo was deleted.
   *
   * @param deleteChatPhoto true if the chat photo was deleted, otherwise - false or null.
   */
  public void setDeleteChatPhoto(Boolean deleteChatPhoto) {
    this.deleteChatPhoto = deleteChatPhoto;
  }

  /**
   * <i>Optional.</i> Service message: the group has been created.
   *
   * @return an optional value of group_chat_created as Boolean.
   */
  public Optional<Boolean> getGroupChatCreated() {
    return Optional.of(groupChatCreated);
  }

  /**
   * Sets the service message: the group has been created.
   *
   * @param groupChatCreated true if the group has been created, otherwise - false or null.
   */
  public void setGroupChatCreated(Boolean groupChatCreated) {
    this.groupChatCreated = groupChatCreated;
  }

  /**
   * <i>Optional.</i> Service message: the supergroup has been created. This field can't be received
   * in a message coming through updates, because bot can't be a member of a supergroup when it is
   * created. It can only be found in reply_to_message if someone replies to a very first message in
   * a directly created supergroup.
   *
   * @return an optional value of supergroup_chat_created as Boolean.
   */
  public Optional<Boolean> getSupergroupChatCreated() {
    return Optional.of(supergroupChatCreated);
  }

  /**
   * Sets the service message: the supegroup has been created.
   *
   * @param supergroupChatCreated true if the supergroup has been created, otherwise - false or
   *     null.
   */
  public void setSupergroupChatCreated(Boolean supergroupChatCreated) {
    this.supergroupChatCreated = supergroupChatCreated;
  }

  /**
   * <i>Optional.</i> Service message: the channel has been created. This field can't be received in
   * a message coming through updates, because bot can't be a member of a channel when it is
   * created. It can only be found in reply_to_message if someone replies to a very first message in
   * a channel.
   *
   * @return an optional value of channel_chat_created as Boolean.
   */
  public Optional<Boolean> getChannelChatCreated() {
    return Optional.of(channelChatCreated);
  }

  /**
   * Sets the service message: the channel has been created.
   *
   * @param channelChatCreated true if the channel has been created, otherwise - false or null.
   */
  public void setChannelChatCreated(Boolean channelChatCreated) {
    this.channelChatCreated = channelChatCreated;
  }

  /**
   * <i>Optional.</i> Service message: auto-delete timer settings changed in the chat.
   *
   * @return an optional value of message_auto_delete_timer_changed as {@link
   *     MessageAutoDeleteTimerChanged}.
   */
  public Optional<MessageAutoDeleteTimerChanged> getMessageAutoDeleteTimerChanged() {
    return Optional.of(messageAutoDeleteTimerChanged);
  }

  /**
   * Sets the service message: auto-delete timer settings changed in the chat.
   *
   * @param messageAutoDeleteTimerChanged the auto-delete timer settings changed in the chat as
   *     {@link MessageAutoDeleteTimerChanged} or null if it is not required.
   */
  public void setMessageAutoDeleteTimerChanged(
      MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged) {
    this.messageAutoDeleteTimerChanged = messageAutoDeleteTimerChanged;
  }

  /**
   * <i>Optional.</i> The group has been migrated to a supergroup with the specified identifier.
   *
   * @return an optional value of migrate_to_chat_id as Long.
   */
  public Optional<Long> getMigrateToChatId() {
    return Optional.of(migrateToChatId);
  }

  /**
   * Sets the specified identifier of the supergroup, which is migrated from the group; for group.
   *
   * @param migrateToChatId the specifier identifier of a supergroup as Long or null if the group
   *     hasn't been migrated.
   */
  public void setMigrateToChatId(Long migrateToChatId) {
    this.migrateToChatId = migrateToChatId;
  }

  /**
   * <i>Optional.</i> The supergroup has been migrated from a group with the specified identifier.
   *
   * @return an optional value of migrate_from_chat_id as Long.
   */
  public Optional<Long> getMigrateFromChatId() {
    return Optional.of(migrateFromChatId);
  }

  /**
   * Sets the specific identifier of the group, from which is migrated to the supegroup.
   *
   * @param migrateFromChatId the specifier identifier of the group as Long or null if the supegroup
   *     hasn't been migrated.
   */
  public void setMigrateFromChatId(Long migrateFromChatId) {
    this.migrateFromChatId = migrateFromChatId;
  }

  /**
   * <i>Optional.</i> Specified message was pinned.
   *
   * <p>Note that the Message object in this field will not contain further reply_to_message fields
   * even if it is itself a reply.
   *
   * @return an optional value of pinned_message as {@link Message}.
   */
  public Optional<Message> getPinnedMessage() {
    return Optional.of(pinnedMessage);
  }

  /**
   * Sets the specified message which was pinned.
   *
   * @param pinnedMessage the specified message which was pinned as {@link Message} or null if the
   *     message wasn't pinned.
   */
  public void setPinnedMessage(Message pinnedMessage) {
    this.pinnedMessage = pinnedMessage;
  }

  /**
   * <i>Optional.</i> Message is an invoice for a payment, information about the invoice.
   *
   * <p><a href="https://core.telegram.org/bots/api#payments">More about payments »</a>.
   *
   * @return an optiona value of invoice as {@link Invoice}.
   */
  public Optional<Invoice> getInvoice() {
    return Optional.of(invoice);
  }

  /**
   * Sets the invoice for a payment as the message, information about the invoice.
   *
   * @param invoice the invoice for a payment as the message as {@link Invoice} or null if the
   *     message is not the invoice.
   */
  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  /**
   * <i>Optional.</i> Message is a service message about a successful payment, information about the
   * payment.
   *
   * <p><a href="https://core.telegram.org/bots/api#payments">More about payments »</a>.
   *
   * @return an optional value of successful_payment as {@link SuccessfulPayment}.
   */
  public Optional<SuccessfulPayment> getSuccessfulPayment() {
    return Optional.of(successfulPayment);
  }

  /**
   * Sets the service message about a successful payment, information abuot the payment.
   *
   * @param successfulPayment the service message about a succcessful payment as {@link
   *     SuccessfulPayment} or null if the message isn't the service message.
   */
  public void setSuccessfulPayment(SuccessfulPayment successfulPayment) {
    this.successfulPayment = successfulPayment;
  }

  /**
   * <i>Optional.</i> Service message: a user was shared with the bot.
   *
   * @return an optional value of user_shared as {@link userShared}.
   */
  public Optional<UserShared> getUserShared() {
    return Optional.of(userShared);
  }

  /**
   * Sets the service message: a user was shared with the bot.
   *
   * @param userShared the serivce message, which a user was shared with the bot, as {@link
   *     UserShared} or null if the message isn't the service message.
   */
  public void setUserShared(UserShared userShared) {
    this.userShared = userShared;
  }

  /**
   * <i>Optional.</i> Service message: a chat was shared with the bot.
   *
   * @return an optional value of chat_shared as {@link ChatShared}.
   */
  public Optional<ChatShared> getChatShared() {
    return Optional.of(chatShared);
  }

  /**
   * Sets the service message: a chat was shared with the bot.
   *
   * @param chatShared the serivce message, which a chat was shared with the bot, as {@link
   *     ChatShared} or null if the message isn't the service message.
   */
  public void setChatShared(ChatShared chatShared) {
    this.chatShared = chatShared;
  }

  /**
   * <i>Optional.</i> The domain name of the website on which the user has logged in.
   *
   * <p><a href="https://core.telegram.org/widgets/login">More about Telegram Login »</a>.
   *
   * @return an optional value of connected_website as String.
   */
  public Optional<String> getConnectedWebsite() {
    return Optional.of(connectedWebsite);
  }

  /**
   * Sets the domain name of the website on which the user has logged in.
   *
   * @param connectedWebsite the domain name of the website on which the user has logged in as
   *     String or null if the message doesn't contains the domain name.
   */
  public void setConnectedWebsite(String connectedWebsite) {
    this.connectedWebsite = connectedWebsite;
  }

  /**
   * <i>Optional.</i> Service message: the user allowed the bot added to the attachment menu to
   * write messages.
   *
   * @return an optional value of write_access_allowed as {@link WriteAccessAllowed}.
   */
  public Optional<WriteAccessAllowed> getWriteAccessAllowed() {
    return Optional.of(writeAccessAllowed);
  }

  /**
   * Sets the service message: the user allowed the bot added to the attachment menu to write
   * messages.
   *
   * @param writeAccessAllowed the service message, which the user allowed the bot added to the
   *     attachment menu to write messages, or null if the message isn't the service message.
   */
  public void setWriteAccessAllowed(WriteAccessAllowed writeAccessAllowed) {
    this.writeAccessAllowed = writeAccessAllowed;
  }

  /**
   * <i>Optional.</i> Telegram Passport data.
   *
   * @return an optional value of passport_data as {@link PassportData}.
   */
  public Optional<PassportData> getPassportData() {
    return Optional.of(passportData);
  }

  /**
   * Sets the Telegram Passport data.
   *
   * @param passportData the Telegram Passport data as {@link PassportData} or null if the message
   *     doesn't contains it.
   */
  public void setPassportData(PassportData passportData) {
    this.passportData = passportData;
  }

  /**
   * <i>Optional.</i> Service message. A user in the chat triggered another user's proximity alert
   * while sharing Live Location.
   *
   * @return an optional value of proximity_alert_triggered as {@link ProximityAlertTriggered}.
   */
  public Optional<ProximityAlertTriggered> getProximityAlertTriggered() {
    return Optional.of(proximityAlertTriggered);
  }

  /**
   * Sets the service message: a user in the chat triggered another user's proximity alert while
   * sharing Live Location.
   *
   * @param proximityAlertTriggered the service message, which a user the chat triggerred another
   *     user's proximity alert while sharing Live Location, as {@link ProximityAlertTriggered} or
   *     null if the message isn't the service message.
   */
  public void setProximityAlertTriggered(ProximityAlertTriggered proximityAlertTriggered) {
    this.proximityAlertTriggered = proximityAlertTriggered;
  }

  /**
   * <i>Optional.</i> Service message: forum topic created.
   *
   * @return an optional value of forum_topic_created as {@link ForumTopicCreated}.
   */
  public Optional<ForumTopicCreated> getForumTopicCreated() {
    return Optional.of(forumTopicCreated);
  }

  /**
   * Sets the service message: forum topic created.
   *
   * @param forumTopicCreated the service message, which forum topic created, as {@link
   *     ForumTopicCreated} or null if the message isn't the service message.
   */
  public void setForumTopicCreated(ForumTopicCreated forumTopicCreated) {
    this.forumTopicCreated = forumTopicCreated;
  }

  /**
   * <i>Optional.</i> Service message: forum topic edited.
   *
   * @return an optional value of forum_topic_edited as {@link ForumTopicEdited}.
   */
  public Optional<ForumTopicEdited> getForumTopicEdited() {
    return Optional.of(forumTopicEdited);
  }

  /**
   * Sets the service message: forum topic edited.
   *
   * @param forumTopicEdited the service message, which forum topic edited, as {@link
   *     ForumTopicEdited} or null if the message isn't the service message.
   */
  public void setForumTopicEdited(ForumTopicEdited forumTopicEdited) {
    this.forumTopicEdited = forumTopicEdited;
  }

  /**
   * <i>Optional.</i> Service message: forum topic closed.
   *
   * @return an optional value of forum_topic_closed as {@link ForumTopicClosed}.
   */
  public Optional<ForumTopicClosed> getForumTopicClosed() {
    return Optional.of(forumTopicClosed);
  }

  /**
   * Sets the service message: forum topic closed.
   *
   * @param forumTopicClosed the service message, which forum topic closed, as {@link
   *     ForumTopicClosed} or null if the message isn't the service message.
   */
  public void setForumTopicClosed(ForumTopicClosed forumTopicClosed) {
    this.forumTopicClosed = forumTopicClosed;
  }

  /**
   * <i>Optional.</i> Service message: forum topic reopened.
   *
   * @return an optional value of forum_topic_reopened as {@link ForumTopicReopened}.
   */
  public Optional<ForumTopicReopened> getForumTopicReopened() {
    return Optional.of(forumTopicReopened);
  }

  /**
   * Sets the service message: forum topic reopened.
   *
   * @param forumTopicReopened the service message, which forum topic reopened, as {@link
   *     ForumTopicReopened} or null if the message isn't the service message.
   */
  public void setForumTopicReopened(ForumTopicReopened forumTopicReopened) {
    this.forumTopicReopened = forumTopicReopened;
  }

  /**
   * <i>Optional.</i> Service message: the 'General' forum topic hidden.
   *
   * @return an optional value of general_forum_topic_hidden as {@link GeneralForumTopicHidden}.
   */
  public Optional<GeneralForumTopicHidden> getGeneralForumTopicHidden() {
    return Optional.of(generalForumTopicHidden);
  }

  /**
   * Sets the service message: the 'General' forum topic hidden.
   *
   * @param generalForumTopicHidden the service message, which forum topic hidden, as {@link
   *     GeneralForumTopicHidden} or null if the message isn't the service message.
   */
  public void setGeneralForumTopicHidden(GeneralForumTopicHidden generalForumTopicHidden) {
    this.generalForumTopicHidden = generalForumTopicHidden;
  }

  /**
   * <i>Optional.</i> Service message: the 'General' forum topic unhidden.
   *
   * @return an optional value of general_forum_topic_unhidden as {@link GeneralForumTopicUnhidden}.
   */
  public Optional<GeneralForumTopicUnhidden> getGeneralForumTopicUnhidden() {
    return Optional.of(generalForumTopicUnhidden);
  }

  /**
   * Sets the service message: the 'General' forum topic unhidden.
   *
   * @param generalForumTopicUnhidden the service message, which the 'General' forum topic unhidden,
   *     as {@link GeneralForumTopicUnhidden} or null if the message isn't the service message.
   */
  public void setGeneralForumTopicUnhidden(GeneralForumTopicUnhidden generalForumTopicUnhidden) {
    this.generalForumTopicUnhidden = generalForumTopicUnhidden;
  }

  /**
   * <i>Optional.</i> Service message: video chat scheduled.
   *
   * @return an optional value of video_chat_scheduled as {@link VideoChatScheduled}.
   */
  public Optional<VideoChatScheduled> getVideoChatScheduled() {
    return Optional.of(videoChatScheduled);
  }

  /**
   * Sets the service message: video chat scheduled.
   *
   * @param videoChatScheduled the service message, which the video chat scheduled, as {@link
   *     VideoChatScheduled} or null if the message isn't the service message.
   */
  public void setVideoChatScheduled(VideoChatScheduled videoChatScheduled) {
    this.videoChatScheduled = videoChatScheduled;
  }

  /**
   * <i>Optional.</i> Service message: video chat started.
   *
   * @return an optional value of video_chat_started as {@link VideoChatStarted}.
   */
  public Optional<VideoChatStarted> getVideoChatStarted() {
    return Optional.of(videoChatStarted);
  }

  /**
   * Sets the service message: video chat started.
   *
   * @param videoChatStarted the service message, which the video chat started, as {@link
   *     VideoChatStarted} or null if the message isn't the service message.
   */
  public void setVideoChatStarted(VideoChatStarted videoChatStarted) {
    this.videoChatStarted = videoChatStarted;
  }

  /**
   * <i>Optional.</i> Service message: video chat ended.
   *
   * @return an optional value of video_chat_ended as {@link VideoChatEnded}.
   */
  public Optional<VideoChatEnded> getVideoChatEnded() {
    return Optional.of(videoChatEnded);
  }

  /**
   * Sets the service message: video chat ended.
   *
   * @param videoChatEnded the service message, which the video chat ended, as {@link
   *     VideoChatEnded} or null if the message isn't the service message.
   */
  public void setVideoChatEnded(VideoChatEnded videoChatEnded) {
    this.videoChatEnded = videoChatEnded;
  }

  /**
   * <i>Optional.</i> Service message: new participants invited to a video chat.
   *
   * @return an optional value of video_chat_participants_invited as {@link
   *     VideoChatParticipantsInvited}.
   */
  public Optional<VideoChatParticipantsInvited> getVideoChatParticipantsInvited() {
    return Optional.of(videoChatParticipantsInvited);
  }

  /**
   * Sets the service message: new participants invited to a video chat.
   *
   * @param videoChatParticipantsInvited the service message, which the new participants invited to
   *     a video chat, as {@link VideoChatParticipantsInvited} or null if the message isn't the
   *     service message.
   */
  public void setVideoChatParticipantsInvited(
      VideoChatParticipantsInvited videoChatParticipantsInvited) {
    this.videoChatParticipantsInvited = videoChatParticipantsInvited;
  }

  /**
   * <i>Optional.</i> Service message: data sent by a Web App.
   *
   * @return an optional value of web_app_data as {@link WebAppData}.
   */
  public Optional<WebAppData> getWebAppData() {
    return Optional.of(webAppData);
  }

  /**
   * Sets the service message: data sent by a Web App.
   *
   * @param webAppData the service message, which a data senty by a Web App, as {@link WebAppData}
   *     or null if the message isn't the service message.
   */
  public void setWebAppData(WebAppData webAppData) {
    this.webAppData = webAppData;
  }

  /**
   * <i>Optional.</i> Inline keyboard attached to the message. <code>login_url</code> buttons are
   * represented as ordinary <code>url</code> buttons.
   *
   * @return an optional value of reply_markup as {@link InlineKeyboardMarkup}.
   */
  public Optional<InlineKeyboardMarkup> getReplyMarkup() {
    return Optional.of(replyMarkup);
  }

  /**
   * Sets the inline keyboard, which attached to the message.
   *
   * @param replyMarkup the inline keyboard, which attached to the message, as {@link
   *     InlineKeyboardMarkup} or null if is is not required.
   */
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
    if (this == obj) return true;
    if (!(obj instanceof Message other)) return false;
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
        && Objects.equals(messageAutoDeleteTimerChanged, other.messageAutoDeleteTimerChanged)
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
    builder
        .append("Message[messageId=")
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
