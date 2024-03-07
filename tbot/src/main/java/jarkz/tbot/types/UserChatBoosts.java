package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object represents a list of boosts added to a chat by a user. */
public final class UserChatBoosts {

  /** The list of boosts added to the chat by the user */
  @NotNull public List<ChatBoost> boosts;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof UserChatBoosts other)) return false;
    return Objects.equals(boosts, other.boosts);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(boosts);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("UserChatBoosts[boosts=").append(boosts).append("]");
    return builder.toString();
  }
}
