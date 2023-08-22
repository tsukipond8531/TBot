package jarkz.tbot.types.document;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a voice note.
 *
 * @author Pavel Bialiauski
 */
public class Voice {

  @SerializedName("file_id")
  @NotNull
  private String fileId;

  @SerializedName("file_unique_id")
  @NotNull
  private String fileUniqueId;

  @NotNull private int duration;

  @SerializedName("mime_type")
  private String mimeType;

  @SerializedName("file_size")
  private Long fileSize;

  /** Default constructor. */
  public Voice() {}

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
   * Duration of the audio in seconds as defined by sender.
   *
   * @return duration as int.
   */
  public int getDuration() {
    return duration;
  }

  /**
   * Sets the duration of the audio in seconds as defined by sender.
   *
   * @param duration the duration of the audio in seconds as int.
   */
  public void setDuration(int duration) {
    this.duration = duration;
  }

  /**
   * <i>Optional.</i> MIME type of the file as defined by sender.
   *
   * @return an optional value of mime_type as String.
   */
  public Optional<String> getMimeType() {
    return Optional.of(mimeType);
  }

  /**
   * Sets the MIME type of the file as defined by sender.
   *
   * @param mimeType the MIME type of the file as String or null if it doesn't provided.
   */
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * <i>Optional.</i> File size in bytes.
   *
   * @return an optional value of file_size as Long.
   */
  public Optional<Long> getFileSize() {
    return Optional.of(fileSize);
  }

  /**
   * Sets the file size in bytes.
   *
   * @param fileSize the file size in bytes as Long or null if it doesn't provided.
   */
  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(fileId, fileUniqueId, duration, mimeType, fileSize);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Voice other)) return false;
    return Objects.equals(fileId, other.fileId)
        && Objects.equals(fileUniqueId, other.fileUniqueId)
        && duration == other.duration
        && Objects.equals(mimeType, other.mimeType)
        && Objects.equals(fileSize, other.fileSize);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("Voice[fileId=")
        .append(fileId)
        .append(", fileUniqueId=")
        .append(fileUniqueId)
        .append(", duration=")
        .append(duration)
        .append(", mimeType=")
        .append(mimeType)
        .append(", fileSize=")
        .append(fileSize)
        .append("]");
    return builder.toString();
  }
}
