package jarkz.tbot.types.document;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Location;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a venue.
 *
 * @author Pavel Bialiauski
 */
public class Venue {

  @NotNull private Location location;

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
  public Venue() {}

  /**
   * Venue location. Can't be a live location.
   *
   * @return location as {@link Location}.
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Sets the venue location. Can't be a live location.
   *
   * @param location the venue location as {@link Location}.
   */
  public void setLocation(Location location) {
    this.location = location;
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
   * <i>Optional.</i> Foursquare identifier of the venue.
   *
   * @return an optional value of foursquare_id as String.
   */
  public Optional<String> getFoursquareId() {
    return Optional.of(foursquareId);
  }

  /**
   * Sets the foursquare identifier of the venue.
   *
   * @param foursquareId the foursquare identifier of the venue as String or null if it doesn't
   *     exists.
   */
  public void setFoursquareId(String foursquareId) {
    this.foursquareId = foursquareId;
  }

  /**
   * <i>Optional.</i> Foursquare type of the venue. (For example, “arts_entertainment/default”,
   * “arts_entertainment/aquarium” or “food/icecream”.).
   *
   * @return an optional value of foursquare_type as String.
   */
  public Optional<String> getFoursquareType() {
    return Optional.of(foursquareType);
  }

  /**
   * Sets the foursquare type of the venue. (For example, “arts_entertainment/default”,
   * “arts_entertainment/aquarium” or “food/icecream”.).
   *
   * @param foursquareType the foursquare type of the venue as String or null if it doesn't exists.
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
    return Optional.of(googlePlaceId);
  }

  /**
   * Sets the Google Places identifier of the venue.
   *
   * @param googlePlaceId the Google Places identifier of the venue as String or null if it doesn't
   *     exists.
   */
  public void setGooglePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
  }

  /**
   * <i>Optional.</i> Google Places type of the venue. (See <a href=
   * "https://developers.google.com/places/web-service/supported_types">supported types</a>.).
   *
   * @return an optional value of google_place_type as String.
   */
  public Optional<String> getGooglePlaceType() {
    return Optional.of(googlePlaceType);
  }

  /**
   * Sets the Google Places type of the venue. (See <a href=
   * "https://developers.google.com/places/web-service/supported_types">supported types</a>.).
   *
   * @param googlePlaceType the Google Places type of the venue as String.
   */
  public void setGooglePlaceType(String googlePlaceType) {
    this.googlePlaceType = googlePlaceType;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        location, title, address, foursquareId, foursquareType, googlePlaceId, googlePlaceType);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Venue other)) return false;
    return Objects.equals(location, other.location)
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
        .append("Venue[location=")
        .append(location)
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
