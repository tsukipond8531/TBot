package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

public class MessageAutoDeleteTimerChanged {

  @SerializedName("message_auto_delete_time")
  @NotNull
  private int messageAutoDeleteTime;

  public MessageAutoDeleteTimerChanged() {}

  public int getMessageAutoDeleteTime() {
    return messageAutoDeleteTime;
  }

  public void setMessageAutoDeleteTime(int messageAutoDeleteTime) {
    this.messageAutoDeleteTime = messageAutoDeleteTime;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(messageAutoDeleteTime);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MessageAutoDeleteTimerChanged other)) return false;
    return messageAutoDeleteTime == other.messageAutoDeleteTime;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("MessageAutoDeleteTimerChanged[messageAutoDeleteTime=")
        .append(messageAutoDeleteTime)
        .append("]");
    return builder.toString();
  }
}
