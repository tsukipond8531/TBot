package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents an issue with a document scan. The error is considered resolved when the file with the
 * document scan changes.
 */
public final class PassportElementErrorFile implements PassportElementError {

  public static final class Builder {

    private PassportElementErrorFile buildingType;

    public Builder() {
      buildingType = new PassportElementErrorFile();
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

    public PassportElementErrorFile build() {
      return buildingType;
    }
  }

  public static final String SOURCE = "file";

  /** Error source, must be file */
  @NotNull public final String source = SOURCE;

  /**
   * The section of the user's Telegram Passport which has the issue, one of "utility_bill",
   * "bank_statement", "rental_agreement", "passport_registration", "temporary_registration"
   */
  @NotNull public String type;

  /** Base64-encoded file hash */
  @NotNull
  @SerializedName("file_hash")
  public String fileHash;

  /** Error message */
  @NotNull public String message;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PassportElementErrorFile other)) return false;
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
        .append("PassportElementErrorFile[source=")
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
