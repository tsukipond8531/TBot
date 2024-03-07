package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method when you need to tell the user that something is happening on the bot's side. The
 * status is set for 5 seconds or less (when a message arrives from your bot, Telegram clients clear
 * its typing status). Returns True on success.
 *
 * <p>We only recommend using this method when a response from the bot will take a noticeable amount
 * of time to arrive.
 */
public final class SendChatActionParameters {

  public static final class Builder {

    private SendChatActionParameters buildingType;

    public Builder() {
      buildingType = new SendChatActionParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageThreadId(Integer messageThreadId) {
      buildingType.messageThreadId = messageThreadId;
      return this;
    }

    public Builder setAction(String action) {
      buildingType.action = action;
      return this;
    }

    public SendChatActionParameters build() {
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

  /** Unique identifier for the target message thread; for supergroups only */
  @SerializedName("message_thread_id")
  public Integer messageThreadId;

  /**
   * Type of action to broadcast. Choose one, depending on what the user is about to receive: typing
   * for text messages, upload_photo for photos, record_video or upload_video for videos,
   * record_voice or upload_voice for voice notes, upload_document for general files, choose_sticker
   * for stickers, find_location for location data, record_video_note or upload_video_note for video
   * notes.
   */
  @NotNull public String action;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SendChatActionParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageThreadId, other.messageThreadId)
        && Objects.equals(action, other.action);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, messageThreadId, action);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SendChatActionParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
        .append(", action=")
        .append(action)
        .append("]");
    return builder.toString();
  }
}
