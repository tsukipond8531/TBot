package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents the default scope of bot commands. Default commands are used if no commands with a
 * narrower scope are specified for the user.
 */
public final class BotCommandScopeDefault implements BotCommandScope {

  public static final String TYPE = "default";

  /** Scope type, must be default */
  @NotNull public final String type = TYPE;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotCommandScopeDefault other)) return false;
    return Objects.equals(type, other.type);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("BotCommandScopeDefault[type=").append(type).append("]");
    return builder.toString();
  }
}
