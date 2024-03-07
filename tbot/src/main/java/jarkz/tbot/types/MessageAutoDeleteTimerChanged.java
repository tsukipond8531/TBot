package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a service message about a change in auto-delete timer settings. */
public final class MessageAutoDeleteTimerChanged {

  public static final class Builder {

    private MessageAutoDeleteTimerChanged buildingType;

    public Builder() {
      buildingType = new MessageAutoDeleteTimerChanged();
    }

    public Builder setMessageAutoDeleteTime(int messageAutoDeleteTime) {
      buildingType.messageAutoDeleteTime = messageAutoDeleteTime;
      return this;
    }

    public MessageAutoDeleteTimerChanged build() {
      return buildingType;
    }
  }

  /** New auto-delete time for messages in the chat; in seconds */
  @NotNull
  @SerializedName("message_auto_delete_time")
  public int messageAutoDeleteTime;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MessageAutoDeleteTimerChanged other)) return false;
    return messageAutoDeleteTime == other.messageAutoDeleteTime;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(messageAutoDeleteTime);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("MessageAutoDeleteTimerChanged[messageAutoDeleteTime=")
        .append(messageAutoDeleteTime)
        .append("]");
    return builder.toString();
  }
}
