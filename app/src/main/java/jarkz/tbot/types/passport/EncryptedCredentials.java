package jarkz.tbot.types.passport;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Describes data required for decrypting and authenticating <a
 * href="https://core.telegram.org/bots/api#encryptedpassportelement">EncryptedPassportElement</a>.
 * See the <a href="https://core.telegram.org/passport#receiving-information">Telegram Passport
 * Documentation</a> for a complete description of the data decryption and authentication processes.
 *
 * @author Pavel Bialiauski
 */
public class EncryptedCredentials {

  @NotNull private String data;

  @NotNull private String hash;

  @NotNull private String secret;

  /** Default constructor. */
  public EncryptedCredentials() {}

  /**
   * Base64-encoded encrypted data with unique user's payload, data hashes and secrets required for
   * <a
   * href="https://core.telegram.org/bots/api#encryptedpassportelement">EncryptedPassportElement</a>
   * decryption and authentication.
   *
   * @return data as String.
   */
  public String getData() {
    return data;
  }

  /**
   * Sets the base64-encoded encrypted data with unique user's payload, data hashes and secrets
   * required for <a
   * href="https://core.telegram.org/bots/api#encryptedpassportelement">EncryptedPassportElement</a>
   * decryption and authentication.
   *
   * @param data the base64-encoded encrypted data with unique user's payload, data hashes and
   *     secrets requied for {@link EncryptedPassportElement} decryption and authentication as
   *     String.
   */
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Base64-encoded data hash for data authentication.
   *
   * @return hash as String.
   */
  public String getHash() {
    return hash;
  }

  /**
   * Sets the base64-encoded data hash for data authentication.
   *
   * @param hash the base64-encoded data hash for data authentication as String.
   */
  public void setHash(String hash) {
    this.hash = hash;
  }

  /**
   * Base64-encoded secret, encrypted with the bot's public RSA key, required for data decryption.
   *
   * @return secret as String.
   */
  public String getSecret() {
    return secret;
  }

  /**
   * Sets the base64-encoded secret, encrypted with the bot's public RSA key, required for data
   * decryption.
   *
   * @param secret the base64-encoded secret, encrypted with the bot's public RSA key, required for
   *     data decryption, as String.
   */
  public void setSecret(String secret) {
    this.secret = secret;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(data, hash, secret);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof EncryptedCredentials other)) return false;
    return Objects.equals(data, other.data)
        && Objects.equals(hash, other.hash)
        && Objects.equals(secret, other.secret);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("EncryptedCredentials[data=")
        .append(data)
        .append(", hash=")
        .append(hash)
        .append(", secret=")
        .append(secret)
        .append("]");
    return builder.toString();
  }
}
