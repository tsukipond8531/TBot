package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a button to be shown above inline query results. You must use exactly one
 * of the optional fields.
 */
public final class InlineQueryResultsButton {

  public static final class Builder {

    private InlineQueryResultsButton buildingType;

    public Builder() {
      buildingType = new InlineQueryResultsButton();
    }

    public Builder setText(String text) {
      buildingType.text = text;
      return this;
    }

    public Builder setWebApp(WebAppInfo webApp) {
      buildingType.webApp = webApp;
      return this;
    }

    public Builder setStartParameter(String startParameter) {
      buildingType.startParameter = startParameter;
      return this;
    }

    public InlineQueryResultsButton build() {
      return buildingType;
    }
  }

  /** Label text on the button */
  @NotNull public String text;

  /**
   * Optional. Description of the Web App that will be launched when the user presses the button.
   * The Web App will be able to switch back to the inline mode using the method switchInlineQuery
   * inside the Web App.
   */
  @SerializedName("web_app")
  public WebAppInfo webApp;

  /**
   * Optional. Deep-linking parameter for the /start message sent to the bot when a user presses the
   * button. 1-64 characters, only A-Z, a-z, 0-9, _ and - are allowed. Example: An inline bot that
   * sends YouTube videos can ask the user to connect the bot to their YouTube account to adapt
   * search results accordingly. To do this, it displays a 'Connect your YouTube account' button
   * above the results, or even before showing any. The user presses the button, switches to a
   * private chat with the bot and, in doing so, passes a start parameter that instructs the bot to
   * return an OAuth link. Once done, the bot can offer a switch_inline button so that the user can
   * easily return to the chat where they wanted to use the bot's inline capabilities.
   */
  @SerializedName("start_parameter")
  public String startParameter;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultsButton other)) return false;
    return Objects.equals(text, other.text)
        && Objects.equals(webApp, other.webApp)
        && Objects.equals(startParameter, other.startParameter);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(text, webApp, startParameter);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
