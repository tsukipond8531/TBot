package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** Describes the current status of a webhook. */
public final class WebhookInfo {

  /** Webhook URL, may be empty if webhook is not set up */
  @NotNull public String url;

  /** True, if a custom certificate was provided for webhook certificate checks */
  @NotNull
  @SerializedName("has_custom_certificate")
  public boolean hasCustomCertificate;

  /** Number of updates awaiting delivery */
  @NotNull
  @SerializedName("pending_update_count")
  public int pendingUpdateCount;

  /** Optional. Currently used webhook IP address */
  @SerializedName("ip_address")
  public String ipAddress;

  /**
   * Optional. Unix time for the most recent error that happened when trying to deliver an update
   * via webhook
   */
  @SerializedName("last_error_date")
  public Integer lastErrorDate;

  /**
   * Optional. Error message in human-readable format for the most recent error that happened when
   * trying to deliver an update via webhook
   */
  @SerializedName("last_error_message")
  public String lastErrorMessage;

  /**
   * Optional. Unix time of the most recent error that happened when trying to synchronize available
   * updates with Telegram datacenters
   */
  @SerializedName("last_synchronization_error_date")
  public Integer lastSynchronizationErrorDate;

  /**
   * Optional. The maximum allowed number of simultaneous HTTPS connections to the webhook for
   * update delivery
   */
  @SerializedName("max_connections")
  public Integer maxConnections;

  /**
   * Optional. A list of update types the bot is subscribed to. Defaults to all update types except
   * chat_member
   */
  @SerializedName("allowed_updates")
  public List<String> allowedUpdates;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof WebhookInfo other)) return false;
    return Objects.equals(url, other.url)
        && hasCustomCertificate == other.hasCustomCertificate
        && pendingUpdateCount == other.pendingUpdateCount
        && Objects.equals(ipAddress, other.ipAddress)
        && Objects.equals(lastErrorDate, other.lastErrorDate)
        && Objects.equals(lastErrorMessage, other.lastErrorMessage)
        && Objects.equals(lastSynchronizationErrorDate, other.lastSynchronizationErrorDate)
        && Objects.equals(maxConnections, other.maxConnections)
        && Objects.equals(allowedUpdates, other.allowedUpdates);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        url,
        hasCustomCertificate,
        pendingUpdateCount,
        ipAddress,
        lastErrorDate,
        lastErrorMessage,
        lastSynchronizationErrorDate,
        maxConnections,
        allowedUpdates);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("WebhookInfo[url=")
        .append(url)
        .append(", hasCustomCertificate=")
        .append(hasCustomCertificate)
        .append(", pendingUpdateCount=")
        .append(pendingUpdateCount)
        .append(", ipAddress=")
        .append(ipAddress)
        .append(", lastErrorDate=")
        .append(lastErrorDate)
        .append(", lastErrorMessage=")
        .append(lastErrorMessage)
        .append(", lastSynchronizationErrorDate=")
        .append(lastSynchronizationErrorDate)
        .append(", maxConnections=")
        .append(maxConnections)
        .append(", allowedUpdates=")
        .append(allowedUpdates)
        .append("]");
    return builder.toString();
  }
}
