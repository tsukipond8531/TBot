package jarkz.tbot.types.passport;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Represents an issue with the translated version of a document. The error is considered resolved
 * when a file with the document translation change.
 *
 * @author Pavel Bialiauski
 */
public class PassportElementErrorTranslationFiles implements PassportElementError {

  /** Source of {@link PassportElementError}. Always "translation_files". */
  protected static final String SOURCE = "translation_files";

  private final String source = PassportElementErrorTranslationFiles.SOURCE;

  @NotNull private String type;

  @SerializedName("file_hashes")
  @NotNull
  private List<String> fileHashes;

  @NotNull private String message;

  /** Default constructor. */
  public PassportElementErrorTranslationFiles() {}

  /**
   * Error source, must be <i>translation_files</i>.
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
   * List of base64-encoded file hashes.
   *
   * @return file_hashes as {@link List}&lt;String&gt;.
   */
  public List<String> getFileHashes() {
    return fileHashes;
  }

  /**
   * Sets the list of base64-encoded file hashes.
   *
   * @param fileHashes the list of base64-encoded file hashes as {@link List}&lt;String&gt;.
   */
  public void setFileHashes(List<String> fileHashes) {
    this.fileHashes = fileHashes;
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
    return Objects.hash(source, type, fileHashes, message);
  }

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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
