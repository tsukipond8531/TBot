package jarkz.tbot.types.botcommandscope;

import java.util.Objects;

/**
 * Represents the <a href="https://core.telegram.org/bots/api#botcommandscope">scope</a> of bot
 * commands, covering all group and supergroup chats.
 *
 * @author Pavel Bialiauski
 */
public class BotCommandScopeAllGroupChats implements BotCommandScope {

  /** Type of {@link BotCommandScope}. Always "all_group_chats". */
  protected static final String TYPE = "all_group_chats";

  private final String type = BotCommandScopeAllGroupChats.TYPE;

  /** Default constructor. */
  public BotCommandScopeAllGroupChats() {}

  /**
   * Scope type, must be <i>all_group_chats</i>.
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
    if (!(obj instanceof BotCommandScopeAllGroupChats other)) return false;
    return Objects.equals(type, other.type);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("BotCommandScopeAllGroupChats[type=").append(type).append("]");
    return builder.toString();
  }
}
