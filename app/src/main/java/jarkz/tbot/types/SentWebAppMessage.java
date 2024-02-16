package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** Describes an inline message sent by a Web App on behalf of a user. */
public final class SentWebAppMessage {

  /**
   * Optional. Identifier of the sent inline message. Available only if there is an inline keyboard
   * attached to the message.
   */
  @SerializedName("inline_message_id")
  public String inlineMessageId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SentWebAppMessage other)) return false;
    return Objects.equals(inlineMessageId, other.inlineMessageId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(inlineMessageId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("SentWebAppMessage[inlineMessageId=").append(inlineMessageId).append("]");
    return builder.toString();
  }
}
