package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a unique message identifier.
 *
 * @author Pavel Bialiauski
 */
public class MessageId {

  @SerializedName("message_id")
  @NotNull
  private long messageId;

  /** Default constructor. */
  public MessageId() {}

  /**
   * Unique message identifier.
   *
   * @return message identifier.
   */
  public long getMessageId() {
    return messageId;
  }

  /**
   * Sets the unique message identifier.
   *
   * @param messageId the unique message identifier as long.
   */
  public void setMessageId(long messageId) {
    this.messageId = messageId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(messageId);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MessageId other)) return false;
    return messageId == other.messageId;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("MessageId[messageId=").append(messageId).append("]");
    return builder.toString();
  }
}
