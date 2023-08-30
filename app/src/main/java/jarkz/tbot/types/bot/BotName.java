package jarkz.tbot.types.bot;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents the bot's name.
 *
 * @author Pavel Bialiauski
 */
public class BotName {

  @NotNull private String name;

  /** Default constructor. */
  public BotName() {}

  /**
   * The bot's name.
   *
   * @return name as String.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the bot's name.
   *
   * @param name the bot's name as String.
   */
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotName other)) return false;
    return Objects.equals(name, other.name);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("BotName[name=").append(name).append("]");
    return builder.toString();
  }
}
