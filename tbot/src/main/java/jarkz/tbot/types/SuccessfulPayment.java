package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object contains basic information about a successful payment. */
public final class SuccessfulPayment {

  public static final class Builder {

    private SuccessfulPayment buildingType;

    public Builder() {
      buildingType = new SuccessfulPayment();
    }

    public Builder setCurrency(String currency) {
      buildingType.currency = currency;
      return this;
    }

    public Builder setTotalAmount(int totalAmount) {
      buildingType.totalAmount = totalAmount;
      return this;
    }

    public Builder setInvoicePayload(String invoicePayload) {
      buildingType.invoicePayload = invoicePayload;
      return this;
    }

    public Builder setShippingOptionId(String shippingOptionId) {
      buildingType.shippingOptionId = shippingOptionId;
      return this;
    }

    public Builder setOrderInfo(OrderInfo orderInfo) {
      buildingType.orderInfo = orderInfo;
      return this;
    }

    public Builder setTelegramPaymentChargeId(String telegramPaymentChargeId) {
      buildingType.telegramPaymentChargeId = telegramPaymentChargeId;
      return this;
    }

    public Builder setProviderPaymentChargeId(String providerPaymentChargeId) {
      buildingType.providerPaymentChargeId = providerPaymentChargeId;
      return this;
    }

    public SuccessfulPayment build() {
      return buildingType;
    }
  }

  /** Three-letter ISO 4217 currency code */
  @NotNull public String currency;

  /**
   * Total price in the smallest units of the currency (integer, not float/double). For example, for
   * a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows the
   * number of digits past the decimal point for each currency (2 for the majority of currencies).
   */
  @NotNull
  @SerializedName("total_amount")
  public int totalAmount;

  /** Bot specified invoice payload */
  @NotNull
  @SerializedName("invoice_payload")
  public String invoicePayload;

  /** Optional. Identifier of the shipping option chosen by the user */
  @SerializedName("shipping_option_id")
  public String shippingOptionId;

  /** Optional. Order information provided by the user */
  @SerializedName("order_info")
  public OrderInfo orderInfo;

  /** Telegram payment identifier */
  @NotNull
  @SerializedName("telegram_payment_charge_id")
  public String telegramPaymentChargeId;

  /** Provider payment identifier */
  @NotNull
  @SerializedName("provider_payment_charge_id")
  public String providerPaymentChargeId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SuccessfulPayment other)) return false;
    return Objects.equals(currency, other.currency)
        && totalAmount == other.totalAmount
        && Objects.equals(invoicePayload, other.invoicePayload)
        && Objects.equals(shippingOptionId, other.shippingOptionId)
        && Objects.equals(orderInfo, other.orderInfo)
        && Objects.equals(telegramPaymentChargeId, other.telegramPaymentChargeId)
        && Objects.equals(providerPaymentChargeId, other.providerPaymentChargeId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        currency,
        totalAmount,
        invoicePayload,
        shippingOptionId,
        orderInfo,
        telegramPaymentChargeId,
        providerPaymentChargeId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SuccessfulPayment[currency=")
        .append(currency)
        .append(", totalAmount=")
        .append(totalAmount)
        .append(", invoicePayload=")
        .append(invoicePayload)
        .append(", shippingOptionId=")
        .append(shippingOptionId)
        .append(", orderInfo=")
        .append(orderInfo)
        .append(", telegramPaymentChargeId=")
        .append(telegramPaymentChargeId)
        .append(", providerPaymentChargeId=")
        .append(providerPaymentChargeId)
        .append("]");
    return builder.toString();
  }
}
