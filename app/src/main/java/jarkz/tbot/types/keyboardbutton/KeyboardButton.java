package jarkz.tbot.types.keyboardbutton;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.WebAppInfo;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents one button of the reply keyboard. For simple text buttons, String can be
 * used instead of this object to specify the button text. The optional fields web_app,
 * request_user, request_chat, request_contact, request_location, and request_poll are mutually
 * exclusive.
 *
 * @author Pavel Bialiauski
 */
public class KeyboardButton {

  @NotNull private String text;

  @SerializedName("request_user")
  private KeyboardButtonRequestUser requestUser;

  @SerializedName("request_chat")
  private KeyboardButtonRequestChat requestChat;

  @SerializedName("request_contact")
  private Boolean requestContact;

  @SerializedName("request_location")
  private Boolean requestLocation;

  @SerializedName("request_poll")
  private KeyboardButtonPollType requestPoll;

  @SerializedName("web_app")
  private WebAppInfo webApp;

  /** Default constructor. */
  public KeyboardButton() {}

  /**
   * Text of the button. If none of the optional fields are used, it will be sent as a message when
   * the button is pressed.
   *
   * @return text as String.
   */
  public String getText() {
    return text;
  }

  /**
   * Sets the text of the button. If none of the optional fields are used, it will be sent as a
   * message when the button is pressed.
   *
   * @param text the text of the button as String.
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * <i>Optional.</i> If specified, pressing the button will open a list of suitable users. Tapping
   * on any user will send their identifier to the bot in a “user_shared” service message. Available
   * in private chats only.
   *
   * @apiNote request_user option will only work in Telegram versions released after 3 February,
   *     2023. Older clients will display unsupported message.
   * @return an optional value of request_user as {@link KeyboardButtonRequestUser}.
   */
  public Optional<KeyboardButtonRequestUser> getRequestUser() {
    return Optional.of(requestUser);
  }

  /**
   * If specified, pressing the button will open a list of suitable users. Tapping on any user will
   * send their identifier to the bot in a “user_shared” service message. Available in private chats
   * only.
   *
   * @apiNote request_user option will only work in Telegram versions released after 3 February,
   *     2023. Older clients will display unsupported message.
   * @param requestUser the keyboard button, pressing which will open a list of suitalbe users, as
   *     {@link KeyboardButtonRequestUser} or null if it is not required.
   */
  public void setRequestUser(KeyboardButtonRequestUser requestUser) {
    this.requestUser = requestUser;
  }

  /**
   * <i>Optional.</i> If specified, pressing the button will open a list of suitable chats. Tapping
   * on a chat will send its identifier to the bot in a “chat_shared” service message. Available in
   * private chats only.
   *
   * @apiNote request_chat option will only work in Telegram versions released after 3 February,
   *     2023. Older clients will display unsupported message.
   * @return an optional value of request_chat as {@link KeyboardButtonRequestChat}.
   */
  public Optional<KeyboardButtonRequestChat> getRequestChat() {
    return Optional.of(requestChat);
  }

  /**
   * If specified, pressing the button will open a list of suitable chats. Tapping on a chat will
   * send its identifier to the bot in a “chat_shared” service message. Available in private chats
   * only.
   *
   * @apiNote request_chat option will only work in Telegram versions released after 3 February,
   *     2023. Older clients will display unsupported message.
   * @param requestChat the keyboard button, pressing which will open a list of suitable chats, as
   *     {@link KeyboardButtonRequestChat} or null if it is not required.
   */
  public void setRequestChat(KeyboardButtonRequestChat requestChat) {
    this.requestChat = requestChat;
  }

  /**
   * <i>Optional.</i> If <i>True</i>, the user's phone number will be sent as a contact when the
   * button is pressed. Available in private chats only.
   *
   * @apiNote request_contact option will only work in Telegram versions released after 9 April,
   *     2016. Older clients will display unsupported message.
   * @return an optional value of request_contact as Boolean.
   */
  public Optional<Boolean> getRequestContact() {
    return Optional.of(requestContact);
  }

  /**
   * If <i>True</i>, the user's phone number will be sent as a contact when the button is pressed.
   * Available in private chats only.
   *
   * @apiNote request_contact option will only work in Telegram versions released after 9 April,
   *     2016. Older clients will display unsupported message.
   * @param requestContact true if the user's phone number must be sent as a contact, when the
   *     button is pressed, otherwise - false or null.
   */
  public void setRequestContact(Boolean requestContact) {
    this.requestContact = requestContact;
  }

  /**
   * <i>Optional.</i> If <i>True</i>, the user's current location will be sent when the button is
   * pressed. Available in private chats only.
   *
   * @apiNote request_location option will only work in Telegram versions released after 9 April,
   *     2016. Older clients will display unsupported message.
   * @return an optional value of request_location as Boolean.
   */
  public Optional<Boolean> getRequestLocation() {
    return Optional.of(requestLocation);
  }

  /**
   * If <i>True</i>, the user's current location will be sent when the button is pressed. Available
   * in private chats only.
   *
   * @apiNote request_location option will only work in Telegram versions released after 9 April,
   *     2016. Older clients will display unsupported message.
   * @param requestLocation true if the user's current location must be sent, when the button is
   *     pressed, otherwise - false or null.
   */
  public void setRequestLocation(Boolean requestLocation) {
    this.requestLocation = requestLocation;
  }

  /**
   * <i>Optional.</i> If specified, the user will be asked to create a poll and send it to the bot
   * when the button is pressed. Available in private chats only.
   *
   * @apiNote request_poll option will only work in Telegram versions released after 23 January,
   *     2020. Older clients will display unsupported message.
   * @return an optional value of request_poll as {@link KeyboardButtonPollType}.
   */
  public Optional<KeyboardButtonPollType> getRequestPoll() {
    return Optional.of(requestPoll);
  }

  /**
   * If specified, the user will be asked to create a poll and send it to the bot when the button is
   * pressed. Available in private chats only.
   *
   * @apiNote request_poll option will only work in Telegram versions released after 23 January,
   *     2020. Older clients will display unsupported message.
   * @param requestPoll the keyboard button, pressing which asking the user to create a poll and
   *     send it to the bot, {@link KeyboardButtonPollType} or null if it is not required.
   */
  public void setRequestPoll(KeyboardButtonPollType requestPoll) {
    this.requestPoll = requestPoll;
  }

  /**
   * <i>Optional.</i> If specified, the described <a
   * href="https://core.telegram.org/bots/webapps">Web App</a> will be launched when the button is
   * pressed. The Web App will be able to send a “web_app_data” service message. Available in
   * private chats only.
   *
   * @apiNote web_app option will only work in Telegram versions released after 16 April, 2022.
   *     Older clients will display unsupported message.
   * @return an optional value of web_app as {@link WebAppInfo}.
   */
  public Optional<WebAppInfo> getWebApp() {
    return Optional.of(webApp);
  }

  /**
   * If specified, the described <a href="https://core.telegram.org/bots/webapps">Web App</a> will
   * be launched when the button is pressed. The Web App will be able to send a “web_app_data”
   * service message. Available in private chats only.
   *
   * @apiNote web_app option will only work in Telegram versions released after 16 April, 2022.
   *     Older clients will display unsupported message.
   * @param webApp the described Web App will be launched, when the button is pressed, as {@link
   *     WebAppInfo} or null if it is not required.
   */
  public void setWebApp(WebAppInfo webApp) {
    this.webApp = webApp;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        text, requestUser, requestChat, requestContact, requestLocation, requestPoll, webApp);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof KeyboardButton other)) return false;
    return Objects.equals(text, other.text)
        && Objects.equals(requestUser, other.requestUser)
        && Objects.equals(requestChat, other.requestChat)
        && Objects.equals(requestContact, other.requestContact)
        && Objects.equals(requestLocation, other.requestLocation)
        && Objects.equals(requestPoll, other.requestPoll)
        && Objects.equals(webApp, other.webApp);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("KeyboardButton[text=")
        .append(text)
        .append(", requestUser=")
        .append(requestUser)
        .append(", requestChat=")
        .append(requestChat)
        .append(", requestContact=")
        .append(requestContact)
        .append(", requestLocation=")
        .append(requestLocation)
        .append(", requestPoll=")
        .append(requestPoll)
        .append(", webApp=")
        .append(webApp)
        .append("]");
    return builder.toString();
  }
}
