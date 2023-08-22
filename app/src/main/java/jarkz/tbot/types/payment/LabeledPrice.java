package jarkz.tbot.types.payment;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a portion of the price for goods or services.
 *
 * @author Pavel Bialiauski
 */
public class LabeledPrice {

  @NotNull private String label;

  @NotNull private int amount;

  /** Default constructor. */
  public LabeledPrice() {}

  /**
   * Portion label.
   *
   * @return label as String.
   */
  public String getLabel() {
    return label;
  }

  /**
   * Sets the portion label.
   *
   * @param label the portion label as String.
   */
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Price of the product in the <i>smallest units</i> of the <a
   * href="https://core.telegram.org/bots/payments#supported-currencies">currency</a> (integer,
   * <strong>not</strong> float/double).
   *
   * <p>For example, for a price of <code>US$ 1.45</code> pass <code>amount = 145</code>. See the
   * <i>exp</i> parameter in <a
   * href="https://core.telegram.org/bots/payments/currencies.json">currencies.json</a>, it shows
   * the number of digits past the decimal point for each currency (2 for the majority of
   * currencies).
   *
   * @return amount as int.
   */
  public int getAmount() {
    return amount;
  }

  /**
   * Sets the price of the product in the <i>smallest units</i> of the <a
   * href="https://core.telegram.org/bots/payments#supported-currencies">currency</a> (integer,
   * <strong>not</strong> float/double).
   *
   * <p>For example, for a price of <code>US$ 1.45</code> pass <code>amount = 145</code>. See the
   * <i>exp</i> parameter in <a
   * href="https://core.telegram.org/bots/payments/currencies.json">currencies.json</a>, it shows
   * the number of digits past the decimal point for each currency (2 for the majority of
   * currencies).
   *
   * @param amount the price of the product in the currency as int.
   */
  public void setAmount(int amount) {
    this.amount = amount;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(label, amount);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof LabeledPrice other)) return false;
    return Objects.equals(label, other.label) && amount == other.amount;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("LabeledPrice[label=")
        .append(label)
        .append(", amount=")
        .append(amount)
        .append("]");
    return builder.toString();
  }
}
