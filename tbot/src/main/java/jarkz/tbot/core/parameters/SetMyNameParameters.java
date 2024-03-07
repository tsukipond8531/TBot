package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** Use this method to change the bot's name. Returns True on success. */
public final class SetMyNameParameters {

  public static final class Builder {

    private SetMyNameParameters buildingType;

    public Builder() {
      buildingType = new SetMyNameParameters();
    }

    public Builder setName(String name) {
      buildingType.name = name;
      return this;
    }

    public Builder setLanguageCode(String languageCode) {
      buildingType.languageCode = languageCode;
      return this;
    }

    public SetMyNameParameters build() {
      return buildingType;
    }
  }

  /**
   * New bot name; 0-64 characters. Pass an empty string to remove the dedicated name for the given
   * language.
   */
  public String name;

  /**
   * A two-letter ISO 639-1 language code. If empty, the name will be shown to all users for whose
   * language there is no dedicated name.
   */
  @SerializedName("language_code")
  public String languageCode;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetMyNameParameters other)) return false;
    return Objects.equals(name, other.name) && Objects.equals(languageCode, other.languageCode);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name, languageCode);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetMyNameParameters[name=")
        .append(name)
        .append(", languageCode=")
        .append(languageCode)
        .append("]");
    return builder.toString();
  }
}
