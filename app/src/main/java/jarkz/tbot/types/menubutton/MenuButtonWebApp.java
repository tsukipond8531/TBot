package jarkz.tbot.types.menubutton;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.WebAppInfo;
import java.util.Objects;

public class MenuButtonWebApp implements MenuButton {

  protected static final String TYPE = "web_app";

  private final String type = MenuButtonWebApp.TYPE;

  @NotNull private String text;

  @SerializedName("web_app")
  @NotNull
  private WebAppInfo webApp;

  public MenuButtonWebApp() {}

  public String getType() {
    return type;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public WebAppInfo getWebApp() {
    return webApp;
  }

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
