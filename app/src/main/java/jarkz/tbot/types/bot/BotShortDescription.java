package jarkz.tbot.types.bot;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

public class BotShortDescription {

  @SerializedName("short_description")
  @NotNull
  private String shortDescription;

  public BotShortDescription() {}

  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(shortDescription);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotShortDescription other)) return false;
    return Objects.equals(shortDescription, other.shortDescription);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("BotShortDescription[shortDescription=").append(shortDescription).append("]");
    return builder.toString();
  }
}
