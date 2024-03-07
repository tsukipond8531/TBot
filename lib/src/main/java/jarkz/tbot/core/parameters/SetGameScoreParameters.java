package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Use this method to set the score of the specified user in a game message. On success, if the
 * message is not an inline message, the Message is returned, otherwise True is returned. Returns an
 * error, if the new score is not greater than the user's current score in the chat and force is
 * False.
 */
public final class SetGameScoreParameters {

  /** User identifier */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  /** New score, must be non-negative */
  @NotNull public int score;

  /**
   * Pass True if the high score is allowed to decrease. This can be useful when fixing mistakes or
   * banning cheaters
   */
  public Boolean force;

  /**
   * Pass True if the game message should not be automatically edited to include the current
   * scoreboard
   */
  @SerializedName("disable_edit_message")
  public Boolean disableEditMessage;

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
    if (!(obj instanceof SetGameScoreParameters other)) return false;
    return userId == other.userId
        && score == other.score
        && Objects.equals(force, other.force)
        && Objects.equals(disableEditMessage, other.disableEditMessage)
        && Objects.equals(chatId, other.chatId)
        && Objects.equals(messageId, other.messageId)
        && Objects.equals(inlineMessageId, other.inlineMessageId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        userId, score, force, disableEditMessage, chatId, messageId, inlineMessageId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetGameScoreParameters[userId=")
        .append(userId)
        .append(", score=")
        .append(score)
        .append(", force=")
        .append(force)
        .append(", disableEditMessage=")
        .append(disableEditMessage)
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
