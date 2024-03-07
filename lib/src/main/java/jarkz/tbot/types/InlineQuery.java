package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents an incoming inline query. When the user sends an empty query, your bot
 * could return some default or trending results.
 */
public final class InlineQuery {

  /** Unique identifier for this query */
  @NotNull public String id;

  /** Sender */
  @NotNull public User from;

  /** Text of the query (up to 256 characters) */
  @NotNull public String query;

  /** Offset of the results to be returned, can be controlled by the bot */
  @NotNull public String offset;

  /**
   * Optional. Type of the chat from which the inline query was sent. Can be either "sender" for a
   * private chat with the inline query sender, "private", "group", "supergroup", or "channel". The
   * chat type should be always known for requests sent from official clients and most third-party
   * clients, unless the request was sent from a secret chat
   */
  @SerializedName("chat_type")
  public String chatType;

  /** Optional. Sender location, only for bots that request user location */
  public Location location;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQuery other)) return false;
    return Objects.equals(id, other.id)
        && Objects.equals(from, other.from)
        && Objects.equals(query, other.query)
        && Objects.equals(offset, other.offset)
        && Objects.equals(chatType, other.chatType)
        && Objects.equals(location, other.location);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(id, from, query, offset, chatType, location);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("InlineQuery[id=")
        .append(id)
        .append(", from=")
        .append(from)
        .append(", query=")
        .append(query)
        .append(", offset=")
        .append(offset)
        .append(", chatType=")
        .append(chatType)
        .append(", location=")
        .append(location)
        .append("]");
    return builder.toString();
  }
}
