package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Use this method to remove webhook integration if you decide to switch back to getUpdates. Returns
 * True on success.
 */
public final class DeleteWebhookParameters {

  public static final class Builder {

    private DeleteWebhookParameters buildingType;

    public Builder() {
      buildingType = new DeleteWebhookParameters();
    }

    public Builder setDropPendingUpdates(Boolean dropPendingUpdates) {
      buildingType.dropPendingUpdates = dropPendingUpdates;
      return this;
    }

    public DeleteWebhookParameters build() {
      return buildingType;
    }
  }

  /** Pass True to drop all pending updates */
  @SerializedName("drop_pending_updates")
  public Boolean dropPendingUpdates;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof DeleteWebhookParameters other)) return false;
    return Objects.equals(dropPendingUpdates, other.dropPendingUpdates);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(dropPendingUpdates);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("DeleteWebhookParameters[dropPendingUpdates=")
        .append(dropPendingUpdates)
        .append("]");
    return builder.toString();
  }
}
