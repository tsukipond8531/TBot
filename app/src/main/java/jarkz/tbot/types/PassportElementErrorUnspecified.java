package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents an issue in an unspecified place. The error is considered resolved when new data is
 * added.
 */
public final class PassportElementErrorUnspecified implements PassportElementError {

  public static final String SOURCE = "unspecified";

  /** Error source, must be unspecified */
  @NotNull public final String source = SOURCE;

  /** Type of element of the user's Telegram Passport which has the issue */
  @NotNull public String type;

  /** Base64-encoded element hash */
  @NotNull
  @SerializedName("element_hash")
  public String elementHash;

  /** Error message */
  @NotNull public String message;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PassportElementErrorUnspecified other)) return false;
    return Objects.equals(source, other.source)
        && Objects.equals(type, other.type)
        && Objects.equals(elementHash, other.elementHash)
        && Objects.equals(message, other.message);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(source, type, elementHash, message);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("PassportElementErrorUnspecified[source=")
        .append(source)
        .append(", type=")
        .append(type)
        .append(", elementHash=")
        .append(elementHash)
        .append(", message=")
        .append(message)
        .append("]");
    return builder.toString();
  }
}
