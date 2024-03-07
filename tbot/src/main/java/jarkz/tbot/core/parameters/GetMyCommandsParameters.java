package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jarkz.tbot.types.BotCommandScope;
import java.util.Objects;

/**
 * Use this method to get the current list of the bot's commands for the given scope and user
 * language. Returns an Array of BotCommand objects. If commands aren't set, an empty list is
 * returned.
 */
public final class GetMyCommandsParameters {

  public static final class Builder {

    private GetMyCommandsParameters buildingType;

    public Builder() {
      buildingType = new GetMyCommandsParameters();
    }

    public Builder setScope(BotCommandScope scope) {
      buildingType.scope = scope;
      return this;
    }

    public Builder setLanguageCode(String languageCode) {
      buildingType.languageCode = languageCode;
      return this;
    }

    public GetMyCommandsParameters build() {
      return buildingType;
    }
  }

  /** A JSON-serialized object, describing scope of users. Defaults to BotCommandScopeDefault. */
  public BotCommandScope scope;

  /** A two-letter ISO 639-1 language code or an empty string */
  @SerializedName("language_code")
  public String languageCode;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetMyCommandsParameters other)) return false;
    return Objects.equals(scope, other.scope) && Objects.equals(languageCode, other.languageCode);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(scope, languageCode);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("GetMyCommandsParameters[scope=")
        .append(scope)
        .append(", languageCode=")
        .append(languageCode)
        .append("]");
    return builder.toString();
  }
}
