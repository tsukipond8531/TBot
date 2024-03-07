package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents the content of a location message to be sent as the result of an inline query. */
public final class InputLocationMessageContent implements InputMessageContent {

  public static final class Builder {

    private InputLocationMessageContent buildingType;

    public Builder() {
      buildingType = new InputLocationMessageContent();
    }

    public Builder setLatitude(float latitude) {
      buildingType.latitude = latitude;
      return this;
    }

    public Builder setLongitude(float longitude) {
      buildingType.longitude = longitude;
      return this;
    }

    public Builder setHorizontalAccuracy(Float horizontalAccuracy) {
      buildingType.horizontalAccuracy = horizontalAccuracy;
      return this;
    }

    public Builder setLivePeriod(Integer livePeriod) {
      buildingType.livePeriod = livePeriod;
      return this;
    }

    public Builder setHeading(Integer heading) {
      buildingType.heading = heading;
      return this;
    }

    public Builder setProximityAlertRadius(Integer proximityAlertRadius) {
      buildingType.proximityAlertRadius = proximityAlertRadius;
      return this;
    }

    public InputLocationMessageContent build() {
      return buildingType;
    }
  }

  /** Latitude of the location in degrees */
  @NotNull public float latitude;

  /** Longitude of the location in degrees */
  @NotNull public float longitude;

  /** Optional. The radius of uncertainty for the location, measured in meters; 0-1500 */
  @SerializedName("horizontal_accuracy")
  public Float horizontalAccuracy;

  /**
   * Optional. Period in seconds for which the location can be updated, should be between 60 and
   * 86400.
   */
  @SerializedName("live_period")
  public Integer livePeriod;

  /**
   * Optional. For live locations, a direction in which the user is moving, in degrees. Must be
   * between 1 and 360 if specified.
   */
  public Integer heading;

  /**
   * Optional. For live locations, a maximum distance for proximity alerts about approaching another
   * chat member, in meters. Must be between 1 and 100000 if specified.
   */
  @SerializedName("proximity_alert_radius")
  public Integer proximityAlertRadius;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputLocationMessageContent other)) return false;
    return Float.floatToIntBits(latitude) == Float.floatToIntBits(other.latitude)
        && Float.floatToIntBits(longitude) == Float.floatToIntBits(other.longitude)
        && Objects.equals(horizontalAccuracy, other.horizontalAccuracy)
        && Objects.equals(livePeriod, other.livePeriod)
        && Objects.equals(heading, other.heading)
        && Objects.equals(proximityAlertRadius, other.proximityAlertRadius);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        latitude, longitude, horizontalAccuracy, livePeriod, heading, proximityAlertRadius);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("InputLocationMessageContent[latitude=")
        .append(latitude)
        .append(", longitude=")
        .append(longitude)
        .append(", horizontalAccuracy=")
        .append(horizontalAccuracy)
        .append(", livePeriod=")
        .append(livePeriod)
        .append(", heading=")
        .append(heading)
        .append(", proximityAlertRadius=")
        .append(proximityAlertRadius)
        .append("]");
    return builder.toString();
  }
}
