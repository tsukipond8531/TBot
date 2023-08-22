package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Upon receiving a message with this object, Telegram clients will display a reply interface to the
 * user (act as if the user has selected the bot's message and tapped 'Reply'). This can be
 * extremely useful if you want to create user-friendly step-by-step interfaces without having to
 * sacrifice <a href="https://core.telegram.org/bots/features#privacy-mode">privacy mode</a>.
 *
 * @author Pavel Bialiauski
 */
public class ForceReply {

  @SerializedName("force_reply")
  @NotNull
  private boolean forceReply;

  @SerializedName("input_field_placeholder")
  private String inputFieldPlaceholder;

  private Boolean selective;

  /** Default constructor. */
  public ForceReply() {}

  /**
   * Shows reply interface to the user, as if they manually selected the bot's message and tapped
   * 'Reply'.
   *
   * @return force_reply as boolean.
   */
  public boolean isForceReply() {
    return forceReply;
  }

  /**
   * Sets whether the shows reply interface to the user, as if they manually selected the bot's
   * message and tapped 'Reply'.
   *
   * @param forceReply true if show reply interface to the user, otherwise - false.
   */
  public void setForceReply(boolean forceReply) {
    this.forceReply = forceReply;
  }

  /**
   * <i>Optional.</i> The placeholder to be shown in the input field when the reply is active; 1-64
   * characters.
   *
   * @return an optional value of input_field_placeholder as String.
   */
  public Optional<String> getInputFieldPlaceholder() {
    return Optional.of(inputFieldPlaceholder);
  }

  /**
   * Sets the placeholder to be shown in the input field when the reply is active; 1-64 characters.
   *
   * @param inputFieldPlaceholder the placeholder to be shown in the input field when the reply is
   *     active (1-64 characters) as String or null if it is not required.
   */
  public void setInputFieldPlaceholder(String inputFieldPlaceholder) {
    this.inputFieldPlaceholder = inputFieldPlaceholder;
  }

  /**
   * <i>Optional.</i> True if to force reply from specific users only. <br>
   * Targets:<br>
   * 1) users that are &#64;mentioned in the <i>text</i> of the <a
   * href="https://core.telegram.org/bots/api#message">Message</a> object ({@link Message});<br>
   * 2) if the bot's message is a reply (has <i>reply_to_message_id</i>), sender of the original
   * message.
   *
   * @return an optional value of selective as Boolean.
   */
  public Optional<Boolean> getSelective() {
    return Optional.of(selective);
  }

  /**
   * Use this parameter if you want to force reply from specific users only. <br>
   * Targets:<br>
   * 1) users that are &#64;mentioned in the <i>text</i> of the <a
   * href="https://core.telegram.org/bots/api#message">Message</a> object ({@link Message});<br>
   * 2) if the bot's message is a reply (has <i>reply_to_message_id</i>), sender of the original
   * message.
   *
   * @param selective true if you want to force reply from specific users only, otherwise - false or null.
   */
  public void setSelective(Boolean selective) {
    this.selective = selective;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(forceReply, inputFieldPlaceholder, selective);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ForceReply other)) return false;
    return forceReply == other.forceReply
        && Objects.equals(inputFieldPlaceholder, other.inputFieldPlaceholder)
        && Objects.equals(selective, other.selective);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
