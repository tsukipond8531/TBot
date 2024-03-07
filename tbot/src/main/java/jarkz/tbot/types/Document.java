package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a general file (as opposed to photos, voice messages and audio files). */
public final class Document {

  public static final class Builder {

    private Document buildingType;

    public Builder() {
      buildingType = new Document();
    }

    public Builder setFileId(String fileId) {
      buildingType.fileId = fileId;
      return this;
    }

    public Builder setFileUniqueId(String fileUniqueId) {
      buildingType.fileUniqueId = fileUniqueId;
      return this;
    }

    public Builder setThumbnail(PhotoSize thumbnail) {
      buildingType.thumbnail = thumbnail;
      return this;
    }

    public Builder setFileName(String fileName) {
      buildingType.fileName = fileName;
      return this;
    }

    public Builder setMimeType(String mimeType) {
      buildingType.mimeType = mimeType;
      return this;
    }

    public Builder setFileSize(Long fileSize) {
      buildingType.fileSize = fileSize;
      return this;
    }

    public Document build() {
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

  /** Optional. Document thumbnail as defined by sender */
  public PhotoSize thumbnail;

  /** Optional. Original filename as defined by sender */
  @SerializedName("file_name")
  public String fileName;

  /** Optional. MIME type of the file as defined by sender */
  @SerializedName("mime_type")
  public String mimeType;

  /**
   * Optional. File size in bytes. It can be bigger than 2^31 and some programming languages may
   * have difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a
   * signed 64-bit integer or double-precision float type are safe for storing this value.
   */
  @SerializedName("file_size")
  public Long fileSize;

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
  public final int hashCode() {
    return Objects.hash(fileId, fileUniqueId, thumbnail, fileName, mimeType, fileSize);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
