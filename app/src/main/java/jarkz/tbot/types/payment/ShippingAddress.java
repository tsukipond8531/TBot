package jarkz.tbot.types.payment;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a shipping address.
 *
 * @author Pavel Bialiauski
 */
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

  /** Default constructor. */
  public ShippingAddress() {}

  /**
   * Two-letter ISO 3166-1 alpha-2 country code.
   *
   * @return country_code as String.
   */
  public String getCountryCode() {
    return countryCode;
  }

  /**
   * Sets the two-letter ISO 3166-1 alpha-2 country code.
   *
   * @param countryCode the two-letter ISO 3166-1 alpha-2 country code as String.
   */
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * State, if applicable.
   *
   * @return state as String.
   */
  public String getState() {
    return state;
  }

  /**
   * Sets the state, if applicable.
   *
   * @param state the state, if applicable, as String.
   */
  public void setState(String state) {
    this.state = state;
  }

  /**
   * City.
   *
   * @return city as String.
   */
  public String getCity() {
    return city;
  }

  /**
   * Sets the city.
   *
   * @param city the city as String.
   */
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * First line for the address.
   *
   * @return street_line1 as String.
   */
  public String getStreetLine1() {
    return streetLine1;
  }

  /**
   * Sets the first line for the address.
   *
   * @param streetLine1 the first line for the address as String.
   */
  public void setStreetLine1(String streetLine1) {
    this.streetLine1 = streetLine1;
  }

  /**
   * Second line for the address.
   *
   * @return street_line2 as String.
   */
  public String getStreetLine2() {
    return streetLine2;
  }

  /**
   * Sets the second line for the address.
   *
   * @param streetLine2 the second line for the address as String.
   */
  public void setStreetLine2(String streetLine2) {
    this.streetLine2 = streetLine2;
  }

  /**
   * Address post code.
   *
   * @return post_code as String.
   */
  public String getPostCode() {
    return postCode;
  }

  /**
   * Sets the address post code.
   *
   * @param postCode the address post code as String.
   */
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
