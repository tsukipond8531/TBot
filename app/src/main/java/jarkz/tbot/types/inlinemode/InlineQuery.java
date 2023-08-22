package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Location;
import jarkz.tbot.types.User;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents an incoming inline query. When the user sends an empty query, your bot
 * could return some default or trending results.
 *
 * @author Pavel Bialiauski
 */
public class InlineQuery {

  @NotNull private String id;

  @NotNull private User from;

  @NotNull private String query;

  @NotNull private String offset;

  @SerializedName("chat_type")
  private String chatType;

  private Location location;

  /** Default constructor. */
  public InlineQuery() {}

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
   * Text of the query (up to 256 characters).
   *
   * @return query as String.
   */
  public String getQuery() {
    return query;
  }

  /**
   * Sets the text of the query (up to 256 characters).
   *
   * @param query the text of the query (up to 256 characters) as String.
   */
  public void setQuery(String query) {
    this.query = query;
  }

  /**
   * Offset of the results to be returned, can be controlled by the bot.
   *
   * @return offset as String.
   */
  public String getOffset() {
    return offset;
  }

  /**
   * Sets the offset of the results to be returned, can be controlled by the bot.
   *
   * @param offset the offset of the results to be returned as String.
   */
  public void setOffset(String offset) {
    this.offset = offset;
  }

  /**
   * <i>Optional.</i> Type of the chat from which the inline query was sent. Can be either “sender”
   * for a private chat with the inline query sender, “private”, “group”, “supergroup”, or
   * “channel”. The chat type should be always known for requests sent from official clients and
   * most third-party clients, unless the request was sent from a secret chat.
   *
   * @return an optional value of chat_type as String.
   */
  public Optional<String> getChatType() {
    return Optional.of(chatType);
  }

  /**
   * Type of the chat from which the inline query was sent. Can be either “sender” for a private
   * chat with the inline query sender, “private”, “group”, “supergroup”, or “channel”. The chat
   * type should be always known for requests sent from official clients and most third-party
   * clients, unless the request was sent from a secret chat.
   *
   * @param chatType the chat type to which the inline query was sent as String or null if inline
   *     query was sent from a secret chat.
   */
  public void setChatType(String chatType) {
    this.chatType = chatType;
  }

  /**
   * <i>Optional.</i> Sender location, only for bots that request user location.
   *
   * @return an optional value of location as {@link Location}.
   */
  public Optional<Location> getLocation() {
    return Optional.of(location);
  }

  /**
   * Sets the sender location, only for bots that request user location.
   *
   * @param location the sender location as {@link Location}.
   */
  public void setLocation(Location location) {
    this.location = location;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(id, from, query, offset, chatType, location);
  }

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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
