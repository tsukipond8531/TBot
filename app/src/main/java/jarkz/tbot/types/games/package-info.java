/**
 * This package present the datatypes about the <a
 * href="https://core.telegram.org/bots/api#games">Games</a>
 *
 * <p>Your bot can offer users <strong>HTML5 games</strong> to play solo or to compete against each
 * other in groups and one-on-one chats. Create games via <a
 * href="https://t.me/botfather">&#64;BotFather</a> using the <i>/newgame</i> command. Please note
 * that this kind of power requires responsibility: you will need to accept the terms for each game
 * that your bots will be offering.
 *
 * <ul>
 *   <li>Games are a new type of content on Telegram, represented by the {@link Game} and {@link
 *       jarkz.tbot.types.inlinemode.InlineQueryResultGame} objects.
 *   <li>Once you've created a game via <a href="https://t.me/botfather">BotFather</a>, you can send
 *       games to chats as regular messages using the sendGame method, or use inline mode with
 *       {@link jarkz.tbot.types.inlinemode.InlineQueryResultGame}.
 *   <li>If you send the game message without any buttons, it will automatically have a 'Play
 *       GameName' button. When this button is pressed, your bot gets a {@link
 *       jarkz.tbot.types.CallbackQuery} with the game_short_name of the requested game. You provide
 *       the correct URL for this particular user and the app opens the game in the in-app browser.
 *   <li>You can manually add multiple buttons to your game message. Please note that the first
 *       button in the first row must always launch the game, using the field callback_game in
 *       {@link jarkz.tbot.types.inlinemode.InlineKeyboardButton}. You can add extra buttons
 *       according to taste: e.g., for a description of the rules, or to open the game's official
 *       community.
 *   <li>To make your game more attractive, you can upload a GIF animation that demostrates the game
 *       to the users via <a href="https://t.me/botfather">BotFather</a> (see <a
 *       href="https://t.me/gamebot?game=lumberjack">Lumberjack</a> for example).
 *   <li>A game message will also display high scores for the current chat. Use setGameScore to post
 *       high scores to the chat with the game, add the edit_message parameter to automatically
 *       update the message with the current scoreboard.
 *   <li>Use getGameHighScores to get data for in-game high score tables.
 *   <li>You can also add an extra sharing button for users to share their best score to different
 *       chats.
 *   <li>For examples of what can be done using this new stuff, check the &#64;gamebot and
 *       &#64;gamee bots.
 * </ul>
 *
 * @author Pavel Bialiauski
 */
package jarkz.tbot.types.games;
