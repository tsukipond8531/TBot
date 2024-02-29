package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents the scope of bot commands, covering all private chats. */
public final class BotCommandScopeAllPrivateChats implements BotCommandScope {

  public static final String TYPE = "all_private_chats";

  /** Scope type, must be all_private_chats */
  @NotNull public final String type = TYPE;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotCommandScopeAllPrivateChats other)) return false;
    return Objects.equals(type, other.type);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("BotCommandScopeAllPrivateChats[type=").append(type).append("]");
    return builder.toString();
  }
}
