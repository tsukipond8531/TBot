package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a link to an animated GIF file. By default, this animated GIF file will be sent by the
 * user with optional caption. Alternatively, you can use <i>input_message_content</i> to send a
 * message with the specified content instead of the animation.
 *
 * @author Pavel Bialiauski
 */
public class InlineQueryResultGif implements InlineQueryResult {

  /**
   * Type of {@link InlineQueryResult}. Always "gif".
   */
  protected static final String TYPE = "gif";

  private final String type = InlineQueryResultGif.TYPE;

  @NotNull private String id;

  @SerializedName("gif_url")
  @NotNull
  private String gifUrl;

  @SerializedName("gif_width")
  private Integer gifWidth;

  @SerializedName("gif_height")
  private Integer gifHeight;

  @SerializedName("gif_duration")
  private Integer gifDuration;

  @SerializedName("thumbnail_url")
  @NotNull
  private String thumbnailUrl;

  @SerializedName("thumbnail_mime_type")
  private String thumbnailMimeType;

  private String title;

  private String caption;

  @SerializedName("parse_mode")
  private String parseMode;

  @SerializedName("caption_entities")
  private List<MessageEntity> captionEntities;

  @SerializedName("reply_markup")
  private InlineKeyboardMarkup replyMarkup;

  @SerializedName("input_message_content")
  private InputMessageContent inputMessageContent;

  /** Default constructor. */
  public InlineQueryResultGif() {}

  /**
   * Type of the result, must be <i>gif</i>.
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  /**
   * Unique identifier for this result, 1-64 Bytes.
   *
   * @return id as String.
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the unique identifier for this result, 1-64 Bytes.
   *
   * @param id the unique identifier for this result (1-64 Bytes) as String.
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * A valid URL for the GIF file. File size must not exceed 1MB.
   *
   * @return gif_url as String.
   */
  public String getGifUrl() {
    return gifUrl;
  }

  /**
   * Sets the valid URL for the GIF file. File size must not exceed 1MB.
   *
   * @param gifUrl the valid URL for the GIF file as String.
   */
  public void setGifUrl(String gifUrl) {
    this.gifUrl = gifUrl;
  }

  /**
   * <i>Optional.</i> Width of the GIF.
   *
   * @return an optional value of gif_width as Integer.
   */
  public Optional<Integer> getGifWidth() {
    return Optional.of(gifWidth);
  }

  /**
   * Sets the width of the GIF.
   *
   * @param gifWidth the width of the GIF as Integer or null if it doesn't provided.
   */
  public void setGifWidth(Integer gifWidth) {
    this.gifWidth = gifWidth;
  }

  /**
   * <i>Optional.</i> Height of the GIF.
   *
   * @return an optional value of gif_height as Integer.
   */
  public Optional<Integer> getGifHeight() {
    return Optional.of(gifHeight);
  }

  /**
   * Sets the height of the GIF.
   *
   * @param gifHeight the height of the GIF as Integer or null if it doesn't provided.
   */
  public void setGifHeight(Integer gifHeight) {
    this.gifHeight = gifHeight;
  }

  /**
   * <i>optional</i>. duration of the gif in seconds.
   *
   * @return an optional value of gif_duration as integer.
   */
  public Optional<Integer> getGifDuration() {
    return Optional.of(gifDuration);
  }

  /**
   * Sets the duration of the GIF in seconds.
   *
   * @param gifDuration the duration of the GIF in seconds as Integer or null if it doesn't
   *     provided.
   */
  public void setGifDuration(Integer gifDuration) {
    this.gifDuration = gifDuration;
  }

  /**
   * URL of the static (JPEG or GIF) or animated (MPEG4) thumbnail for the result.
   *
   * @return thumbnail_url as String.
   */
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  /**
   * Sets the URL of the static (JPEG or GIF) or animated (MPEG4) thumbnail for the result.
   *
   * @param thumbnailUrl the URL of the static (JPEG or GIF) or animated (MPEG4) thumbnail for the
   *     result as String.
   */
  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  /**
   * <i>Optional.</i> MIME type of the thumbnail, must be one of “image/jpeg”, “image/gif”, or
   * “video/mp4”. Defaults to “image/jpeg”.
   *
   * @return an optional value of thumbnail_mime_type as String.
   */
  public Optional<String> getThumbnailMimeType() {
    return Optional.of(thumbnailMimeType);
  }

  /**
   * Sets the MIME type of the thumbnail, must be one of “image/jpeg”, “image/gif”, or “video/mp4”.
   * Defaults to “image/jpeg”.
   *
   * @param thumbnailMimeType the MIME type of the thumbnail, must be one of “image/jpeg”,
   *     “image/gif”, or “video/mp4”, as String or null if you want sets to default as "image/jpeg".
   */
  public void setThumbnailMimeType(String thumbnailMimeType) {
    this.thumbnailMimeType = thumbnailMimeType;
  }

  /**
   * <i>Optional.</i> Title for the result.
   *
   * @return an optional value of title as String.
   */
  public Optional<String> getTitle() {
    return Optional.of(title);
  }

  /**
   * Sets the title for the result.
   *
   * @param title the title for the result as String.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * <i>Optional.</i> Caption of the GIF file to be sent, 0-1024 characters after entities parsing.
   *
   * @return an optional value of caption as String.
   */
  public Optional<String> getCaption() {
    return Optional.of(caption);
  }

  /**
   * Sets the caption of the GIF to be sent, 0-1024 characters after entities parsing.
   *
   * @param caption the caption of the GIF to be sent (0-1024 characters after entities parsing) as
   *     String or null if it is not required.
   */
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * <i>Optional.</i> Mode for parsing entities in the GIF caption. See <a
   * href="https://core.telegram.org/bots/api#formatting-options">formatting options</a> for more
   * details.
   *
   * @return an optional value of parse_mode as String.
   */
  public Optional<String> getParseMode() {
    return Optional.of(parseMode);
  }

  /**
   * Sets the mode for parsing entities in the GIF caption. See <a
   * href="https://core.telegram.org/bots/api#formatting-options">formatting options</a> for more
   * details.
   *
   * @param parseMode the mode for parsing entities in the GIF caption as String or null if a
   *     caption is not provided.
   */
  public void setParseMode(String parseMode) {
    this.parseMode = parseMode;
  }

  /**
   * <i>Optional.</i> List of special entities that appear in the caption, which can be specified
   * instead of <i>parse_mode</i>.
   *
   * @return an optional value of caption_entities as {@link List}&lt;{@link MessageEntity}&gt;.
   */
  public Optional<List<MessageEntity>> getCaptionEntities() {
    return Optional.of(captionEntities);
  }

  /**
   * Sets the list of special entities that appear in the caption, which can be specified instead of
   * <i>parse_mode</i>.
   *
   * @param captionEntities the list of special entities that appear in the caption, which can be
   *     specified instead of <i>parse_mode</i>, as {@link List}&lt;{@link MessageEntity}&gt; or
   *     null if a caption is not provided.
   */
  public void setCaptionEntities(List<MessageEntity> captionEntities) {
    this.captionEntities = captionEntities;
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
   * <i>Optional.</i> Content of the message to be sent instead of the GIF.
   *
   * @return an optional value of input_message_content as {@link InputMessageContent}.
   */
  public Optional<InputMessageContent> getInputMessageContent() {
    return Optional.of(inputMessageContent);
  }

  /**
   * Sets the content of the message to be sent instead of the GIF.
   *
   * @param inputMessageContent the content of the message to be sent instead of the GIF as {@link
   *     InputMessageContent} or null if it is not reuiqred.
   */
  public void setInputMessageContent(InputMessageContent inputMessageContent) {
    this.inputMessageContent = inputMessageContent;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        type,
        id,
        gifUrl,
        gifWidth,
        gifHeight,
        gifDuration,
        thumbnailUrl,
        thumbnailMimeType,
        title,
        caption,
        parseMode,
        captionEntities,
        replyMarkup,
        inputMessageContent);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultGif other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(gifUrl, other.gifUrl)
        && Objects.equals(gifWidth, other.gifWidth)
        && Objects.equals(gifHeight, other.gifHeight)
        && Objects.equals(gifDuration, other.gifDuration)
        && Objects.equals(thumbnailUrl, other.thumbnailUrl)
        && Objects.equals(thumbnailMimeType, other.thumbnailMimeType)
        && Objects.equals(title, other.title)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(replyMarkup, other.replyMarkup)
        && Objects.equals(inputMessageContent, other.inputMessageContent);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InlineQueryResultGif[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", gifUrl=")
        .append(gifUrl)
        .append(", gifWidth=")
        .append(gifWidth)
        .append(", gifHeight=")
        .append(gifHeight)
        .append(", gifDuration=")
        .append(gifDuration)
        .append(", thumbnailUrl=")
        .append(thumbnailUrl)
        .append(", thumbnailMimeType=")
        .append(thumbnailMimeType)
        .append(", title=")
        .append(title)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append(", inputMessageContent=")
        .append(inputMessageContent)
        .append("]");
    return builder.toString();
  }
}
