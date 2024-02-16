package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** Describes Telegram Passport data shared with the bot by the user. */
public final class PassportData {

  /**
   * Array with information about documents and other Telegram Passport elements that was shared
   * with the bot
   */
  @NotNull public List<EncryptedPassportElement> data;

  /** Encrypted credentials required to decrypt the data */
  @NotNull public EncryptedCredentials credentials;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PassportData other)) return false;
    return Objects.equals(data, other.data) && Objects.equals(credentials, other.credentials);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(data, credentials);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("PassportData[data=")
        .append(data)
        .append(", credentials=")
        .append(credentials)
        .append("]");
    return builder.toString();
  }
}
