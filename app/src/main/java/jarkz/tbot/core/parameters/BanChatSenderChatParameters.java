package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to ban a channel chat in a supergroup or a channel. Until the chat is unbanned,
 * the owner of the banned chat won't be able to send messages on behalf of any of their channels.
 * The bot must be an administrator in the supergroup or channel for this to work and must have the
 * appropriate administrator rights. Returns True on success.
 */
public final class BanChatSenderChatParameters {

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** Unique identifier of the target sender chat */
  @NotNull
  @SerializedName("sender_chat_id")
  public int senderChatId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BanChatSenderChatParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && senderChatId == other.senderChatId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, senderChatId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("BanChatSenderChatParameters[chatId=")
        .append(chatId)
        .append(", senderChatId=")
        .append(senderChatId)
        .append("]");
    return builder.toString();
  }
}
