package jarkz.tbot.types.botcommandscope;

import java.util.Objects;

/**
 * Represents the <a href="https://core.telegram.org/bots/api#botcommandscope">scope</a> of bot
 * commands, covering all group and supergroup chat administrators.
 *
 * @author Pavel Bialiauski
 */
public class BotCommandScopeAllChatAdministrators implements BotCommandScope {

  /**
   * Type of {@link BotCommandScope}. Always "all_chat_administrators".
   */
  protected static final String TYPE = "all_chat_administrators";

  private final String type = BotCommandScopeAllChatAdministrators.TYPE;

  /**
   * Default constructor.
   */
  public BotCommandScopeAllChatAdministrators() {}

  /**
   * Scope type, must be <i>all_chat_administrators</i>.
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
    if (!(obj instanceof BotCommandScopeAllChatAdministrators other)) return false;
    return Objects.equals(type, other.type);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("BotCommandScopeAllChatAdministrators[type=").append(type).append("]");
    return builder.toString();
  }
}
