package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents the scope of bot commands, covering all group and supergroup chats. */
public final class BotCommandScopeAllGroupChats implements BotCommandScope {

  public static final String TYPE = "all_group_chats";

  /** Scope type, must be all_group_chats */
  @NotNull public final String type = TYPE;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotCommandScopeAllGroupChats other)) return false;
    return Objects.equals(type, other.type);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("BotCommandScopeAllGroupChats[type=").append(type).append("]");
    return builder.toString();
  }
}
