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

/** Use this method to send photos. On success, the sent Message is returned. */
public final class SendPhotoParameters {

  public static final class Builder {

    private SendPhotoParameters buildingType;

    public Builder() {
      buildingType = new SendPhotoParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageThreadId(Integer messageThreadId) {
      buildingType.messageThreadId = messageThreadId;
      return this;
    }

    public Builder setPhoto(InputFile photo) {
      buildingType.photo = photo;
      return this;
    }

    public Builder setCaption(String caption) {
      buildingType.caption = caption;
      return this;
    }

    public Builder setParseMode(String parseMode) {
      buildingType.parseMode = parseMode;
      return this;
    }

    public Builder setCaptionEntities(List<MessageEntity> captionEntities) {
      buildingType.captionEntities = captionEntities;
      return this;
    }

    public Builder setHasSpoiler(Boolean hasSpoiler) {
      buildingType.hasSpoiler = hasSpoiler;
      return this;
    }

    public Builder setDisableNotification(Boolean disableNotification) {
      buildingType.disableNotification = disableNotification;
      return this;
    }

    public Builder setProtectContent(Boolean protectContent) {
      buildingType.protectContent = protectContent;
      return this;
    }

    public Builder setReplyParameters(ReplyParameters replyParameters) {
      buildingType.replyParameters = replyParameters;
      return this;
    }

    public Builder setReplyMarkup(ReplyMarkup replyMarkup) {
      buildingType.replyMarkup = replyMarkup;
      return this;
    }

    public SendPhotoParameters build() {
      return buildingType;
    }
  }

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
   * Photo to send. Pass a file_id as String to send a photo that exists on the Telegram servers
   * (recommended), pass an HTTP URL as a String for Telegram to get a photo from the Internet, or
   * upload a new photo using multipart/form-data. The photo must be at most 10 MB in size. The
   * photo's width and height must not exceed 10000 in total. Width and height ratio must be at most
   * 20. More information on Sending Files: https://core.telegram.org/bots/api#sending-files
   */
  @NotNull public InputFile photo;

  /**
   * Photo caption (may also be used when resending photos by file_id), 0-1024 characters after
   * entities parsing
   */
  public String caption;

  /** Mode for parsing entities in the photo caption. See formatting options for more details. */
  @SerializedName("parse_mode")
  public String parseMode;

  /**
   * A JSON-serialized list of special entities that appear in the caption, which can be specified
   * instead of parse_mode
   */
  @SerializedName("caption_entities")
  public List<MessageEntity> captionEntities;

  /** Pass True if the photo needs to be covered with a spoiler animation */
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
    if (!(obj instanceof SendPhotoParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageThreadId, other.messageThreadId)
        && Objects.equals(photo, other.photo)
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
        photo,
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
        .append("SendPhotoParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
        .append(", photo=")
        .append(photo)
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
