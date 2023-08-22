package jarkz.tbot.types.menubutton;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.WebAppInfo;
import java.util.Objects;

/**
 * Represents a menu button, which launches a <a href="https://core.telegram.org/bots/webapps">Web
 * App</a>.
 *
 * @author Pavel Bialiauski
 */
public class MenuButtonWebApp implements MenuButton {

  /**
   * Type of {@link MenuButton}. Always "web_app".
   */
  protected static final String TYPE = "web_app";

  private final String type = MenuButtonWebApp.TYPE;

  @NotNull private String text;

  @SerializedName("web_app")
  @NotNull
  private WebAppInfo webApp;

  /** Default constructor. */
  public MenuButtonWebApp() {}

  /**
   * Type of the button, must be <i>web_app</i>.
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  /**
   * Text on the button.
   *
   * @return text as String.
   */
  public String getText() {
    return text;
  }

  /**
   * Sets the text on the button.
   *
   * @param text the text on the button as String.
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Description of the Web App that will be launched when the user presses the button. The Web App
   * will be able to send an arbitrary message on behalf of the user using the method <a href=
   * "https://core.telegram.org/bots/api#answerwebappquery">answerWebAppQuery</a>.
   *
   * @return web_app as {@link WebAppInfo}.
   */
  public WebAppInfo getWebApp() {
    return webApp;
  }

  /**
   * Sets the description of the Web App that will be launched when the user presses the button. The
   * Web App will be able to send an arbitrary message on behalf of the user using the method <a
   * href= "https://core.telegram.org/bots/api#answerwebappquery">answerWebAppQuery</a>.
   *
   * @param webApp the description of the Web App that will be launched, when the user presses the
   *     button, as {@link WebAppInfo}.
   */
  public void setWebApp(WebAppInfo webApp) {
    this.webApp = webApp;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, text, webApp);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MenuButtonWebApp other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(text, other.text)
        && Objects.equals(webApp, other.webApp);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
