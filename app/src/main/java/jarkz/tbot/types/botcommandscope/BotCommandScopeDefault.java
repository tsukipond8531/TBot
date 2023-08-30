package jarkz.tbot.types.botcommandscope;

import java.util.Objects;

/**
 * Represents the default <a href="https://core.telegram.org/bots/api#botcommandscope">scope</a> of
 * bot commands. Default commands are used if no commands with a <a href=
 * "https://core.telegram.org/bots/api#determining-list-of-commands">narrower scope</a> are
 * specified for the user.
 *
 * @author Pavel Bialiauski
 */
public class BotCommandScopeDefault implements BotCommandScope {

  /** Type of {@link BotCommandScope}. Always "default". */
  protected static final String TYPE = "default";

  private final String type = BotCommandScopeDefault.TYPE;

  /** Default constructor. */
  public BotCommandScopeDefault() {}

  /**
   * Scope type, must be <i>default</i>.
   *
   * @return type as String.
   */
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
