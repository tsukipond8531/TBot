package jarkz.tbot.types.document;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents an audio file to be treated as music by the Telegram clients.
 *
 * @author Pavel Bialiauski
 */
public class Audio {

  @SerializedName("file_id")
  @NotNull
  private String fileId;

  @SerializedName("file_unique_id")
  @NotNull
  private String fileUniqueId;

  @NotNull private int duration;

  private String performer;

  private String title;

  @SerializedName("file_name")
  private String fileName;

  @SerializedName("mime_type")
  private String mimeType;

  @SerializedName("file_size")
  private Long fileSize;

  private PhotoSize thumbnail;

  /** Default constructor. */
  public Audio() {}

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
   * <i>Optional.</i> Performer of the audio as defined by sender or by audio tags.
   *
   * @return an optional value of performer as String.
   */
  public Optional<String> getPerformer() {
    return Optional.ofNullable(performer);
  }

  /**
   * Sets the performer of the audio as defined by sender or by audio tags.
   *
   * @param performer the performer of the audio as String or null if it doesn't provided.
   */
  public void setPerformer(String performer) {
    this.performer = performer;
  }

  /**
   * <i>Optional.</i> Title of the audio as defined by sender or by audio tags.
   *
   * @return an optional value of title as String.
   */
  public Optional<String> getTitle() {
    return Optional.ofNullable(title);
  }

  /**
   * Sets the title of the audio as defined by sender or by audio tags.
   *
   * @param title the title of the audio as String or null if it doesn't provided.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * <i>Optional.</i> Original filename as defined by sender.
   *
   * @return an optional value of file_name as String.
   */
  public Optional<String> getFileName() {
    return Optional.ofNullable(fileName);
  }

  /**
   * Sets the original filename as defined by sender.
   *
   * @param fileName the original filename as String or null if it doesn't provided.
   */
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   * <i>Optional.</i> MIME type of the file as defined by sender.
   *
   * @return an optional value of mime_type as String.
   */
  public Optional<String> getMimeType() {
    return Optional.ofNullable(mimeType);
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
    return Optional.ofNullable(fileSize);
  }

  /**
   * Sets the file size in bytes.
   *
   * @param fileSize the file size in bytes as Long or null if it doesn't provided.
   */
  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  /**
   * <i>Optional.</i> Thumbnail of the album cover to which the music file belongs.
   *
   * @return an optional value of thumbnail as {@link PhotoSize}.
   */
  public Optional<PhotoSize> getThumbnail() {
    return Optional.of(thumbnail);
  }

  /**
   * Sets the thumbnail of the album cover to which the music file belongs.
   *
   * @param thumbnail the thumbnail of the album cover as {@link PhotoSize} or null if it doesn't
   *     provided.
   */
  public void setThumbnail(PhotoSize thumbnail) {
    this.thumbnail = thumbnail;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        fileId, fileUniqueId, duration, performer, title, fileName, mimeType, fileSize, thumbnail);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Audio other)) return false;
    return Objects.equals(fileId, other.fileId)
        && Objects.equals(fileUniqueId, other.fileUniqueId)
        && duration == other.duration
        && Objects.equals(performer, other.performer)
        && Objects.equals(title, other.title)
        && Objects.equals(fileName, other.fileName)
        && Objects.equals(mimeType, other.mimeType)
        && Objects.equals(fileSize, other.fileSize)
        && Objects.equals(thumbnail, other.thumbnail);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("Audio[fileId=")
        .append(fileId)
        .append(", fileUniqueId=")
        .append(fileUniqueId)
        .append(", duration=")
        .append(duration)
        .append(", performer=")
        .append(performer)
        .append(", title=")
        .append(title)
        .append(", fileName=")
        .append(fileName)
        .append(", mimeType=")
        .append(mimeType)
        .append(", fileSize=")
        .append(fileSize)
        .append(", thumbnail=")
        .append(thumbnail)
        .append("]");
    return builder.toString();
  }
}
