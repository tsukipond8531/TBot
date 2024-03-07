package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Use this method to get data for high score tables. Will return the score of the specified user
 * and several of their neighbors in a game. Returns an Array of GameHighScore objects.
 */
public final class GetGameHighScoresParameters {

  /** Target user id */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  /** Required if inline_message_id is not specified. Unique identifier for the target chat */
  @SerializedName("chat_id")
  public Integer chatId;

  /** Required if inline_message_id is not specified. Identifier of the sent message */
  @SerializedName("message_id")
  public Integer messageId;

  /** Required if chat_id and message_id are not specified. Identifier of the inline message */
  @SerializedName("inline_message_id")
  public String inlineMessageId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetGameHighScoresParameters other)) return false;
    return userId == other.userId
        && Objects.equals(chatId, other.chatId)
        && Objects.equals(messageId, other.messageId)
        && Objects.equals(inlineMessageId, other.inlineMessageId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(userId, chatId, messageId, inlineMessageId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("GetGameHighScoresParameters[userId=")
        .append(userId)
        .append(", chatId=")
        .append(chatId)
        .append(", messageId=")
        .append(messageId)
        .append(", inlineMessageId=")
        .append(inlineMessageId)
        .append("]");
    return builder.toString();
  }
}
