package jarkz.tbot.types.keyboardbutton;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * This object defines the criteria used to request a suitable user. The identifier of the selected
 * user will be shared with the bot when the corresponding button is pressed.
 *
 * <p><a href= "https://core.telegram.org/bots/features#chat-and-user-selection">More about
 * requesting users »</a>
 *
 * @author Pavel Bialiauski
 */
public class KeyboardButtonRequestUser {

  @SerializedName("request_id")
  @NotNull
  private int requestId;

  @SerializedName("user_is_bot")
  private Boolean userIsBot;

  @SerializedName("user_is_premium")
  private Boolean userIsPremium;

  /** Default constructor. */
  public KeyboardButtonRequestUser() {}

  /**
   * Signed 32-bit identifier of the request, which will be received back in the <a
   * href="https://core.telegram.org/bots/api#usershared">UserShared</a> object. Must be unique
   * within the message.
   *
   * @return request_id as int.
   */
  public int getRequestId() {
    return requestId;
  }

  /**
   * Sets the signed 32-bit identifier of the request, which will be received back in the <a
   * href="https://core.telegram.org/bots/api#usershared">UserShared</a> object. Must be unique
   * within the message.
   *
   * @param requestId the identifier of the request as int.
   */
  public void setRequestId(int requestId) {
    this.requestId = requestId;
  }

  /**
   * <i>Optional.</i> <i>True</i> to request a bot, pass <i>False</i> to request a regular user. If
   * not specified, no additional restrictions are applied.
   *
   * @return an optional value of user_is_bot as Boolean.
   */
  public Optional<Boolean> getUserIsBot() {
    return Optional.ofNullable(userIsBot);
  }

  /**
   * Pass <i>True</i> to request a bot, pass <i>False</i> to request a regular user. If not
   * specified, no additional restrictions are applied.
   *
   * @param userIsBot true if to request a bot, false if to request a regular user, null if no
   *     additional restrictions are applied.
   */
  public void setUserIsBot(Boolean userIsBot) {
    this.userIsBot = userIsBot;
  }

  /**
   * <i>Optional.</i> <i>True</i> to request a premium user, pass <i>False</i> to request a
   * non-premium user. If not specified, no additional restrictions are applied.
   *
   * @return an optional value of user_is_premium as Boolean.
   */
  public Optional<Boolean> getUserIsPremium() {
    return Optional.ofNullable(userIsPremium);
  }

  /**
   * Pass <i>True</i> to request a premium user, pass <i>False</i> to request a non-premium user. If
   * not specified, no additional restrictions are applied.
   *
   * @param userIsPremium true if to request a premium user, false if to request a non-premium user,
   *     null if no additional restrictions are applied.
   */
  public void setUserIsPremium(Boolean userIsPremium) {
    this.userIsPremium = userIsPremium;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(requestId, userIsBot, userIsPremium);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof KeyboardButtonRequestUser other)) return false;
    return requestId == other.requestId
        && Objects.equals(userIsBot, other.userIsBot)
        && Objects.equals(userIsPremium, other.userIsPremium);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("KeyboardButtonRequestUser[requestId=")
        .append(requestId)
        .append(", userIsBot=")
        .append(userIsBot)
        .append(", userIsPremium=")
        .append(userIsPremium)
        .append("]");
    return builder.toString();
  }
}
