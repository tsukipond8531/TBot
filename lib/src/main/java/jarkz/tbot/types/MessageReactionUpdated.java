package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object represents a change of a reaction on a message performed by a user. */
public final class MessageReactionUpdated {

  /** The chat containing the message the user reacted to */
  @NotNull public Chat chat;

  /** Unique identifier of the message inside the chat */
  @NotNull
  @SerializedName("message_id")
  public int messageId;

  /** Optional. The user that changed the reaction, if the user isn't anonymous */
  public User user;

  /** Optional. The chat on behalf of which the reaction was changed, if the user is anonymous */
  @SerializedName("actor_chat")
  public Chat actorChat;

  /** Date of the change in Unix time */
  @NotNull public int date;

  /** Previous list of reaction types that were set by the user */
  @NotNull
  @SerializedName("old_reaction")
  public List<ReactionType> oldReaction;

  /** New list of reaction types that have been set by the user */
  @NotNull
  @SerializedName("new_reaction")
  public List<ReactionType> newReaction;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MessageReactionUpdated other)) return false;
    return Objects.equals(chat, other.chat)
        && messageId == other.messageId
        && Objects.equals(user, other.user)
        && Objects.equals(actorChat, other.actorChat)
        && date == other.date
        && Objects.equals(oldReaction, other.oldReaction)
        && Objects.equals(newReaction, other.newReaction);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chat, messageId, user, actorChat, date, oldReaction, newReaction);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("MessageReactionUpdated[chat=")
        .append(chat)
        .append(", messageId=")
        .append(messageId)
        .append(", user=")
        .append(user)
        .append(", actorChat=")
        .append(actorChat)
        .append(", date=")
        .append(date)
        .append(", oldReaction=")
        .append(oldReaction)
        .append(", newReaction=")
        .append(newReaction)
        .append("]");
    return builder.toString();
  }
}
