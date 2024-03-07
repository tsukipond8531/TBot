package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to change the title of a chat. Titles can't be changed for private chats. The bot
 * must be an administrator in the chat for this to work and must have the appropriate administrator
 * rights. Returns True on success.
 */
public final class SetChatTitleParameters {

  public static final class Builder {

    private SetChatTitleParameters buildingType;

    public Builder() {
      buildingType = new SetChatTitleParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setTitle(String title) {
      buildingType.title = title;
      return this;
    }

    public SetChatTitleParameters build() {
      return buildingType;
    }
  }

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** New chat title, 1-128 characters */
  @NotNull public String title;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetChatTitleParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && Objects.equals(title, other.title);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, title);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetChatTitleParameters[chatId=")
        .append(chatId)
        .append(", title=")
        .append(title)
        .append("]");
    return builder.toString();
  }
}
