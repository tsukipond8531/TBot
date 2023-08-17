package jarkz.tbot.types.stickers;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InputFile;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class InputSticker {

  @NotNull private InputFile sticker;

  @SerializedName("emoji_list")
  @NotNull
  private List<String> emojiList;

  @SerializedName("mask_position")
  private MaskPosition maskPosition;

  private List<String> keywords;

  public InputSticker() {}

  public InputFile getSticker() {
    return sticker;
  }

  public void setSticker(InputFile sticker) {
    this.sticker = sticker;
  }

  public List<String> getEmojiList() {
    return emojiList;
  }

  public void setEmojiList(List<String> emojiList) {
    this.emojiList = emojiList;
  }

  public Optional<MaskPosition> getMaskPosition() {
    return Optional.of(maskPosition);
  }

  public void setMaskPosition(MaskPosition maskPosition) {
    this.maskPosition = maskPosition;
  }

  public Optional<List<String>> getKeywords() {
    return Optional.of(keywords);
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(sticker, emojiList, maskPosition, keywords);
  }

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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
