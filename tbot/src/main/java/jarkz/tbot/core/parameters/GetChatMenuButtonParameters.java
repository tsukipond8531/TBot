package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Use this method to get the current value of the bot's menu button in a private chat, or the
 * default menu button. Returns MenuButton on success.
 */
public final class GetChatMenuButtonParameters {

  public static final class Builder {

    private GetChatMenuButtonParameters buildingType;

    public Builder() {
      buildingType = new GetChatMenuButtonParameters();
    }

    public Builder setChatId(Integer chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public GetChatMenuButtonParameters build() {
      return buildingType;
    }
  }

  /**
   * Unique identifier for the target private chat. If not specified, default bot's menu button will
   * be returned
   */
  @SerializedName("chat_id")
  public Integer chatId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetChatMenuButtonParameters other)) return false;
    return Objects.equals(chatId, other.chatId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("GetChatMenuButtonParameters[chatId=").append(chatId).append("]");
    return builder.toString();
  }
}
