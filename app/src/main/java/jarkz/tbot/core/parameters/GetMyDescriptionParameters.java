package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Use this method to get the current bot description for the given user language. Returns
 * BotDescription on success.
 */
public final class GetMyDescriptionParameters {

  /** A two-letter ISO 639-1 language code or an empty string */
  @SerializedName("language_code")
  public String languageCode;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetMyDescriptionParameters other)) return false;
    return Objects.equals(languageCode, other.languageCode);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(languageCode);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("GetMyDescriptionParameters[languageCode=").append(languageCode).append("]");
    return builder.toString();
  }
}
