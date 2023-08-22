package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.WebAppInfo;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a button to be shown above inline query results. You <strong>must</strong>
 * use exactly one of the optional fields.
 *
 * @author Pavel Bialiauski
 */
public class InlineQueryResultsButton {

  @NotNull private String text;

  @SerializedName("web_app")
  private WebAppInfo webApp;

  @SerializedName("start_parameter")
  private String startParameter;

  /** Default constructor. */
  public InlineQueryResultsButton() {}

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
   * <i>Optional.</i> Description of the <a href="https://core.telegram.org/bots/webapps">Web
   * App</a> that will be launched when the user presses the button. The Web App will be able to
   * switch back to the inline mode using the method <a href=
   * "https://core.telegram.org/bots/webapps#initializing-web-apps">switchInlineQuery</a> inside the
   * Web App.
   *
   * @return an optional value of web_app as {@link WebAppInfo}.
   */
  public Optional<WebAppInfo> getWebApp() {
    return Optional.of(webApp);
  }

  /**
   * Sets the description of the <a href="https://core.telegram.org/bots/webapps">Web App</a> that
   * will be launched when the user presses the button. The Web App will be able to switch back to
   * the inline mode using the method <a href=
   * "https://core.telegram.org/bots/webapps#initializing-web-apps">switchInlineQuery</a> inside the
   * Web App.
   *
   * @param webApp the description of the Web App that will be launched when the user presses the
   *     button as {@link WebAppInfo} or null if startParameter is provided.
   */
  public void setWebApp(WebAppInfo webApp) {
    if (startParameter != null) {
      throw new IllegalStateException(
          "You must use exactly one of the optional fields: webApp or startParameter! Cause: startParameter is not null.");
    }
    this.webApp = webApp;
  }

  /**
   * <i>Optional.</i> <a href=
   * "https://core.telegram.org/bots/features#deep-linking">Deep-linking</a> parameter for the
   * /start message sent to the bot when a user presses the button. 1-64 characters, only <code>A-Z
   * </code>, <code>a-z</code>, <code>0-9</code>, <code>_</code> and <code>-</code> are allowed.<br>
   * <br>
   * <i>Example:</i> An inline bot that sends YouTube videos can ask the user to connect the bot to
   * their YouTube account to adapt search results accordingly. To do this, it displays a 'Connect
   * your YouTube account' button above the results, or even before showing any. The user presses
   * the button, switches to a private chat with the bot and, in doing so, passes a start parameter
   * that instructs the bot to return an OAuth link. Once done, the bot can offer a <a href=
   * "https://core.telegram.org/bots/api#inlinekeyboardmarkup"><i>switch_inline</i></a> button so
   * that the user can easily return to the chat where they wanted to use the bot's inline
   * capabilities.
   *
   * @return an optional value of start_parameter as String.
   */
  public Optional<String> getStartParameter() {
    return Optional.of(startParameter);
  }

  /**
   * Sets the <a href= "https://core.telegram.org/bots/features#deep-linking">deep-linking</a>
   * parameter for the /start message sent to the bot when a user presses the button. 1-64
   * characters, only <code>A-Z
   * </code>, <code>a-z</code>, <code>0-9</code>, <code>_</code> and <code>-</code> are allowed.<br>
   * <br>
   * <i>Example:</i> An inline bot that sends YouTube videos can ask the user to connect the bot to
   * their YouTube account to adapt search results accordingly. To do this, it displays a 'Connect
   * your YouTube account' button above the results, or even before showing any. The user presses
   * the button, switches to a private chat with the bot and, in doing so, passes a start parameter
   * that instructs the bot to return an OAuth link. Once done, the bot can offer a <a href=
   * "https://core.telegram.org/bots/api#inlinekeyboardmarkup"><i>switch_inline</i></a> button so
   * that the user can easily return to the chat where they wanted to use the bot's inline
   * capabilities.
   *
   * @param startParameter the deep-linking parameter for the /start message sent to the bot, when a
   *     user presses the button, as String.
   */
  public void setStartParameter(String startParameter) {
    if (webApp != null) {
      throw new IllegalStateException(
          "You must use exactly one of the optional fields: webApp or startParameter! Cause: webApp is not null.");
    }
    this.startParameter = startParameter;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(text, webApp, startParameter);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultsButton other)) return false;
    return Objects.equals(text, other.text)
        && Objects.equals(webApp, other.webApp)
        && Objects.equals(startParameter, other.startParameter);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InlineQueryResultsButton[text=")
        .append(text)
        .append(", webApp=")
        .append(webApp)
        .append(", startParameter=")
        .append(startParameter)
        .append("]");
    return builder.toString();
  }
}
