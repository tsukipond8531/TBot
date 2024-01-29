package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a <a href="https://core.telegram.org/bots/api#games">Game</a>.
 *
 * @apiNote This will only work in Telegram versions released after October 1, 2016. Older clients
 *     will not display any inline results if a game result is among them.
 * @author Pavel Bialiauski
 */
public class InlineQueryResultGame implements InlineQueryResult {

  /** Type of {@link InlineQueryResult}. Always "game". */
  protected static final String TYPE = "game";

  private final String type = InlineQueryResultGame.TYPE;

  @NotNull private String id;

  @SerializedName("game_short_name")
  @NotNull
  private String gameShortName;

  @SerializedName("reply_markup")
  private InlineKeyboardMarkup replyMarkup;

  /** Default constructor. */
  public InlineQueryResultGame() {}

  /**
   * Type of the result, must be <i>game</i>.
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  /**
   * Unique identifier for this result, 1-64 Bytes.
   *
   * @return id as String.
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the unique identifier for this result, 1-64 Bytes.
   *
   * @param id the unique identifier for this result (1-64 Bytes) as String.
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Short name of the game.
   *
   * @return game_short_name as String.
   */
  public String getGameShortName() {
    return gameShortName;
  }

  /**
   * Sets the short name of the game.
   *
   * @param gameShortName the short name fo the game as String.
   */
  public void setGameShortName(String gameShortName) {
    this.gameShortName = gameShortName;
  }

  /**
   * <i>Optional.</i> <a href="https://core.telegram.org/bots/features#inline-keyboards">Inline
   * keyboard</a> attached to the message.
   *
   * @return an optional value of reply_markup as {@link InlineKeyboardMarkup}.
   */
  public Optional<InlineKeyboardMarkup> getReplyMarkup() {
    return Optional.ofNullable(replyMarkup);
  }

  /**
   * Sets the <a href="https://core.telegram.org/bots/features#inline-keyboards">inline keyboard</a>
   * attached to the message.
   *
   * @param replyMarkup the inline keyboard attached to the message as {@link InlineKeyboardMarkup}
   *     or null if it is not required.
   */
  public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
    this.replyMarkup = replyMarkup;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, id, gameShortName, replyMarkup);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultGame other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(gameShortName, other.gameShortName)
        && Objects.equals(replyMarkup, other.replyMarkup);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InlineQueryResultGame[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", gameShortName=")
        .append(gameShortName)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append("]");
    return builder.toString();
  }
}
