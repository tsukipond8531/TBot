package jarkz.tbot.types.chat;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.keyboardbutton.KeyboardButtonRequestChat;
import java.util.Objects;

/**
 * This object contains information about the chat whose identifier was shared with the bot using a
 * {@link KeyboardButtonRequestChat} button.
 *
 * @author Pavel Bialiauski
 */
public class ChatShared {

  @SerializedName("request_id")
  @NotNull
  private int requestId;

  @SerializedName("chat_id")
  @NotNull
  private long chatId;

  /** Default constructor. */
  public ChatShared() {}

  /**
   * Identifier of the request.
   *
   * @return request_id as int.
   */
  public int getRequestId() {
    return requestId;
  }

  /**
   * Sets the identifier of the request.
   *
   * @param requestId the identifier of the request as int.
   */
  public void setRequestId(int requestId) {
    this.requestId = requestId;
  }

  /**
   * Identifier of the shared chat. The bot may not have access to the chat and could be unable to
   * use this identifier, unless the chat is already known to the bot by some other means.
   *
   * @return chat_id as long.
   */
  public long getChatId() {
    return chatId;
  }

  /**
   * Sets the identifier of the shared chat. The bot may not have access to the chat and could be
   * unable to use this identifier, unless the chat is already known to the bot by some other means.
   *
   * @param chatId the identifier of the shared chat as long.
   */
  public void setChatId(long chatId) {
    this.chatId = chatId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(requestId, chatId);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatShared other)) return false;
    return requestId == other.requestId && chatId == other.chatId;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ChatShared[requestId=")
        .append(requestId)
        .append(", chatId=")
        .append(chatId)
        .append("]");
    return builder.toString();
  }
}
