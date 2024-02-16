package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a portion of the price for goods or services. */
public final class LabeledPrice {

  /** Portion label */
  @NotNull public String label;

  /**
   * Price of the product in the smallest units of the currency (integer, not float/double). For
   * example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json,
   * it shows the number of digits past the decimal point for each currency (2 for the majority of
   * currencies).
   */
  @NotNull public int amount;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof LabeledPrice other)) return false;
    return Objects.equals(label, other.label) && amount == other.amount;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(label, amount);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("LabeledPrice[label=")
        .append(label)
        .append(", amount=")
        .append(amount)
        .append("]");
    return builder.toString();
  }
}
