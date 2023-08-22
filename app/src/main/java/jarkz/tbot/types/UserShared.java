package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.keyboardbutton.KeyboardButtonRequestUser;
import java.util.Objects;

/**
 * This object contains information about the user whose identifier was shared with the bot using a
 * <a
 * href="https://core.telegram.org/bots/api#keyboardbuttonrequestuser">KeyboardButtonRequestUser</a>
 * button (or {@link KeyboardButtonRequestUser}).
 *
 * @author Pavel Bialiauski
 */
public class UserShared {

  @SerializedName("request_id")
  @NotNull
  private int requestId;

  @SerializedName("user_id")
  @NotNull
  private long userId;

  /** Default constructor. */
  public UserShared() {}

  /**
   * Identifier of the request.
   *
   * @return request_id as int.
   */
  public int getRequestId() {
    return requestId;
  }

  /**
   * Sets the identifier of the request.
   *
   * @param requestId the identifier of the request as int.
   */
  public void setRequestId(int requestId) {
    this.requestId = requestId;
  }

  /**
   * Identifier of the shared user. The bot may not have access to the user and could be unable to
   * use this identifier, unless the user is already known to the bot by some other means.
   *
   * @return user_id as long.
   */
  public long getUserId() {
    return userId;
  }

  /**
   * Sets the identifier of the shared user. The bot may not have access to the user and could be
   * unable to use this identifier, unless the user is already known to the bot by some other means.
   *
   * @param userId the identifier of the shared user as long.
   */
  public void setUserId(long userId) {
    this.userId = userId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(requestId, userId);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof UserShared other)) return false;
    return requestId == other.requestId && userId == other.userId;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("UserShared[requestId=")
        .append(requestId)
        .append(", userId=")
        .append(userId)
        .append("]");
    return builder.toString();
  }
}
