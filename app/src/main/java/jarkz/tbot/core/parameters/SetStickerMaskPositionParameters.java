package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Use this method to change the mask position of a mask sticker. The sticker must belong to a
 * sticker set that was created by the bot. Returns True on success.
 */
public final class SetStickerMaskPositionParameters {

  /** File identifier of the sticker */
  @NotNull public String sticker;

  /**
   * A JSON-serialized object with the position where the mask should be placed on faces. Omit the
   * parameter to remove the mask position.
   */
  @SerializedName("mask_position")
  public MaskPosition maskPosition;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetStickerMaskPositionParameters other)) return false;
    return Objects.equals(sticker, other.sticker)
        && Objects.equals(maskPosition, other.maskPosition);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(sticker, maskPosition);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetStickerMaskPositionParameters[sticker=")
        .append(sticker)
        .append(", maskPosition=")
        .append(maskPosition)
        .append("]");
    return builder.toString();
  }
}
