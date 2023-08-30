package jarkz.tbot.types.bot;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents the bot's short description.
 *
 * @author Pavel Bialiauski
 */
public class BotShortDescription {

  @SerializedName("short_description")
  @NotNull
  private String shortDescription;

  /** Default constructor. */
  public BotShortDescription() {}

  /**
   * The bot's short description.
   *
   * @return short_description as String.
   */
  public String getShortDescription() {
    return shortDescription;
  }

  /**
   * Sets the bot's short description.
   *
   * @param shortDescription the bot's short description as String.
   */
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
