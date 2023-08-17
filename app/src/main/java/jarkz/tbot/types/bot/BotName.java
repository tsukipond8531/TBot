package jarkz.tbot.types.bot;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

public class BotName {

  @NotNull private String name;

  public BotName() {}

  public String getName() {
    return name;
  }

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
