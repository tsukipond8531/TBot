package jarkz.tbot.types.botcommandscope;

import java.util.Objects;

public class BotCommandScopeDefault implements BotCommandScope {

  protected static final String TYPE = "default";

  private final String type = BotCommandScopeDefault.TYPE;

  public BotCommandScopeDefault() {}

  public String getType() {
    return type;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotCommandScopeDefault other)) return false;
    return Objects.equals(type, other.type);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("BotCommandScopeDefault[type=").append(type).append("]");
    return builder.toString();
  }
}
