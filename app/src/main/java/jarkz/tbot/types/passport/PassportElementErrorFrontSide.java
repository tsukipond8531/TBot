package jarkz.tbot.types.passport;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents an issue with the front side of a document. The error is considered resolved when the
 * file with the front side of the document changes.
 *
 * @author Pavel Bialiauski
 */
public class PassportElementErrorFrontSide implements PassportElementError {

  /** Source of {@link PassportElementError}. Always "front_side". */
  protected static final String SOURCE = "front_side";

  private final String source = PassportElementErrorFrontSide.SOURCE;

  @NotNull private String type;

  @SerializedName("file_hash")
  @NotNull
  private String fileHash;

  @NotNull private String message;

  /** Default constructor. */
  public PassportElementErrorFrontSide() {}

  /**
   * Error source, must be <i>front_side</i>.
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
   * Base64-encoded hash of the file with the front side of the document.
   *
   * @return file_hash as String.
   */
  public String getFileHash() {
    return fileHash;
  }

  /**
   * Sets the base64-encoded hash of the file with the front side of the document.
   *
   * @param fileHash the base64-encoded hash of the file with the front side of the document as
   *     String.
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
    if (!(obj instanceof PassportElementErrorFrontSide other)) return false;
    return Objects.equals(source, other.source)
        && Objects.equals(type, other.type)
        && Objects.equals(fileHash, other.fileHash)
        && Objects.equals(message, other.message);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
