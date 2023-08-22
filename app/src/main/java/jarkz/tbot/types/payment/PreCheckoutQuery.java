package jarkz.tbot.types.payment;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import java.util.Objects;
import java.util.Optional;

/**
 * This object contains information about an incoming pre-checkout query.
 *
 * @author Pavel Bialiauski
 */
public class PreCheckoutQuery {

  @NotNull private String id;

  @NotNull private User from;

  @NotNull private String currency;

  @SerializedName("total_amount")
  @NotNull
  private int totalAmount;

  @SerializedName("invoice_payload")
  @NotNull
  private String invoicePayload;

  @SerializedName("shipping_option_id")
  private String shippingOptionId;

  @SerializedName("order_info")
  private OrderInfo orderInfo;

  /** Default constructor. */
  public PreCheckoutQuery() {}

  /**
   * Unique query identifier.
   *
   * @return id as String.
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the unique query identifier.
   *
   * @param id the unique query identifier as String.
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * User who sent the query.
   *
   * @return from as {@link User}.
   */
  public User getFrom() {
    return from;
  }

  /**
   * Sets the user who sent the query.
   *
   * @param from the user who sent the query as {@link User}.
   */
  public void setFrom(User from) {
    this.from = from;
  }

  /**
   * Three-letter ISO 4217 <a
   * href="https://core.telegram.org/bots/payments#supported-currencies">currency</a> code.
   *
   * @return currency as String.
   */
  public String getCurrency() {
    return currency;
  }

  /**
   * Sets the three-letter ISO 4217 <a
   * href="https://core.telegram.org/bots/payments#supported-currencies">currency</a> code.
   *
   * @param currency Sets the three-letter ISO 4217 currency code as String.
   */
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Total price in the <i>smallest units</i> of the currency (integer, <strong>not</strong>
   * float/double).
   *
   * <p>For example, for a price of <code>US$ 1.45</code> pass <code>amount = 145</code>. See the
   * <i>exp</i> parameter in <a
   * href="https://core.telegram.org/bots/payments/currencies.json">currencies.json</a>, it shows
   * the number of digits past the decimal point for each currency (2 for the majority of
   * currencies).
   *
   * @return total_amount as int.
   */
  public int getTotalAmount() {
    return totalAmount;
  }

  /**
   * Sets the total price in the <i>smallest units</i> of the currency (integer,
   * <strong>not</strong> float/double).
   *
   * <p>For example, for a price of <code>US$ 1.45</code> pass <code>amount = 145</code>. See the
   * <i>exp</i> parameter in <a
   * href="https://core.telegram.org/bots/payments/currencies.json">currencies.json</a>, it shows
   * the number of digits past the decimal point for each currency (2 for the majority of
   * currencies).
   *
   * @param totalAmount the total price in the <i>smallest units</i> of the currency as int.
   */
  public void setTotalAmount(int totalAmount) {
    this.totalAmount = totalAmount;
  }

  /**
   * Bot specified invoice payload.
   *
   * @return invoice_payload as String.
   */
  public String getInvoicePayload() {
    return invoicePayload;
  }

  /**
   * Sets the bot specified invoice payload.
   *
   * @param invoicePayload the bot specified invoice payload as String.
   */
  public void setInvoicePayload(String invoicePayload) {
    this.invoicePayload = invoicePayload;
  }

  /**
   * <i>Optional.</i> Identifier of the shipping option chosen by the user.
   *
   * @return an optional value of shipping_option_id as String.
   */
  public Optional<String> getShippingOptionId() {
    return Optional.of(shippingOptionId);
  }

  /**
   * Sets the identifier of the shipping option chosen by the user.
   *
   * @param shippingOptionId the identifier of the shipping option chosen by the user as String or
   *     null if the options doesn't exists.
   */
  public void setShippingOptionId(String shippingOptionId) {
    this.shippingOptionId = shippingOptionId;
  }

  /**
   * <i>Optional.</i> Order information provided by the user.
   *
   * @return an optional value of order_info as {@link OrderInfo}.
   */
  public Optional<OrderInfo> getOrderInfo() {
    return Optional.of(orderInfo);
  }

  /**
   * Sets the order information provided by the user.
   *
   * @param orderInfo the order information provided by the user as {@link OrderInfo} or null if the
   *     user doesn't provide this.
   */
  public void setOrderInfo(OrderInfo orderInfo) {
    this.orderInfo = orderInfo;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        id, from, currency, totalAmount, invoicePayload, shippingOptionId, orderInfo);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PreCheckoutQuery other)) return false;
    return Objects.equals(id, other.id)
        && Objects.equals(from, other.from)
        && Objects.equals(currency, other.currency)
        && totalAmount == other.totalAmount
        && Objects.equals(invoicePayload, other.invoicePayload)
        && Objects.equals(shippingOptionId, other.shippingOptionId)
        && Objects.equals(orderInfo, other.orderInfo);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("PreCheckoutQuery[id=")
        .append(id)
        .append(", from=")
        .append(from)
        .append(", currency=")
        .append(currency)
        .append(", totalAmount=")
        .append(totalAmount)
        .append(", invoicePayload=")
        .append(invoicePayload)
        .append(", shippingOptionId=")
        .append(shippingOptionId)
        .append(", orderInfo=")
        .append(orderInfo)
        .append("]");
    return builder.toString();
  }
}
