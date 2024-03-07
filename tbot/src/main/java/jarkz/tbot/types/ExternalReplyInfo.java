package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * This object contains information about a message that is being replied to, which may come from
 * another chat or forum topic.
 */
public final class ExternalReplyInfo {

  /** Origin of the message replied to by the given message */
  @NotNull public MessageOrigin origin;

  /**
   * Optional. Chat the original message belongs to. Available only if the chat is a supergroup or a
   * channel.
   */
  public Chat chat;

  /**
   * Optional. Unique message identifier inside the original chat. Available only if the original
   * chat is a supergroup or a channel.
   */
  @SerializedName("message_id")
  public Integer messageId;

  /**
   * Optional. Options used for link preview generation for the original message, if it is a text
   * message
   */
  @SerializedName("link_preview_options")
  public LinkPreviewOptions linkPreviewOptions;

  /** Optional. Message is an animation, information about the animation */
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

  /** Optional. Message is a scheduled giveaway, information about the giveaway */
  public Giveaway giveaway;

  /** Optional. A giveaway with public winners was completed */
  @SerializedName("giveaway_winners")
  public GiveawayWinners giveawayWinners;

  /**
   * Optional. Message is an invoice for a payment, information about the invoice. More about
   * payments: https://core.telegram.org/bots/api#payments
   */
  public Invoice invoice;

  /** Optional. Message is a shared location, information about the location */
  public Location location;

  /** Optional. Message is a native poll, information about the poll */
  public Poll poll;

  /** Optional. Message is a venue, information about the venue */
  public Venue venue;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ExternalReplyInfo other)) return false;
    return Objects.equals(origin, other.origin)
        && Objects.equals(chat, other.chat)
        && Objects.equals(messageId, other.messageId)
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
        && Objects.equals(hasMediaSpoiler, other.hasMediaSpoiler)
        && Objects.equals(contact, other.contact)
        && Objects.equals(dice, other.dice)
        && Objects.equals(game, other.game)
        && Objects.equals(giveaway, other.giveaway)
        && Objects.equals(giveawayWinners, other.giveawayWinners)
        && Objects.equals(invoice, other.invoice)
        && Objects.equals(location, other.location)
        && Objects.equals(poll, other.poll)
        && Objects.equals(venue, other.venue);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        origin,
        chat,
        messageId,
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
        hasMediaSpoiler,
        contact,
        dice,
        game,
        giveaway,
        giveawayWinners,
        invoice,
        location,
        poll,
        venue);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ExternalReplyInfo[origin=")
        .append(origin)
        .append(", chat=")
        .append(chat)
        .append(", messageId=")
        .append(messageId)
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
        .append(", hasMediaSpoiler=")
        .append(hasMediaSpoiler)
        .append(", contact=")
        .append(contact)
        .append(", dice=")
        .append(dice)
        .append(", game=")
        .append(game)
        .append(", giveaway=")
        .append(giveaway)
        .append(", giveawayWinners=")
        .append(giveawayWinners)
        .append(", invoice=")
        .append(invoice)
        .append(", location=")
        .append(location)
        .append(", poll=")
        .append(poll)
        .append(", venue=")
        .append(venue)
        .append("]");
    return builder.toString();
  }
}
