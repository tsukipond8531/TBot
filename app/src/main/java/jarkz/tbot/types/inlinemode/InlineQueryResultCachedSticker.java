package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a link to a sticker stored on the Telegram servers. By default, this sticker will be
 * sent by the user. Alternatively, you can use <i>input_message_content</i> to send a message with
 * the specified content instead of the sticker.
 *
 * @apiNote This will only work in Telegram versions released after 9 April, 2016 for static
 *     stickers and after 06 July, 2019 for <a
 *     href="https://telegram.org/blog/animated-stickers">animated stickers</a>. Older clients will
 *     ignore them.
 * @author Pavel Bialiauski
 */
public class InlineQueryResultCachedSticker implements InlineQueryResult {

  /** Type of {@link InlineQueryResult}. Always "sticker". */
  protected static final String TYPE = "sticker";

  private final String type = InlineQueryResultCachedSticker.TYPE;

  @NotNull private String id;

  @SerializedName("sticker_file_id")
  @NotNull
  private String stickerFileId;

  @SerializedName("reply_markup")
  private InlineKeyboardMarkup replyMarkup;

  @SerializedName("input_message_content")
  private InputMessageContent inputMessageContent;

  /** Default constructor. */
  public InlineQueryResultCachedSticker() {}

  /**
   * Type of the result, must be <i>sticker</i>.
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  /**
   * Unique identifier for this result, 1-64 bytes.
   *
   * @return id as String.
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the unique identifier for this result, 1-64 bytes.
   *
   * @param id the unique identifier for this result, 1-64 bytes as String.
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * A valid file identifier of the sticker.
   *
   * @return sticker_file_id as String.
   */
  public String getStickerFileId() {
    return stickerFileId;
  }

  /**
   * Sets the valid file identifier of the sticker.
   *
   * @param stickerFileId the valid file identifier of the sticker as String.
   */
  public void setStickerFileId(String stickerFileId) {
    this.stickerFileId = stickerFileId;
  }

  /**
   * <i>Optional.</i> <a href="https://core.telegram.org/bots/features#inline-keyboards">Inline
   * keyboard</a> attached to the message.
   *
   * @return an optional value of reply_markup as {@link InlineKeyboardMarkup}.
   */
  public Optional<InlineKeyboardMarkup> getReplyMarkup() {
    return Optional.of(replyMarkup);
  }

  /**
   * Sets the <a href="https://core.telegram.org/bots/features#inline-keyboards">inline keyboard</a>
   * attached to the message.
   *
   * @param replyMarkup the inline keyboard attached to the message as {@link InlineKeyboardMarkup}
   *     or null if it is not required.
   */
  public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
    this.replyMarkup = replyMarkup;
  }

  /**
   * <i>Optional.</i> Content of the message to be sent instead of the sticker.
   *
   * @return an optional value of input_message_content as {@link InputMessageContent}.
   */
  public Optional<InputMessageContent> getInputMessageContent() {
    return Optional.of(inputMessageContent);
  }

  /**
   * Sets the content of the message to be sent instead of the sticker.
   *
   * @param inputMessageContent the content of the message to be sent instead of the sticker as
   *     {@link InputMessageContent} or null if it is not required.
   */
  public void setInputMessageContent(InputMessageContent inputMessageContent) {
    this.inputMessageContent = inputMessageContent;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, id, stickerFileId, replyMarkup, inputMessageContent);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultCachedSticker other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(stickerFileId, other.stickerFileId)
        && Objects.equals(replyMarkup, other.replyMarkup)
        && Objects.equals(inputMessageContent, other.inputMessageContent);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InlineQueryResultCachedSticker[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", stickerFileId=")
        .append(stickerFileId)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append(", inputMessageContent=")
        .append(inputMessageContent)
        .append("]");
    return builder.toString();
  }
}
