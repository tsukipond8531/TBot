package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Location;
import jarkz.tbot.types.User;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a <a href="https://core.telegram.org/bots/api#inlinequeryresult">result</a> of an
 * inline query that was chosen by the user and sent to their chat partner.
 *
 * @apiNote It is necessary to enable <a
 *     href="https://core.telegram.org/bots/inline#collecting-feedback">inline feedback</a> via <a
 *     href="https://t.me/botfather">@BotFather</a> in order to receive these objects in updates.
 * @author Pavel Bialiauski
 */
public class ChosenInlineResult {

  @SerializedName("result_id")
  @NotNull
  private String resultId;

  @NotNull private User from;

  private Location location;

  @SerializedName("inline_message_id")
  private String inlineMessageId;

  @NotNull private String query;

  /** Default constructor. */
  public ChosenInlineResult() {}

  /**
   * The unique identifier for the result that was chosen.
   *
   * @return result_id as String.
   */
  public String getResultId() {
    return resultId;
  }

  /**
   * Sets the unique identifier for the result that was chosen.
   *
   * @param resultId the unique identifier for the result that was chosen as String.
   */
  public void setResultId(String resultId) {
    this.resultId = resultId;
  }

  /**
   * The user that chose the result.
   *
   * @return from as {@link User}.
   */
  public User getFrom() {
    return from;
  }

  /**
   * Sets the user that chose the result.
   *
   * @param from the user that chose the result as {@link User}.
   */
  public void setFrom(User from) {
    this.from = from;
  }

  /**
   * <i>Optional.</i> Sender location, only for bots that require user location.
   *
   * @return an optional value of location as {@link Location}.
   */
  public Optional<Location> getLocation() {
    return Optional.ofNullable(location);
  }

  /**
   * Sets the sender location, only for bots that require user location.
   *
   * @param location the sender location as {@link Location} or null if the bot not requested.
   */
  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * <i>Optional.</i> Identifier of the sent inline message. Available only if there is an <a
   * href="https://core.telegram.org/bots/api#inlinekeyboardmarkup">inline keyboard</a> attached to
   * the message. Will be also received in <a
   * href="https://core.telegram.org/bots/api#callbackquery">callback queries</a> and can be used to
   * <a href="https://core.telegram.org/bots/api#updating-messages">edit</a> the message.
   *
   * @return an optional value of inline_message_id as String.
   */
  public Optional<String> getInlineMessageId() {
    return Optional.ofNullable(inlineMessageId);
  }

  /**
   * Sets the identifier of the sent inline message. Available only if there is an <a
   * href="https://core.telegram.org/bots/api#inlinekeyboardmarkup">inline keyboard</a> attached to
   * the message. Will be also received in <a
   * href="https://core.telegram.org/bots/api#callbackquery">callback queries</a> and can be used to
   * <a href="https://core.telegram.org/bots/api#updating-messages">edit</a> the message.
   *
   * @param inlineMessageId the identifier of the sent inline message as String or null if it is not
   *     an inline keyboard attached to the message or not recieved in callback query.
   */
  public void setInlineMessageId(String inlineMessageId) {
    this.inlineMessageId = inlineMessageId;
  }

  /**
   * The query that was used to obtain the result.
   *
   * @return query as String.
   */
  public String getQuery() {
    return query;
  }

  /**
   * Sets the query that was used to obtain the result.
   *
   * @param query the query that was used to obtain the result as String.
   */
  public void setQuery(String query) {
    this.query = query;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(resultId, from, location, inlineMessageId, query);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChosenInlineResult other)) return false;
    return Objects.equals(resultId, other.resultId)
        && Objects.equals(from, other.from)
        && Objects.equals(location, other.location)
        && Objects.equals(inlineMessageId, other.inlineMessageId)
        && Objects.equals(query, other.query);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ChosenInlineResult[resultId=")
        .append(resultId)
        .append(", from=")
        .append(from)
        .append(", location=")
        .append(location)
        .append(", inlineMessageId=")
        .append(inlineMessageId)
        .append(", query=")
        .append(query)
        .append("]");
    return builder.toString();
  }
}
