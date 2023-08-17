package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

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

  public InputLocationMessageContent() {}

  public float getLatitude() {
    return latitude;
  }

  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  public float getLongitude() {
    return longitude;
  }

  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  public Optional<Float> getHorizontalAccuracy() {
    return Optional.of(horizontalAccuracy);
  }

  public void setHorizontalAccuracy(Float horizontalAccuracy) {
    this.horizontalAccuracy = horizontalAccuracy;
  }

  public Optional<Integer> getLivePeriod() {
    return Optional.of(livePeriod);
  }

  public void setLivePeriod(Integer livePeriod) {
    this.livePeriod = livePeriod;
  }

  public Optional<Integer> getHeading() {
    return Optional.of(heading);
  }

  public void setHeading(Integer heading) {
    this.heading = heading;
  }

  public Optional<Integer> getProximityAlertRadius() {
    return Optional.of(proximityAlertRadius);
  }

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
