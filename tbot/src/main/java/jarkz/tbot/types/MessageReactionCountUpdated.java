package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object represents reaction changes on a message with anonymous reactions. */
public final class MessageReactionCountUpdated {

  /** The chat containing the message */
  @NotNull public Chat chat;

  /** Unique message identifier inside the chat */
  @NotNull
  @SerializedName("message_id")
  public int messageId;

  /** Date of the change in Unix time */
  @NotNull public int date;

  /** List of reactions that are present on the message */
  @NotNull public List<ReactionCount> reactions;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MessageReactionCountUpdated other)) return false;
    return Objects.equals(chat, other.chat)
        && messageId == other.messageId
        && date == other.date
        && Objects.equals(reactions, other.reactions);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chat, messageId, date, reactions);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("MessageReactionCountUpdated[chat=")
        .append(chat)
        .append(", messageId=")
        .append(messageId)
        .append(", date=")
        .append(date)
        .append(", reactions=")
        .append(reactions)
        .append("]");
    return builder.toString();
  }
}
