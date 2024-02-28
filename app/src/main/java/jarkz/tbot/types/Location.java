package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a point on the map. */
public final class Location {

  /** Latitude as defined by sender */
  @NotNull public float latitude;

  /** Longitude as defined by sender */
  @NotNull public float longitude;

  /** Optional. The radius of uncertainty for the location, measured in meters; 0-1500 */
  @SerializedName("horizontal_accuracy")
  public Float horizontalAccuracy;

  /**
   * Optional. Time relative to the message sending date, during which the location can be updated;
   * in seconds. For active live locations only.
   */
  @SerializedName("live_period")
  public Integer livePeriod;

  /**
   * Optional. The direction in which user is moving, in degrees; 1-360. For active live locations
   * only.
   */
  public Integer heading;

  /**
   * Optional. The maximum distance for proximity alerts about approaching another chat member, in
   * meters. For sent live locations only.
   */
  @SerializedName("proximity_alert_radius")
  public Integer proximityAlertRadius;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Location other)) return false;
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
        .append("Location[latitude=")
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
