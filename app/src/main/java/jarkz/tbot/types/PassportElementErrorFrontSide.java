package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents an issue with the front side of a document. The error is considered resolved when the
 * file with the front side of the document changes.
 */
public final class PassportElementErrorFrontSide implements PassportElementError {

  /** Error source, must be front_side */
  @NotNull public String source;

  /**
   * The section of the user's Telegram Passport which has the issue, one of "passport",
   * "driver_license", "identity_card", "internal_passport"
   */
  @NotNull public String type;

  /** Base64-encoded hash of the file with the front side of the document */
  @NotNull
  @SerializedName("file_hash")
  public String fileHash;

  /** Error message */
  @NotNull public String message;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PassportElementErrorFrontSide other)) return false;
    return Objects.equals(source, other.source)
        && Objects.equals(type, other.type)
        && Objects.equals(fileHash, other.fileHash)
        && Objects.equals(message, other.message);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(source, type, fileHash, message);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("PassportElementErrorFrontSide[source=")
        .append(source)
        .append(", type=")
        .append(type)
        .append(", fileHash=")
        .append(fileHash)
        .append(", message=")
        .append(message)
        .append("]");
    return builder.toString();
  }
}
