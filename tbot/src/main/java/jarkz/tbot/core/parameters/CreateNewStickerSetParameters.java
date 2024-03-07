package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InputSticker;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to create a new sticker set owned by a user. The bot will be able to edit the
 * sticker set thus created. Returns True on success.
 */
public final class CreateNewStickerSetParameters {

  public static final class Builder {

    private CreateNewStickerSetParameters buildingType;

    public Builder() {
      buildingType = new CreateNewStickerSetParameters();
    }

    public Builder setUserId(int userId) {
      buildingType.userId = userId;
      return this;
    }

    public Builder setName(String name) {
      buildingType.name = name;
      return this;
    }

    public Builder setTitle(String title) {
      buildingType.title = title;
      return this;
    }

    public Builder setStickers(List<InputSticker> stickers) {
      buildingType.stickers = stickers;
      return this;
    }

    public Builder setStickerFormat(String stickerFormat) {
      buildingType.stickerFormat = stickerFormat;
      return this;
    }

    public Builder setStickerType(String stickerType) {
      buildingType.stickerType = stickerType;
      return this;
    }

    public Builder setNeedsRepainting(Boolean needsRepainting) {
      buildingType.needsRepainting = needsRepainting;
      return this;
    }

    public CreateNewStickerSetParameters build() {
      return buildingType;
    }
  }

  /** User identifier of created sticker set owner */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  /**
   * Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals). Can contain
   * only English letters, digits and underscores. Must begin with a letter, can't contain
   * consecutive underscores and must end in "_by_<bot_username>". <bot_username> is case
   * insensitive. 1-64 characters.
   */
  @NotNull public String name;

  /** Sticker set title, 1-64 characters */
  @NotNull public String title;

  /** A JSON-serialized list of 1-50 initial stickers to be added to the sticker set */
  @NotNull public List<InputSticker> stickers;

  /** Format of stickers in the set, must be one of "static", "animated", "video" */
  @NotNull
  @SerializedName("sticker_format")
  public String stickerFormat;

  /**
   * Type of stickers in the set, pass "regular", "mask", or "custom_emoji". By default, a regular
   * sticker set is created.
   */
  @SerializedName("sticker_type")
  public String stickerType;

  /**
   * Pass True if stickers in the sticker set must be repainted to the color of text when used in
   * messages, the accent color if used as emoji status, white on chat photos, or another
   * appropriate color based on context; for custom emoji sticker sets only
   */
  @SerializedName("needs_repainting")
  public Boolean needsRepainting;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof CreateNewStickerSetParameters other)) return false;
    return userId == other.userId
        && Objects.equals(name, other.name)
        && Objects.equals(title, other.title)
        && Objects.equals(stickers, other.stickers)
        && Objects.equals(stickerFormat, other.stickerFormat)
        && Objects.equals(stickerType, other.stickerType)
        && Objects.equals(needsRepainting, other.needsRepainting);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(userId, name, title, stickers, stickerFormat, stickerType, needsRepainting);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("CreateNewStickerSetParameters[userId=")
        .append(userId)
        .append(", name=")
        .append(name)
        .append(", title=")
        .append(title)
        .append(", stickers=")
        .append(stickers)
        .append(", stickerFormat=")
        .append(stickerFormat)
        .append(", stickerType=")
        .append(stickerType)
        .append(", needsRepainting=")
        .append(needsRepainting)
        .append("]");
    return builder.toString();
  }
}
