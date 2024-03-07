package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a unique message identifier. */
public final class MessageId {

  public static final class Builder {

    private MessageId buildingType;

    public Builder() {
      buildingType = new MessageId();
    }

    public Builder setMessageId(int messageId) {
      buildingType.messageId = messageId;
      return this;
    }

    public MessageId build() {
      return buildingType;
    }
  }

  /** Unique message identifier */
  @NotNull
  @SerializedName("message_id")
  public int messageId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MessageId other)) return false;
    return messageId == other.messageId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(messageId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("MessageId[messageId=").append(messageId).append("]");
    return builder.toString();
  }
}
