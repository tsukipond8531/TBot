package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents the bot's name. */
public final class BotName {

  /** The bot's name */
  @NotNull public String name;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotName other)) return false;
    return Objects.equals(name, other.name);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("BotName[name=").append(name).append("]");
    return builder.toString();
  }
}
