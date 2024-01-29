package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents the <a href="https://core.telegram.org/bots/api#inputmessagecontent">content</a> of a
 * location message to be sent as the result of an inline query.
 *
 * @author Pavel Bialiauski
 */
public class InputLocationMessageContent implements InputMessageContent {

  @NotNull private float latitude;

  @NotNull private float longitude;

  @SerializedName("horizontal_accuracy")
  private Float horizontalAccuracy;

  @SerializedName("live_period")
  @Min(value = 60)
  @Max(value = 86400)
  private Integer livePeriod;

  @Min(value = 1)
  @Max(value = 360)
  private Integer heading;

  @SerializedName("proximity_alert_radius")
  @Min(value = 1)
  @Max(value = 1_000_000)
  private Integer proximityAlertRadius;

  /** Default constructor. */
  public InputLocationMessageContent() {}

  /**
   * Latitude of the location in degrees.
   *
   * @return latitude as float.
   */
  public float getLatitude() {
    return latitude;
  }

  /**
   * Sets the latitude of the location in degrees.
   *
   * @param latitude the latitude of the location in degrees as float.
   */
  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  /**
   * Longitude of the location in degrees.
   *
   * @return longitude as float.
   */
  public float getLongitude() {
    return longitude;
  }

  /**
   * Sets the longitude of the location in degrees.
   *
   * @param longitude the longitude of the location in degrees as float.
   */
  public void setLongitude(float longitude) {
    this.longitude = longitude;
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
   * @param horizontalAccuracy the radius of uncertainty for the location (0-1500 meters) as Float
   *     or null if it is not required.
   */
  public void setHorizontalAccuracy(Float horizontalAccuracy) {
    this.horizontalAccuracy = horizontalAccuracy;
  }

  /**
   * <i>Optional.</i> Period in seconds for which the location can be updated, should be between 60
   * and 86400.
   *
   * @return an optional value of live_period as Integer.
   */
  public Optional<Integer> getLivePeriod() {
    return Optional.ofNullable(livePeriod);
  }

  /**
   * Sets the period in seconds for which the location can be updated, should be between 60 and
   * 86400.
   *
   * @param livePeriod the period in seconds for which the location can be updated (60-86400
   *     seconds) as Integer or null if it is not required.
   */
  public void setLivePeriod(Integer livePeriod) {
    this.livePeriod = livePeriod;
  }

  /**
   * <i>Optional.</i> For live locations, a direction in which the user is moving, in degrees. Must
   * be between 1 and 360 if specified.
   *
   * @return an optional value of heading as Integer.
   */
  public Optional<Integer> getHeading() {
    return Optional.ofNullable(heading);
  }

  /**
   * Sets the direction in which the user is moving, in degrees; for live locations. Must be between
   * 1 and 360 if specified.
   *
   * @param heading the direction in which the user is moving (1-360 degree) as Integer or null if
   *     it is not for live location.
   */
  public void setHeading(Integer heading) {
    this.heading = heading;
  }

  /**
   * <i>Optional.</i> For live locations, a maximum distance for proximity alerts about approaching
   * another chat member, in meters. Must be between 1 and 100000 if specified.
   *
   * @return an optional value of proximity_alert_radius as Integer.
   */
  public Optional<Integer> getProximityAlertRadius() {
    return Optional.ofNullable(proximityAlertRadius);
  }

  /**
   * Sets the maximum distance for proximity alerts about approaching another chat member, in
   * meters; for live locations. Must be between 1 and 100000 if specified.
   *
   * @param proximityAlertRadius the maximum distance for proximity alerts about approaching another
   *     chat member (1-100000 meters) as Integer or null it it is not for live location.
   */
  public void setProximityAlertRadius(Integer proximityAlertRadius) {
    this.proximityAlertRadius = proximityAlertRadius;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        latitude, longitude, horizontalAccuracy, livePeriod, heading, proximityAlertRadius);
  }

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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
