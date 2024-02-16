package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object represents one shipping option. */
public final class ShippingOption {

  /** Shipping option identifier */
  @NotNull public String id;

  /** Option title */
  @NotNull public String title;

  /** List of price portions */
  @NotNull public List<LabeledPrice> prices;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ShippingOption other)) return false;
    return Objects.equals(id, other.id)
        && Objects.equals(title, other.title)
        && Objects.equals(prices, other.prices);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(id, title, prices);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ShippingOption[id=")
        .append(id)
        .append(", title=")
        .append(title)
        .append(", prices=")
        .append(prices)
        .append("]");
    return builder.toString();
  }
}
