package jarkz.tbot.types.document;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a video message (available in Telegram apps as of v.4.0).
 *
 * @author Pavel Bialiauski
 */
public class VideoNote {

  @SerializedName("file_id")
  @NotNull
  private String fileId;

  @SerializedName("file_unique_id")
  @NotNull
  private String fileUniqueId;

  @NotNull private int length;

  @NotNull private int duration;

  private PhotoSize thumbnail;

  @SerializedName("file_size")
  private Integer fileSize;

  /** Default constructor. */
  public VideoNote() {}

  /**
   * Identifier for this file, which can be used to download or reuse the file.
   *
   * @return file_id as String.
   */
  public String getFileId() {
    return fileId;
  }

  /**
   * Sets the identifier for this file, which can be used to download or reuse the file.
   *
   * @param fileId the identifier for this file, which can be used to download or reuse the file, as
   *     String.
   */
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  /**
   * Unique identifier for this file, which is supposed to be the same over time and for different
   * bots. Can't be used to download or reuse the file.
   *
   * @return file_unique_id as String.
   */
  public String getFileUniqueId() {
    return fileUniqueId;
  }

  /**
   * Sets the unique identifier for this file, which is supposed to be the same over time and for
   * different bots. Can't be used to download or reuse the file.
   *
   * @param fileUniqueId the unique identifier for this file, which is supposed to be the same over
   *     time and for different bots, as String.
   */
  public void setFileUniqueId(String fileUniqueId) {
    this.fileUniqueId = fileUniqueId;
  }

  /**
   * Video width and height (diameter of the video message) as defined by sender.
   *
   * @return length as int.
   */
  public int getLength() {
    return length;
  }

  /**
   * Sets the ideo width and height (diameter of the video message) as defined by sender.
   *
   * @param length the ideo width and height (diameter of the video message) as int.
   */
  public void setLength(int length) {
    this.length = length;
  }

  /**
   * Duration of the video in seconds as defined by sender.
   *
   * @return duration as int.
   */
  public int getDuration() {
    return duration;
  }

  /**
   * Sets the duration of the video in seconds as defined by sender.
   *
   * @param duration the duration of the video in seconds as int.
   */
  public void setDuration(int duration) {
    this.duration = duration;
  }

  /**
   * <i>Optional.</i> Video thumbnail.
   *
   * @return an optional value of thumbnail as {@link PhotoSize}.
   */
  public Optional<PhotoSize> getThumbnail() {
    return Optional.ofNullable(thumbnail);
  }

  /**
   * Sets the video thumbnail.
   *
   * @param thumbnail the video thumbnail as {@link PhotoSize} or null if it doesn't provided.
   */
  public void setThumbnail(PhotoSize thumbnail) {
    this.thumbnail = thumbnail;
  }

  /**
   * <i>Optional.</i> File size in bytes.
   *
   * @return an optional value of file_size as Integer.
   */
  public Optional<Integer> getFileSize() {
    return Optional.ofNullable(fileSize);
  }

  /**
   * Sets the file size in bytes.
   *
   * @param fileSize the file size in bytes as Integer or null if it doesn't provided.
   */
  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(fileId, fileUniqueId, length, duration, thumbnail, fileSize);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof VideoNote other)) return false;
    return Objects.equals(fileId, other.fileId)
        && Objects.equals(fileUniqueId, other.fileUniqueId)
        && length == other.length
        && duration == other.duration
        && Objects.equals(thumbnail, other.thumbnail)
        && Objects.equals(fileSize, other.fileSize);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("VideoNote[fileId=")
        .append(fileId)
        .append(", fileUniqueId=")
        .append(fileUniqueId)
        .append(", length=")
        .append(length)
        .append(", duration=")
        .append(duration)
        .append(", thumbnail=")
        .append(thumbnail)
        .append(", fileSize=")
        .append(fileSize)
        .append("]");
    return builder.toString();
  }
}
