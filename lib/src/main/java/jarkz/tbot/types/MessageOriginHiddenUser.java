package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** The message was originally sent by an unknown user. */
public final class MessageOriginHiddenUser implements MessageOrigin {

  public static final String TYPE = "hidden_user";

  /** Type of the message origin, always "hidden_user" */
  @NotNull public final String type = TYPE;

  /** Date the message was sent originally in Unix time */
  @NotNull public int date;

  /** Name of the user that sent the message originally */
  @NotNull
  @SerializedName("sender_user_name")
  public String senderUserName;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MessageOriginHiddenUser other)) return false;
    return Objects.equals(type, other.type)
        && date == other.date
        && Objects.equals(senderUserName, other.senderUserName);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, date, senderUserName);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("MessageOriginHiddenUser[type=")
        .append(type)
        .append(", date=")
        .append(date)
        .append(", senderUserName=")
        .append(senderUserName)
        .append("]");
    return builder.toString();
  }
}
