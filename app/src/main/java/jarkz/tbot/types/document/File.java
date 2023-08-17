package jarkz.tbot.types.document;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

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

  public File() {}

  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public String getFileUniqueId() {
    return fileUniqueId;
  }

  public void setFileUniqueId(String fileUniqueId) {
    this.fileUniqueId = fileUniqueId;
  }

  public Optional<Long> getFileSize() {
    return Optional.of(fileSize);
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public Optional<String> getFilePath() {
    return Optional.of(filePath);
  }

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
