package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents a result of an inline query that was chosen by the user and sent to their chat
 * partner.
 *
 * <p>Note: It is necessary to enable inline feedback via @BotFather in order to receive these
 * objects in updates.
 */
public final class ChosenInlineResult {

  /** The unique identifier for the result that was chosen */
  @NotNull
  @SerializedName("result_id")
  public String resultId;

  /** The user that chose the result */
  @NotNull public User from;

  /** Optional. Sender location, only for bots that require user location */
  public Location location;

  /**
   * Optional. Identifier of the sent inline message. Available only if there is an inline keyboard
   * attached to the message. Will be also received in callback queries and can be used to edit the
   * message.
   */
  @SerializedName("inline_message_id")
  public String inlineMessageId;

  /** The query that was used to obtain the result */
  @NotNull public String query;

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
  public final int hashCode() {
    return Objects.hash(resultId, from, location, inlineMessageId, query);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
