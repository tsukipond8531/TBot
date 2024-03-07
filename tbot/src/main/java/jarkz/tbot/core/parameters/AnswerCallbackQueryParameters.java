package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Use this method to send answers to callback queries sent from inline keyboards. The answer will
 * be displayed to the user as a notification at the top of the chat screen or as an alert. On
 * success, True is returned.
 */
public final class AnswerCallbackQueryParameters {

  /** Unique identifier for the query to be answered */
  @NotNull
  @SerializedName("callback_query_id")
  public String callbackQueryId;

  /**
   * Text of the notification. If not specified, nothing will be shown to the user, 0-200 characters
   */
  public String text;

  /**
   * If True, an alert will be shown by the client instead of a notification at the top of the chat
   * screen. Defaults to false.
   */
  @SerializedName("show_alert")
  public Boolean showAlert;

  /**
   * URL that will be opened by the user's client. If you have created a Game and accepted the
   * conditions via @BotFather, specify the URL that opens your game - note that this will only work
   * if the query comes from a callback_game button. Otherwise, you may use links like
   * t.me/your_bot?start=XXXX that open your bot with a parameter.
   */
  public String url;

  /**
   * The maximum amount of time in seconds that the result of the callback query may be cached
   * client-side. Telegram apps will support caching starting in version 3.14. Defaults to 0.
   */
  @SerializedName("cache_time")
  public Integer cacheTime;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof AnswerCallbackQueryParameters other)) return false;
    return Objects.equals(callbackQueryId, other.callbackQueryId)
        && Objects.equals(text, other.text)
        && Objects.equals(showAlert, other.showAlert)
        && Objects.equals(url, other.url)
        && Objects.equals(cacheTime, other.cacheTime);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(callbackQueryId, text, showAlert, url, cacheTime);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("AnswerCallbackQueryParameters[callbackQueryId=")
        .append(callbackQueryId)
        .append(", text=")
        .append(text)
        .append(", showAlert=")
        .append(showAlert)
        .append(", url=")
        .append(url)
        .append(", cacheTime=")
        .append(cacheTime)
        .append("]");
    return builder.toString();
  }
}
