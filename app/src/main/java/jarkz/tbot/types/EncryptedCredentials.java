package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Describes data required for decrypting and authenticating EncryptedPassportElement. See the
 * Telegram Passport Documentation for a complete description of the data decryption and
 * authentication processes.
 */
public final class EncryptedCredentials {

  /**
   * Base64-encoded encrypted JSON-serialized data with unique user's payload, data hashes and
   * secrets required for EncryptedPassportElement decryption and authentication
   */
  @NotNull public String data;

  /** Base64-encoded data hash for data authentication */
  @NotNull public String hash;

  /**
   * Base64-encoded secret, encrypted with the bot's public RSA key, required for data decryption
   */
  @NotNull public String secret;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof EncryptedCredentials other)) return false;
    return Objects.equals(data, other.data)
        && Objects.equals(hash, other.hash)
        && Objects.equals(secret, other.secret);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(data, hash, secret);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
