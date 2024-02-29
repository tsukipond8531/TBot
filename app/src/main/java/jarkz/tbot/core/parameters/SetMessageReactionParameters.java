package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import jarkz.tbot.types.ReactionType;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to change the chosen reactions on a message. Service messages can't be reacted
 * to. Automatically forwarded messages from a channel to its discussion group have the same
 * available reactions as messages in the channel. Returns True on success.
 */
public final class SetMessageReactionParameters {

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /**
   * Identifier of the target message. If the message belongs to a media group, the reaction is set
   * to the first non-deleted message in the group instead.
   */
  @NotNull
  @SerializedName("message_id")
  public int messageId;

  /**
   * New list of reaction types to set on the message. Currently, as non-premium users, bots can set
   * up to one reaction per message. A custom emoji reaction can be used if it is either already
   * present on the message or explicitly allowed by chat administrators.
   */
  public List<ReactionType> reaction;

  /** Pass True to set the reaction with a big animation */
  @SerializedName("is_big")
  public Boolean isBig;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetMessageReactionParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && messageId == other.messageId
        && Objects.equals(reaction, other.reaction)
        && Objects.equals(isBig, other.isBig);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, messageId, reaction, isBig);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetMessageReactionParameters[chatId=")
        .append(chatId)
        .append(", messageId=")
        .append(messageId)
        .append(", reaction=")
        .append(reaction)
        .append(", isBig=")
        .append(isBig)
        .append("]");
    return builder.toString();
  }
}
