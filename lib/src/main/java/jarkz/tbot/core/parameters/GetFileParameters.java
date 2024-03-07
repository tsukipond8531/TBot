package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Use this method to get basic information about a file and prepare it for downloading. For the
 * moment, bots can download files of up to 20MB in size. On success, a File object is returned. The
 * file can then be downloaded via the link https://api.telegram.org/file/bot<token>/<file_path>,
 * where <file_path> is taken from the response. It is guaranteed that the link will be valid for at
 * least 1 hour. When the link expires, a new one can be requested by calling getFile again.
 *
 * <p>Note: This function may not preserve the original file name and MIME type. You should save the
 * file's MIME type and name (if available) when the File object is received.
 */
public final class GetFileParameters {

  /** File identifier to get information about */
  @NotNull
  @SerializedName("file_id")
  public String fileId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetFileParameters other)) return false;
    return Objects.equals(fileId, other.fileId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(fileId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("GetFileParameters[fileId=").append(fileId).append("]");
    return builder.toString();
  }
}
