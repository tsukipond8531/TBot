package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents a menu button, which launches a Web App. */
public final class MenuButtonWebApp implements MenuButton {

  public static final String TYPE = "web_app";

  /** Type of the button, must be web_app */
  @NotNull public final String type = TYPE;

  /** Text on the button */
  @NotNull public String text;

  /**
   * Description of the Web App that will be launched when the user presses the button. The Web App
   * will be able to send an arbitrary message on behalf of the user using the method
   * answerWebAppQuery.
   */
  @NotNull
  @SerializedName("web_app")
  public WebAppInfo webApp;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MenuButtonWebApp other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(text, other.text)
        && Objects.equals(webApp, other.webApp);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, text, webApp);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("MenuButtonWebApp[type=")
        .append(type)
        .append(", text=")
        .append(text)
        .append(", webApp=")
        .append(webApp)
        .append("]");
    return builder.toString();
  }
}
