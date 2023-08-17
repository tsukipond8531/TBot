package jarkz.tbot.types.payment;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

public class ShippingAddress {

  @SerializedName("country_code")
  @NotNull
  private String countryCode;

  @NotNull private String state;

  @NotNull private String city;

  @SerializedName("street_line1")
  @NotNull
  private String streetLine1;

  @SerializedName("street_line2")
  @NotNull
  private String streetLine2;

  @SerializedName("post_code")
  @NotNull
  private String postCode;

  public ShippingAddress() {}

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreetLine1() {
    return streetLine1;
  }

  public void setStreetLine1(String streetLine1) {
    this.streetLine1 = streetLine1;
  }

  public String getStreetLine2() {
    return streetLine2;
  }

  public void setStreetLine2(String streetLine2) {
    this.streetLine2 = streetLine2;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(countryCode, state, city, streetLine1, streetLine2, postCode);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ShippingAddress other)) return false;
    return Objects.equals(countryCode, other.countryCode)
        && Objects.equals(state, other.state)
        && Objects.equals(city, other.city)
        && Objects.equals(streetLine1, other.streetLine1)
        && Objects.equals(streetLine2, other.streetLine2)
        && Objects.equals(postCode, other.postCode);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ShippingAddress[countryCode=")
        .append(countryCode)
        .append(", state=")
        .append(state)
        .append(", city=")
        .append(city)
        .append(", streetLine1=")
        .append(streetLine1)
        .append(", streetLine2=")
        .append(streetLine2)
        .append(", postCode=")
        .append(postCode)
        .append("]");
    return builder.toString();
  }
}
