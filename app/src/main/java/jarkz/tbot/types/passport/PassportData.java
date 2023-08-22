package jarkz.tbot.types.passport;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Describes Telegram Passport data shared with the bot by the user.
 *
 * @author Pavel Bialiauski
 */
public class PassportData {

  @NotNull private List<EncryptedPassportElement> data;

  @NotNull private EncryptedCredentials credentials;

  /** Default constructor. */
  public PassportData() {}

  /**
   * List with information about documents and other Telegram Passport elements that was shared
   * with the bot.
   *
   * @return data as {@link List}&lt;{@link EncryptedPassportElement}&gt;.
   */
  public List<EncryptedPassportElement> getData() {
    return data;
  }

  /**
   * Sets the list with information about documents and other Telegram Passport elements that was
   * shared with the bot.
   *
   * @param data the list with information about documents and other Telegram Passport elements that
   *     was shared with the bot as {@link List}&lt;{@link EncryptedPassportElement}&gt;.
   */
  public void setData(List<EncryptedPassportElement> data) {
    this.data = data;
  }

  /**
   * Encrypted credentials required to decrypt the data.
   *
   * @return credentials as {@link EncryptedCredentials}.
   */
  public EncryptedCredentials getCredentials() {
    return credentials;
  }

  /**
   * Sets the encrypted credentials required to decrypt the data.
   *
   * @param credentials the encrypted credentials required to decrypt the data as {@link
   *     EncryptedCredentials}.
   */
  public void setCredentials(EncryptedCredentials credentials) {
    this.credentials = credentials;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(data, credentials);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PassportData other)) return false;
    return Objects.equals(data, other.data) && Objects.equals(credentials, other.credentials);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("PassportData[data=")
        .append(data)
        .append(", credentials=")
        .append(credentials)
        .append("]");
    return builder.toString();
  }
}
