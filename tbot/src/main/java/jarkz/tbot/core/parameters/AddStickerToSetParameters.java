package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InputSticker;
import java.util.Objects;

/**
 * Use this method to add a new sticker to a set created by the bot. The format of the added sticker
 * must match the format of the other stickers in the set. Emoji sticker sets can have up to 200
 * stickers. Animated and video sticker sets can have up to 50 stickers. Static sticker sets can
 * have up to 120 stickers. Returns True on success.
 */
public final class AddStickerToSetParameters {

  /** User identifier of sticker set owner */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  /** Sticker set name */
  @NotNull public String name;

  /**
   * A JSON-serialized object with information about the added sticker. If exactly the same sticker
   * had already been added to the set, then the set isn't changed.
   */
  @NotNull public InputSticker sticker;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof AddStickerToSetParameters other)) return false;
    return userId == other.userId
        && Objects.equals(name, other.name)
        && Objects.equals(sticker, other.sticker);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(userId, name, sticker);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("AddStickerToSetParameters[userId=")
        .append(userId)
        .append(", name=")
        .append(name)
        .append(", sticker=")
        .append(sticker)
        .append("]");
    return builder.toString();
  }
}
