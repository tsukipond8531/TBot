package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents an audio file to be treated as music by the Telegram clients. */
public final class Audio {

  public static final class Builder {

    private Audio buildingType;

    public Builder() {
      buildingType = new Audio();
    }

    public Builder setFileId(String fileId) {
      buildingType.fileId = fileId;
      return this;
    }

    public Builder setFileUniqueId(String fileUniqueId) {
      buildingType.fileUniqueId = fileUniqueId;
      return this;
    }

    public Builder setDuration(int duration) {
      buildingType.duration = duration;
      return this;
    }

    public Builder setPerformer(String performer) {
      buildingType.performer = performer;
      return this;
    }

    public Builder setTitle(String title) {
      buildingType.title = title;
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

    public Builder setThumbnail(PhotoSize thumbnail) {
      buildingType.thumbnail = thumbnail;
      return this;
    }

    public Audio build() {
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

  /** Duration of the audio in seconds as defined by sender */
  @NotNull public int duration;

  /** Optional. Performer of the audio as defined by sender or by audio tags */
  public String performer;

  /** Optional. Title of the audio as defined by sender or by audio tags */
  public String title;

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

  /** Optional. Thumbnail of the album cover to which the music file belongs */
  public PhotoSize thumbnail;

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
  public final int hashCode() {
    return Objects.hash(
        fileId, fileUniqueId, duration, performer, title, fileName, mimeType, fileSize, thumbnail);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
