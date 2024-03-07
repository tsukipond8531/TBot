package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents one button of an inline keyboard. You must use exactly one of the optional
 * fields.
 */
public final class InlineKeyboardButton {

  /** Label text on the button */
  @NotNull public String text;

  /**
   * Optional. HTTP or tg:// URL to be opened when the button is pressed. Links
   * tg://user?id=<user_id> can be used to mention a user by their identifier without using a
   * username, if this is allowed by their privacy settings.
   */
  public String url;

  /** Optional. Data to be sent in a callback query to the bot when button is pressed, 1-64 bytes */
  @SerializedName("callback_data")
  public String callbackData;

  /**
   * Optional. Description of the Web App that will be launched when the user presses the button.
   * The Web App will be able to send an arbitrary message on behalf of the user using the method
   * answerWebAppQuery. Available only in private chats between a user and the bot.
   */
  @SerializedName("web_app")
  public WebAppInfo webApp;

  /**
   * Optional. An HTTPS URL used to automatically authorize the user. Can be used as a replacement
   * for the Telegram Login Widget.
   */
  @SerializedName("login_url")
  public LoginUrl loginUrl;

  /**
   * Optional. If set, pressing the button will prompt the user to select one of their chats, open
   * that chat and insert the bot's username and the specified inline query in the input field. May
   * be empty, in which case just the bot's username will be inserted.
   */
  @SerializedName("switch_inline_query")
  public String switchInlineQuery;

  /**
   * Optional. If set, pressing the button will insert the bot's username and the specified inline
   * query in the current chat's input field. May be empty, in which case only the bot's username
   * will be inserted. This offers a quick way for the user to open your bot in inline mode in the
   * same chat - good for selecting something from multiple options.
   */
  @SerializedName("switch_inline_query_current_chat")
  public String switchInlineQueryCurrentChat;

  /**
   * Optional. If set, pressing the button will prompt the user to select one of their chats of the
   * specified type, open that chat and insert the bot's username and the specified inline query in
   * the input field
   */
  @SerializedName("switch_inline_query_chosen_chat")
  public SwitchInlineQueryChosenChat switchInlineQueryChosenChat;

  /**
   * Optional. Description of the game that will be launched when the user presses the button. NOTE:
   * This type of button must always be the first button in the first row.
   */
  @SerializedName("callback_game")
  public CallbackGame callbackGame;

  /**
   * Optional. Specify True, to send a Pay button. NOTE: This type of button must always be the
   * first button in the first row and can only be used in invoice messages.
   */
  public Boolean pay;

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
  public final String toString() {
    var builder = new StringBuilder();
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
