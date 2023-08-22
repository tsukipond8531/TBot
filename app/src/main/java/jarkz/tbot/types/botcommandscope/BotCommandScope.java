package jarkz.tbot.types.botcommandscope;

import jarkz.tbot.types.annotations.GeneralInterface;

/**
 * This object represents the scope to which bot commands are applied. Currently, the following 7
 * scopes are supported:
 *
 * <ul>
 *   <li>{@link BotCommandScopeDefault}
 *   <li>{@link BotCommandScopeAllPrivateChats}
 *   <li>{@link BotCommandScopeAllGroupChats}
 *   <li>{@link BotCommandScopeAllChatAdministrators}
 *   <li>{@link BotCommandScopeChat}
 *   <li>{@link BotCommandScopeChatAdministrators}
 *   <li>{@link BotCommandScopeChatMember}
 * </ul>
 *
 * @author Pavel Bialiauski
 */
@GeneralInterface
public interface BotCommandScope {

  /**
   * Returns a type of {@link BotCommandScope}.
   *
   * @return a type.
   */
  String getType();
}
