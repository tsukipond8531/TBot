package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import jarkz.tbot.types.Media;
import jarkz.tbot.types.ReplyParameters;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to send a group of photos, videos, documents or audios as an album. Documents and
 * audio files can be only grouped in an album with messages of the same type. On success, an array
 * of Messages that were sent is returned.
 */
public final class SendMediaGroupParameters {

  public static final class Builder {

    private SendMediaGroupParameters buildingType;

    public Builder() {
      buildingType = new SendMediaGroupParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageThreadId(Integer messageThreadId) {
      buildingType.messageThreadId = messageThreadId;
      return this;
    }

    public Builder setMedia(List<Media> media) {
      buildingType.media = media;
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

    public SendMediaGroupParameters build() {
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

  /** A JSON-serialized array describing messages to be sent, must include 2-10 items */
  @NotNull public List<Media> media;

  /** Sends messages silently. Users will receive a notification with no sound. */
  @SerializedName("disable_notification")
  public Boolean disableNotification;

  /** Protects the contents of the sent messages from forwarding and saving */
  @SerializedName("protect_content")
  public Boolean protectContent;

  /** Description of the message to reply to */
  @SerializedName("reply_parameters")
  public ReplyParameters replyParameters;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SendMediaGroupParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageThreadId, other.messageThreadId)
        && Objects.equals(media, other.media)
        && Objects.equals(disableNotification, other.disableNotification)
        && Objects.equals(protectContent, other.protectContent)
        && Objects.equals(replyParameters, other.replyParameters);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chatId, messageThreadId, media, disableNotification, protectContent, replyParameters);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SendMediaGroupParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
        .append(", media=")
        .append(media)
        .append(", disableNotification=")
        .append(disableNotification)
        .append(", protectContent=")
        .append(protectContent)
        .append(", replyParameters=")
        .append(replyParameters)
        .append("]");
    return builder.toString();
  }
}
