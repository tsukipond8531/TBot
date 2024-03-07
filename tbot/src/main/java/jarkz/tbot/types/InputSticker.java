package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object describes a sticker to be added to a sticker set. */
public final class InputSticker {

  public static final class Builder {

    private InputSticker buildingType;

    public Builder() {
      buildingType = new InputSticker();
    }

    public Builder setSticker(InputFile sticker) {
      buildingType.sticker = sticker;
      return this;
    }

    public Builder setEmojiList(List<String> emojiList) {
      buildingType.emojiList = emojiList;
      return this;
    }

    public Builder setMaskPosition(MaskPosition maskPosition) {
      buildingType.maskPosition = maskPosition;
      return this;
    }

    public Builder setKeywords(List<String> keywords) {
      buildingType.keywords = keywords;
      return this;
    }

    public InputSticker build() {
      return buildingType;
    }
  }

  /**
   * The added sticker. Pass a file_id as a String to send a file that already exists on the
   * Telegram servers, pass an HTTP URL as a String for Telegram to get a file from the Internet,
   * upload a new one using multipart/form-data, or pass "attach://<file_attach_name>" to upload a
   * new one using multipart/form-data under <file_attach_name> name. Animated and video stickers
   * can't be uploaded via HTTP URL. More information on Sending Files:
   * https://core.telegram.org/bots/api#sending-files
   */
  @NotNull public InputFile sticker;

  /** List of 1-20 emoji associated with the sticker */
  @NotNull
  @SerializedName("emoji_list")
  public List<String> emojiList;

  /** Optional. Position where the mask should be placed on faces. For "mask" stickers only. */
  @SerializedName("mask_position")
  public MaskPosition maskPosition;

  /**
   * Optional. List of 0-20 search keywords for the sticker with total length of up to 64
   * characters. For "regular" and "custom_emoji" stickers only.
   */
  public List<String> keywords;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputSticker other)) return false;
    return Objects.equals(sticker, other.sticker)
        && Objects.equals(emojiList, other.emojiList)
        && Objects.equals(maskPosition, other.maskPosition)
        && Objects.equals(keywords, other.keywords);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(sticker, emojiList, maskPosition, keywords);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("InputSticker[sticker=")
        .append(sticker)
        .append(", emojiList=")
        .append(emojiList)
        .append(", maskPosition=")
        .append(maskPosition)
        .append(", keywords=")
        .append(keywords)
        .append("]");
    return builder.toString();
  }
}
