package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jarkz.tbot.types.BotCommandScope;
import java.util.Objects;

/**
 * Use this method to delete the list of the bot's commands for the given scope and user language.
 * After deletion, higher level commands will be shown to affected users. Returns True on success.
 */
public final class DeleteMyCommandsParameters {

  /**
   * A JSON-serialized object, describing scope of users for which the commands are relevant.
   * Defaults to BotCommandScopeDefault.
   */
  public BotCommandScope scope;

  /**
   * A two-letter ISO 639-1 language code. If empty, commands will be applied to all users from the
   * given scope, for whose language there are no dedicated commands
   */
  @SerializedName("language_code")
  public String languageCode;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof DeleteMyCommandsParameters other)) return false;
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
        .append("DeleteMyCommandsParameters[scope=")
        .append(scope)
        .append(", languageCode=")
        .append(languageCode)
        .append("]");
    return builder.toString();
  }
}
