package jarkz.tbot.core.parameters;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Use this method to get a sticker set. On success, a StickerSet object is returned. */
public final class GetStickerSetParameters {

  public static final class Builder {

    private GetStickerSetParameters buildingType;

    public Builder() {
      buildingType = new GetStickerSetParameters();
    }

    public Builder setName(String name) {
      buildingType.name = name;
      return this;
    }

    public GetStickerSetParameters build() {
      return buildingType;
    }
  }

  /** Name of the sticker set */
  @NotNull public String name;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetStickerSetParameters other)) return false;
    return Objects.equals(name, other.name);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("GetStickerSetParameters[name=").append(name).append("]");
    return builder.toString();
  }
}
