package jarkz.tbot.core.parameters;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Use this method to set the title of a created sticker set. Returns True on success. */
public final class SetStickerSetTitleParameters {

  public static final class Builder {

    private SetStickerSetTitleParameters buildingType;

    public Builder() {
      buildingType = new SetStickerSetTitleParameters();
    }

    public Builder setName(String name) {
      buildingType.name = name;
      return this;
    }

    public Builder setTitle(String title) {
      buildingType.title = title;
      return this;
    }

    public SetStickerSetTitleParameters build() {
      return buildingType;
    }
  }

  /** Sticker set name */
  @NotNull public String name;

  /** Sticker set title, 1-64 characters */
  @NotNull public String title;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetStickerSetTitleParameters other)) return false;
    return Objects.equals(name, other.name) && Objects.equals(title, other.title);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name, title);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetStickerSetTitleParameters[name=")
        .append(name)
        .append(", title=")
        .append(title)
        .append("]");
    return builder.toString();
  }
}
