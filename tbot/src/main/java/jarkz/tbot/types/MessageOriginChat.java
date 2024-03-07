package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** The message was originally sent on behalf of a chat to a group chat. */
public final class MessageOriginChat implements MessageOrigin {

  public static final class Builder {

    private MessageOriginChat buildingType;

    public Builder() {
      buildingType = new MessageOriginChat();
    }

    public Builder setDate(int date) {
      buildingType.date = date;
      return this;
    }

    public Builder setSenderChat(Chat senderChat) {
      buildingType.senderChat = senderChat;
      return this;
    }

    public Builder setAuthorSignature(String authorSignature) {
      buildingType.authorSignature = authorSignature;
      return this;
    }

    public MessageOriginChat build() {
      return buildingType;
    }
  }

  public static final String TYPE = "chat";

  /** Type of the message origin, always "chat" */
  @NotNull public final String type = TYPE;

  /** Date the message was sent originally in Unix time */
  @NotNull public int date;

  /** Chat that sent the message originally */
  @NotNull
  @SerializedName("sender_chat")
  public Chat senderChat;

  /**
   * Optional. For messages originally sent by an anonymous chat administrator, original message
   * author signature
   */
  @SerializedName("author_signature")
  public String authorSignature;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MessageOriginChat other)) return false;
    return Objects.equals(type, other.type)
        && date == other.date
        && Objects.equals(senderChat, other.senderChat)
        && Objects.equals(authorSignature, other.authorSignature);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, date, senderChat, authorSignature);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("MessageOriginChat[type=")
        .append(type)
        .append(", date=")
        .append(date)
        .append(", senderChat=")
        .append(senderChat)
        .append(", authorSignature=")
        .append(authorSignature)
        .append("]");
    return builder.toString();
  }
}
