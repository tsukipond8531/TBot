package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.CallbackQuery;
import jarkz.tbot.types.LoginUrl;
import jarkz.tbot.types.SwitchInlineQueryChosenChat;
import jarkz.tbot.types.WebAppInfo;
import jarkz.tbot.types.games.CallbackGame;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents one button of an inline keyboard. You <strong>must</strong> use exactly
 * one of the optional fields.
 *
 * @author Pavel Bialiauski
 */
public class InlineKeyboardButton {

  @NotNull private String text;

  private String url;

  @SerializedName("callback_data")
  private String callbackData;

  @SerializedName("web_app")
  private WebAppInfo webApp;

  @SerializedName("login_url")
  private LoginUrl loginUrl;

  @SerializedName("switch_inline_query")
  private String switchInlineQuery;

  @SerializedName("switch_inline_query_current_chat")
  private String switchInlineQueryCurrentChat;

  @SerializedName("switch_inline_query_chosen_chat")
  private SwitchInlineQueryChosenChat switchInlineQueryChosenChat;

  @SerializedName("callback_game")
  private CallbackGame callbackGame;

  private Boolean pay;

  /** Default constructor. */
  public InlineKeyboardButton() {}

  /**
   * Label text on the button.
   *
   * @return text as String.
   */
  public String getText() {
    return text;
  }

  /**
   * Sets the label text on the button.
   *
   * @param text the label text on the button as String.
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * <i>Optional.</i> HTTP or tg:// URL to be opened when the button is pressed. Links <code>
   * tg://user?id=&lt;user_id&gt;</code> can be used to mention a user by their ID without using a
   * username, if this is allowed by their privacy settings.
   *
   * @return an optional value of url as String.
   */
  public Optional<String> getUrl() {
    return Optional.ofNullable(url);
  }

  /**
   * Sets the HTTP or tg:// URL to be opened when the button is pressed. Links <code>
   * tg://user?id=&lt;user_id&gt;</code> can be used to mention a user by their ID without using a
   * username, if this is allowed by their privacy settings.
   *
   * @param url the HTTP or tg:// URL to be opened when the button is pressed as String or null if
   *     it is not required.
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * <i>Optional.</i> Data to be sent in a <a
   * href="https://core.telegram.org/bots/api#callbackquery">callback query</a> ({@link
   * CallbackQuery}) to the bot when button is pressed, 1-64 bytes.
   *
   * @return an optional value of callback_data as String.
   */
  public Optional<String> getCallbackData() {
    return Optional.ofNullable(callbackData);
  }

  /**
   * Sets the data to be sent in a <a
   * href="https://core.telegram.org/bots/api#callbackquery">callback query</a> ({@link
   * CallbackQuery}) to the bot when button is pressed, 1-64 bytes.
   *
   * @param callbackData the data to be sent in a callback query to the bot, when button is pressed,
   *     (1-64 bytes) as String or null if it is not required.
   */
  public void setCallbackData(String callbackData) {
    this.callbackData = callbackData;
  }

  /**
   * <i>Optional.</i> Description of the <a href="https://core.telegram.org/bots/webapps">Web
   * App</a> that will be launched when the user presses the button. The Web App will be able to
   * send an arbitrary message on behalf of the user using the method <a href=
   * "https://core.telegram.org/bots/api#answerwebappquery">answerWebAppQuery</a>. Available only in
   * private chats between a user and the bot.
   *
   * @return an optional value of web_app as {@link WebAppInfo}.
   */
  public Optional<WebAppInfo> getWebApp() {
    return Optional.ofNullable(webApp);
  }

  /**
   * Sets the description of the <a href="https://core.telegram.org/bots/webapps">Web App</a> that
   * will be launched when the user presses the button. The Web App will be able to send an
   * arbitrary message on behalf of the user using the method <a href=
   * "https://core.telegram.org/bots/api#answerwebappquery">answerWebAppQuery</a>. Available only in
   * private chats between a user and the bot.
   *
   * @param webApp the description of the Web App that will be launched, when user presses the
   *     button, as {@link WebAppInfo} or null if it is not required.
   */
  public void setWebApp(WebAppInfo webApp) {
    this.webApp = webApp;
  }

  /**
   * <i>Optional.</i> An HTTPS URL used to automatically authorize the user. Can be used as a
   * replacement for the <a href="https://core.telegram.org/widgets/login">Telegram Login
   * Widget</a>.
   *
   * @return an optional value of login_url as {@link LoginUrl}.
   */
  public Optional<LoginUrl> getLoginUrl() {
    return Optional.ofNullable(loginUrl);
  }

  /**
   * Sets the HTTPS URL used to automatically authorize the user. Can be used as a replacement for
   * the <a href="https://core.telegram.org/widgets/login">Telegram Login Widget</a>.
   *
   * @param loginUrl the HTTPS URL used to automatically authorize the user as {@link LoginUrl}.
   */
  public void setLoginUrl(LoginUrl loginUrl) {
    this.loginUrl = loginUrl;
  }

  /**
   * <i>Optional.</i> If set, pressing the button will prompt the user to select one of their chats,
   * open that chat and insert the bot's username and the specified inline query in the input field.
   * May be empty, in which case just the bot's username will be inserted.
   *
   * @return an optional value of switch_inline_query as String.
   */
  public Optional<String> getSwitchInlineQuery() {
    return Optional.ofNullable(switchInlineQuery);
  }

  /**
   * If set, pressing the button will prompt the user to select one of their chats, open that chat
   * and insert the bot's username and the specified inline query in the input field. May be empty,
   * in which case just the bot's username will be inserted.
   *
   * @param switchInlineQuery the specified inline query in the input field as String or null if it
   *     is not required.
   */
  public void setSwitchInlineQuery(String switchInlineQuery) {
    this.switchInlineQuery = switchInlineQuery;
  }

  /**
   * <i>Optional.</i> If set, pressing the button will insert the bot's username and the specified
   * inline query in the current chat's input field. May be empty, in which case only the bot's
   * username will be inserted.<br>
   * <br>
   * This offers a quick way for the user to open your bot in inline mode in the same chat - good
   * for selecting something from multiple options.
   *
   * @return an optional value of switch_inline_query_current_chat as String.
   */
  public Optional<String> getSwitchInlineQueryCurrentChat() {
    return Optional.ofNullable(switchInlineQueryCurrentChat);
  }

  /**
   * If set, pressing the button will insert the bot's username and the specified inline query in
   * the current chat's input field. May be empty, in which case only the bot's username will be
   * inserted.<br>
   * <br>
   * This offers a quick way for the user to open your bot in inline mode in the same chat - good
   * for selecting something from multiple options.
   *
   * @param switchInlineQueryCurrentChat the specified inline query in the current chat's input
   *     field as String or null if it is not required.
   */
  public void setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
    this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
  }

  /**
   * <i>Optional.</i> If set, pressing the button will prompt the user to select one of their chats
   * of the specified type, open that chat and insert the bot's username and the specified inline
   * query in the input field.
   *
   * @return an optional value of switch_inline_query_chosen_chat as {@link
   *     SwitchInlineQueryChosenChat}.
   */
  public Optional<SwitchInlineQueryChosenChat> getSwitchInlineQueryChosenChat() {
    return Optional.ofNullable(switchInlineQueryChosenChat);
  }

  /**
   * If set, pressing the button will prompt the user to select one of their chats of the specified
   * type, open that chat and insert the bot's username and the specified inline query in the input
   * field.
   *
   * @param switchInlineQueryChosenChat the specified chosen chats and the specified inline query in
   *     the input field as {@link SwitchInlineQueryChosenChat} or null if it is not required.
   */
  public void setSwitchInlineQueryChosenChat(
      SwitchInlineQueryChosenChat switchInlineQueryChosenChat) {
    this.switchInlineQueryChosenChat = switchInlineQueryChosenChat;
  }

  /**
   * <i>Optional.</i> Description of the game that will be launched when the user presses the
   * button.
   *
   * @apiNote This type of button <strong>must</strong> always be the first button in the first row.
   * @return an optional value of callback_game as {@link CallbackGame}.
   */
  public Optional<CallbackGame> getCallbackGame() {
    return Optional.ofNullable(callbackGame);
  }

  /**
   * Sets the description of the game that will be launched when the user presses the button.
   *
   * @apiNote This type of button <strong>must</strong> always be the first button in the first row.
   * @param callbackGame the description of the game that will be launched when the user presses the
   *     button as {@link CallbackGame} or null if it is not required.
   */
  public void setCallbackGame(CallbackGame callbackGame) {
    this.callbackGame = callbackGame;
  }

  /**
   * <i>Optional.</i> If <i>True</i>, sends a <a
   * href="https://core.telegram.org/bots/api#payments">Pay button</a>.
   *
   * @apiNote This type of button <strong>must</strong> always be the first button in the first row
   *     and can only be used in invoice messages.
   * @return an optional value of pay as Boolean.
   */
  public Optional<Boolean> getPay() {
    return Optional.ofNullable(pay);
  }

  /**
   * Specify <i>True</i>, to send a <a href="https://core.telegram.org/bots/api#payments">Pay
   * button</a>.
   *
   * @apiNote This type of button <strong>must</strong> always be the first button in the first row
   *     and can only be used in invoice messages.
   * @param pay true if to send a Pay button, otherwise - false or null.
   */
  public void setPay(Boolean pay) {
    this.pay = pay;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        text,
        url,
        callbackData,
        webApp,
        loginUrl,
        switchInlineQuery,
        switchInlineQueryCurrentChat,
        switchInlineQueryChosenChat,
        callbackGame,
        pay);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineKeyboardButton other)) return false;
    return Objects.equals(text, other.text)
        && Objects.equals(url, other.url)
        && Objects.equals(callbackData, other.callbackData)
        && Objects.equals(webApp, other.webApp)
        && Objects.equals(loginUrl, other.loginUrl)
        && Objects.equals(switchInlineQuery, other.switchInlineQuery)
        && Objects.equals(switchInlineQueryCurrentChat, other.switchInlineQueryCurrentChat)
        && Objects.equals(switchInlineQueryChosenChat, other.switchInlineQueryChosenChat)
        && Objects.equals(callbackGame, other.callbackGame)
        && Objects.equals(pay, other.pay);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InlineKeyboardButton[text=")
        .append(text)
        .append(", url=")
        .append(url)
        .append(", callbackData=")
        .append(callbackData)
        .append(", webApp=")
        .append(webApp)
        .append(", loginUrl=")
        .append(loginUrl)
        .append(", switchInlineQuery=")
        .append(switchInlineQuery)
        .append(", switchInlineQueryCurrentChat=")
        .append(switchInlineQueryCurrentChat)
        .append(", switchInlineQueryChosenChat=")
        .append(switchInlineQueryChosenChat)
        .append(", callbackGame=")
        .append(callbackGame)
        .append(", pay=")
        .append(pay)
        .append("]");
    return builder.toString();
  }
}
