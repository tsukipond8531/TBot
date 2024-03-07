package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to add a message to the list of pinned messages in a chat. If the chat is not a
 * private chat, the bot must be an administrator in the chat for this to work and must have the
 * 'can_pin_messages' administrator right in a supergroup or 'can_edit_messages' administrator right
 * in a channel. Returns True on success.
 */
public final class PinChatMessageParameters {

  public static final class Builder {

    private PinChatMessageParameters buildingType;

    public Builder() {
      buildingType = new PinChatMessageParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageId(int messageId) {
      buildingType.messageId = messageId;
      return this;
    }

    public Builder setDisableNotification(Boolean disableNotification) {
      buildingType.disableNotification = disableNotification;
      return this;
    }

    public PinChatMessageParameters build() {
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

  /** Identifier of a message to pin */
  @NotNull
  @SerializedName("message_id")
  public int messageId;

  /**
   * Pass True if it is not necessary to send a notification to all chat members about the new
   * pinned message. Notifications are always disabled in channels and private chats.
   */
  @SerializedName("disable_notification")
  public Boolean disableNotification;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PinChatMessageParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && messageId == other.messageId
        && Objects.equals(disableNotification, other.disableNotification);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, messageId, disableNotification);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("PinChatMessageParameters[chatId=")
        .append(chatId)
        .append(", messageId=")
        .append(messageId)
        .append(", disableNotification=")
        .append(disableNotification)
        .append("]");
    return builder.toString();
  }
}
