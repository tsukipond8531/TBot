package jarkz.tbot.types.passport;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents an issue in one of the data fields that was provided by the user. The error is
 * considered resolved when the field's value changes.
 *
 * @author Pavel Bialiauski
 */
public class PassportElementErrorDataField implements PassportElementError {

  /** Source of {@link PassportElementError}. Always "data". */
  protected static final String SOURCE = "data";

  private final String source = PassportElementErrorDataField.SOURCE;

  @NotNull private String type;

  @SerializedName("field_name")
  @NotNull
  private String fieldName;

  @SerializedName("data_hash")
  @NotNull
  private String dataHash;

  @NotNull private String message;

  /** Default constructor. */
  public PassportElementErrorDataField() {}

  /**
   * Error source, must be <i>data</i>.
   *
   * @return source as String.
   */
  public String getSource() {
    return source;
  }

  /**
   * The section of the user's Telegram Passport which has the error, one of
   *
   * <ul>
   *   <li>“personal_details”;
   *   <li>“passport”;
   *   <li>“driver_license”;
   *   <li>“identity_card”;
   *   <li>“internal_passport”;
   *   <li>“address”.
   * </ul>
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the section of the user's Telegram Passport which has the error, one of
   *
   * <ul>
   *   <li>“personal_details”;
   *   <li>“passport”;
   *   <li>“driver_license”;
   *   <li>“identity_card”;
   *   <li>“internal_passport”;
   *   <li>“address”.
   * </ul>
   *
   * @param type the section of the user's Telegram Passport which has the error as String.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Name of the data field which has the error.
   *
   * @return field_name as String.
   */
  public String getFieldName() {
    return fieldName;
  }

  /**
   * Sets the name of the data field which has the error.
   *
   * @param fieldName the name of the data field which has the error as String.
   */
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  /**
   * Base64-encoded data hash.
   *
   * @return data_hash as String.
   */
  public String getDataHash() {
    return dataHash;
  }

  /**
   * Sets the base64-encoded data hash.
   *
   * @param dataHash the base64-encoded data hash as String.
   */
  public void setDataHash(String dataHash) {
    this.dataHash = dataHash;
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
    return Objects.hash(source, type, fieldName, dataHash, message);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PassportElementErrorDataField other)) return false;
    return Objects.equals(source, other.source)
        && Objects.equals(type, other.type)
        && Objects.equals(fieldName, other.fieldName)
        && Objects.equals(dataHash, other.dataHash)
        && Objects.equals(message, other.message);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("PassportElementErrorDataField[source=")
        .append(source)
        .append(", type=")
        .append(type)
        .append(", fieldName=")
        .append(fieldName)
        .append(", dataHash=")
        .append(dataHash)
        .append(", message=")
        .append(message)
        .append("]");
    return builder.toString();
  }
}
