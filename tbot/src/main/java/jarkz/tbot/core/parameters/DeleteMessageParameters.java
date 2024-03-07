package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to delete a message, including service messages, with the following limitations:
 *
 * <p>- A message can only be deleted if it was sent less than 48 hours ago.
 *
 * <p>- Service messages about a supergroup, channel, or forum topic creation can't be deleted.
 *
 * <p>- A dice message in a private chat can only be deleted if it was sent more than 24 hours ago.
 *
 * <p>- Bots can delete outgoing messages in private chats, groups, and supergroups.
 *
 * <p>- Bots can delete incoming messages in private chats.
 *
 * <p>- Bots granted can_post_messages permissions can delete outgoing messages in channels.
 *
 * <p>- If the bot is an administrator of a group, it can delete any message there.
 *
 * <p>- If the bot has can_delete_messages permission in a supergroup or a channel, it can delete
 * any message there.
 *
 * <p>Returns True on success.
 */
public final class DeleteMessageParameters {

  public static final class Builder {

    private DeleteMessageParameters buildingType;

    public Builder() {
      buildingType = new DeleteMessageParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageId(int messageId) {
      buildingType.messageId = messageId;
      return this;
    }

    public DeleteMessageParameters build() {
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

  /** Identifier of the message to delete */
  @NotNull
  @SerializedName("message_id")
  public int messageId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof DeleteMessageParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && messageId == other.messageId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, messageId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("DeleteMessageParameters[chatId=")
        .append(chatId)
        .append(", messageId=")
        .append(messageId)
        .append("]");
    return builder.toString();
  }
}
