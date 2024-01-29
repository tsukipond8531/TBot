package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import java.util.Optional;

/**
 * Describes an inline message sent by a <a href="https://core.telegram.org/bots/webapps">Web
 * App</a> on behalf of a user.
 *
 * @author Pavel Bialiauski
 */
public class SentWebAppMessage {

  @SerializedName("inline_message_id")
  private String inlineMessageId;

  /** Default constructor. */
  public SentWebAppMessage() {}

  /**
   * <i>Optional.</i> Identifier of the sent inline message. Available only if there is an <a
   * href="https://core.telegram.org/bots/api#inlinekeyboardmarkup">inline keyboard</a> attached to
   * the message.
   *
   * @return an optional value of inline_message_id as String.
   */
  public Optional<String> getInlineMessageId() {
    return Optional.ofNullable(inlineMessageId);
  }

  /**
   * Sets the identifier of the sent inline message. Available only if there is an <a
   * href="https://core.telegram.org/bots/api#inlinekeyboardmarkup">inline keyboard</a> attached to
   * the message.
   *
   * @param inlineMessageId the identifier of the sent inline message as String or null if there is
   *     not an inline keyboard attached to the message.
   */
  public void setInlineMessageId(String inlineMessageId) {
    this.inlineMessageId = inlineMessageId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(inlineMessageId);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SentWebAppMessage other)) return false;
    return Objects.equals(inlineMessageId, other.inlineMessageId);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("SentWebAppMessage[inlineMessageId=").append(inlineMessageId).append("]");
    return builder.toString();
  }
}
