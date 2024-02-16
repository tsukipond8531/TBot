package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a boost added to a chat or changed. */
public final class ChatBoostUpdated {

  /** Chat which was boosted */
  @NotNull public Chat chat;

  /** Information about the chat boost */
  @NotNull public ChatBoost boost;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatBoostUpdated other)) return false;
    return Objects.equals(chat, other.chat) && Objects.equals(boost, other.boost);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chat, boost);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatBoostUpdated[chat=")
        .append(chat)
        .append(", boost=")
        .append(boost)
        .append("]");
    return builder.toString();
  }
}
