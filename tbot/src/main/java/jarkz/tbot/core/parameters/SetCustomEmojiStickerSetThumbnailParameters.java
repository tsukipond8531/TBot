package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Use this method to set the thumbnail of a custom emoji sticker set. Returns True on success. */
public final class SetCustomEmojiStickerSetThumbnailParameters {

  public static final class Builder {

    private SetCustomEmojiStickerSetThumbnailParameters buildingType;

    public Builder() {
      buildingType = new SetCustomEmojiStickerSetThumbnailParameters();
    }

    public Builder setName(String name) {
      buildingType.name = name;
      return this;
    }

    public Builder setCustomEmojiId(String customEmojiId) {
      buildingType.customEmojiId = customEmojiId;
      return this;
    }

    public SetCustomEmojiStickerSetThumbnailParameters build() {
      return buildingType;
    }
  }

  /** Sticker set name */
  @NotNull public String name;

  /**
   * Custom emoji identifier of a sticker from the sticker set; pass an empty string to drop the
   * thumbnail and use the first sticker as the thumbnail.
   */
  @SerializedName("custom_emoji_id")
  public String customEmojiId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetCustomEmojiStickerSetThumbnailParameters other)) return false;
    return Objects.equals(name, other.name) && Objects.equals(customEmojiId, other.customEmojiId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name, customEmojiId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetCustomEmojiStickerSetThumbnailParameters[name=")
        .append(name)
        .append(", customEmojiId=")
        .append(customEmojiId)
        .append("]");
    return builder.toString();
  }
}
