package jarkz.tbot.types.stickers;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InputFile;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * This object describes a sticker to be added to a sticker set.
 *
 * @author Pavel Bialiauski
 */
public class InputSticker {

  @NotNull private InputFile sticker;

  @SerializedName("emoji_list")
  @NotNull
  private List<String> emojiList;

  @SerializedName("mask_position")
  private MaskPosition maskPosition;

  private List<String> keywords;

  /** Default constructor. */
  public InputSticker() {}

  /**
   * The added sticker. Pass a <i>file_id</i> as a String to send a file that already exists on the
   * Telegram servers, pass an HTTP URL as a String for Telegram to get a file from the Internet,
   * upload a new one using multipart/form-data, or pass “attach://&lt;file_attach_name&gt;” to
   * upload a new one using multipart/form-data under &lt;file_attach_name&gt; name. Animated and
   * video stickers can't be uploaded via HTTP URL.
   *
   * <p><a href="https://core.telegram.org/bots/api#sending-files">More information on Sending Files
   * »</a>.
   *
   * @return sticker as {@link InputFile}.
   */
  public InputFile getSticker() {
    return sticker;
  }

  /**
   * Sets the added sticker. Pass a <i>file_id</i> as a String to send a file that already exists on
   * the Telegram servers, pass an HTTP URL as a String for Telegram to get a file from the
   * Internet, upload a new one using multipart/form-data, or pass
   * “attach://&lt;file_attach_name&gt;” to upload a new one using multipart/form-data under
   * &lt;file_attach_name&gt; name. Animated and video stickers can't be uploaded via HTTP URL.
   *
   * <p><a href="https://core.telegram.org/bots/api#sending-files">More information on Sending Files
   * »</a>.
   *
   * @param sticker the added sticker as {@link InputFile}.
   */
  public void setSticker(InputFile sticker) {
    this.sticker = sticker;
  }

  /**
   * List of 1-20 emoji associated with the sticker.
   *
   * @return emoji_list as {@link List}&lt;String&gt;.
   */
  public List<String> getEmojiList() {
    return emojiList;
  }

  /**
   * Sets the list of 1-20 emoji associated with the sticker.
   *
   * @param emojiList the list of 1-20 emoji associated with the sticker as {@link
   *     List}&lt;String&gt;.
   */
  public void setEmojiList(List<String> emojiList) {
    this.emojiList = emojiList;
  }

  /**
   * <i>Optional.</i> Position where the mask should be placed on faces. For “mask” stickers only.
   *
   * @return an optional value of mask_position as {@link MaskPosition}.
   */
  public Optional<MaskPosition> getMaskPosition() {
    return Optional.of(maskPosition);
  }

  /**
   * Sets the position where the mask should be placed on faces. For “mask” stickers only.
   *
   * @param maskPosition the position where the mask should be placed on faces as {@link
   *     MaskPosition} or null if it is not for the "mask".
   */
  public void setMaskPosition(MaskPosition maskPosition) {
    this.maskPosition = maskPosition;
  }

  /**
   * <i>Optional.</i> List of 0-20 search keywords for the sticker with total length of up to 64
   * characters. For “regular” and “custom_emoji” stickers only.
   *
   * @return an optional value of keywords as {@link List}&lt;String&gt;.
   */
  public Optional<List<String>> getKeywords() {
    return Optional.of(keywords);
  }

  /**
   * Sets the list of 0-20 search keywords for the sticker with total length of up to 64 characters.
   * For “regular” and “custom_emoji” stickers only.
   *
   * @param keywords the list of 0-20 search keywords for the sticker with total length of up to 64
   *     characters as {@link List}&lt;String&gt; or null if it is for the "mask".
   */
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
