package jarkz.tbot.types.passport;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents an issue with one of the files that constitute the translation of a document. The
 * error is considered resolved when the file changes.
 *
 * @author Pavel Bialiauski
 */
public class PassportElementErrorTranslationFile implements PassportElementError {

  /** Source of {@link PassportElementError}. Always "translation_file". */
  protected static final String SOURCE = "translation_file";

  private final String source = PassportElementErrorTranslationFile.SOURCE;

  @NotNull private String type;

  @SerializedName("file_hash")
  @NotNull
  private String fileHash;

  @NotNull private String message;

  /** Default constructor. */
  public PassportElementErrorTranslationFile() {}

  /**
   * Error source, must be <i>translation_file</i>.
   *
   * @return source as String.
   */
  public String getSource() {
    return source;
  }

  /**
   * Type of element of the user's Telegram Passport which has the issue, one of
   *
   * <ul>
   *   <li>“passport”;
   *   <li>“driver_license”;
   *   <li>“identity_card”;
   *   <li>“internal_passport”;
   *   <li>“utility_bill”;
   *   <li>“bank_statement”;
   *   <li>“rental_agreement”;
   *   <li>“passport_registration”;
   *   <li>“temporary_registration”.
   * </ul>
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the type of element of the user's Telegram Passport which has the issue, one of
   *
   * <ul>
   *   <li>“passport”;
   *   <li>“driver_license”;
   *   <li>“identity_card”;
   *   <li>“internal_passport”;
   *   <li>“utility_bill”;
   *   <li>“bank_statement”;
   *   <li>“rental_agreement”;
   *   <li>“passport_registration”;
   *   <li>“temporary_registration”.
   * </ul>
   *
   * @param type the type of element of the user's Telegram Passport which has the issue as String.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Base64-encoded file hash.
   *
   * @return file_hash as String.
   */
  public String getFileHash() {
    return fileHash;
  }

  /**
   * Sets the base64-encoded file hash.
   *
   * @param fileHash the base64-encoded file hash as String.
   */
  public void setFileHash(String fileHash) {
    this.fileHash = fileHash;
  }

  /**
   * Error message.
   *
   * @return message as String.
   */
  public String getMessage() {
    return message;
  }

  /**
   * Sets the error message.
   *
   * @param message the error message as String.
   */
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(source, type, fileHash, message);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PassportElementErrorTranslationFile other)) return false;
    return Objects.equals(source, other.source)
        && Objects.equals(type, other.type)
        && Objects.equals(fileHash, other.fileHash)
        && Objects.equals(message, other.message);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("PassportElementErrorTranslationFile[source=")
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
