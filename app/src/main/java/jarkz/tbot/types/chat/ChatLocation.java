package jarkz.tbot.types.chat;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Location;
import java.util.Objects;

public class ChatLocation {

  @NotNull private Location location;

  @NotNull private String address;

  public ChatLocation() {}

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
