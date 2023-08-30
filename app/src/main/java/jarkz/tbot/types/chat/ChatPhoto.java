package jarkz.tbot.types.chat;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a chat photo.
 *
 * @author Pavel Bialiauski
 */
public class ChatPhoto {

  @SerializedName("small_file_id")
  @NotNull
  private String smallFileId;

  @SerializedName("small_file_unique_id")
  @NotNull
  private String smallFileUniqueId;

  @SerializedName("big_file_id")
  @NotNull
  private String bigFileId;

  @SerializedName("big_file_unique_id")
  @NotNull
  private String bigFileUniqueId;

  /** Default constructor. */
  public ChatPhoto() {}

  /**
   * File identifier of small (160x160) chat photo. This file_id can be used only for photo download
   * and only for as long as the photo is not changed.
   *
   * @return small_file_id as String.
   */
  public String getSmallFileId() {
    return smallFileId;
  }

  /**
   * Sets the file identifier of small (160x160) chat photo. This file_id can be used only for photo
   * download and only for as long as the photo is not changed.
   *
   * @param smallFileId the file identifier of small (160x160) char photo as String.
   */
  public void setSmallFileId(String smallFileId) {
    this.smallFileId = smallFileId;
  }

  /**
   * Unique file identifier of small (160x160) chat photo, which is supposed to be the same over
   * time and for different bots. Can't be used to download or reuse the file.
   *
   * @return small_file_unique_id as String.
   */
  public String getSmallFileUniqueId() {
    return smallFileUniqueId;
  }

  /**
   * Sets the unique file identifier of small (160x160) chat photo, which is supposed to be the same
   * over time and for different bots. Can't be used to download or reuse the file.
   *
   * @param smallFileUniqueId the unique file identifier of small (160x160) chat photo, which is
   *     supposed to be the same over time and for different bots, as String.
   */
  public void setSmallFileUniqueId(String smallFileUniqueId) {
    this.smallFileUniqueId = smallFileUniqueId;
  }

  /**
   * File identifier of big (640x640) chat photo. This file_id can be used only for photo download
   * and only for as long as the photo is not changed.
   *
   * @return big_file_id as String.
   */
  public String getBigFileId() {
    return bigFileId;
  }

  /**
   * Sets the file identifier of big (640x640) chat photo. This file_id can be used only for photo
   * download and only for as long as the photo is not changed.
   *
   * @param bigFileId the file identifier of big (640x640) chat photo as String.
   */
  public void setBigFileId(String bigFileId) {
    this.bigFileId = bigFileId;
  }

  /**
   * Unique file identifier of big (640x640) chat photo, which is supposed to be the same over time
   * and for different bots. Can't be used to download or reuse the file.
   *
   * @return big_file_unique_id as String.
   */
  public String getBigFileUniqueId() {
    return bigFileUniqueId;
  }

  /**
   * Sets the unique file identifier of big (640x640) chat photo, which is supposed to be the same
   * over time and for different bots. Can't be used to download or reuse the file.
   *
   * @param bigFileUniqueId the unique file identifier of big (640x640) chat photo, which is
   *     supposed to be the same over time and for different bots, as String.
   */
  public void setBigFileUniqueId(String bigFileUniqueId) {
    this.bigFileUniqueId = bigFileUniqueId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(smallFileId, smallFileUniqueId, bigFileId, bigFileUniqueId);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatPhoto other)) return false;
    return Objects.equals(smallFileId, other.smallFileId)
        && Objects.equals(smallFileUniqueId, other.smallFileUniqueId)
        && Objects.equals(bigFileId, other.bigFileId)
        && Objects.equals(bigFileUniqueId, other.bigFileUniqueId);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ChatPhoto[smallFileId=")
        .append(smallFileId)
        .append(", smallFileUniqueId=")
        .append(smallFileUniqueId)
        .append(", bigFileId=")
        .append(bigFileId)
        .append(", bigFileUniqueId=")
        .append(bigFileUniqueId)
        .append("]");
    return builder.toString();
  }
}
