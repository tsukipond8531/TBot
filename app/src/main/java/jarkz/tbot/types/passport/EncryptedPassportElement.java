package jarkz.tbot.types.passport;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Describes documents or other Telegram Passport elements shared with the bot by the user.
 *
 * @author Pavel Bialiauski
 */
public class EncryptedPassportElement {

  @NotNull private String type;

  private String data;

  @SerializedName("phone_number")
  private String phoneNumber;

  private String email;

  private List<PassportFile> files;

  @SerializedName("front_side")
  private PassportFile frontSide;

  @SerializedName("reverse_side")
  private PassportFile reverseSide;

  private PassportFile selfie;

  private List<PassportFile> translation;

  @NotNull private String hash;

  /** Default constructor. */
  public EncryptedPassportElement() {}

  /**
   * Element type. One of
   *
   * <ul>
   *   <li>“personal_details”;
   *   <li>“passport”;
   *   <li>“driver_license”;
   *   <li>“identity_card”;
   *   <li>“internal_passport”;
   *   <li>“address”;
   *   <li>“utility_bill”;
   *   <li>“bank_statement”;
   *   <li>“rental_agreement”;
   *   <li>“passport_registration”;
   *   <li>“temporary_registration”;
   *   <li>“phone_number”;
   *   <li>“email”.
   * </ul>
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the element type. One of
   *
   * <ul>
   *   <li>“personal_details”;
   *   <li>“passport”;
   *   <li>“driver_license”;
   *   <li>“identity_card”;
   *   <li>“internal_passport”;
   *   <li>“address”;
   *   <li>“utility_bill”;
   *   <li>“bank_statement”;
   *   <li>“rental_agreement”;
   *   <li>“passport_registration”;
   *   <li>“temporary_registration”;
   *   <li>“phone_number”;
   *   <li>“email”.
   * </ul>
   *
   * @param type the element type as String.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * <i>Optional.</i> Base64-encoded encrypted Telegram Passport element data provided by the user,
   * available for types:
   *
   * <ul>
   *   <li>“personal_details”;
   *   <li>“passport”;
   *   <li>“driver_license”;
   *   <li>“identity_card”;
   *   <li>“internal_passport”;
   *   <li>“address”
   * </ul>
   *
   * Can be decrypted and verified using the accompanying <a
   * href="https://core.telegram.org/bots/api#encryptedcredentials">EncryptedCredentials</a>.
   *
   * @return an optional value of data as String.
   */
  public Optional<String> getData() {
    return Optional.ofNullable(data);
  }

  /**
   * Sets the base64-encoded encrypted Telegram Passport element data provided by the user,
   * available for types:
   *
   * <ul>
   *   <li>“personal_details”;
   *   <li>“passport”;
   *   <li>“driver_license”;
   *   <li>“identity_card”;
   *   <li>“internal_passport”;
   *   <li>“address”
   * </ul>
   *
   * Can be decrypted and verified using the accompanying <a
   * href="https://core.telegram.org/bots/api#encryptedcredentials">EncryptedCredentials</a>.
   *
   * @param data the base64-encoded encrypted Telegram Passport element data provided by the user as
   *     String or null if the type is incompatible.
   */
  public void setData(String data) {
    this.data = data;
  }

  /**
   * <i>Optional.</i> User's verified phone number, available only for “phone_number” type.
   *
   * @return an optional value of phone_number as String.
   */
  public Optional<String> getPhoneNumber() {
    return Optional.ofNullable(phoneNumber);
  }

  /**
   * Sets the user's verified phone number, available only for “phone_number” type.
   *
   * @param phoneNumber the user's verified phone number as String or null if it is not for
   *     "phone_number" type.
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * <i>Optional.</i> User's verified email address, available only for “email” type.
   *
   * @return an optional value of email as String.
   */
  public Optional<String> getEmail() {
    return Optional.ofNullable(email);
  }

  /**
   * Sets the user's verified email address, available only for “email” type.
   *
   * @param email the user's verified email address as String or null if it is not for "email" type.
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * <i>Optional.</i> List of encrypted files with documents provided by the user, available for
   * types:
   *
   * <ul>
   *   <li>“utility_bill”;
   *   <li>“bank_statement”;
   *   <li>“rental_agreement”;
   *   <li>“passport_registration”;
   *   <li>“temporary_registration”.
   * </ul>
   *
   * Files can be decrypted and verified using the accompanying <a
   * href="https://core.telegram.org/bots/api#encryptedcredentials">EncryptedCredentials</a>.
   *
   * @return an optional value of files as {@link List}&lt;{@link PassportFile}&gt;.
   */
  public Optional<List<PassportFile>> getFiles() {
    return Optional.ofNullable(files);
  }

  /**
   * Sets the list of encrypted files with documents provided by the user, available for types:
   *
   * <ul>
   *   <li>“utility_bill”;
   *   <li>“bank_statement”;
   *   <li>“rental_agreement”;
   *   <li>“passport_registration”;
   *   <li>“temporary_registration”.
   * </ul>
   *
   * Files can be decrypted and verified using the accompanying <a
   * href="https://core.telegram.org/bots/api#encryptedcredentials">EncryptedCredentials</a>.
   *
   * @param files the list of encrypted files with documents provided by the user as {@link
   *     List}&lt;{@link PassportFile}&gt; or null if the type is incompatible.
   */
  public void setFiles(List<PassportFile> files) {
    this.files = files;
  }

  /**
   * <i>Optional.</i> Encrypted file with the front side of the document, provided by the user.
   * Available for
   *
   * <ul>
   *   <li>“passport”;
   *   <li>“driver_license”;
   *   <li>“identity_card”;
   *   <li>“internal_passport”.
   * </ul>
   *
   * The file can be decrypted and verified using the accompanying <a
   * href="https://core.telegram.org/bots/api#encryptedcredentials">EncryptedCredentials</a>.
   *
   * @return an optional value of front_side as {@link PassportFile}.
   */
  public Optional<PassportFile> getFrontSide() {
    return Optional.ofNullable(frontSide);
  }

  /**
   * Sets the encrypted file with the front side of the document, provided by the user. Available
   * for
   *
   * <ul>
   *   <li>“passport”;
   *   <li>“driver_license”;
   *   <li>“identity_card”;
   *   <li>“internal_passport”.
   * </ul>
   *
   * The file can be decrypted and verified using the accompanying <a
   * href="https://core.telegram.org/bots/api#encryptedcredentials">EncryptedCredentials</a>.
   *
   * @param frontSide the encrypted file with the front side of the document, provided by the user
   *     as {@link PassportFile} or null if the type is incompatible.
   */
  public void setFrontSide(PassportFile frontSide) {
    this.frontSide = frontSide;
  }

  /**
   * <i>Optional.</i> Encrypted file with the reverse side of the document, provided by the user.
   * Available for
   *
   * <ul>
   *   <li>“driver_license”;
   *   <li>“identity_card”.
   * </ul>
   *
   * The file can be decrypted and verified using the accompanying <a
   * href="https://core.telegram.org/bots/api#encryptedcredentials">EncryptedCredentials</a>.
   *
   * @return an optional value of reverse_side as {@link PassportFile}.
   */
  public Optional<PassportFile> getReverseSide() {
    return Optional.ofNullable(reverseSide);
  }

  /**
   * Sets the encrypted file with the reverse side of the document, provided by the user. Available
   * for
   *
   * <ul>
   *   <li>“driver_license”;
   *   <li>“identity_card”.
   * </ul>
   *
   * The file can be decrypted and verified using the accompanying <a
   * href="https://core.telegram.org/bots/api#encryptedcredentials">EncryptedCredentials</a>.
   *
   * @param reverseSide the encrypted file with the reverse side of the document, provided by the
   *     user as {@link PassportFile} or null if the type is incompatible.
   */
  public void setReverseSide(PassportFile reverseSide) {
    this.reverseSide = reverseSide;
  }

  /**
   * <i>Optional.</i> Encrypted file with the selfie of the user holding a document, provided by the
   * user; available for
   *
   * <ul>
   *   <li>“passport”;
   *   <li>“driver_license”;
   *   <li>“identity_card”;
   *   <li>“internal_passport”.
   * </ul>
   *
   * The file can be decrypted and verified using the accompanying <a
   * href="https://core.telegram.org/bots/api#encryptedcredentials">EncryptedCredentials</a>.
   *
   * @return an optional value of selfie as {@link PassportFile}.
   */
  public Optional<PassportFile> getSelfie() {
    return Optional.ofNullable(selfie);
  }

  /**
   * Sets the encrypted file with the selfie of the user holding a document, provided by the user;
   * available for
   *
   * <ul>
   *   <li>“passport”;
   *   <li>“driver_license”;
   *   <li>“identity_card”;
   *   <li>“internal_passport”.
   * </ul>
   *
   * The file can be decrypted and verified using the accompanying <a
   * href="https://core.telegram.org/bots/api#encryptedcredentials">EncryptedCredentials</a>.
   *
   * @param selfie the encrypted file with the selfie of the user holding a document, provided by
   *     the user as {@link PassportFile} or null if the type is incompatible.
   */
  public void setSelfie(PassportFile selfie) {
    this.selfie = selfie;
  }

  /**
   * <i>Optional.</i> List of encrypted files with translated versions of documents provided by the
   * user. Available if requested for these types:
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
   * Files can be decrypted and verified using the accompanying <a
   * href="https://core.telegram.org/bots/api#encryptedcredentials">EncryptedCredentials</a>.
   *
   * @return an optional value of translation as {@link List}&lt;{@link PassportFile}&gt;.
   */
  public Optional<List<PassportFile>> getTranslation() {
    return Optional.ofNullable(translation);
  }

  /**
   * Sets the list of encrypted files with translated versions of documents provided by the user.
   * Available if requested for these types:
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
   * Files can be decrypted and verified using the accompanying <a
   * href="https://core.telegram.org/bots/api#encryptedcredentials">EncryptedCredentials</a>.
   *
   * @param translation the list of encrypted files with translated versions of documents provided
   *     by the user as {@link List}&lt;{@link PassportFile}&gt; or null if the type is
   *     incompatible.
   */
  public void setTranslation(List<PassportFile> translation) {
    this.translation = translation;
  }

  /**
   * Base64-encoded element hash for using in <a
   * href="https://core.telegram.org/bots/api#passportelementerrorunspecified">PassportElementErrorUnspecified</a>.
   *
   * @return hash as String.
   */
  public String getHash() {
    return hash;
  }

  /**
   * Sets the base64-encoded element hash for using in <a
   * href="https://core.telegram.org/bots/api#passportelementerrorunspecified">PassportElementErrorUnspecified</a>.
   *
   * @param hash the base64-encoded element hash for using in {@link
   *     PassportElementErrorUnspecified} as String.
   */
  public void setHash(String hash) {
    this.hash = hash;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        type, data, phoneNumber, email, files, frontSide, reverseSide, selfie, translation, hash);
  }

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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
