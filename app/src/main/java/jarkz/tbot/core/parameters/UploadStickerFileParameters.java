package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InputFile;
import java.util.Objects;

/**
 * Use this method to upload a file with a sticker for later use in the createNewStickerSet and
 * addStickerToSet methods (the file can be used multiple times). Returns the uploaded File on
 * success.
 */
public final class UploadStickerFileParameters {

  /** User identifier of sticker file owner */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  /**
   * A file with the sticker in .WEBP, .PNG, .TGS, or .WEBM format. See
   * https://core.telegram.org/stickers for technical requirements. More information on Sending
   * Files: https://core.telegram.org/bots/api#sending-files
   */
  @NotNull public InputFile sticker;

  /** Format of the sticker, must be one of "static", "animated", "video" */
  @NotNull
  @SerializedName("sticker_format")
  public String stickerFormat;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof UploadStickerFileParameters other)) return false;
    return userId == other.userId
        && Objects.equals(sticker, other.sticker)
        && Objects.equals(stickerFormat, other.stickerFormat);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(userId, sticker, stickerFormat);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("UploadStickerFileParameters[userId=")
        .append(userId)
        .append(", sticker=")
        .append(sticker)
        .append(", stickerFormat=")
        .append(stickerFormat)
        .append("]");
    return builder.toString();
  }
}
