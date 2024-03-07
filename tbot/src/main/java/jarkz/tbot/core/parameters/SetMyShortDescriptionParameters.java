package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Use this method to change the bot's short description, which is shown on the bot's profile page
 * and is sent together with the link when users share the bot. Returns True on success.
 */
public final class SetMyShortDescriptionParameters {

  /**
   * New short description for the bot; 0-120 characters. Pass an empty string to remove the
   * dedicated short description for the given language.
   */
  @SerializedName("short_description")
  public String shortDescription;

  /**
   * A two-letter ISO 639-1 language code. If empty, the short description will be applied to all
   * users for whose language there is no dedicated short description.
   */
  @SerializedName("language_code")
  public String languageCode;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetMyShortDescriptionParameters other)) return false;
    return Objects.equals(shortDescription, other.shortDescription)
        && Objects.equals(languageCode, other.languageCode);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(shortDescription, languageCode);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetMyShortDescriptionParameters[shortDescription=")
        .append(shortDescription)
        .append(", languageCode=")
        .append(languageCode)
        .append("]");
    return builder.toString();
  }
}
