package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents the bot's description. */
public final class BotDescription {

  public static final class Builder {

    private BotDescription buildingType;

    public Builder() {
      buildingType = new BotDescription();
    }

    public Builder setDescription(String description) {
      buildingType.description = description;
      return this;
    }

    public BotDescription build() {
      return buildingType;
    }
  }

  /** The bot's description */
  @NotNull public String description;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotDescription other)) return false;
    return Objects.equals(description, other.description);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(description);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("BotDescription[description=").append(description).append("]");
    return builder.toString();
  }
}
