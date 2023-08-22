package jarkz.tbot.types.chat;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Location;
import java.util.Objects;

/**
 * Represents a location to which a chat is connected.
 *
 * @author Pavel Bialiauski
 */
public class ChatLocation {

  @NotNull private Location location;

  @NotNull private String address;

  /**
   * Default constructor.
   */
  public ChatLocation() {}

  /**
   * The location to which the supergroup is connected. Can't be a live location.
   *
   * @return location as {@link Location}.
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Sets the location to which the supergroup is connected. Can't be a live location.
   *
   * @param location the location to which the supergroup is connected as {@link Location}.
   */
  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * Location address; 1-64 characters, as defined by the chat owner.
   *
   * @return address as String.
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the location address; 1-64 characters, as defined by the chat owner.
   *
   * @param address the location address (1-64 characters), which defined by the chat owner, as
   *     String.
   */
  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(location, address);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatLocation other)) return false;
    return Objects.equals(location, other.location) && Objects.equals(address, other.address);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ChatLocation[location=")
        .append(location)
        .append(", address=")
        .append(address)
        .append("]");
    return builder.toString();
  }
}
