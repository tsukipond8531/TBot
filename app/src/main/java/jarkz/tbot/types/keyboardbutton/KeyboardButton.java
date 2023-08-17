package jarkz.tbot.types.keyboardbutton;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.WebAppInfo;
import java.util.Objects;
import java.util.Optional;

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

  public KeyboardButton() {}

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Optional<KeyboardButtonRequestUser> getRequestUser() {
    return Optional.of(requestUser);
  }

  public void setRequestUser(KeyboardButtonRequestUser requestUser) {
    this.requestUser = requestUser;
  }

  public Optional<KeyboardButtonRequestChat> getRequestChat() {
    return Optional.of(requestChat);
  }

  public void setRequestChat(KeyboardButtonRequestChat requestChat) {
    this.requestChat = requestChat;
  }

  public Optional<Boolean> getRequestContact() {
    return Optional.of(requestContact);
  }

  public void setRequestContact(Boolean requestContact) {
    this.requestContact = requestContact;
  }

  public Optional<Boolean> getRequestLocation() {
    return Optional.of(requestLocation);
  }

  public void setRequestLocation(Boolean requestLocation) {
    this.requestLocation = requestLocation;
  }

  public Optional<KeyboardButtonPollType> getRequestPoll() {
    return Optional.of(requestPoll);
  }

  public void setRequestPoll(KeyboardButtonPollType requestPoll) {
    this.requestPoll = requestPoll;
  }

  public Optional<WebAppInfo> getWebApp() {
    return Optional.of(webApp);
  }

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
