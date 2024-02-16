package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** The message was originally sent to a channel chat. */
public final class MessageOriginChannel implements MessageOrigin {

  /** Type of the message origin, always "channel" */
  @NotNull public String type;

  /** Date the message was sent originally in Unix time */
  @NotNull public int date;

  /** Channel chat to which the message was originally sent */
  @NotNull public Chat chat;

  /** Unique message identifier inside the chat */
  @NotNull
  @SerializedName("message_id")
  public int messageId;

  /** Optional. Signature of the original post author */
  @SerializedName("author_signature")
  public String authorSignature;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MessageOriginChannel other)) return false;
    return Objects.equals(type, other.type)
        && date == other.date
        && Objects.equals(chat, other.chat)
        && messageId == other.messageId
        && Objects.equals(authorSignature, other.authorSignature);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, date, chat, messageId, authorSignature);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("MessageOriginChannel[type=")
        .append(type)
        .append(", date=")
        .append(date)
        .append(", chat=")
        .append(chat)
        .append(", messageId=")
        .append(messageId)
        .append(", authorSignature=")
        .append(authorSignature)
        .append("]");
    return builder.toString();
  }
}
