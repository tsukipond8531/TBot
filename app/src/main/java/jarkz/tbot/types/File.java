package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a file ready to be downloaded. The file can be downloaded via the link
 * https://api.telegram.org/file/bot<token>/<file_path>. It is guaranteed that the link will be
 * valid for at least 1 hour. When the link expires, a new one can be requested by calling getFile.
 */
public final class File {

  /** Identifier for this file, which can be used to download or reuse the file */
  @NotNull
  @SerializedName("file_id")
  public String fileId;

  /**
   * Unique identifier for this file, which is supposed to be the same over time and for different
   * bots. Can't be used to download or reuse the file.
   */
  @NotNull
  @SerializedName("file_unique_id")
  public String fileUniqueId;

  /**
   * Optional. File size in bytes. It can be bigger than 2^31 and some programming languages may
   * have difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a
   * signed 64-bit integer or double-precision float type are safe for storing this value.
   */
  @SerializedName("file_size")
  public Integer fileSize;

  /**
   * Optional. File path. Use https://api.telegram.org/file/bot<token>/<file_path> to get the file.
   */
  @SerializedName("file_path")
  public String filePath;

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
  public final int hashCode() {
    return Objects.hash(fileId, fileUniqueId, fileSize, filePath);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
