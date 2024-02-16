package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object represents a message. */
public final class Message implements MaybeInaccessibleMessage {

  /** Unique message identifier inside this chat */
  @NotNull
  @SerializedName("message_id")
  public int messageId;

  /**
   * Optional. Unique identifier of a message thread to which the message belongs; for supergroups
   * only
   */
  @SerializedName("message_thread_id")
  public Integer messageThreadId;

  /**
   * Optional. Sender of the message; empty for messages sent to channels. For backward
   * compatibility, the field contains a fake sender user in non-channel chats, if the message was
   * sent on behalf of a chat.
   */
  public User from;

  /**
   * Optional. Sender of the message, sent on behalf of a chat. For example, the channel itself for
   * channel posts, the supergroup itself for messages from anonymous group administrators, the
   * linked channel for messages automatically forwarded to the discussion group. For backward
   * compatibility, the field from contains a fake sender user in non-channel chats, if the message
   * was sent on behalf of a chat.
   */
  @SerializedName("sender_chat")
  public Chat senderChat;

  /**
   * Date the message was sent in Unix time. It is always a positive number, representing a valid
   * date.
   */
  @NotNull public int date;

  /** Chat the message belongs to */
  @NotNull public Chat chat;

  /** Optional. Information about the original message for forwarded messages */
  @SerializedName("forward_origin")
  public MessageOrigin forwardOrigin;

  /** Optional. True, if the message is sent to a forum topic */
  @SerializedName("is_topic_message")
  public Boolean isTopicMessage;

  /**
   * Optional. True, if the message is a channel post that was automatically forwarded to the
   * connected discussion group
   */
  @SerializedName("is_automatic_forward")
  public Boolean isAutomaticForward;

  /**
   * Optional. For replies in the same chat and message thread, the original message. Note that the
   * Message object in this field will not contain further reply_to_message fields even if it itself
   * is a reply.
   */
  @SerializedName("reply_to_message")
  public Message replyToMessage;

  /**
   * Optional. Information about the message that is being replied to, which may come from another
   * chat or forum topic
   */
  @SerializedName("external_reply")
  public ExternalReplyInfo externalReply;

  /**
   * Optional. For replies that quote part of the original message, the quoted part of the message
   */
  public TextQuote quote;

  /** Optional. Bot through which the message was sent */
  @SerializedName("via_bot")
  public User viaBot;

  /** Optional. Date the message was last edited in Unix time */
  @SerializedName("edit_date")
  public Integer editDate;

  /** Optional. True, if the message can't be forwarded */
  @SerializedName("has_protected_content")
  public Boolean hasProtectedContent;

  /** Optional. The unique identifier of a media message group this message belongs to */
  @SerializedName("media_group_id")
  public String mediaGroupId;

  /**
   * Optional. Signature of the post author for messages in channels, or the custom title of an
   * anonymous group administrator
   */
  @SerializedName("author_signature")
  public String authorSignature;

  /** Optional. For text messages, the actual UTF-8 text of the message */
  public String text;

  /**
   * Optional. For text messages, special entities like usernames, URLs, bot commands, etc. that
   * appear in the text
   */
  public List<MessageEntity> entities;

  /**
   * Optional. Options used for link preview generation for the message, if it is a text message and
   * link preview options were changed
   */
  @SerializedName("link_preview_options")
  public LinkPreviewOptions linkPreviewOptions;

  /**
   * Optional. Message is an animation, information about the animation. For backward compatibility,
   * when this field is set, the document field will also be set
   */
  public Animation animation;

  /** Optional. Message is an audio file, information about the file */
  public Audio audio;

  /** Optional. Message is a general file, information about the file */
  public Document document;

  /** Optional. Message is a photo, available sizes of the photo */
  public List<PhotoSize> photo;

  /** Optional. Message is a sticker, information about the sticker */
  public Sticker sticker;

  /** Optional. Message is a forwarded story */
  public Story story;

  /** Optional. Message is a video, information about the video */
  public Video video;

  /** Optional. Message is a video note, information about the video message */
  @SerializedName("video_note")
  public VideoNote videoNote;

  /** Optional. Message is a voice message, information about the file */
  public Voice voice;

  /** Optional. Caption for the animation, audio, document, photo, video or voice */
  public String caption;

  /**
   * Optional. For messages with a caption, special entities like usernames, URLs, bot commands,
   * etc. that appear in the caption
   */
  @SerializedName("caption_entities")
  public List<MessageEntity> captionEntities;

  /** Optional. True, if the message media is covered by a spoiler animation */
  @SerializedName("has_media_spoiler")
  public Boolean hasMediaSpoiler;

  /** Optional. Message is a shared contact, information about the contact */
  public Contact contact;

  /** Optional. Message is a dice with random value */
  public Dice dice;

  /**
   * Optional. Message is a game, information about the game. More about games:
   * https://core.telegram.org/bots/api#games
   */
  public Game game;

  /** Optional. Message is a native poll, information about the poll */
  public Poll poll;

  /**
   * Optional. Message is a venue, information about the venue. For backward compatibility, when
   * this field is set, the location field will also be set
   */
  public Venue venue;

  /** Optional. Message is a shared location, information about the location */
  public Location location;

  /**
   * Optional. New members that were added to the group or supergroup and information about them
   * (the bot itself may be one of these members)
   */
  @SerializedName("new_chat_members")
  public List<User> newChatMembers;

  /**
   * Optional. A member was removed from the group, information about them (this member may be the
   * bot itself)
   */
  @SerializedName("left_chat_member")
  public User leftChatMember;

  /** Optional. A chat title was changed to this value */
  @SerializedName("new_chat_title")
  public String newChatTitle;

  /** Optional. A chat photo was change to this value */
  @SerializedName("new_chat_photo")
  public List<PhotoSize> newChatPhoto;

  /** Optional. Service message: the chat photo was deleted */
  @SerializedName("delete_chat_photo")
  public Boolean deleteChatPhoto;

  /** Optional. Service message: the group has been created */
  @SerializedName("group_chat_created")
  public Boolean groupChatCreated;

  /**
   * Optional. Service message: the supergroup has been created. This field can't be received in a
   * message coming through updates, because bot can't be a member of a supergroup when it is
   * created. It can only be found in reply_to_message if someone replies to a very first message in
   * a directly created supergroup.
   */
  @SerializedName("supergroup_chat_created")
  public Boolean supergroupChatCreated;

  /**
   * Optional. Service message: the channel has been created. This field can't be received in a
   * message coming through updates, because bot can't be a member of a channel when it is created.
   * It can only be found in reply_to_message if someone replies to a very first message in a
   * channel.
   */
  @SerializedName("channel_chat_created")
  public Boolean channelChatCreated;

  /** Optional. Service message: auto-delete timer settings changed in the chat */
  @SerializedName("message_auto_delete_timer_changed")
  public MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;

  /**
   * Optional. The group has been migrated to a supergroup with the specified identifier. This
   * number may have more than 32 significant bits and some programming languages may have
   * difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a
   * signed 64-bit integer or double-precision float type are safe for storing this identifier.
   */
  @SerializedName("migrate_to_chat_id")
  public Integer migrateToChatId;

  /**
   * Optional. The supergroup has been migrated from a group with the specified identifier. This
   * number may have more than 32 significant bits and some programming languages may have
   * difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a
   * signed 64-bit integer or double-precision float type are safe for storing this identifier.
   */
  @SerializedName("migrate_from_chat_id")
  public Integer migrateFromChatId;

  /**
   * Optional. Specified message was pinned. Note that the Message object in this field will not
   * contain further reply_to_message fields even if it itself is a reply.
   */
  @SerializedName("pinned_message")
  public MaybeInaccessibleMessage pinnedMessage;

  /**
   * Optional. Message is an invoice for a payment, information about the invoice. More about
   * payments: https://core.telegram.org/bots/api#payments
   */
  public Invoice invoice;

  /**
   * Optional. Message is a service message about a successful payment, information about the
   * payment. More about payments: https://core.telegram.org/bots/api#payments
   */
  @SerializedName("successful_payment")
  public SuccessfulPayment successfulPayment;

  /** Optional. Service message: users were shared with the bot */
  @SerializedName("users_shared")
  public UsersShared usersShared;

  /** Optional. Service message: a chat was shared with the bot */
  @SerializedName("chat_shared")
  public ChatShared chatShared;

  /**
   * Optional. The domain name of the website on which the user has logged in. More about Telegram
   * Login: https://core.telegram.org/widgets/login
   */
  @SerializedName("connected_website")
  public String connectedWebsite;

  /**
   * Optional. Service message: the user allowed the bot to write messages after adding it to the
   * attachment or side menu, launching a Web App from a link, or accepting an explicit request from
   * a Web App sent by the method requestWriteAccess
   */
  @SerializedName("write_access_allowed")
  public WriteAccessAllowed writeAccessAllowed;

  /** Optional. Telegram Passport data */
  @SerializedName("passport_data")
  public PassportData passportData;

  /**
   * Optional. Service message. A user in the chat triggered another user's proximity alert while
   * sharing Live Location.
   */
  @SerializedName("proximity_alert_triggered")
  public ProximityAlertTriggered proximityAlertTriggered;

  /** Optional. Service message: forum topic created */
  @SerializedName("forum_topic_created")
  public ForumTopicCreated forumTopicCreated;

  /** Optional. Service message: forum topic edited */
  @SerializedName("forum_topic_edited")
  public ForumTopicEdited forumTopicEdited;

  /** Optional. Service message: forum topic closed */
  @SerializedName("forum_topic_closed")
  public ForumTopicClosed forumTopicClosed;

  /** Optional. Service message: forum topic reopened */
  @SerializedName("forum_topic_reopened")
  public ForumTopicReopened forumTopicReopened;

  /** Optional. Service message: the 'General' forum topic hidden */
  @SerializedName("general_forum_topic_hidden")
  public GeneralForumTopicHidden generalForumTopicHidden;

  /** Optional. Service message: the 'General' forum topic unhidden */
  @SerializedName("general_forum_topic_unhidden")
  public GeneralForumTopicUnhidden generalForumTopicUnhidden;

  /** Optional. Service message: a scheduled giveaway was created */
  @SerializedName("giveaway_created")
  public GiveawayCreated giveawayCreated;

  /** Optional. The message is a scheduled giveaway message */
  public Giveaway giveaway;

  /** Optional. A giveaway with public winners was completed */
  @SerializedName("giveaway_winners")
  public GiveawayWinners giveawayWinners;

  /** Optional. Service message: a giveaway without public winners was completed */
  @SerializedName("giveaway_completed")
  public GiveawayCompleted giveawayCompleted;

  /** Optional. Service message: video chat scheduled */
  @SerializedName("video_chat_scheduled")
  public VideoChatScheduled videoChatScheduled;

  /** Optional. Service message: video chat started */
  @SerializedName("video_chat_started")
  public VideoChatStarted videoChatStarted;

  /** Optional. Service message: video chat ended */
  @SerializedName("video_chat_ended")
  public VideoChatEnded videoChatEnded;

  /** Optional. Service message: new participants invited to a video chat */
  @SerializedName("video_chat_participants_invited")
  public VideoChatParticipantsInvited videoChatParticipantsInvited;

  /** Optional. Service message: data sent by a Web App */
  @SerializedName("web_app_data")
  public WebAppData webAppData;

  /**
   * Optional. Inline keyboard attached to the message. login_url buttons are represented as
   * ordinary url buttons.
   */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

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
        && Objects.equals(forwardOrigin, other.forwardOrigin)
        && Objects.equals(isTopicMessage, other.isTopicMessage)
        && Objects.equals(isAutomaticForward, other.isAutomaticForward)
        && Objects.equals(replyToMessage, other.replyToMessage)
        && Objects.equals(externalReply, other.externalReply)
        && Objects.equals(quote, other.quote)
        && Objects.equals(viaBot, other.viaBot)
        && Objects.equals(editDate, other.editDate)
        && Objects.equals(hasProtectedContent, other.hasProtectedContent)
        && Objects.equals(mediaGroupId, other.mediaGroupId)
        && Objects.equals(authorSignature, other.authorSignature)
        && Objects.equals(text, other.text)
        && Objects.equals(entities, other.entities)
        && Objects.equals(linkPreviewOptions, other.linkPreviewOptions)
        && Objects.equals(animation, other.animation)
        && Objects.equals(audio, other.audio)
        && Objects.equals(document, other.document)
        && Objects.equals(photo, other.photo)
        && Objects.equals(sticker, other.sticker)
        && Objects.equals(story, other.story)
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
        && Objects.equals(usersShared, other.usersShared)
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
        && Objects.equals(giveawayCreated, other.giveawayCreated)
        && Objects.equals(giveaway, other.giveaway)
        && Objects.equals(giveawayWinners, other.giveawayWinners)
        && Objects.equals(giveawayCompleted, other.giveawayCompleted)
        && Objects.equals(videoChatScheduled, other.videoChatScheduled)
        && Objects.equals(videoChatStarted, other.videoChatStarted)
        && Objects.equals(videoChatEnded, other.videoChatEnded)
        && Objects.equals(videoChatParticipantsInvited, other.videoChatParticipantsInvited)
        && Objects.equals(webAppData, other.webAppData)
        && Objects.equals(replyMarkup, other.replyMarkup);
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
        forwardOrigin,
        isTopicMessage,
        isAutomaticForward,
        replyToMessage,
        externalReply,
        quote,
        viaBot,
        editDate,
        hasProtectedContent,
        mediaGroupId,
        authorSignature,
        text,
        entities,
        linkPreviewOptions,
        animation,
        audio,
        document,
        photo,
        sticker,
        story,
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
        usersShared,
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
        giveawayCreated,
        giveaway,
        giveawayWinners,
        giveawayCompleted,
        videoChatScheduled,
        videoChatStarted,
        videoChatEnded,
        videoChatParticipantsInvited,
        webAppData,
        replyMarkup);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
        .append(", forwardOrigin=")
        .append(forwardOrigin)
        .append(", isTopicMessage=")
        .append(isTopicMessage)
        .append(", isAutomaticForward=")
        .append(isAutomaticForward)
        .append(", replyToMessage=")
        .append(replyToMessage)
        .append(", externalReply=")
        .append(externalReply)
        .append(", quote=")
        .append(quote)
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
        .append(", linkPreviewOptions=")
        .append(linkPreviewOptions)
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
        .append(", story=")
        .append(story)
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
        .append(", usersShared=")
        .append(usersShared)
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
        .append(", giveawayCreated=")
        .append(giveawayCreated)
        .append(", giveaway=")
        .append(giveaway)
        .append(", giveawayWinners=")
        .append(giveawayWinners)
        .append(", giveawayCompleted=")
        .append(giveawayCompleted)
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
