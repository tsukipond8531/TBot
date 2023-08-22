package jarkz.tbot.types.botcommandscope;

import java.util.Objects;

/**
 * Represents the <a href="https://core.telegram.org/bots/api#botcommandscope">scope</a> of bot
 * commands, covering all private chats.
 *
 * @author Pavel Bialiauski
 */
public class BotCommandScopeAllPrivateChats implements BotCommandScope {

  /**
   * Type of {@link BotCommandScope}. Always "all_private_chats".
   */
  protected static final String TYPE = "all_private_chats";

  private final String type = BotCommandScopeAllPrivateChats.TYPE;

  /**
   * Default constructor.
   */
  public BotCommandScopeAllPrivateChats() {}

  /**
   * Scope type, must be <i>all_private_chats</i>.
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
    if (!(obj instanceof BotCommandScopeAllPrivateChats other)) return false;
    return Objects.equals(type, other.type);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("BotCommandScopeAllPrivateChats[type=").append(type).append("]");
    return builder.toString();
  }
}
