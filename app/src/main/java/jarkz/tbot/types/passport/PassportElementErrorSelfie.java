package jarkz.tbot.types.passport;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents an issue with the selfie with a document. The error is considered resolved when the
 * file with the selfie changes.
 *
 * @author Pavel Bialiauski
 */
public class PassportElementErrorSelfie implements PassportElementError {

  /** Source of {@link PassportElementError}. Always "selfie". */
  protected static final String SOURCE = "selfie";

  private final String source = PassportElementErrorSelfie.SOURCE;

  @NotNull private String type;

  @SerializedName("file_hash")
  @NotNull
  private String fileHash;

  @NotNull private String message;

  /** Default constructor. */
  public PassportElementErrorSelfie() {}

  /**
   * Error source, must be <i>selfie</i>.
   *
   * @return source as String.
   */
  public String getSource() {
    return source;
  }

  /**
   * The section of the user's Telegram Passport which has the issue, one of
   *
   * <ul>
   *   <li>“passport”;
   *   <li>“driver_license”;
   *   <li>“identity_card”;
   *   <li>“internal_passport”.
   * </ul>
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the section of the user's Telegram Passport which has the issue, one of
   *
   * <ul>
   *   <li>“passport”;
   *   <li>“driver_license”;
   *   <li>“identity_card”;
   *   <li>“internal_passport”.
   * </ul>
   *
   * @param type the section of the user's Telegram Passport which has the issue as String.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Base64-encoded hash of the file with the selfie.
   *
   * @return file_hash as String.
   */
  public String getFileHash() {
    return fileHash;
  }

  /**
   * Sets the base64-encoded hash of the file with the selfie.
   *
   * @param fileHash the base64-encoded hash of the file with the selfie as String.
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
    if (!(obj instanceof PassportElementErrorSelfie other)) return false;
    return Objects.equals(source, other.source)
        && Objects.equals(type, other.type)
        && Objects.equals(fileHash, other.fileHash)
        && Objects.equals(message, other.message);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("PassportElementErrorSelfie[source=")
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
