package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Use this method to send a game. On success, the sent Message is returned. */
public final class SendGameParameters {

  /** Unique identifier for the target chat */
  @NotNull
  @SerializedName("chat_id")
  public int chatId;

  /**
   * Unique identifier for the target message thread (topic) of the forum; for forum supergroups
   * only
   */
  @SerializedName("message_thread_id")
  public Integer messageThreadId;

  /**
   * Short name of the game, serves as the unique identifier for the game. Set up your games
   * via @BotFather.
   */
  @NotNull
  @SerializedName("game_short_name")
  public String gameShortName;

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
   * A JSON-serialized object for an inline keyboard. If empty, one 'Play game_title' button will be
   * shown. If not empty, the first button must launch the game.
   */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SendGameParameters other)) return false;
    return chatId == other.chatId
        && Objects.equals(messageThreadId, other.messageThreadId)
        && Objects.equals(gameShortName, other.gameShortName)
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
        gameShortName,
        disableNotification,
        protectContent,
        replyParameters,
        replyMarkup);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SendGameParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
        .append(", gameShortName=")
        .append(gameShortName)
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
