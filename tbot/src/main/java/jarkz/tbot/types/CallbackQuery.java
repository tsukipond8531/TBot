package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents an incoming callback query from a callback button in an inline keyboard.
 * If the button that originated the query was attached to a message sent by the bot, the field
 * message will be present. If the button was attached to a message sent via the bot (in inline
 * mode), the field inline_message_id will be present. Exactly one of the fields data or
 * game_short_name will be present.
 */
public final class CallbackQuery {

  public static final class Builder {

    private CallbackQuery buildingType;

    public Builder() {
      buildingType = new CallbackQuery();
    }

    public Builder setId(String id) {
      buildingType.id = id;
      return this;
    }

    public Builder setFrom(User from) {
      buildingType.from = from;
      return this;
    }

    public Builder setMessage(MaybeInaccessibleMessage message) {
      buildingType.message = message;
      return this;
    }

    public Builder setInlineMessageId(String inlineMessageId) {
      buildingType.inlineMessageId = inlineMessageId;
      return this;
    }

    public Builder setChatInstance(String chatInstance) {
      buildingType.chatInstance = chatInstance;
      return this;
    }

    public Builder setData(String data) {
      buildingType.data = data;
      return this;
    }

    public Builder setGameShortName(String gameShortName) {
      buildingType.gameShortName = gameShortName;
      return this;
    }

    public CallbackQuery build() {
      return buildingType;
    }
  }

  /** Unique identifier for this query */
  @NotNull public String id;

  /** Sender */
  @NotNull public User from;

  /** Optional. Message sent by the bot with the callback button that originated the query */
  public MaybeInaccessibleMessage message;

  /**
   * Optional. Identifier of the message sent via the bot in inline mode, that originated the query.
   */
  @SerializedName("inline_message_id")
  public String inlineMessageId;

  /**
   * Global identifier, uniquely corresponding to the chat to which the message with the callback
   * button was sent. Useful for high scores in games.
   */
  @NotNull
  @SerializedName("chat_instance")
  public String chatInstance;

  /**
   * Optional. Data associated with the callback button. Be aware that the message originated the
   * query can contain no callback buttons with this data.
   */
  public String data;

  /** Optional. Short name of a Game to be returned, serves as the unique identifier for the game */
  @SerializedName("game_short_name")
  public String gameShortName;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof CallbackQuery other)) return false;
    return Objects.equals(id, other.id)
        && Objects.equals(from, other.from)
        && Objects.equals(message, other.message)
        && Objects.equals(inlineMessageId, other.inlineMessageId)
        && Objects.equals(chatInstance, other.chatInstance)
        && Objects.equals(data, other.data)
        && Objects.equals(gameShortName, other.gameShortName);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(id, from, message, inlineMessageId, chatInstance, data, gameShortName);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("CallbackQuery[id=")
        .append(id)
        .append(", from=")
        .append(from)
        .append(", message=")
        .append(message)
        .append(", inlineMessageId=")
        .append(inlineMessageId)
        .append(", chatInstance=")
        .append(chatInstance)
        .append(", data=")
        .append(data)
        .append(", gameShortName=")
        .append(gameShortName)
        .append("]");
    return builder.toString();
  }
}
