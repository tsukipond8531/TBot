package jarkz.tbot.types.passport;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents an issue in an unspecified place. The error is considered resolved when new data is
 * added.
 *
 * @author Pavel Bialiauski
 */
public class PassportElementErrorUnspecified implements PassportElementError {

  /**
   * Source of {@link PassportElementError}. Always "unspecified".
   */
  protected static final String SOURCE = "unspecified";

  private final String source = PassportElementErrorUnspecified.SOURCE;

  @NotNull private String type;

  @SerializedName("element_hash")
  @NotNull
  private String elementHash;

  @NotNull private String message;

  /** Default constructor. */
  public PassportElementErrorUnspecified() {}

  /**
   * Error source, must be <i>unspecified</i>.
   *
   * @return source as String.
   */
  public String getSource() {
    return source;
  }

  /**
   * Type of element of the user's Telegram Passport which has the issue.
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the type of element of the user's Telegram Passport which has the issue.
   *
   * @param type the type of element of the user's Telegram Passport which has the issue as String.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Base64-encoded element hash.
   *
   * @return element_hash as String.
   */
  public String getElementHash() {
    return elementHash;
  }

  /**
   * Sets the base64-encoded element hash.
   *
   * @param elementHash the base64-encoded element hash as String.
   */
  public void setElementHash(String elementHash) {
    this.elementHash = elementHash;
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
    return Objects.hash(source, type, elementHash, message);
  }

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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
