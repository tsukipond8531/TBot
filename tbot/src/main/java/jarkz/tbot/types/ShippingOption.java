package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object represents one shipping option. */
public final class ShippingOption {

  public static final class Builder {

    private ShippingOption buildingType;

    public Builder() {
      buildingType = new ShippingOption();
    }

    public Builder setId(String id) {
      buildingType.id = id;
      return this;
    }

    public Builder setTitle(String title) {
      buildingType.title = title;
      return this;
    }

    public Builder setPrices(List<LabeledPrice> prices) {
      buildingType.prices = prices;
      return this;
    }

    public ShippingOption build() {
      return buildingType;
    }
  }

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
