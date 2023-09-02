package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jarkz.tbot.core.BotApi;
import java.util.List;

/**
 * The parameters, which will be passed to the {@link BotApi#getUpdates(GetUpdatesParameters)}
 * method.
 *
 * @author Pavel Bialiauski
 */
public class GetUpdatesParameters {

  /**
   * Default parameters, which defined in <a
   * href="https://core.telegram.org/bots/api#getUpdates">Telegram API</a> documentation.
   */
  public static final GetUpdatesParameters DEFAULT = new GetUpdatesParameters(null, 100, 1, null);

  private Integer offset;
  private Integer limit;
  private Integer timeout;

  @SerializedName("allowed_updates")
  private List<String> allowedUpdates;

  /** Default constaructor */
  public GetUpdatesParameters() {}

  /** The constructor with all arguments. */
  public GetUpdatesParameters(
      Integer offset, Integer limit, Integer timeout, List<String> allowedUpdates) {
    this.offset = offset;
    this.limit = limit;
    this.timeout = timeout;
    this.allowedUpdates = allowedUpdates;
  }

  public static GetUpdatesParameters getDefault() {
    return DEFAULT;
  }

  /**
   * Identifier of the first update to be returned.
   *
   * <p>Must be greater by one than the highest among the identifiers of previously received
   * updates. By default, updates starting with the earliest unconfirmed update are returned. An
   * update is considered confirmed as soon as <a
   * href="https://core.telgeram.org/bots/api#getUpdates">getUpdates</a> is called with an
   * <i>offset<i> higher than its <i>update_id</i>. The negative offset can be specified to retrieve
   * updates starting from -<i>offset</i> update from the end of the updates queue. All previous
   * updates will be forgotten.
   *
   * @return offset as Integer.
   */
  public Integer getOffset() {
    return offset;
  }

  /**
   * Sets the identifier of the first update to be returned.
   *
   * <p>Must be greater by one than the highest among the identifiers of previously received
   * updates. By default, updates starting with the earliest unconfirmed update are returned. An
   * update is considered confirmed as soon as <a
   * href="https://core.telgeram.org/bots/api#getUpdates">getUpdates</a> is called with an
   * <i>offset<i> higher than its <i>update_id</i>. The negative offset can be specified to retrieve
   * updates starting from -<i>offset</i> update from the end of the updates queue. All previous
   * updates will be forgotten.
   *
   * @param offset the identifier of the first update to be returned as Integer or null if the
   *     offset is not required.
   */
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  /**
   * Limits the number of updates to be retrieved. Values between 1-100 are accepted. Defaults to
   * 100.
   *
   * @return limit as Integer.
   */
  public Integer getLimit() {
    return limit;
  }

  /**
   * Sets the number, which limits of updates to be retrieved. Values between 1-100 are accepted.
   * Defaults to 100.
   *
   * @param limit the number, which limits of updates to be retrieved as Integer or null if you want
   *     to set to 100 as default.
   */
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   * Timeout in seconds for long polling. Defaults to 0, i.e. usual short polling. Should be
   * positive, short polling should be used for testing purposes only.
   *
   * @return timeout as Integer.
   */
  public Integer getTimeout() {
    return timeout;
  }

  /**
   * Sets the timeout in seconds for long polling. Defaults to 0, i.e. usual short polling. Should
   * be positive, short polling should be used for testing purposes only.
   *
   * @param timeout the timeout in seconds for long polling as Integer or null if you want to 0 as
   *     default.
   */
  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  /**
   * A JSON-serialized list of the update types you want your bot to receive.
   *
   * <p>For example, specify [“message”, “edited_channel_post”, “callback_query”] to only receive
   * updates of these types. See <a href="https://core.telegram.org/bots/api#update">Update</a> (or
   * {@link Update}) for a complete list of available update types.
   *
   * <p>Specify an empty list to receive all update types except chat_member (default). If not
   * specified, the previous setting will be used.
   *
   * @return allowed_updates as {@link List}&lt;String&gt;.
   */
  public List<String> getAllowedUpdates() {
    return allowedUpdates;
  }

  /**
   * Sets the JSON-serialized list of the update types you want your bot to receive.
   *
   * <p>For example, specify [“message”, “edited_channel_post”, “callback_query”] to only receive
   * updates of these types. See <a href="https://core.telegram.org/bots/api#update">Update</a> (or
   * {@link Update}) for a complete list of available update types.
   *
   * <p>Specify an empty list to receive all update types except chat_member (default). If not
   * specified, the previous setting will be used.
   *
   * @return allowed_updates the JSON-serialized list of the update types you want your bot to
   *     receive as {@link List}&lt;String&gt; or null if you want to receive all update types
   *     except "chat_member" as default.
   */
  public void setAllowedUpdates(List<String> allowedUpdates) {
    this.allowedUpdates = allowedUpdates;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("GetUpdateParameters[offset=")
        .append(offset)
        .append(", limit=")
        .append(limit)
        .append(", timeout=")
        .append(timeout)
        .append(", allowedUpdates=")
        .append(allowedUpdates)
        .append("]");
    return builder.toString();
  }
}
