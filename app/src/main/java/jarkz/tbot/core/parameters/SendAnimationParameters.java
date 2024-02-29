package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import jarkz.tbot.types.InputFile;
import jarkz.tbot.types.MessageEntity;
import jarkz.tbot.types.ReplyMarkup;
import jarkz.tbot.types.ReplyParameters;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to send animation files (GIF or H.264/MPEG-4 AVC video without sound). On
 * success, the sent Message is returned. Bots can currently send animation files of up to 50 MB in
 * size, this limit may be changed in the future.
 */
public final class SendAnimationParameters {

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /**
   * Unique identifier for the target message thread (topic) of the forum; for forum supergroups
   * only
   */
  @SerializedName("message_thread_id")
  public Integer messageThreadId;

  /**
   * Animation to send. Pass a file_id as String to send an animation that exists on the Telegram
   * servers (recommended), pass an HTTP URL as a String for Telegram to get an animation from the
   * Internet, or upload a new animation using multipart/form-data. More information on Sending
   * Files: https://core.telegram.org/bots/api#sending-files
   */
  @NotNull public InputFile animation;

  /** Duration of sent animation in seconds */
  public Integer duration;

  /** Animation width */
  public Integer width;

  /** Animation height */
  public Integer height;

  /**
   * Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported
   * server-side. The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's
   * width and height should not exceed 320. Ignored if the file is not uploaded using
   * multipart/form-data. Thumbnails can't be reused and can be only uploaded as a new file, so you
   * can pass "attach://<file_attach_name>" if the thumbnail was uploaded using multipart/form-data
   * under <file_attach_name>. More information on Sending Files:
   * https://core.telegram.org/bots/api#sending-files
   */
  public InputFile thumbnail;

  /**
   * Animation caption (may also be used when resending animation by file_id), 0-1024 characters
   * after entities parsing
   */
  public String caption;

  /**
   * Mode for parsing entities in the animation caption. See formatting options for more details.
   */
  @SerializedName("parse_mode")
  public String parseMode;

  /**
   * A JSON-serialized list of special entities that appear in the caption, which can be specified
   * instead of parse_mode
   */
  @SerializedName("caption_entities")
  public List<MessageEntity> captionEntities;

  /** Pass True if the animation needs to be covered with a spoiler animation */
  @SerializedName("has_spoiler")
  public Boolean hasSpoiler;

  /** Sends the message silently. Users will receive a notification with no sound. */
  @SerializedName("disable_notification")
  public Boolean disableNotification;

  /** Protects the contents of the sent message from forwarding and saving */
  @SerializedName("protect_content")
  public Boolean protectContent;

  /** Description of the message to reply to */
  @SerializedName("reply_parameters")
  public ReplyParameters replyParameters;

  /**
   * Additional interface options. A JSON-serialized object for an inline keyboard, custom reply
   * keyboard, instructions to remove reply keyboard or to force a reply from the user.
   */
  @SerializedName("reply_markup")
  public ReplyMarkup replyMarkup;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SendAnimationParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageThreadId, other.messageThreadId)
        && Objects.equals(animation, other.animation)
        && Objects.equals(duration, other.duration)
        && Objects.equals(width, other.width)
        && Objects.equals(height, other.height)
        && Objects.equals(thumbnail, other.thumbnail)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(hasSpoiler, other.hasSpoiler)
        && Objects.equals(disableNotification, other.disableNotification)
        && Objects.equals(protectContent, other.protectContent)
        && Objects.equals(replyParameters, other.replyParameters)
        && Objects.equals(replyMarkup, other.replyMarkup);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chatId,
        messageThreadId,
        animation,
        duration,
        width,
        height,
        thumbnail,
        caption,
        parseMode,
        captionEntities,
        hasSpoiler,
        disableNotification,
        protectContent,
        replyParameters,
        replyMarkup);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SendAnimationParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
        .append(", animation=")
        .append(animation)
        .append(", duration=")
        .append(duration)
        .append(", width=")
        .append(width)
        .append(", height=")
        .append(height)
        .append(", thumbnail=")
        .append(thumbnail)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", hasSpoiler=")
        .append(hasSpoiler)
        .append(", disableNotification=")
        .append(disableNotification)
        .append(", protectContent=")
        .append(protectContent)
        .append(", replyParameters=")
        .append(replyParameters)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append("]");
    return builder.toString();
  }
}
