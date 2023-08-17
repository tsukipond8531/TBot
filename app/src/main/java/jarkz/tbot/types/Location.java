package jarkz.tbot.types;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class Location {

	@NotNull
	private float longitude;

	@NotNull
	private float latitude;

	@SerializedName("horizontal_accuracy")
	private Float horizontalAccuracy;

	@SerializedName("live_period")
	private Integer livePeriod;

	private Integer heading;

	@SerializedName("proximity_alert_radius")
	private Integer proximityAlertRadius;

	public Location() {
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
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
	final public int hashCode() {
		return Objects.hash(longitude, latitude, horizontalAccuracy, livePeriod, heading, proximityAlertRadius);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Location other))
			return false;
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
		builder.append("Location[longitude=").append(longitude)
				.append(", latitude=").append(latitude)
				.append(", horizontalAccuracy=").append(horizontalAccuracy)
				.append(", livePeriod=").append(livePeriod)
				.append(", heading=").append(heading)
				.append(", proximityAlertRadius=").append(proximityAlertRadius).append("]");
		return builder.toString();
	}
}
