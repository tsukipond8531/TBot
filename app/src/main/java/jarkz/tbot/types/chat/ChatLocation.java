package jarkz.tbot.types.chat;

import java.util.Objects;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Location;

public class ChatLocation {

	@NotNull
	private Location location;

	@NotNull
	private String address;

	public ChatLocation() {
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, address);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ChatLocation other))
			return false;
		return Objects.equals(location, other.location) && Objects.equals(address, other.address);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChatLocation[location=").append(location).append(", address=").append(address).append("]");
		return builder.toString();
	}
}
