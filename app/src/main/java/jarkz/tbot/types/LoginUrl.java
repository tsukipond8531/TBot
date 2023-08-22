package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a parameter of the inline keyboard button used to automatically authorize
 * a user. Serves as a great replacement for the <a
 * href="https://core.telegram.org/widgets/login">Telegram Login Widget</a> when the user is coming
 * from Telegram. All the user needs to do is tap/click a button and confirm that they want to log
 * in.
 *
 * @apiNote Telegram apps support these buttons as of <a href=
 *     "https://telegram.org/blog/privacy-discussions-web-bots#meet-seamless-web-bots">version
 *     5.7</a>.
 * @author Pavel Bialiauski
 */
public class LoginUrl {

  @NotNull private String url;

  @SerializedName("forward_text")
  private String forwardText;

  @SerializedName("bot_username")
  private String botUsername;

  @SerializedName("request_write_access")
  private Boolean requestWriteAccess;

  /** Default constructor. */
  public LoginUrl() {}

  /**
   * An HTTPS URL to be opened with user authorization data added to the query string when the
   * button is pressed. If the user refuses to provide authorization data, the original URL without
   * information about the user will be opened. The data added is the same as described in <a href=
   * "https://core.telegram.org/widgets/login#receiving-authorization-data">Receiving authorization
   * data</a>.
   *
   * @apiNote You <strong>must</strong> always check the hash of the received data to verify the
   *     authentication and the integrity of the data as described in <a href=
   *     "https://core.telegram.org/widgets/login#checking-authorization">Checking
   *     authorization</a>.
   * @return url as String.
   */
  public String getUrl() {
    return url;
  }

  /**
   * Sets the HTTPS URL to be opened with user authorization data added to the query string when the
   * button is pressed. If the user refuses to provide authorization data, the original URL without
   * information about the user will be opened. The data added is the same as described in <a href=
   * "https://core.telegram.org/widgets/login#receiving-authorization-data">Receiving authorization
   * data</a>.
   *
   * @apiNote You <strong>must</strong> always check the hash of the received data to verify the
   *     authentication and the integrity of the data as described in <a href=
   *     "https://core.telegram.org/widgets/login#checking-authorization">Checking
   *     authorization</a>.
   * @param url the HTTPS URL to be opened with user authorization data added to the query string
   *     when the button is pressed as String.
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * <i>Optional.</i> New text of the button in forwarded messages.
   *
   * @return an optional value of forward_text as String.
   */
  public Optional<String> getForwardText() {
    return Optional.of(forwardText);
  }

  /**
   * Sets the new text of the button in forwarded messages.
   *
   * @param forwardText the new text of the button in forwareded message as String or null if it
   *     doesn't exists.
   */
  public void setForwardText(String forwardText) {
    this.forwardText = forwardText;
  }

  /**
   * <i>Optional.</i> Username of a bot, which will be used for user authorization. See <a
   * href="https://core.telegram.org/widgets/login#setting-up-a-bot">Setting up a bot</a> for more
   * details. If not specified, the current bot's username will be assumed. The <i>url</i>'s domain
   * must be the same as the domain linked with the bot.
   *
   * <p>See <a href=
   * "https://core.telegram.org/widgets/login#linking-your-domain-to-the-bot">Linking your domain to
   * the bot</a> for more details.
   *
   * @return an optional value of bot_username as String.
   */
  public Optional<String> getBotUsername() {
    return Optional.of(botUsername);
  }

  /**
   * Sets the username of a bot, which will be used for user authorization. See <a
   * href="https://core.telegram.org/widgets/login#setting-up-a-bot">Setting up a bot</a> for more
   * details. If not specified, the current bot's username will be assumed. The <i>url</i>'s domain
   * must be the same as the domain linked with the bot.
   *
   * <p>See <a href=
   * "https://core.telegram.org/widgets/login#linking-your-domain-to-the-bot">Linking your domain to
   * the bot</a> for more details.
   *
   * @param botUsername the username of a bot, which will be used for user authorization, as String
   *     or null if it not specified.
   */
  public void setBotUsername(String botUsername) {
    this.botUsername = botUsername;
  }

  /**
   * <i>Optional.</i> <i>True</i> if to request the permission for your bot to send messages to the
   * user.
   *
   * @return an optional value of request_write_access as Boolean.
   */
  public Optional<Boolean> getRequestWriteAccess() {
    return Optional.of(requestWriteAccess);
  }

  /**
   * Pass <i>True</i> to request the permission for your bot to send messages to the user.
   *
   * @param requestWriteAccess true if to request the permission for your bot to send messages to
   *     the user, otherwise - false or null.
   */
  public void setRequestWriteAccess(Boolean requestWriteAccess) {
    this.requestWriteAccess = requestWriteAccess;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(url, forwardText, botUsername, requestWriteAccess);
  }

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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
