package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** The message was originally sent by a known user. */
public final class MessageOriginUser implements MessageOrigin {

  public static final class Builder {

    private MessageOriginUser buildingType;

    public Builder() {
      buildingType = new MessageOriginUser();
    }

    public Builder setDate(int date) {
      buildingType.date = date;
      return this;
    }

    public Builder setSenderUser(User senderUser) {
      buildingType.senderUser = senderUser;
      return this;
    }

    public MessageOriginUser build() {
      return buildingType;
    }
  }

  public static final String TYPE = "user";

  /** Type of the message origin, always "user" */
  @NotNull public final String type = TYPE;

  /** Date the message was sent originally in Unix time */
  @NotNull public int date;

  /** User that sent the message originally */
  @NotNull
  @SerializedName("sender_user")
  public User senderUser;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MessageOriginUser other)) return false;
    return Objects.equals(type, other.type)
        && date == other.date
        && Objects.equals(senderUser, other.senderUser);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, date, senderUser);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("MessageOriginUser[type=")
        .append(type)
        .append(", date=")
        .append(date)
        .append(", senderUser=")
        .append(senderUser)
        .append("]");
    return builder.toString();
  }
}
