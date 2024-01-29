package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents the <a href="https://core.telegram.org/bots/api#inputmessagecontent">content</a> of a
 * venue message to be sent as the result of an inline query.
 *
 * @author Pavel Bialiauski
 */
public class InputVenueMessageContent implements InputMessageContent {

  @NotNull private float latitude;

  @NotNull private float longitude;

  @NotNull private String title;

  @NotNull private String address;

  @SerializedName("foursquare_id")
  private String foursquareId;

  @SerializedName("foursquare_type")
  private String foursquareType;

  @SerializedName("google_place_id")
  private String googlePlaceId;

  @SerializedName("google_place_type")
  private String googlePlaceType;

  /** Default constructor. */
  public InputVenueMessageContent() {}

  /**
   * Latitude of the venue in degrees.
   *
   * @return latitude as float.
   */
  public float getLatitude() {
    return latitude;
  }

  /**
   * Sets the latitude of the venue in degrees.
   *
   * @param latitude the latitude of the venue in degrees as float.
   */
  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  /**
   * Longitude of the venue in degrees.
   *
   * @return longitude as float.
   */
  public float getLongitude() {
    return longitude;
  }

  /**
   * Sets the longitude of the venue in degrees.
   *
   * @param longitude the longitude of the venue in degrees as float.
   */
  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  /**
   * Name of the venue.
   *
   * @return title as String.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the name of the venue.
   *
   * @param title the name of the venue as String.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Address of the venue.
   *
   * @return address as String.
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the address of the venue.
   *
   * @param address the address of the venue as String.
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * <i>Optional.</i> Foursquare identifier of the venue, if known.
   *
   * @return an optional value of foursquare_id as String.
   */
  public Optional<String> getFoursquareId() {
    return Optional.ofNullable(foursquareId);
  }

  /**
   * Sets the foursquare identifier of the venue, if known.
   *
   * @param foursquareId the foursquare identifier of the venue as String or null if it doesn't
   *     known.
   */
  public void setFoursquareId(String foursquareId) {
    this.foursquareId = foursquareId;
  }

  /**
   * <i>Optional.</i> Foursquare type of the venue, if known. (For example,
   * “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.).
   *
   * @return an optional value of foursquare_type as String.
   */
  public Optional<String> getFoursquareType() {
    return Optional.ofNullable(foursquareType);
  }

  /**
   * Sets the foursquare type of the venue, if known. (For example, “arts_entertainment/default”,
   * “arts_entertainment/aquarium” or “food/icecream”.).
   *
   * @param foursquareType the foursquare type of the venue as String or null if it doesn't known.
   */
  public void setFoursquareType(String foursquareType) {
    this.foursquareType = foursquareType;
  }

  /**
   * <i>Optional.</i> Google Places identifier of the venue.
   *
   * @return an optional value of google_place_id as String.
   */
  public Optional<String> getGooglePlaceId() {
    return Optional.ofNullable(googlePlaceId);
  }

  /**
   * Sets the Google Places identifier of the venue.
   *
   * @param googlePlaceId the Google Places identifier of the venue as String or null if it is not
   *     required.
   */
  public void setGooglePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
  }

  /**
   * <i>Optional.</i> Google Places type of the venue. (See <a
   * href="https://developers.google.com/places/web-service/supported_types">supported types</a>.).
   *
   * @return an optional value of google_place_type as String.
   */
  public Optional<String> getGooglePlaceType() {
    return Optional.ofNullable(googlePlaceType);
  }

  /**
   * Sets the Google Places type of the venue. (See <a
   * href="https://developers.google.com/places/web-service/supported_types">supported types</a>.).
   *
   * @param googlePlaceType the Google Places type of the venue as String if it is not required.
   */
  public void setGooglePlaceType(String googlePlaceType) {
    this.googlePlaceType = googlePlaceType;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        latitude,
        longitude,
        title,
        address,
        foursquareId,
        foursquareType,
        googlePlaceId,
        googlePlaceType);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputVenueMessageContent other)) return false;
    return Float.floatToIntBits(latitude) == Float.floatToIntBits(other.latitude)
        && Float.floatToIntBits(longitude) == Float.floatToIntBits(other.longitude)
        && Objects.equals(title, other.title)
        && Objects.equals(address, other.address)
        && Objects.equals(foursquareId, other.foursquareId)
        && Objects.equals(foursquareType, other.foursquareType)
        && Objects.equals(googlePlaceId, other.googlePlaceId)
        && Objects.equals(googlePlaceType, other.googlePlaceType);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InputVenueMessageContent[latitude=")
        .append(latitude)
        .append(", longitude=")
        .append(longitude)
        .append(", title=")
        .append(title)
        .append(", address=")
        .append(address)
        .append(", foursquareId=")
        .append(foursquareId)
        .append(", foursquareType=")
        .append(foursquareType)
        .append(", googlePlaceId=")
        .append(googlePlaceId)
        .append(", googlePlaceType=")
        .append(googlePlaceType)
        .append("]");
    return builder.toString();
  }
}
