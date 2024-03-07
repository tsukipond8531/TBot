package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * The boost was obtained by the creation of Telegram Premium gift codes to boost a chat. Each such
 * code boosts the chat 4 times for the duration of the corresponding Telegram Premium subscription.
 */
public final class ChatBoostSourceGiftCode implements ChatBoostSource {

  public static final String SOURCE = "gift_code";

  /** Source of the boost, always "gift_code" */
  @NotNull public final String source = SOURCE;

  /** User for which the gift code was created */
  @NotNull public User user;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatBoostSourceGiftCode other)) return false;
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
        .append("ChatBoostSourceGiftCode[source=")
        .append(source)
        .append(", user=")
        .append(user)
        .append("]");
    return builder.toString();
  }
}
