package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.ShippingOption;
import java.util.List;
import java.util.Objects;

/**
 * If you sent an invoice requesting a shipping address and the parameter is_flexible was specified,
 * the Bot API will send an Update with a shipping_query field to the bot. Use this method to reply
 * to shipping queries. On success, True is returned.
 */
public final class AnswerShippingQueryParameters {

  public static final class Builder {

    private AnswerShippingQueryParameters buildingType;

    public Builder() {
      buildingType = new AnswerShippingQueryParameters();
    }

    public Builder setShippingQueryId(String shippingQueryId) {
      buildingType.shippingQueryId = shippingQueryId;
      return this;
    }

    public Builder setOk(boolean ok) {
      buildingType.ok = ok;
      return this;
    }

    public Builder setShippingOptions(List<ShippingOption> shippingOptions) {
      buildingType.shippingOptions = shippingOptions;
      return this;
    }

    public Builder setErrorMessage(String errorMessage) {
      buildingType.errorMessage = errorMessage;
      return this;
    }

    public AnswerShippingQueryParameters build() {
      return buildingType;
    }
  }

  /** Unique identifier for the query to be answered */
  @NotNull
  @SerializedName("shipping_query_id")
  public String shippingQueryId;

  /**
   * Pass True if delivery to the specified address is possible and False if there are any problems
   * (for example, if delivery to the specified address is not possible)
   */
  @NotNull public boolean ok;

  /** Required if ok is True. A JSON-serialized array of available shipping options. */
  @SerializedName("shipping_options")
  public List<ShippingOption> shippingOptions;

  /**
   * Required if ok is False. Error message in human readable form that explains why it is
   * impossible to complete the order (e.g. "Sorry, delivery to your desired address is
   * unavailable'). Telegram will display this message to the user.
   */
  @SerializedName("error_message")
  public String errorMessage;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof AnswerShippingQueryParameters other)) return false;
    return Objects.equals(shippingQueryId, other.shippingQueryId)
        && ok == other.ok
        && Objects.equals(shippingOptions, other.shippingOptions)
        && Objects.equals(errorMessage, other.errorMessage);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(shippingQueryId, ok, shippingOptions, errorMessage);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("AnswerShippingQueryParameters[shippingQueryId=")
        .append(shippingQueryId)
        .append(", ok=")
        .append(ok)
        .append(", shippingOptions=")
        .append(shippingOptions)
        .append(", errorMessage=")
        .append(errorMessage)
        .append("]");
    return builder.toString();
  }
}
