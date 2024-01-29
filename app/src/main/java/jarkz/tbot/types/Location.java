package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a point on the map.
 *
 * @author Pavel Bialiauski
 */
public class Location {

  @NotNull private float longitude;

  @NotNull private float latitude;

  @SerializedName("horizontal_accuracy")
  private Float horizontalAccuracy;

  @SerializedName("live_period")
  private Integer livePeriod;

  private Integer heading;

  @SerializedName("proximity_alert_radius")
  private Integer proximityAlertRadius;

  /** Default constructor. */
  public Location() {}

  /**
   * Longitude as defined by sender.
   *
   * @return longitude as float.
   */
  public float getLongitude() {
    return longitude;
  }

  /**
   * Sets the longitude as defined by sender.
   *
   * @param longitude the longitude as float.
   */
  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  /**
   * Latitude as defined by sender.
   *
   * @return latitude as float.
   */
  public float getLatitude() {
    return latitude;
  }

  /**
   * Sets the latitude as defined by sender.
   *
   * @param latitude the latitude as float.
   */
  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  /**
   * <i>Optional.</i> The radius of uncertainty for the location, measured in meters; 0-1500.
   *
   * @return an optional value of horizontal_accuracy as Float.
   */
  public Optional<Float> getHorizontalAccuracy() {
    return Optional.ofNullable(horizontalAccuracy);
  }

  /**
   * Sets the radius of uncertainty for the location, measured in meters; 0-1500.
   *
   * @param horizontalAccuracy the radius of uncertainty for the location (0 - 1500 meters) as Float
   *     or null if it is not required.
   */
  public void setHorizontalAccuracy(Float horizontalAccuracy) {
    this.horizontalAccuracy = horizontalAccuracy;
  }

  /**
   * <i>Optional.</i> Time relative to the message sending date, during which the location can be
   * updated; in seconds. For active live locations only.
   *
   * @return an optional value of live_period as Integer.
   */
  public Optional<Integer> getLivePeriod() {
    return Optional.ofNullable(livePeriod);
  }

  /**
   * Sets the time relative to the message sending date, during which the location can be updated;
   * in seconds. For active live locations only.
   *
   * @param livePeriod the time relative to the message sending date, during which the location can
   *     be updated (in seconds), as Integer or null if it not is active live location.
   */
  public void setLivePeriod(Integer livePeriod) {
    this.livePeriod = livePeriod;
  }

  /**
   * <i>Optional.</i> The direction in which user is moving, in degrees; 1-360. For active live
   * locations only.
   *
   * @return an optional value of heading as Integer.
   */
  public Optional<Integer> getHeading() {
    return Optional.ofNullable(heading);
  }

  /**
   * Sets the direction in which user is moving, in degrees; 1-360. For active live locations only.
   *
   * @param heading the direction in which user is moving (1-360 degrees) as Integer or null if it
   *     not is active live location.
   */
  public void setHeading(Integer heading) {
    this.heading = heading;
  }

  /**
   * <i>Optional.</i> The maximum distance for proximity alerts about approaching another chat
   * member, in meters. For sent live locations only.
   *
   * @return an optional value of proximity_alert_radius as Integer.
   */
  public Optional<Integer> getProximityAlertRadius() {
    return Optional.ofNullable(proximityAlertRadius);
  }

  /**
   * Sets the maximum distance for proximity alerts about approaching another chat member, in
   * meters. For sent live locations only.
   *
   * @param proximityAlertRadius the maximum distance for proximity alerts about approaching another
   *     chat member (in meters) as Integer or null if it is not live location.
   */
  public void setProximityAlertRadius(Integer proximityAlertRadius) {
    this.proximityAlertRadius = proximityAlertRadius;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        longitude, latitude, horizontalAccuracy, livePeriod, heading, proximityAlertRadius);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Location other)) return false;
    return Float.floatToIntBits(longitude) == Float.floatToIntBits(other.longitude)
        && Float.floatToIntBits(latitude) == Float.floatToIntBits(other.latitude)
        && Objects.equals(horizontalAccuracy, other.horizontalAccuracy)
        && Objects.equals(livePeriod, other.livePeriod)
        && Objects.equals(heading, other.heading)
        && Objects.equals(proximityAlertRadius, other.proximityAlertRadius);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("Location[longitude=")
        .append(longitude)
        .append(", latitude=")
        .append(latitude)
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
