package jarkz.tbot.core.parameters;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Use this method to delete a sticker from a set created by the bot. Returns True on success. */
public final class DeleteStickerFromSetParameters {

  public static final class Builder {

    private DeleteStickerFromSetParameters buildingType;

    public Builder() {
      buildingType = new DeleteStickerFromSetParameters();
    }

    public Builder setSticker(String sticker) {
      buildingType.sticker = sticker;
      return this;
    }

    public DeleteStickerFromSetParameters build() {
      return buildingType;
    }
  }

  /** File identifier of the sticker */
  @NotNull public String sticker;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof DeleteStickerFromSetParameters other)) return false;
    return Objects.equals(sticker, other.sticker);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(sticker);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("DeleteStickerFromSetParameters[sticker=").append(sticker).append("]");
    return builder.toString();
  }
}
