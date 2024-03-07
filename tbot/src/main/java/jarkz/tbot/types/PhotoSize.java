package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents one size of a photo or a file / sticker thumbnail. */
public final class PhotoSize {

  public static final class Builder {

    private PhotoSize buildingType;

    public Builder() {
      buildingType = new PhotoSize();
    }

    public Builder setFileId(String fileId) {
      buildingType.fileId = fileId;
      return this;
    }

    public Builder setFileUniqueId(String fileUniqueId) {
      buildingType.fileUniqueId = fileUniqueId;
      return this;
    }

    public Builder setWidth(int width) {
      buildingType.width = width;
      return this;
    }

    public Builder setHeight(int height) {
      buildingType.height = height;
      return this;
    }

    public Builder setFileSize(Integer fileSize) {
      buildingType.fileSize = fileSize;
      return this;
    }

    public PhotoSize build() {
      return buildingType;
    }
  }

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
