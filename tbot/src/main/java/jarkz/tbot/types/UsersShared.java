package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * This object contains information about the users whose identifiers were shared with the bot using
 * a KeyboardButtonRequestUsers button.
 */
public final class UsersShared {

  public static final class Builder {

    private UsersShared buildingType;

    public Builder() {
      buildingType = new UsersShared();
    }

    public Builder setRequestId(int requestId) {
      buildingType.requestId = requestId;
      return this;
    }

    public Builder setUserIds(List<Integer> userIds) {
      buildingType.userIds = userIds;
      return this;
    }

    public UsersShared build() {
      return buildingType;
    }
  }

  /** Identifier of the request */
  @NotNull
  @SerializedName("request_id")
  public int requestId;

  /**
   * Identifiers of the shared users. These numbers may have more than 32 significant bits and some
   * programming languages may have difficulty/silent defects in interpreting them. But they have at
   * most 52 significant bits, so 64-bit integers or double-precision float types are safe for
   * storing these identifiers. The bot may not have access to the users and could be unable to use
   * these identifiers, unless the users are already known to the bot by some other means.
   */
  @NotNull
  @SerializedName("user_ids")
  public List<Integer> userIds;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof UsersShared other)) return false;
    return requestId == other.requestId && Objects.equals(userIds, other.userIds);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(requestId, userIds);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("UsersShared[requestId=")
        .append(requestId)
        .append(", userIds=")
        .append(userIds)
        .append("]");
    return builder.toString();
  }
}
