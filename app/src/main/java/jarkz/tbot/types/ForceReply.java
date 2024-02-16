package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Upon receiving a message with this object, Telegram clients will display a reply interface to the
 * user (act as if the user has selected the bot's message and tapped 'Reply'). This can be
 * extremely useful if you want to create user-friendly step-by-step interfaces without having to
 * sacrifice privacy mode.
 */
public final class ForceReply {

  /**
   * Shows reply interface to the user, as if they manually selected the bot's message and tapped
   * 'Reply'
   */
  @NotNull
  @SerializedName("force_reply")
  public boolean forceReply;

  /**
   * Optional. The placeholder to be shown in the input field when the reply is active; 1-64
   * characters
   */
  @SerializedName("input_field_placeholder")
  public String inputFieldPlaceholder;

  /**
   * Optional. Use this parameter if you want to force reply from specific users only. Targets: 1)
   * users that are @mentioned in the text of the Message object; 2) if the bot's message is a reply
   * to a message in the same chat and forum topic, sender of the original message.
   */
  public Boolean selective;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ForceReply other)) return false;
    return forceReply == other.forceReply
        && Objects.equals(inputFieldPlaceholder, other.inputFieldPlaceholder)
        && Objects.equals(selective, other.selective);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(forceReply, inputFieldPlaceholder, selective);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ForceReply[forceReply=")
        .append(forceReply)
        .append(", inputFieldPlaceholder=")
        .append(inputFieldPlaceholder)
        .append(", selective=")
        .append(selective)
        .append("]");
    return builder.toString();
  }
}
