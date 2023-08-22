package jarkz.tbot.types.payment;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import java.util.Objects;

/**
 * This object contains information about an incoming shipping query.
 *
 * @author Pavel Bialiauski
 */
public class ShippingQuery {

  @NotNull private String id;

  @NotNull private User from;

  @SerializedName("invoice_payload")
  @NotNull
  private String invoicePayload;

  @SerializedName("shipping_address")
  @NotNull
  private ShippingAddress shippingAddress;

  /** Default constructor. */
  public ShippingQuery() {}

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
   * User specified shipping address.
   *
   * @return shipping_address as {@link ShippingAddress}.
   */
  public ShippingAddress getShippingAddress() {
    return shippingAddress;
  }

  /**
   * Sets the user specified shipping address.
   *
   * @param shippingAddress the user specified shipping address as {@link ShippingAddress}.
   */
  public void setShippingAddress(ShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(id, from, invoicePayload, shippingAddress);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ShippingQuery other)) return false;
    return Objects.equals(id, other.id)
        && Objects.equals(from, other.from)
        && Objects.equals(invoicePayload, other.invoicePayload)
        && Objects.equals(shippingAddress, other.shippingAddress);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ShippingQuery[id=")
        .append(id)
        .append(", from=")
        .append(from)
        .append(", invoicePayload=")
        .append(invoicePayload)
        .append(", shippingAddress=")
        .append(shippingAddress)
        .append("]");
    return builder.toString();
  }
}
