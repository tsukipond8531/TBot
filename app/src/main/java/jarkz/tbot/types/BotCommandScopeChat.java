package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents the scope of bot commands, covering a specific chat. */
public final class BotCommandScopeChat implements BotCommandScope {

  /** Scope type, must be chat */
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
    if (!(obj instanceof BotCommandScopeChat other)) return false;
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
        .append("BotCommandScopeChat[type=")
        .append(type)
        .append(", chatId=")
        .append(chatId)
        .append("]");
    return builder.toString();
  }
}
