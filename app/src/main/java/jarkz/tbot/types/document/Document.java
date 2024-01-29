package jarkz.tbot.types.document;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a general file (as opposed to photos, voice messages and audio files).
 *
 * @author Pavel Bialiauski
 */
public class Document {

  @SerializedName("file_id")
  @NotNull
  private String fileId;

  @SerializedName("file_unique_id")
  @NotNull
  private String fileUniqueId;

  private PhotoSize thumbnail;

  @SerializedName("file_name")
  private String fileName;

  @SerializedName("mime_type")
  private String mimeType;

  @SerializedName("file_size")
  private Long fileSize;

  /** Default constructor. */
  public Document() {}

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
   * <i>Optional.</i> Document thumbnail as defined by sender.
   *
   * @return an optional value of thumbnail as {@link PhotoSize}.
   */
  public Optional<PhotoSize> getThumbnail() {
    return Optional.ofNullable(thumbnail);
  }

  /**
   * Sets the document thumbnail as defined by sender.
   *
   * @param thumbnail the document thumbnail as {@link PhotoSize} or null if it doesn't provided.
   */
  public void setThumbnail(PhotoSize thumbnail) {
    this.thumbnail = thumbnail;
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

  @Override
  public final int hashCode() {
    return Objects.hash(fileId, fileUniqueId, thumbnail, fileName, mimeType, fileSize);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Document other)) return false;
    return Objects.equals(fileId, other.fileId)
        && Objects.equals(fileUniqueId, other.fileUniqueId)
        && Objects.equals(thumbnail, other.thumbnail)
        && Objects.equals(fileName, other.fileName)
        && Objects.equals(mimeType, other.mimeType)
        && Objects.equals(fileSize, other.fileSize);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("Document[fileId=")
        .append(fileId)
        .append(", fileUniqueId=")
        .append(fileUniqueId)
        .append(", thumbnail=")
        .append(thumbnail)
        .append(", fileName=")
        .append(fileName)
        .append(", mimeType=")
        .append(mimeType)
        .append(", fileSize=")
        .append(fileSize)
        .append("]");
    return builder.toString();
  }
}
