package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents the scope of bot commands, covering all administrators of a specific group or
 * supergroup chat.
 */
public final class BotCommandScopeChatAdministrators implements BotCommandScope {

  /** Scope type, must be chat_administrators */
  @NotNull public String type;

  /**
   * Unique identifier for the target chat or username of the target supergroup (in the
   * format @supergroupusername)
   */
  @SerializedName("chat_id")
  @NotNull
  public String chatId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotCommandScopeChatAdministrators other)) return false;
    return Objects.equals(type, other.type) && Objects.equals(chatId, other.chatId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, chatId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("BotCommandScopeChatAdministrators[type=")
        .append(type)
        .append(", chatId=")
        .append(chatId)
        .append("]");
    return builder.toString();
  }
}
