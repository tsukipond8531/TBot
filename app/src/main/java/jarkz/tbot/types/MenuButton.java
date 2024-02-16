package jarkz.tbot.types;

/**
 * This object describes the bot's menu button in a private chat. It should be one of
 *
 * <p>- MenuButtonCommands
 *
 * <p>- MenuButtonWebApp
 *
 * <p>- MenuButtonDefault
 *
 * <p>If a menu button other than MenuButtonDefault is set for a private chat, then it is applied in
 * the chat. Otherwise the default menu button is applied. By default, the menu button opens the
 * list of bot commands.
 */
public sealed interface MenuButton
    permits MenuButtonCommands, MenuButtonWebApp, MenuButtonDefault {}
