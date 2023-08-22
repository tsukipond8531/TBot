package jarkz.tbot.types.payment;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents information about an order.
 *
 * @author Pavel Bialiauski
 */
public class OrderInfo {

  private String name;

  @SerializedName("phone_number")
  private String phoneNumber;

  private String email;

  @SerializedName("shipping_address")
  private ShippingAddress shippingAddress;

  /** Default constructor. */
  public OrderInfo() {}

  /**
   * <i>Optional.</i> User name.
   *
   * @return an optional value of name as String.
   */
  public Optional<String> getName() {
    return Optional.of(name);
  }

  /**
   * Sets the user name.
   *
   * @param name the user name as String or null if the user doesn't provide his name.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * <i>Optional.</i> User's phone number.
   *
   * @return an optional value of phone_number as String.
   */
  public Optional<String> getPhoneNumber() {
    return Optional.of(phoneNumber);
  }

  /**
   * Sets the user's phone number.
   *
   * @param phoneNumber the user's phone number as String or null if the user doesn't provide his
   *     phone.
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * <i>Optional.</i> User email.
   *
   * @return an optional value of email as String.
   */
  public Optional<String> getEmail() {
    return Optional.of(email);
  }

  /**
   * Sets the user email.
   *
   * @param email the user email as String or null if the user doesn't provide his email.
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * <i>Optional.</i> User shipping address.
   *
   * @return an optional value of shipping_address as {@link ShippingAddress}.
   */
  public Optional<ShippingAddress> getShippingAddress() {
    return Optional.of(shippingAddress);
  }

  /**
   * Sets the user shipping address.
   *
   * @param shippingAddress the user shipping address as {@link ShippingAddress} or null if the user
   *     doesn't provide the shipping address.
   */
  public void setShippingAddress(ShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name, phoneNumber, email, shippingAddress);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof OrderInfo other)) return false;
    return Objects.equals(name, other.name)
        && Objects.equals(phoneNumber, other.phoneNumber)
        && Objects.equals(email, other.email)
        && Objects.equals(shippingAddress, other.shippingAddress);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("OrderInfo[name=")
        .append(name)
        .append(", phoneNumber=")
        .append(phoneNumber)
        .append(", email=")
        .append(email)
        .append(", shippingAddress=")
        .append(shippingAddress)
        .append("]");
    return builder.toString();
  }
}
