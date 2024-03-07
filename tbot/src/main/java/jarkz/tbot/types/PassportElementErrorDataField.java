package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents an issue in one of the data fields that was provided by the user. The error is
 * considered resolved when the field's value changes.
 */
public final class PassportElementErrorDataField implements PassportElementError {

  public static final class Builder {

    private PassportElementErrorDataField buildingType;

    public Builder() {
      buildingType = new PassportElementErrorDataField();
    }

    public Builder setType(String type) {
      buildingType.type = type;
      return this;
    }

    public Builder setFieldName(String fieldName) {
      buildingType.fieldName = fieldName;
      return this;
    }

    public Builder setDataHash(String dataHash) {
      buildingType.dataHash = dataHash;
      return this;
    }

    public Builder setMessage(String message) {
      buildingType.message = message;
      return this;
    }

    public PassportElementErrorDataField build() {
      return buildingType;
    }
  }

  public static final String SOURCE = "data";

  /** Error source, must be data */
  @NotNull public final String source = SOURCE;

  /**
   * The section of the user's Telegram Passport which has the error, one of "personal_details",
   * "passport", "driver_license", "identity_card", "internal_passport", "address"
   */
  @NotNull public String type;

  /** Name of the data field which has the error */
  @NotNull
  @SerializedName("field_name")
  public String fieldName;

  /** Base64-encoded data hash */
  @NotNull
  @SerializedName("data_hash")
  public String dataHash;

  /** Error message */
  @NotNull public String message;

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
  public final int hashCode() {
    return Objects.hash(source, type, fieldName, dataHash, message);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
