package jarkz.tbot.types.passport;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a file uploaded to Telegram Passport. Currently all Telegram Passport
 * files are in JPEG format when decrypted and don't exceed 10MB.
 *
 * @author Pavel Bialiauski
 */
public class PassportFile {

  @SerializedName("file_id")
  @NotNull
  private String fileId;

  @SerializedName("file_unique_id")
  @NotNull
  private String fileUniqueId;

  @SerializedName("file_size")
  @NotNull
  private int fileSize;

  @SerializedName("file_date")
  @NotNull
  private long fileDate;

  /** Default constructor. */
  public PassportFile() {}

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
   * File size in bytes.
   *
   * @return file_size as int.
   */
  public int getFileSize() {
    return fileSize;
  }

  /**
   * Sets the file size in bytes.
   *
   * @param fileSize the file size in bytes as int.
   */
  public void setFileSize(int fileSize) {
    this.fileSize = fileSize;
  }

  /**
   * Unix time when the file was uploaded.
   *
   * @return file_date as long.
   */
  public long getFileDate() {
    return fileDate;
  }

  /**
   * Sets the Unix time when the file was uploaded.
   *
   * @param fileDate the Unix time when the file was uploaded as long.
   */
  public void setFileDate(long fileDate) {
    this.fileDate = fileDate;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(fileId, fileUniqueId, fileSize, fileDate);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PassportFile other)) return false;
    return Objects.equals(fileId, other.fileId)
        && Objects.equals(fileUniqueId, other.fileUniqueId)
        && fileSize == other.fileSize
        && fileDate == other.fileDate;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("PassportFile[fileId=")
        .append(fileId)
        .append(", fileUniqueId=")
        .append(fileUniqueId)
        .append(", fileSize=")
        .append(fileSize)
        .append(", fileDate=")
        .append(fileDate)
        .append("]");
    return builder.toString();
  }
}
