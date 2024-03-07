package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents an issue with the reverse side of a document. The error is considered resolved when
 * the file with reverse side of the document changes.
 */
public final class PassportElementErrorReverseSide implements PassportElementError {

  public static final class Builder {

    private PassportElementErrorReverseSide buildingType;

    public Builder() {
      buildingType = new PassportElementErrorReverseSide();
    }

    public Builder setType(String type) {
      buildingType.type = type;
      return this;
    }

    public Builder setFileHash(String fileHash) {
      buildingType.fileHash = fileHash;
      return this;
    }

    public Builder setMessage(String message) {
      buildingType.message = message;
      return this;
    }

    public PassportElementErrorReverseSide build() {
      return buildingType;
    }
  }

  public static final String SOURCE = "reverse_side";

  /** Error source, must be reverse_side */
  @NotNull public final String source = SOURCE;

  /**
   * The section of the user's Telegram Passport which has the issue, one of "driver_license",
   * "identity_card"
   */
  @NotNull public String type;

  /** Base64-encoded hash of the file with the reverse side of the document */
  @NotNull
  @SerializedName("file_hash")
  public String fileHash;

  /** Error message */
  @NotNull public String message;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PassportElementErrorReverseSide other)) return false;
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
        .append("PassportElementErrorReverseSide[source=")
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
