package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** This object represents information about an order. */
public final class OrderInfo {

  public static final class Builder {

    private OrderInfo buildingType;

    public Builder() {
      buildingType = new OrderInfo();
    }

    public Builder setName(String name) {
      buildingType.name = name;
      return this;
    }

    public Builder setPhoneNumber(String phoneNumber) {
      buildingType.phoneNumber = phoneNumber;
      return this;
    }

    public Builder setEmail(String email) {
      buildingType.email = email;
      return this;
    }

    public Builder setShippingAddress(ShippingAddress shippingAddress) {
      buildingType.shippingAddress = shippingAddress;
      return this;
    }

    public OrderInfo build() {
      return buildingType;
    }
  }

  /** Optional. User name */
  public String name;

  /** Optional. User's phone number */
  @SerializedName("phone_number")
  public String phoneNumber;

  /** Optional. User email */
  public String email;

  /** Optional. User shipping address */
  @SerializedName("shipping_address")
  public ShippingAddress shippingAddress;

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
  public final int hashCode() {
    return Objects.hash(name, phoneNumber, email, shippingAddress);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
