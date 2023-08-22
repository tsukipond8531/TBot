package jarkz.tbot.types.menubutton;

import jarkz.tbot.types.annotations.GeneralInterface;

/**
 * This object describes the bot's menu button in a private chat. It should be one of
 *
 * <ul>
 *   <li>{@link MenuButtonCommands}
 *   <li>{@link MenuButtonWebApp}
 *   <li>{@link MenuButtonDefault}
 * </ul>
 *
 * If a menu button other than <a href=
 * "https://core.telegram.org/bots/api#menubuttondefault">MenuButtonDefault</a> is set for a private
 * chat, then it is applied in the chat. Otherwise the default menu button is applied. By default,
 * the menu button opens the list of bot commands.
 *
 * @author Pavel Bialiauski
 */
@GeneralInterface
public interface MenuButton {

  /**
   * Returns a type of {@link MenuButton}.
   *
   * @return a type.
   */
  String getType();
}
