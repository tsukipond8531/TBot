package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Represents an issue with a list of scans. The error is considered resolved when the list of files
 * containing the scans changes.
 */
public final class PassportElementErrorFiles implements PassportElementError {

  public static final class Builder {

    private PassportElementErrorFiles buildingType;

    public Builder() {
      buildingType = new PassportElementErrorFiles();
    }

    public Builder setType(String type) {
      buildingType.type = type;
      return this;
    }

    public Builder setFileHashes(List<String> fileHashes) {
      buildingType.fileHashes = fileHashes;
      return this;
    }

    public Builder setMessage(String message) {
      buildingType.message = message;
      return this;
    }

    public PassportElementErrorFiles build() {
      return buildingType;
    }
  }

  public static final String SOURCE = "files";

  /** Error source, must be files */
  @NotNull public final String source = SOURCE;

  /**
   * The section of the user's Telegram Passport which has the issue, one of "utility_bill",
   * "bank_statement", "rental_agreement", "passport_registration", "temporary_registration"
   */
  @NotNull public String type;

  /** List of base64-encoded file hashes */
  @NotNull
  @SerializedName("file_hashes")
  public List<String> fileHashes;

  /** Error message */
  @NotNull public String message;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PassportElementErrorFiles other)) return false;
    return Objects.equals(source, other.source)
        && Objects.equals(type, other.type)
        && Objects.equals(fileHashes, other.fileHashes)
        && Objects.equals(message, other.message);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(source, type, fileHashes, message);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("PassportElementErrorFiles[source=")
        .append(source)
        .append(", type=")
        .append(type)
        .append(", fileHashes=")
        .append(fileHashes)
        .append(", message=")
        .append(message)
        .append("]");
    return builder.toString();
  }
}
