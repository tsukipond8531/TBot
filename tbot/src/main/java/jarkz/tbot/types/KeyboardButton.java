package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents one button of the reply keyboard. For simple text buttons, String can be
 * used instead of this object to specify the button text. The optional fields web_app,
 * request_users, request_chat, request_contact, request_location, and request_poll are mutually
 * exclusive.
 *
 * <p>Note: request_users and request_chat options will only work in Telegram versions released
 * after 3 February, 2023. Older clients will display unsupported message.
 */
public final class KeyboardButton {

  public static final class Builder {

    private KeyboardButton buildingType;

    public Builder() {
      buildingType = new KeyboardButton();
    }

    public Builder setText(String text) {
      buildingType.text = text;
      return this;
    }

    public Builder setRequestUsers(KeyboardButtonRequestUsers requestUsers) {
      buildingType.requestUsers = requestUsers;
      return this;
    }

    public Builder setRequestChat(KeyboardButtonRequestChat requestChat) {
      buildingType.requestChat = requestChat;
      return this;
    }

    public Builder setRequestContact(Boolean requestContact) {
      buildingType.requestContact = requestContact;
      return this;
    }

    public Builder setRequestLocation(Boolean requestLocation) {
      buildingType.requestLocation = requestLocation;
      return this;
    }

    public Builder setRequestPoll(KeyboardButtonPollType requestPoll) {
      buildingType.requestPoll = requestPoll;
      return this;
    }

    public Builder setWebApp(WebAppInfo webApp) {
      buildingType.webApp = webApp;
      return this;
    }

    public KeyboardButton build() {
      return buildingType;
    }
  }

  /**
   * Text of the button. If none of the optional fields are used, it will be sent as a message when
   * the button is pressed
   */
  @NotNull public String text;

  /**
   * Optional. If specified, pressing the button will open a list of suitable users. Identifiers of
   * selected users will be sent to the bot in a "users_shared" service message. Available in
   * private chats only.
   */
  @SerializedName("request_users")
  public KeyboardButtonRequestUsers requestUsers;

  /**
   * Optional. If specified, pressing the button will open a list of suitable chats. Tapping on a
   * chat will send its identifier to the bot in a "chat_shared" service message. Available in
   * private chats only.
   */
  @SerializedName("request_chat")
  public KeyboardButtonRequestChat requestChat;

  /**
   * Optional. If True, the user's phone number will be sent as a contact when the button is
   * pressed. Available in private chats only.
   */
  @SerializedName("request_contact")
  public Boolean requestContact;

  /**
   * Optional. If True, the user's current location will be sent when the button is pressed.
   * Available in private chats only.
   */
  @SerializedName("request_location")
  public Boolean requestLocation;

  /**
   * Optional. If specified, the user will be asked to create a poll and send it to the bot when the
   * button is pressed. Available in private chats only.
   */
  @SerializedName("request_poll")
  public KeyboardButtonPollType requestPoll;

  /**
   * Optional. If specified, the described Web App will be launched when the button is pressed. The
   * Web App will be able to send a "web_app_data" service message. Available in private chats only.
   */
  @SerializedName("web_app")
  public WebAppInfo webApp;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof KeyboardButton other)) return false;
    return Objects.equals(text, other.text)
        && Objects.equals(requestUsers, other.requestUsers)
        && Objects.equals(requestChat, other.requestChat)
        && Objects.equals(requestContact, other.requestContact)
        && Objects.equals(requestLocation, other.requestLocation)
        && Objects.equals(requestPoll, other.requestPoll)
        && Objects.equals(webApp, other.webApp);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        text, requestUsers, requestChat, requestContact, requestLocation, requestPoll, webApp);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("KeyboardButton[text=")
        .append(text)
        .append(", requestUsers=")
        .append(requestUsers)
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
