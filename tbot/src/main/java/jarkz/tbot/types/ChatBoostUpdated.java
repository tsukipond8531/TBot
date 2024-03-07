package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a boost added to a chat or changed. */
public final class ChatBoostUpdated {

  public static final class Builder {

    private ChatBoostUpdated buildingType;

    public Builder() {
      buildingType = new ChatBoostUpdated();
    }

    public Builder setChat(Chat chat) {
      buildingType.chat = chat;
      return this;
    }

    public Builder setBoost(ChatBoost boost) {
      buildingType.boost = boost;
      return this;
    }

    public ChatBoostUpdated build() {
      return buildingType;
    }
  }

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
