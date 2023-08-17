package jarkz.tbot.types.payment;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import java.util.Optional;

public class OrderInfo {

  private String name;

  @SerializedName("phone_number")
  private String phoneNumber;

  private String email;

  @SerializedName("shipping_address")
  private ShippingAddress shippingAddress;

  public OrderInfo() {}

  public Optional<String> getName() {
    return Optional.of(name);
  }

  public void setName(String name) {
    this.name = name;
  }

  public Optional<String> getPhoneNumber() {
    return Optional.of(phoneNumber);
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Optional<String> getEmail() {
    return Optional.of(email);
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Optional<ShippingAddress> getShippingAddress() {
    return Optional.of(shippingAddress);
  }

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
