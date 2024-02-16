package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents a location to which a chat is connected. */
public final class ChatLocation {

  /** The location to which the supergroup is connected. Can't be a live location. */
  @NotNull public Location location;

  /** Location address; 1-64 characters, as defined by the chat owner */
  @NotNull public String address;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatLocation other)) return false;
    return Objects.equals(location, other.location) && Objects.equals(address, other.address);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(location, address);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatLocation[location=")
        .append(location)
        .append(", address=")
        .append(address)
        .append("]");
    return builder.toString();
  }
}
