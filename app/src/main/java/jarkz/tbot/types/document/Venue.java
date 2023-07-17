package jarkz.tbot.types.document;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Location;

public class Venue {

	@NotNull
	private Location location;

	@NotNull
	private String title;

	@NotNull
	private String address;

	@SerializedName("foursquare_id")
	private String foursquareId;

	@SerializedName("foursquare_type")
	private String foursquareType;

	@SerializedName("google_place_id")
	private String googlePlaceId;

	@SerializedName("google_place_type")
	private String googlePlaceType;

	public Venue() {
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Optional<String> getFoursquareId() {
		return Optional.of(foursquareId);
	}

	public void setFoursquareId(String foursquareId) {
		this.foursquareId = foursquareId;
	}

	public Optional<String> getFoursquareType() {
		return Optional.of(foursquareType);
	}

	public void setFoursquareType(String foursquareType) {
		this.foursquareType = foursquareType;
	}

	public Optional<String> getGooglePlaceId() {
		return Optional.of(googlePlaceId);
	}

	public void setGooglePlaceId(String googlePlaceId) {
		this.googlePlaceId = googlePlaceId;
	}

	public Optional<String> getGooglePlaceType() {
		return Optional.of(googlePlaceType);
	}

	public void setGooglePlaceType(String googlePlaceType) {
		this.googlePlaceType = googlePlaceType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, title, address, foursquareId, foursquareType, googlePlaceId, googlePlaceType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Venue other))
			return false;
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
		builder.append("Venue[location=").append(location)
				.append(", title=").append(title)
				.append(", address=").append(address)
				.append(", foursquareId=").append(foursquareId)
				.append(", foursquareType=").append(foursquareType)
				.append(", googlePlaceId=").append(googlePlaceId)
				.append(", googlePlaceType=").append(googlePlaceType).append("]");
		return builder.toString();
	}
}
