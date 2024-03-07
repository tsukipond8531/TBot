package jarkz.tbot.types;

/**
 * This object represents the scope to which bot commands are applied. Currently, the following 7
 * scopes are supported:
 *
 * <p>- BotCommandScopeDefault
 *
 * <p>- BotCommandScopeAllPrivateChats
 *
 * <p>- BotCommandScopeAllGroupChats
 *
 * <p>- BotCommandScopeAllChatAdministrators
 *
 * <p>- BotCommandScopeChat
 *
 * <p>- BotCommandScopeChatAdministrators
 *
 * <p>- BotCommandScopeChatMember
 */
public sealed interface BotCommandScope
    permits BotCommandScopeDefault,
        BotCommandScopeAllPrivateChats,
        BotCommandScopeAllGroupChats,
        BotCommandScopeAllChatAdministrators,
        BotCommandScopeChat,
        BotCommandScopeChatAdministrators,
        BotCommandScopeChatMember {}
