package jarkz.tbot.types.document;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a file ready to be downloaded. The file can be downloaded via the link
 * https://api.telegram.org/file/bot&lt;token&gt;/&lt;file_path&gt;. It is guaranteed that the link will be
 * valid for at least 1 hour. When the link expires, a new one can be requested by calling getFile.
 *
 * @author Pavel Bialiauski
 */
public class File {

  @SerializedName("file_id")
  @NotNull
  private String fileId;

  @SerializedName("file_unique_id")
  @NotNull
  private String fileUniqueId;

  @SerializedName("file_size")
  private Long fileSize;

  @SerializedName("file_path")
  private String filePath;

  /** Default constructor. */
  public File() {}

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

  /**
   * <i>Optional.</i> File path. Use <code>
   * https://api.telegram.org/file/bot&lt;token&gt;/&lt;file_path&gt;</code> to get the file.
   *
   * @return an optional value of file_path as String.
   */
  public Optional<String> getFilePath() {
    return Optional.of(filePath);
  }

  /**
   * Sets the file path. Use <code>https://api.telegram.org/file/bot&lt;token&gt;/&lt;file_path&gt;
   * </code> to get the file.
   *
   * @param filePath the file path as String or null if it doesn't exists.
   */
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(fileId, fileUniqueId, fileSize, filePath);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof File other)) return false;
    return Objects.equals(fileId, other.fileId)
        && Objects.equals(fileUniqueId, other.fileUniqueId)
        && Objects.equals(fileSize, other.fileSize)
        && Objects.equals(filePath, other.filePath);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("File[fileId=")
        .append(fileId)
        .append(", fileUniqueId=")
        .append(fileUniqueId)
        .append(", fileSize=")
        .append(fileSize)
        .append(", filePath=")
        .append(filePath)
        .append("]");
    return builder.toString();
  }
}
