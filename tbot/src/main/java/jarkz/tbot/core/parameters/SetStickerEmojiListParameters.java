package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to change the list of emoji assigned to a regular or custom emoji sticker. The
 * sticker must belong to a sticker set created by the bot. Returns True on success.
 */
public final class SetStickerEmojiListParameters {

  public static final class Builder {

    private SetStickerEmojiListParameters buildingType;

    public Builder() {
      buildingType = new SetStickerEmojiListParameters();
    }

    public Builder setSticker(String sticker) {
      buildingType.sticker = sticker;
      return this;
    }

    public Builder setEmojiList(List<String> emojiList) {
      buildingType.emojiList = emojiList;
      return this;
    }

    public SetStickerEmojiListParameters build() {
      return buildingType;
    }
  }

  /** File identifier of the sticker */
  @NotNull public String sticker;

  /** A JSON-serialized list of 1-20 emoji associated with the sticker */
  @NotNull
  @SerializedName("emoji_list")
  public List<String> emojiList;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetStickerEmojiListParameters other)) return false;
    return Objects.equals(sticker, other.sticker) && Objects.equals(emojiList, other.emojiList);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(sticker, emojiList);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetStickerEmojiListParameters[sticker=")
        .append(sticker)
        .append(", emojiList=")
        .append(emojiList)
        .append("]");
    return builder.toString();
  }
}
