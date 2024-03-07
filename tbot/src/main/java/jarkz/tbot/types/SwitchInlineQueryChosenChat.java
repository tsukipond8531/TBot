package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * This object represents an inline button that switches the current user to inline mode in a chosen
 * chat, with an optional default inline query.
 */
public final class SwitchInlineQueryChosenChat {

  public static final class Builder {

    private SwitchInlineQueryChosenChat buildingType;

    public Builder() {
      buildingType = new SwitchInlineQueryChosenChat();
    }

    public Builder setQuery(String query) {
      buildingType.query = query;
      return this;
    }

    public Builder setAllowUserChats(Boolean allowUserChats) {
      buildingType.allowUserChats = allowUserChats;
      return this;
    }

    public Builder setAllowBotChats(Boolean allowBotChats) {
      buildingType.allowBotChats = allowBotChats;
      return this;
    }

    public Builder setAllowGroupChats(Boolean allowGroupChats) {
      buildingType.allowGroupChats = allowGroupChats;
      return this;
    }

    public Builder setAllowChannelChats(Boolean allowChannelChats) {
      buildingType.allowChannelChats = allowChannelChats;
      return this;
    }

    public SwitchInlineQueryChosenChat build() {
      return buildingType;
    }
  }

  /**
   * Optional. The default inline query to be inserted in the input field. If left empty, only the
   * bot's username will be inserted
   */
  public String query;

  /** Optional. True, if private chats with users can be chosen */
  @SerializedName("allow_user_chats")
  public Boolean allowUserChats;

  /** Optional. True, if private chats with bots can be chosen */
  @SerializedName("allow_bot_chats")
  public Boolean allowBotChats;

  /** Optional. True, if group and supergroup chats can be chosen */
  @SerializedName("allow_group_chats")
  public Boolean allowGroupChats;

  /** Optional. True, if channel chats can be chosen */
  @SerializedName("allow_channel_chats")
  public Boolean allowChannelChats;

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
  public final int hashCode() {
    return Objects.hash(query, allowUserChats, allowBotChats, allowGroupChats, allowChannelChats);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
