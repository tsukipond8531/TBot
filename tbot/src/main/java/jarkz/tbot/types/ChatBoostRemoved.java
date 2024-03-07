package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a boost removed from a chat. */
public final class ChatBoostRemoved {

  public static final class Builder {

    private ChatBoostRemoved buildingType;

    public Builder() {
      buildingType = new ChatBoostRemoved();
    }

    public Builder setChat(Chat chat) {
      buildingType.chat = chat;
      return this;
    }

    public Builder setBoostId(String boostId) {
      buildingType.boostId = boostId;
      return this;
    }

    public Builder setRemoveDate(int removeDate) {
      buildingType.removeDate = removeDate;
      return this;
    }

    public Builder setSource(ChatBoostSource source) {
      buildingType.source = source;
      return this;
    }

    public ChatBoostRemoved build() {
      return buildingType;
    }
  }

  /** Chat which was boosted */
  @NotNull public Chat chat;

  /** Unique identifier of the boost */
  @NotNull
  @SerializedName("boost_id")
  public String boostId;

  /** Point in time (Unix timestamp) when the boost was removed */
  @NotNull
  @SerializedName("remove_date")
  public int removeDate;

  /** Source of the removed boost */
  @NotNull public ChatBoostSource source;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatBoostRemoved other)) return false;
    return Objects.equals(chat, other.chat)
        && Objects.equals(boostId, other.boostId)
        && removeDate == other.removeDate
        && Objects.equals(source, other.source);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chat, boostId, removeDate, source);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatBoostRemoved[chat=")
        .append(chat)
        .append(", boostId=")
        .append(boostId)
        .append(", removeDate=")
        .append(removeDate)
        .append(", source=")
        .append(source)
        .append("]");
    return builder.toString();
  }
}
