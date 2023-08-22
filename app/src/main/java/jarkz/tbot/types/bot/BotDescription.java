package jarkz.tbot.types.bot;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents the bot's description.
 *
 * @author Pavel Bialiauski
 */
public class BotDescription {

  @NotNull private String description;

  /**
   * Default constructor.
   */
  public BotDescription() {}

  /**
   * The bot's description.
   *
   * @return description as String.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the bot's description.
   *
   * @param description the bot's description as String.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(description);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotDescription other)) return false;
    return Objects.equals(description, other.description);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("BotDescription[description=").append(description).append("]");
    return builder.toString();
  }
}
