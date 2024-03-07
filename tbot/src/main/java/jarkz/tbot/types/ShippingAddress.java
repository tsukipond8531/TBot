package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a shipping address. */
public final class ShippingAddress {

  public static final class Builder {

    private ShippingAddress buildingType;

    public Builder() {
      buildingType = new ShippingAddress();
    }

    public Builder setCountryCode(String countryCode) {
      buildingType.countryCode = countryCode;
      return this;
    }

    public Builder setState(String state) {
      buildingType.state = state;
      return this;
    }

    public Builder setCity(String city) {
      buildingType.city = city;
      return this;
    }

    public Builder setStreetLine1(String streetLine1) {
      buildingType.streetLine1 = streetLine1;
      return this;
    }

    public Builder setStreetLine2(String streetLine2) {
      buildingType.streetLine2 = streetLine2;
      return this;
    }

    public Builder setPostCode(String postCode) {
      buildingType.postCode = postCode;
      return this;
    }

    public ShippingAddress build() {
      return buildingType;
    }
  }

  /** Two-letter ISO 3166-1 alpha-2 country code */
  @NotNull
  @SerializedName("country_code")
  public String countryCode;

  /** State, if applicable */
  @NotNull public String state;

  /** City */
  @NotNull public String city;

  /** First line for the address */
  @NotNull
  @SerializedName("street_line1")
  public String streetLine1;

  /** Second line for the address */
  @NotNull
  @SerializedName("street_line2")
  public String streetLine2;

  /** Address post code */
  @NotNull
  @SerializedName("post_code")
  public String postCode;

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
  public final int hashCode() {
    return Objects.hash(countryCode, state, city, streetLine1, streetLine2, postCode);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
