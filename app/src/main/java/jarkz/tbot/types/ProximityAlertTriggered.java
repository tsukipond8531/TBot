package jarkz.tbot.types;

import java.util.Objects;

import jakarta.validation.constraints.NotNull;

public class ProximityAlertTriggered {

	@NotNull
	private User traveler;

	@NotNull
	private User watcher;

	@NotNull
	private int distance;

	public ProximityAlertTriggered() {
	}

	public User getTraveler() {
		return traveler;
	}

	public void setTraveler(User traveler) {
		this.traveler = traveler;
	}

	public User getWatcher() {
		return watcher;
	}

	public void setWatcher(User watcher) {
		this.watcher = watcher;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(traveler, watcher, distance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ProximityAlertTriggered other))
			return false;
		return Objects.equals(traveler, other.traveler)
				&& Objects.equals(watcher, other.watcher)
				&& distance == other.distance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProximityAlertTriggered[traveler=").append(traveler)
				.append(", watcher=").append(watcher)
				.append(", distance=").append(distance).append("]");
		return builder.toString();
	}
}
