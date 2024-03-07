package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object contains basic information about an invoice. */
public final class Invoice {

  /** Product name */
  @NotNull public String title;

  /** Product description */
  @NotNull public String description;

  /** Unique bot deep-linking parameter that can be used to generate this invoice */
  @NotNull
  @SerializedName("start_parameter")
  public String startParameter;

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
  public final int hashCode() {
    return Objects.hash(title, description, startParameter, currency, totalAmount);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
