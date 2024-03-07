package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a parameter of the inline keyboard button used to automatically authorize
 * a user. Serves as a great replacement for the Telegram Login Widget when the user is coming from
 * Telegram. All the user needs to do is tap/click a button and confirm that they want to log in:
 *
 * <p>Telegram apps support these buttons as of version 5.7.
 */
public final class LoginUrl {

  /**
   * An HTTPS URL to be opened with user authorization data added to the query string when the
   * button is pressed. If the user refuses to provide authorization data, the original URL without
   * information about the user will be opened. The data added is the same as described in Receiving
   * authorization data. NOTE: You must always check the hash of the received data to verify the
   * authentication and the integrity of the data as described in Checking authorization.
   */
  @NotNull public String url;

  /** Optional. New text of the button in forwarded messages. */
  @SerializedName("forward_text")
  public String forwardText;

  /**
   * Optional. Username of a bot, which will be used for user authorization. See Setting up a bot
   * for more details. If not specified, the current bot's username will be assumed. The url's
   * domain must be the same as the domain linked with the bot. See Linking your domain to the bot
   * for more details.
   */
  @SerializedName("bot_username")
  public String botUsername;

  /** Optional. Pass True to request the permission for your bot to send messages to the user. */
  @SerializedName("request_write_access")
  public Boolean requestWriteAccess;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof LoginUrl other)) return false;
    return Objects.equals(url, other.url)
        && Objects.equals(forwardText, other.forwardText)
        && Objects.equals(botUsername, other.botUsername)
        && Objects.equals(requestWriteAccess, other.requestWriteAccess);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(url, forwardText, botUsername, requestWriteAccess);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("LoginUrl[url=")
        .append(url)
        .append(", forwardText=")
        .append(forwardText)
        .append(", botUsername=")
        .append(botUsername)
        .append(", requestWriteAccess=")
        .append(requestWriteAccess)
        .append("]");
    return builder.toString();
  }
}
