package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a venue. */
public final class Venue {

  public static final class Builder {

    private Venue buildingType;

    public Builder() {
      buildingType = new Venue();
    }

    public Builder setLocation(Location location) {
      buildingType.location = location;
      return this;
    }

    public Builder setTitle(String title) {
      buildingType.title = title;
      return this;
    }

    public Builder setAddress(String address) {
      buildingType.address = address;
      return this;
    }

    public Builder setFoursquareId(String foursquareId) {
      buildingType.foursquareId = foursquareId;
      return this;
    }

    public Builder setFoursquareType(String foursquareType) {
      buildingType.foursquareType = foursquareType;
      return this;
    }

    public Builder setGooglePlaceId(String googlePlaceId) {
      buildingType.googlePlaceId = googlePlaceId;
      return this;
    }

    public Builder setGooglePlaceType(String googlePlaceType) {
      buildingType.googlePlaceType = googlePlaceType;
      return this;
    }

    public Venue build() {
      return buildingType;
    }
  }

  /** Venue location. Can't be a live location */
  @NotNull public Location location;

  /** Name of the venue */
  @NotNull public String title;

  /** Address of the venue */
  @NotNull public String address;

  /** Optional. Foursquare identifier of the venue */
  @SerializedName("foursquare_id")
  public String foursquareId;

  /**
   * Optional. Foursquare type of the venue. (For example, "arts_entertainment/default",
   * "arts_entertainment/aquarium" or "food/icecream".)
   */
  @SerializedName("foursquare_type")
  public String foursquareType;

  /** Optional. Google Places identifier of the venue */
  @SerializedName("google_place_id")
  public String googlePlaceId;

  /** Optional. Google Places type of the venue. (See supported types.) */
  @SerializedName("google_place_type")
  public String googlePlaceType;

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
  public final int hashCode() {
    return Objects.hash(
        location, title, address, foursquareId, foursquareType, googlePlaceId, googlePlaceType);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
