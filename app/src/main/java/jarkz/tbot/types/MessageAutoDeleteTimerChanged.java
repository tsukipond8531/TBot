package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a service message about a change in auto-delete timer settings.
 *
 * @author Pavel Bialiauski
 */
public class MessageAutoDeleteTimerChanged {

  @SerializedName("message_auto_delete_time")
  @NotNull
  private int messageAutoDeleteTime;

  /** Default constructor. */
  public MessageAutoDeleteTimerChanged() {}

  /**
   * New auto-delete time for messages in the chat; in seconds.
   *
   * @return message_auto_delete_time as int.
   */
  public int getMessageAutoDeleteTime() {
    return messageAutoDeleteTime;
  }

  /**
   * Sets the new auto-delete time for messages in the chat; in seconds.
   *
   * @param messageAutoDeleteTime the new auto-delete time for messages in the chat (in seconds) as
   *     int.
   */
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
