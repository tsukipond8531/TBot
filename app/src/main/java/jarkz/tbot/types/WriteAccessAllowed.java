package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a service message about a user allowing a bot to write messages after
 * adding the bot to the attachment menu or launching a Web App from a link.
 *
 * @author Pavel Bialiauski
 */
public class WriteAccessAllowed {

  @SerializedName("web_app_name")
  private String webAppName;

  /** Default constructor. */
  public WriteAccessAllowed() {}

  /**
   * <i>Optional.</i> Name of the Web App which was launched from a link.
   *
   * @return an optional value of web_app_name as String.
   */
  public Optional<String> getWebAppName() {
    return Optional.ofNullable(webAppName);
  }

  /**
   * Sets the name of the Web App which was launched from a link.
   *
   * @param webAppName the name of the Web App which was launched from a link as String or null if
   *     it doesn't contains.
   */
  public void setWebAppName(String webAppName) {
    this.webAppName = webAppName;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(webAppName);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof WriteAccessAllowed other)) return false;
    return Objects.equals(webAppName, other.webAppName);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("WriteAccessAllowed[webAppName=").append(webAppName).append("]");
    return builder.toString();
  }
}
