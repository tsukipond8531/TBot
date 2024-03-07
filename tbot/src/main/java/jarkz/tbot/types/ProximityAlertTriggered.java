package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents the content of a service message, sent whenever a user in the chat
 * triggers a proximity alert set by another user.
 */
public final class ProximityAlertTriggered {

  public static final class Builder {

    private ProximityAlertTriggered buildingType;

    public Builder() {
      buildingType = new ProximityAlertTriggered();
    }

    public Builder setTraveler(User traveler) {
      buildingType.traveler = traveler;
      return this;
    }

    public Builder setWatcher(User watcher) {
      buildingType.watcher = watcher;
      return this;
    }

    public Builder setDistance(int distance) {
      buildingType.distance = distance;
      return this;
    }

    public ProximityAlertTriggered build() {
      return buildingType;
    }
  }

  /** User that triggered the alert */
  @NotNull public User traveler;

  /** User that set the alert */
  @NotNull public User watcher;

  /** The distance between the users */
  @NotNull public int distance;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ProximityAlertTriggered other)) return false;
    return Objects.equals(traveler, other.traveler)
        && Objects.equals(watcher, other.watcher)
        && distance == other.distance;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(traveler, watcher, distance);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ProximityAlertTriggered[traveler=")
        .append(traveler)
        .append(", watcher=")
        .append(watcher)
        .append(", distance=")
        .append(distance)
        .append("]");
    return builder.toString();
  }
}
