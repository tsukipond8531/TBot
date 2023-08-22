package jarkz.tbot.types.payment;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object contains basic information about an invoice.
 *
 * @author Pavel Bialiauski
 */
public class Invoice {

  @NotNull private String title;

  @NotNull private String description;

  @SerializedName("start_parameter")
  @NotNull
  private String startParameter;

  @NotNull private String currency;

  @SerializedName("total_amount")
  @NotNull
  private int totalAmount;

  /** Default constructor. */
  public Invoice() {}

  /**
   * Product name.
   *
   * @return title as String.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the product name.
   *
   * @param title the product name as String.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Product description.
   *
   * @return description as String.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the product description.
   *
   * @param description the product description as String.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Unique bot deep-linking parameter that can be used to generate this invoice.
   *
   * @return start_parameter as String.
   */
  public String getStartParameter() {
    return startParameter;
  }

  /**
   * Sets the unique bot deep-linking parameter that can be used to generate this invoice.
   *
   * @param startParameter the unique bot deep-linking parameter that can be used to generate this
   *     invoice as String.
   */
  public void setStartParameter(String startParameter) {
    this.startParameter = startParameter;
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
   * @param currency the three-letter ISO 4217 currency code as String.
   */
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Total price in the <i>smallest units</i> of the currency (integer, <strong>not</strong>
   * float/double).
   *
   * <p>For example, for a price of <code>US$ 1.45</code> pass <code>amount = 145</code> . See the
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
   * <p>For example, for a price of <code>US$ 1.45</code> pass <code>amount = 145</code> . See the
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

  @Override
  public final int hashCode() {
    return Objects.hash(title, description, startParameter, currency, totalAmount);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Invoice other)) return false;
    return Objects.equals(title, other.title)
        && Objects.equals(description, other.description)
        && Objects.equals(startParameter, other.startParameter)
        && Objects.equals(currency, other.currency)
        && totalAmount == other.totalAmount;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("Invoice[title=")
        .append(title)
        .append(", description=")
        .append(description)
        .append(", startParameter=")
        .append(startParameter)
        .append(", currency=")
        .append(currency)
        .append(", totalAmount=")
        .append(totalAmount)
        .append("]");
    return builder.toString();
  }
}
