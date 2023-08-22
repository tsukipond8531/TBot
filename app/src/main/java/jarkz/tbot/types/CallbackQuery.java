package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents an incoming callback query from a callback button in an <a
 * href="https://core.telegram.org/bots/features#inline-keyboards">inline keyboard</a>. If the
 * button that originated the query was attached to a message sent by the bot, the field
 * <i>message</i> will be present. If the button was attached to a message sent via the bot (in <a
 * href="https://core.telegram.org/bots/api#inline-mode">inline mode</a>), the field
 * <i>inline_message_id</i> will be present. Exactly one of the fields <i>data</i> or
 * <i>game_short_name</i> will be present.
 *
 * @author Pavel Bialiauski
 */
public class CallbackQuery {

  @NotNull private String id;

  @NotNull private User from;

  private Message message;

  @SerializedName("inline_message_id")
  private String inlineMessageId;

  @SerializedName("chat_instance")
  @NotNull
  private String chatInstance;

  private String data;

  @SerializedName("game_short_name")
  private String gameShortName;

  /** Default constructor. */
  public CallbackQuery() {}

  /**
   * Unique identifier for this query.
   *
   * @return id as String.
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the unique identifier for this query.
   *
   * @param id the unique identifier for this query as String.
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Sender.
   *
   * @return from as {@link User}.
   */
  public User getFrom() {
    return from;
  }

  /**
   * Sets the sender.
   *
   * @param from the sender as {@link User}.
   */
  public void setFrom(User from) {
    this.from = from;
  }

  /**
   * <i>Optional.</i> Message with the callback button that originated the query. Note that message
   * content and message date will not be available if the message is too old.
   *
   * @return an optional value of message as {@link Message}.
   */
  public Optional<Message> getMessage() {
    return Optional.of(message);
  }

  /**
   * Sets the message with the callback button that originated the query.
   *
   * @param message the message with the callback button that originated the query as {@link
   *     Message} or null if it doesn't provided.
   */
  public void setMessage(Message message) {
    this.message = message;
  }

  /**
   * <i>Optional.</i> Identifier of the message sent via the bot in inline mode, that originated the
   * query.
   *
   * @return an optional value of inline_message_id as String.
   */
  public Optional<String> getInlineMessageId() {
    return Optional.of(inlineMessageId);
  }

  /**
   * Sets the identifier of the message sent via the bot in inline mode, that originated the query.
   *
   * @param inlineMessageId the identifier of the message sent via the bot in inline mode, that
   *     originated the query, as String or null if it doesn't provided.
   */
  public void setInlineMessageId(String inlineMessageId) {
    this.inlineMessageId = inlineMessageId;
  }

  /**
   * Global identifier, uniquely corresponding to the chat to which the message with the callback
   * button was sent. Useful for high scores in <a
   * href="https://core.telegram.org/bots/api#games">games</a>.
   *
   * @return chat_instance as String.
   */
  public String getChatInstance() {
    return chatInstance;
  }

  /**
   * Sets the global identifier, uniquely corresponding to the chat to which the message with the
   * callback button was sent. Useful for high scores in <a
   * href="https://core.telegram.org/bots/api#games">games</a>.
   *
   * @param chatInstance the global identifier, uniquely corresponding to the chat to which the
   *     message with the callback button was sent, as String.
   */
  public void setChatInstance(String chatInstance) {
    this.chatInstance = chatInstance;
  }

  /**
   * <i>Optional.</i> Data associated with the callback button. Be aware that the message originated
   * the query can contain no callback buttons with this data.
   *
   * @return an optional value of data as String.
   */
  public Optional<String> getData() {
    return Optional.of(data);
  }

  /**
   * Sets the data associated with the callback button. Be aware that the message originated the
   * query can contain no callback buttons with this data.
   *
   * @param data the data associated with the callback button as String or null if it doesn't
   *     provided.
   */
  public void setData(String data) {
    this.data = data;
  }

  /**
   * <i>Optional.</i> Short name of a <a href="https://core.telegram.org/bots/api#games">Game</a> to
   * be returned, serves as the unique identifier for the game.
   *
   * @return an optional value of game_short_name as String.
   */
  public Optional<String> getGameShortName() {
    return Optional.of(gameShortName);
  }

  /**
   * Sets the short name of a <a href="https://core.telegram.org/bots/api#games">Game</a> to be
   * returned, serves as the unique identifier for the game.
   *
   * @param gameShortName the short name of a Game to be returned as String or null if it doesn't
   *     provided.
   */
  public void setGameShortName(String gameShortName) {
    this.gameShortName = gameShortName;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(id, from, message, inlineMessageId, chatInstance, data, gameShortName);
  }

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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
