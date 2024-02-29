package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Represents an issue with the translated version of a document. The error is considered resolved
 * when a file with the document translation change.
 */
public final class PassportElementErrorTranslationFiles implements PassportElementError {

  public static final String SOURCE = "translation_files";

  /** Error source, must be translation_files */
  @NotNull public final String source = SOURCE;

  /**
   * Type of element of the user's Telegram Passport which has the issue, one of "passport",
   * "driver_license", "identity_card", "internal_passport", "utility_bill", "bank_statement",
   * "rental_agreement", "passport_registration", "temporary_registration"
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
    if (!(obj instanceof PassportElementErrorTranslationFiles other)) return false;
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
        .append("PassportElementErrorTranslationFiles[source=")
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
