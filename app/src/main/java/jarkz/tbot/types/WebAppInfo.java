package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Describes a Web App.
 *
 * @author Pavel Bialiauski
 */
public class WebAppInfo {

  @NotNull private String url;

  /** Default constructor. */
  public WebAppInfo() {}

  /**
   * An HTTPS URL of a Web App to be opened with additional data as specified in <a href=
   * "https://core.telegram.org/bots/webapps#initializing-web-apps">Initializing Web Apps</a>.
   *
   * @return url as String.
   */
  public String getUrl() {
    return url;
  }

  /**
   * Sets the HTTPS URL of a Web App to be opened with additional data as specified in <a href=
   * "https://core.telegram.org/bots/webapps#initializing-web-apps">Initializing Web Apps</a>.
   *
   * @param url the HTTPS URL of a Web App to be opened with additional data as String.
   */
  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof WebAppInfo other)) return false;
    return Objects.equals(url, other.url);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("WebAppInfo[url=").append(url).append("]");
    return builder.toString();
  }
}
