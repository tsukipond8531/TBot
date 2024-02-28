package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to receive incoming updates using long polling (wiki). Returns an Array of Update
 * objects.
 */
public final class GetUpdatesParameters {

  /**
   * Identifier of the first update to be returned. Must be greater by one than the highest among
   * the identifiers of previously received updates. By default, updates starting with the earliest
   * unconfirmed update are returned. An update is considered confirmed as soon as getUpdates is
   * called with an offset higher than its update_id. The negative offset can be specified to
   * retrieve updates starting from -offset update from the end of the updates queue. All previous
   * updates will be forgotten.
   */
  public Integer offset;

  /**
   * Limits the number of updates to be retrieved. Values between 1-100 are accepted. Defaults to
   * 100.
   */
  public Integer limit;

  /**
   * Timeout in seconds for long polling. Defaults to 0, i.e. usual short polling. Should be
   * positive, short polling should be used for testing purposes only.
   */
  public Integer timeout;

  /**
   * A JSON-serialized list of the update types you want your bot to receive. For example, specify
   * ["message", "edited_channel_post", "callback_query"] to only receive updates of these types.
   * See Update for a complete list of available update types. Specify an empty list to receive all
   * update types except chat_member, message_reaction, and message_reaction_count (default). If not
   * specified, the previous setting will be used. Please note that this parameter doesn't affect
   * updates created before the call to the getUpdates, so unwanted updates may be received for a
   * short period of time.
   */
  @SerializedName("allowed_updates")
  public List<String> allowedUpdates;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetUpdatesParameters other)) return false;
    return Objects.equals(offset, other.offset)
        && Objects.equals(limit, other.limit)
        && Objects.equals(timeout, other.timeout)
        && Objects.equals(allowedUpdates, other.allowedUpdates);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(offset, limit, timeout, allowedUpdates);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("GetUpdatesParameters[offset=")
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
