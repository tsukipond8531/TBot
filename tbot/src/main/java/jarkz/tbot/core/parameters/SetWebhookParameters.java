package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InputFile;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to specify a URL and receive incoming updates via an outgoing webhook. Whenever
 * there is an update for the bot, we will send an HTTPS POST request to the specified URL,
 * containing a JSON-serialized Update. In case of an unsuccessful request, we will give up after a
 * reasonable amount of attempts. Returns True on success.
 *
 * <p>If you'd like to make sure that the webhook was set by you, you can specify secret data in the
 * parameter secret_token. If specified, the request will contain a header
 * "X-Telegram-Bot-Api-Secret-Token" with the secret token as content.
 */
public final class SetWebhookParameters {

  /** HTTPS URL to send updates to. Use an empty string to remove webhook integration */
  @NotNull public String url;

  /**
   * Upload your public key certificate so that the root certificate in use can be checked. See our
   * self-signed guide for details.
   */
  public InputFile certificate;

  /**
   * The fixed IP address which will be used to send webhook requests instead of the IP address
   * resolved through DNS
   */
  @SerializedName("ip_address")
  public String ipAddress;

  /**
   * The maximum allowed number of simultaneous HTTPS connections to the webhook for update
   * delivery, 1-100. Defaults to 40. Use lower values to limit the load on your bot's server, and
   * higher values to increase your bot's throughput.
   */
  @SerializedName("max_connections")
  public Integer maxConnections;

  /**
   * A JSON-serialized list of the update types you want your bot to receive. For example, specify
   * ["message", "edited_channel_post", "callback_query"] to only receive updates of these types.
   * See Update for a complete list of available update types. Specify an empty list to receive all
   * update types except chat_member, message_reaction, and message_reaction_count (default). If not
   * specified, the previous setting will be used. Please note that this parameter doesn't affect
   * updates created before the call to the setWebhook, so unwanted updates may be received for a
   * short period of time.
   */
  @SerializedName("allowed_updates")
  public List<String> allowedUpdates;

  /** Pass True to drop all pending updates */
  @SerializedName("drop_pending_updates")
  public Boolean dropPendingUpdates;

  /**
   * A secret token to be sent in a header "X-Telegram-Bot-Api-Secret-Token" in every webhook
   * request, 1-256 characters. Only characters A-Z, a-z, 0-9, _ and - are allowed. The header is
   * useful to ensure that the request comes from a webhook set by you.
   */
  @SerializedName("secret_token")
  public String secretToken;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetWebhookParameters other)) return false;
    return Objects.equals(url, other.url)
        && Objects.equals(certificate, other.certificate)
        && Objects.equals(ipAddress, other.ipAddress)
        && Objects.equals(maxConnections, other.maxConnections)
        && Objects.equals(allowedUpdates, other.allowedUpdates)
        && Objects.equals(dropPendingUpdates, other.dropPendingUpdates)
        && Objects.equals(secretToken, other.secretToken);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        url,
        certificate,
        ipAddress,
        maxConnections,
        allowedUpdates,
        dropPendingUpdates,
        secretToken);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetWebhookParameters[url=")
        .append(url)
        .append(", certificate=")
        .append(certificate)
        .append(", ipAddress=")
        .append(ipAddress)
        .append(", maxConnections=")
        .append(maxConnections)
        .append(", allowedUpdates=")
        .append(allowedUpdates)
        .append(", dropPendingUpdates=")
        .append(dropPendingUpdates)
        .append(", secretToken=")
        .append(secretToken)
        .append("]");
    return builder.toString();
  }
}
