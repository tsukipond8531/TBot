package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents one size of a photo or a file / sticker thumbnail. */
public final class PhotoSize {

  /** Identifier for this file, which can be used to download or reuse the file */
  @NotNull
  @SerializedName("file_id")
  public String fileId;

  /**
   * Unique identifier for this file, which is supposed to be the same over time and for different
   * bots. Can't be used to download or reuse the file.
   */
  @SerializedName("file_unique_id")
  @NotNull
  public String fileUniqueId;

  /** Photo width */
  @NotNull public int width;

  /** Photo height */
  @NotNull public int height;

  /** Optional. File size in bytes */
  @SerializedName("file_size")
  public Integer fileSize;

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
  public final int hashCode() {
    return Objects.hash(fileId, fileUniqueId, width, height, fileSize);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
