package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a voice note. */
public final class Voice {

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
    if (!(obj instanceof Voice other)) return false;
    return Objects.equals(fileId, other.fileId)
        && Objects.equals(fileUniqueId, other.fileUniqueId)
        && duration == other.duration
        && Objects.equals(mimeType, other.mimeType)
        && Objects.equals(fileSize, other.fileSize);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(fileId, fileUniqueId, duration, mimeType, fileSize);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("Voice[fileId=")
        .append(fileId)
        .append(", fileUniqueId=")
        .append(fileUniqueId)
        .append(", duration=")
        .append(duration)
        .append(", mimeType=")
        .append(mimeType)
        .append(", fileSize=")
        .append(fileSize)
        .append("]");
    return builder.toString();
  }
}
