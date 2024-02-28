package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Use this method to get a list of profile pictures for a user. Returns a UserProfilePhotos object.
 */
public final class GetUserProfilePhotosParameters {

  /** Unique identifier of the target user */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  /** Sequential number of the first photo to be returned. By default, all photos are returned. */
  public Integer offset;

  /**
   * Limits the number of photos to be retrieved. Values between 1-100 are accepted. Defaults to
   * 100.
   */
  public Integer limit;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetUserProfilePhotosParameters other)) return false;
    return userId == other.userId
        && Objects.equals(offset, other.offset)
        && Objects.equals(limit, other.limit);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(userId, offset, limit);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("GetUserProfilePhotosParameters[userId=")
        .append(userId)
        .append(", offset=")
        .append(offset)
        .append(", limit=")
        .append(limit)
        .append("]");
    return builder.toString();
  }
}
