package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.BotCommand;
import jarkz.tbot.types.BotCommandScope;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to change the list of the bot's commands. See this manual for more details about
 * bot commands. Returns True on success.
 */
public final class SetMyCommandsParameters {

  public static final class Builder {

    private SetMyCommandsParameters buildingType;

    public Builder() {
      buildingType = new SetMyCommandsParameters();
    }

    public Builder setCommands(List<BotCommand> commands) {
      buildingType.commands = commands;
      return this;
    }

    public Builder setScope(BotCommandScope scope) {
      buildingType.scope = scope;
      return this;
    }

    public Builder setLanguageCode(String languageCode) {
      buildingType.languageCode = languageCode;
      return this;
    }

    public SetMyCommandsParameters build() {
      return buildingType;
    }
  }

  /**
   * A JSON-serialized list of bot commands to be set as the list of the bot's commands. At most 100
   * commands can be specified.
   */
  @NotNull public List<BotCommand> commands;

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
    if (!(obj instanceof SetMyCommandsParameters other)) return false;
    return Objects.equals(commands, other.commands)
        && Objects.equals(scope, other.scope)
        && Objects.equals(languageCode, other.languageCode);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(commands, scope, languageCode);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetMyCommandsParameters[commands=")
        .append(commands)
        .append(", scope=")
        .append(scope)
        .append(", languageCode=")
        .append(languageCode)
        .append("]");
    return builder.toString();
  }
}
