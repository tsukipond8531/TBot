package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import jarkz.tbot.types.InlineKeyboardMarkup;
import java.util.Objects;

/**
 * Use this method to stop a poll which was sent by the bot. On success, the stopped Poll is
 * returned.
 */
public final class StopPollParameters {

  public static final class Builder {

    private StopPollParameters buildingType;

    public Builder() {
      buildingType = new StopPollParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageId(int messageId) {
      buildingType.messageId = messageId;
      return this;
    }

    public Builder setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      buildingType.replyMarkup = replyMarkup;
      return this;
    }

    public StopPollParameters build() {
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

  /** Identifier of the original message with the poll */
  @NotNull
  @SerializedName("message_id")
  public int messageId;

  /** A JSON-serialized object for a new message inline keyboard. */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof StopPollParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && messageId == other.messageId
        && Objects.equals(replyMarkup, other.replyMarkup);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, messageId, replyMarkup);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("StopPollParameters[chatId=")
        .append(chatId)
        .append(", messageId=")
        .append(messageId)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append("]");
    return builder.toString();
  }
}
