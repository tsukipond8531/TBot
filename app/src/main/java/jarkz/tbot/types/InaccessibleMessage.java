package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object describes a message that was deleted or is otherwise inaccessible to the bot. */
public final class InaccessibleMessage implements MaybeInaccessibleMessage {

  /** Chat the message belonged to */
  @NotNull public Chat chat;

  /** Unique message identifier inside the chat */
  @NotNull
  @SerializedName("message_id")
  public int messageId;

  /** Always 0. The field can be used to differentiate regular and inaccessible messages. */
  @NotNull public int date;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InaccessibleMessage other)) return false;
    return Objects.equals(chat, other.chat) && messageId == other.messageId && date == other.date;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chat, messageId, date);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("InaccessibleMessage[chat=")
        .append(chat)
        .append(", messageId=")
        .append(messageId)
        .append(", date=")
        .append(date)
        .append("]");
    return builder.toString();
  }
}
