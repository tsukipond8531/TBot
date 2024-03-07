package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jarkz.tbot.types.Id;
import jarkz.tbot.types.InlineKeyboardMarkup;
import java.util.Objects;

/**
 * Use this method to stop updating a live location message before live_period expires. On success,
 * if the message is not an inline message, the edited Message is returned, otherwise True is
 * returned.
 */
public final class StopMessageLiveLocationParameters {

  public static final class Builder {

    private StopMessageLiveLocationParameters buildingType;

    public Builder() {
      buildingType = new StopMessageLiveLocationParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageId(Integer messageId) {
      buildingType.messageId = messageId;
      return this;
    }

    public Builder setInlineMessageId(String inlineMessageId) {
      buildingType.inlineMessageId = inlineMessageId;
      return this;
    }

    public Builder setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      buildingType.replyMarkup = replyMarkup;
      return this;
    }

    public StopMessageLiveLocationParameters build() {
      return buildingType;
    }
  }

  /**
   * Required if inline_message_id is not specified. Unique identifier for the target chat or
   * username of the target channel (in the format @channelusername)
   */
  @SerializedName("chat_id")
  public Id chatId;

  /**
   * Required if inline_message_id is not specified. Identifier of the message with live location to
   * stop
   */
  @SerializedName("message_id")
  public Integer messageId;

  /** Required if chat_id and message_id are not specified. Identifier of the inline message */
  @SerializedName("inline_message_id")
  public String inlineMessageId;

  /** A JSON-serialized object for a new inline keyboard. */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof StopMessageLiveLocationParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageId, other.messageId)
        && Objects.equals(inlineMessageId, other.inlineMessageId)
        && Objects.equals(replyMarkup, other.replyMarkup);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, messageId, inlineMessageId, replyMarkup);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("StopMessageLiveLocationParameters[chatId=")
        .append(chatId)
        .append(", messageId=")
        .append(messageId)
        .append(", inlineMessageId=")
        .append(inlineMessageId)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append("]");
    return builder.toString();
  }
}
