package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a story. */
public final class Story {

  /** Chat that posted the story */
  @NotNull public Chat chat;

  /** Unique identifier for the story in the chat */
  @NotNull public int id;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Story other)) return false;
    return Objects.equals(chat, other.chat) && id == other.id;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chat, id);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("Story[chat=").append(chat).append(", id=").append(id).append("]");
    return builder.toString();
  }
}
