package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Use this method to change the bot's description, which is shown in the chat with the bot if the
 * chat is empty. Returns True on success.
 */
public final class SetMyDescriptionParameters {

  public static final class Builder {

    private SetMyDescriptionParameters buildingType;

    public Builder() {
      buildingType = new SetMyDescriptionParameters();
    }

    public Builder setDescription(String description) {
      buildingType.description = description;
      return this;
    }

    public Builder setLanguageCode(String languageCode) {
      buildingType.languageCode = languageCode;
      return this;
    }

    public SetMyDescriptionParameters build() {
      return buildingType;
    }
  }

  /**
   * New bot description; 0-512 characters. Pass an empty string to remove the dedicated description
   * for the given language.
   */
  public String description;

  /**
   * A two-letter ISO 639-1 language code. If empty, the description will be applied to all users
   * for whose language there is no dedicated description.
   */
  @SerializedName("language_code")
  public String languageCode;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetMyDescriptionParameters other)) return false;
    return Objects.equals(description, other.description)
        && Objects.equals(languageCode, other.languageCode);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(description, languageCode);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetMyDescriptionParameters[description=")
        .append(description)
        .append(", languageCode=")
        .append(languageCode)
        .append("]");
    return builder.toString();
  }
}
