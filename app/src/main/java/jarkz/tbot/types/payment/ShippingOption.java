package jarkz.tbot.types.payment;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * This object represents one shipping option.
 *
 * @author Pavel Bialiauski
 */
public class ShippingOption {

  @NotNull private String id;

  @NotNull private String title;

  @NotNull private List<LabeledPrice> prices;

  /** Default constructor. */
  public ShippingOption() {}

  /**
   * Shipping option identifier.
   *
   * @return id as String.
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the shipping option identifier.
   *
   * @param id the shipping option identifier as String.
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Option title.
   *
   * @return title as String.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the option title.
   *
   * @param title the option title as String.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * List of price portions.
   *
   * @return prices as {@link List}&lt;{@link LabeledPrice}&gt;.
   */
  public List<LabeledPrice> getPrices() {
    return prices;
  }

  /**
   * Sets the list of price portions.
   *
   * @param prices the list of price portions as {@link List}&lt;{@link LabeledPrice}&gt;.
   */
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
