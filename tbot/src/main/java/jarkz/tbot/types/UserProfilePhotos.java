package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object represent a user's profile pictures. */
public final class UserProfilePhotos {

  /** Total number of profile pictures the target user has */
  @NotNull
  @SerializedName("total_count")
  public int totalCount;

  /** Requested profile pictures (in up to 4 sizes each) */
  @NotNull public List<List<PhotoSize>> photos;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof UserProfilePhotos other)) return false;
    return totalCount == other.totalCount && Objects.equals(photos, other.photos);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(totalCount, photos);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("UserProfilePhotos[totalCount=")
        .append(totalCount)
        .append(", photos=")
        .append(photos)
        .append("]");
    return builder.toString();
  }
}
