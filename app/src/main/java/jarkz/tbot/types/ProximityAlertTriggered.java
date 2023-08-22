package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents the content of a service message, sent whenever a user in the chat
 * triggers a proximity alert set by another user.
 *
 * @author Pavel Bialiauski
 */
public class ProximityAlertTriggered {

  @NotNull private User traveler;

  @NotNull private User watcher;

  @NotNull private int distance;

  /** Default constructor. */
  public ProximityAlertTriggered() {}

  /**
   * User that triggered the alert.
   *
   * @return traveler as {@link User}.
   */
  public User getTraveler() {
    return traveler;
  }

  /**
   * Sets the user that triggered the alert.
   *
   * @param traveler the user that triggered the alert as {@link User}.
   */
  public void setTraveler(User traveler) {
    this.traveler = traveler;
  }

  /**
   * User that set the alert.
   *
   * @return watcher as {@link User}.
   */
  public User getWatcher() {
    return watcher;
  }

  /**
   * Sets the user that set the alert.
   *
   * @param watcher the user that set the alert as {@link User}.
   */
  public void setWatcher(User watcher) {
    this.watcher = watcher;
  }

  /**
   * The distance between the users.
   *
   * @return distance as int.
   */
  public int getDistance() {
    return distance;
  }

  /**
   * Sets the distance between the users.
   *
   * @param distance the distance between the users as int.
   */
  public void setDistance(int distance) {
    this.distance = distance;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(traveler, watcher, distance);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ProximityAlertTriggered other)) return false;
    return Objects.equals(traveler, other.traveler)
        && Objects.equals(watcher, other.watcher)
        && distance == other.distance;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
