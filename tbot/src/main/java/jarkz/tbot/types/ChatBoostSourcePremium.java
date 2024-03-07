package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * The boost was obtained by subscribing to Telegram Premium or by gifting a Telegram Premium
 * subscription to another user.
 */
public final class ChatBoostSourcePremium implements ChatBoostSource {

  public static final String SOURCE = "premium";

  /** Source of the boost, always "premium" */
  @NotNull public final String source = SOURCE;

  /** User that boosted the chat */
  @NotNull public User user;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatBoostSourcePremium other)) return false;
    return Objects.equals(source, other.source) && Objects.equals(user, other.user);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(source, user);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatBoostSourcePremium[source=")
        .append(source)
        .append(", user=")
        .append(user)
        .append("]");
    return builder.toString();
  }
}
