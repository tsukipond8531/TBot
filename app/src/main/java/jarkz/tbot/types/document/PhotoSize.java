package jarkz.tbot.types.document;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents one size of a photo or a file / sticker thumbnail.
 *
 * @author Pavel Bialiauski
 */
public class PhotoSize {

  @SerializedName("file_id")
  @NotNull
  private String fileId;

  @SerializedName("file_unique_id")
  @NotNull
  private String fileUniqueId;

  @NotNull private int width;

  @NotNull private int height;

  @SerializedName("file_size")
  private Integer fileSize;

  /** Default constructor. */
  public PhotoSize() {}

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
   * Photo width.
   *
   * @return width as int.
   */
  public int getWidth() {
    return width;
  }

  /**
   * Sets the photo width.
   *
   * @param width the photo width as int.
   */
  public void setWidth(int width) {
    this.width = width;
  }

  /**
   * Photo height.
   *
   * @return height as int.
   */
  public int getHeight() {
    return height;
  }

  /**
   * Sets the photo height.
   *
   * @param height the photo height as int.
   */
  public void setHeight(int height) {
    this.height = height;
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
    return Objects.hash(fileId, fileUniqueId, width, height, fileSize);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PhotoSize other)) return false;
    return Objects.equals(fileId, other.fileId)
        && Objects.equals(fileUniqueId, other.fileUniqueId)
        && width == other.width
        && height == other.height
        && Objects.equals(fileSize, other.fileSize);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("PhotoSize[fileId=")
        .append(fileId)
        .append(", fileUniqueId=")
        .append(fileUniqueId)
        .append(", width=")
        .append(width)
        .append(", height=")
        .append(height)
        .append(", fileSize=")
        .append(fileSize)
        .append("]");
    return builder.toString();
  }
}
