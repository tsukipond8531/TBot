package jarkz.tbot.types.payment;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

public class ShippingOption {

  @NotNull private String id;

  @NotNull private String title;

  @NotNull private List<LabeledPrice> prices;

  public ShippingOption() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<LabeledPrice> getPrices() {
    return prices;
  }

  public void setPrices(List<LabeledPrice> prices) {
    this.prices = prices;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(id, title, prices);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ShippingOption other)) return false;
    return Objects.equals(id, other.id)
        && Objects.equals(title, other.title)
        && Objects.equals(prices, other.prices);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
