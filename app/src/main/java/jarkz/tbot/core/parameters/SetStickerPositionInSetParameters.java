package jarkz.tbot.core.parameters;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Use this method to move a sticker in a set created by the bot to a specific position. Returns
 * True on success.
 */
public final class SetStickerPositionInSetParameters {

  /** File identifier of the sticker */
  @NotNull public String sticker;

  /** New sticker position in the set, zero-based */
  @NotNull public int position;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetStickerPositionInSetParameters other)) return false;
    return Objects.equals(sticker, other.sticker) && position == other.position;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(sticker, position);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetStickerPositionInSetParameters[sticker=")
        .append(sticker)
        .append(", position=")
        .append(position)
        .append("]");
    return builder.toString();
  }
}
