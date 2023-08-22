package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.document.PhotoSize;
import java.util.List;
import java.util.Objects;

/**
 * This object represent a user's profile pictures.
 *
 * @author Pavel Bialiauski
 */
public class UserProfilePhotos {

  @SerializedName("total_count")
  @NotNull
  private int totalCount;

  @NotNull private List<List<PhotoSize>> photos;

  /** Default constructor. */
  public UserProfilePhotos() {}

  /**
   * Total number of profile pictures the target user has.
   *
   * @return total_count as int.
   */
  public int getTotalCount() {
    return totalCount;
  }

  /**
   * Sets the total number of profile pictures the target user has.
   *
   * @param totalCount the total number of profile pictures as int.
   */
  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

  /**
   * Requested profile pictures (in up to 4 sizes each).
   *
   * @return photos as {@link List}&lt;{@link List}&lt;{@link PhotoSize}&gt;&gt;.
   */
  public List<List<PhotoSize>> getPhotos() {
    return photos;
  }

  /**
   * Sets the requested profile pictures (in up to 4 sizes each).
   *
   * @param photos the requested profile pictures (in up to 4 size each) as {@link List}&lt;{@link
   *     List}&lt;{@link PhotoSize}&gt;&gt;.
   */
  public void setPhotos(List<List<PhotoSize>> photos) {
    this.photos = photos;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(totalCount, photos);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof UserProfilePhotos other)) return false;
    return totalCount == other.totalCount && Objects.equals(photos, other.photos);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("UserProfilePhotos[totalCount=")
        .append(totalCount)
        .append(", photos=")
        .append(photos)
        .append("]");
    return builder.toString();
  }
}
