package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** Describes documents or other Telegram Passport elements shared with the bot by the user. */
public final class EncryptedPassportElement {

  /**
   * Element type. One of "personal_details", "passport", "driver_license", "identity_card",
   * "internal_passport", "address", "utility_bill", "bank_statement", "rental_agreement",
   * "passport_registration", "temporary_registration", "phone_number", "email".
   */
  @NotNull public String type;

  /**
   * Optional. Base64-encoded encrypted Telegram Passport element data provided by the user,
   * available for "personal_details", "passport", "driver_license", "identity_card",
   * "internal_passport" and "address" types. Can be decrypted and verified using the accompanying
   * EncryptedCredentials.
   */
  public String data;

  /** Optional. User's verified phone number, available only for "phone_number" type */
  @SerializedName("phone_number")
  public String phoneNumber;

  /** Optional. User's verified email address, available only for "email" type */
  public String email;

  /**
   * Optional. Array of encrypted files with documents provided by the user, available for
   * "utility_bill", "bank_statement", "rental_agreement", "passport_registration" and
   * "temporary_registration" types. Files can be decrypted and verified using the accompanying
   * EncryptedCredentials.
   */
  public List<PassportFile> files;

  /**
   * Optional. Encrypted file with the front side of the document, provided by the user. Available
   * for "passport", "driver_license", "identity_card" and "internal_passport". The file can be
   * decrypted and verified using the accompanying EncryptedCredentials.
   */
  @SerializedName("front_side")
  public PassportFile frontSide;

  /**
   * Optional. Encrypted file with the reverse side of the document, provided by the user. Available
   * for "driver_license" and "identity_card". The file can be decrypted and verified using the
   * accompanying EncryptedCredentials.
   */
  @SerializedName("reverse_side")
  public PassportFile reverseSide;

  /**
   * Optional. Encrypted file with the selfie of the user holding a document, provided by the user;
   * available for "passport", "driver_license", "identity_card" and "internal_passport". The file
   * can be decrypted and verified using the accompanying EncryptedCredentials.
   */
  public PassportFile selfie;

  /**
   * Optional. Array of encrypted files with translated versions of documents provided by the user.
   * Available if requested for "passport", "driver_license", "identity_card", "internal_passport",
   * "utility_bill", "bank_statement", "rental_agreement", "passport_registration" and
   * "temporary_registration" types. Files can be decrypted and verified using the accompanying
   * EncryptedCredentials.
   */
  public List<PassportFile> translation;

  /** Base64-encoded element hash for using in PassportElementErrorUnspecified */
  @NotNull public String hash;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof EncryptedPassportElement other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(data, other.data)
        && Objects.equals(phoneNumber, other.phoneNumber)
        && Objects.equals(email, other.email)
        && Objects.equals(files, other.files)
        && Objects.equals(frontSide, other.frontSide)
        && Objects.equals(reverseSide, other.reverseSide)
        && Objects.equals(selfie, other.selfie)
        && Objects.equals(translation, other.translation)
        && Objects.equals(hash, other.hash);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        type, data, phoneNumber, email, files, frontSide, reverseSide, selfie, translation, hash);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("EncryptedPassportElement[type=")
        .append(type)
        .append(", data=")
        .append(data)
        .append(", phoneNumber=")
        .append(phoneNumber)
        .append(", email=")
        .append(email)
        .append(", files=")
        .append(files)
        .append(", frontSide=")
        .append(frontSide)
        .append(", reverseSide=")
        .append(reverseSide)
        .append(", selfie=")
        .append(selfie)
        .append(", translation=")
        .append(translation)
        .append(", hash=")
        .append(hash)
        .append("]");
    return builder.toString();
  }
}
