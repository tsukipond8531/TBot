package jarkz.tbot.core.parameters;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Use this method to delete a sticker set that was created by the bot. Returns True on success. */
public final class DeleteStickerSetParameters {

  /** Sticker set name */
  @NotNull public String name;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof DeleteStickerSetParameters other)) return false;
    return Objects.equals(name, other.name);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("DeleteStickerSetParameters[name=").append(name).append("]");
    return builder.toString();
  }
}
