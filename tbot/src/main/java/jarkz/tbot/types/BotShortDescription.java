package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents the bot's short description. */
public final class BotShortDescription {

  public static final class Builder {

    private BotShortDescription buildingType;

    public Builder() {
      buildingType = new BotShortDescription();
    }

    public Builder setShortDescription(String shortDescription) {
      buildingType.shortDescription = shortDescription;
      return this;
    }

    public BotShortDescription build() {
      return buildingType;
    }
  }

  /** The bot's short description */
  @NotNull
  @SerializedName("short_description")
  public String shortDescription;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotShortDescription other)) return false;
    return Objects.equals(shortDescription, other.shortDescription);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(shortDescription);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("BotShortDescription[shortDescription=").append(shortDescription).append("]");
    return builder.toString();
  }
}
