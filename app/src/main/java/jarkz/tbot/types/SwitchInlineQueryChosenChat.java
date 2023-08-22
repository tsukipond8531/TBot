package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents an inline button that switches the current user to inline mode in a chosen
 * chat, with an optional default inline query.
 *
 * @author Pavel Bialiauski
 */
public class SwitchInlineQueryChosenChat {

  private String query;

  @SerializedName("allow_user_chats")
  private Boolean allowUserChats;

  @SerializedName("allow_bot_chats")
  private Boolean allowBotChats;

  @SerializedName("allow_group_chats")
  private Boolean allowGroupChats;

  @SerializedName("allow_channel_chats")
  private Boolean allowChannelChats;

  /** Default constructor. */
  public SwitchInlineQueryChosenChat() {}

  /**
   * <i>Optional.</i> The default inline query to be inserted in the input field. If left empty,
   * only the bot's username will be inserted.
   *
   * @return an optional value of query as String.
   */
  public Optional<String> getQuery() {
    return Optional.of(query);
  }

  /**
   * Sets the default inline query to be inserted in the input field. If left empty, only the bot's
   * username will be inserted.
   *
   * @param query the default inline query to be inserted in the input field as String or null if it
   *     is not required.
   */
  public void setQuery(String query) {
    this.query = query;
  }

  /**
   * <i>Optional.</i> True, if private chats with users can be chosen.
   *
   * @return an optional value of allow_user_chats as Boolean.
   */
  public Optional<Boolean> getAllowUserChats() {
    return Optional.of(allowUserChats);
  }

  /**
   * True, if private chats with users can be chosen.
   *
   * @param allowUserChats true if private chats with users can be chosen, otherwise - false or
   *     null.
   */
  public void setAllowUserChats(Boolean allowUserChats) {
    this.allowUserChats = allowUserChats;
  }

  /**
   * <i>Optional.</i> True, if private chats with bots can be chosen.
   *
   * @return an optional value of allow_bot_chats as Boolean.
   */
  public Optional<Boolean> getAllowBotChats() {
    return Optional.of(allowBotChats);
  }

  /**
   * True, if private chats with bots can be chosen.
   *
   * @param allowBotChats true if private chats with bots can be chosen, otherwise - false or null.
   */
  public void setAllowBotChats(Boolean allowBotChats) {
    this.allowBotChats = allowBotChats;
  }

  /**
   * <i>Optional.</i> True, if group and supergroup chats can be chosen.
   *
   * @return an optional value of allow_group_chats as Boolean.
   */
  public Optional<Boolean> getAllowGroupChats() {
    return Optional.of(allowGroupChats);
  }

  /**
   * True, if group and supergroup chats can be chosen.
   *
   * @param allowGroupChats true if group and supergroup chats can be chosen, otherwise - false or
   *     null.
   */
  public void setAllowGroupChats(Boolean allowGroupChats) {
    this.allowGroupChats = allowGroupChats;
  }

  /**
   * <i>Optional.</i> True, if channel chats can be chosen.
   *
   * @return an optional value of allow_channel_chats as Boolean.
   */
  public Optional<Boolean> getAllowChannelChats() {
    return Optional.of(allowChannelChats);
  }

  /**
   * True, if channel chats can be chosen.
   *
   * @param allowChannelChats true if channel chats can be chosen, otherwise - false or null.
   */
  public void setAllowChannelChats(Boolean allowChannelChats) {
    this.allowChannelChats = allowChannelChats;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(query, allowUserChats, allowBotChats, allowGroupChats, allowChannelChats);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SwitchInlineQueryChosenChat other)) return false;
    return Objects.equals(query, other.query)
        && Objects.equals(allowUserChats, other.allowUserChats)
        && Objects.equals(allowBotChats, other.allowBotChats)
        && Objects.equals(allowGroupChats, other.allowGroupChats)
        && Objects.equals(allowChannelChats, other.allowChannelChats);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("SwitchInlineQueryChosenChat[query=")
        .append(query)
        .append(", allowUserChats=")
        .append(allowUserChats)
        .append(", allowBotChats=")
        .append(allowBotChats)
        .append(", allowGroupChats=")
        .append(allowGroupChats)
        .append(", allowChannelChats=")
        .append(allowChannelChats)
        .append("]");
    return builder.toString();
  }
}
