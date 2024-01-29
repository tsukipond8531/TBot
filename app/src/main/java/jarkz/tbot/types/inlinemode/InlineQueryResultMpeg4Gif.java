package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a link to a video animation (H.264/MPEG-4 AVC video without sound). By default, this
 * animated MPEG-4 file will be sent by the user with optional caption. Alternatively, you can use
 * <i>input_message_content</i> to send a message with the specified content instead of the
 * animation.
 *
 * @author Pavel Bialiauski
 */
public class InlineQueryResultMpeg4Gif implements InlineQueryResult {

  /** Type of {@link InlineQueryResult}. Always "mpeg4_gif". */
  protected static final String TYPE = "mpeg4_gif";

  private final String type = InlineQueryResultMpeg4Gif.TYPE;

  @NotNull private String id;

  @SerializedName("mpeg4_url")
  @NotNull
  private String mpeg4Url;

  @SerializedName("mpeg4_width")
  private Integer mpeg4Width;

  @SerializedName("mpeg4_height")
  private Integer mpeg4Height;

  @SerializedName("mpeg4_duration")
  private Integer mpeg4Duration;

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
  public InlineQueryResultMpeg4Gif() {}

  /**
   * Type of the result, must be <i>mpeg4_gif</i>.
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
   * A valid URL for the MPEG4 file. File size must not exceed 1MB.
   *
   * @return mpeg4_url as String.
   */
  public String getMpeg4Url() {
    return mpeg4Url;
  }

  /**
   * Sets the valid URL for the MPEG4 file. File size must not exceed 1MB.
   *
   * @param mpeg4Url the valid URL for the MPEG4 file as String.
   */
  public void setMpeg4Url(String mpeg4Url) {
    this.mpeg4Url = mpeg4Url;
  }

  /**
   * <i>Optional.</i> Video width.
   *
   * @return an optional value of mpeg4_width as Integer.
   */
  public Optional<Integer> getMpeg4Width() {
    return Optional.ofNullable(mpeg4Width);
  }

  /**
   * Sets the video width.
   *
   * @param mpeg4Width the video width as Integer or null if it doesn't provided.
   */
  public void setMpeg4Width(Integer mpeg4Width) {
    this.mpeg4Width = mpeg4Width;
  }

  /**
   * <i>Optional.</i> Video height.
   *
   * @return an optional value of mpeg4_height as Integer.
   */
  public Optional<Integer> getMpeg4Height() {
    return Optional.ofNullable(mpeg4Height);
  }

  /**
   * Sets the video height.
   *
   * @param mpeg4Height the video height as Integer or null if it doesn't provided.
   */
  public void setMpeg4Height(Integer mpeg4Height) {
    this.mpeg4Height = mpeg4Height;
  }

  /**
   * <i>Optional.</i> Video duration in seconds.
   *
   * @return an optional value of mpeg4_duration as Integer.
   */
  public Optional<Integer> getMpeg4Duration() {
    return Optional.ofNullable(mpeg4Duration);
  }

  /**
   * Sets the video duration in seconds.
   *
   * @param mpeg4Duration the video duration in seconds as Integer or null if it doesn't provided.
   */
  public void setMpeg4Duration(Integer mpeg4Duration) {
    this.mpeg4Duration = mpeg4Duration;
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
    return Optional.ofNullable(thumbnailMimeType);
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
    return Optional.ofNullable(title);
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
   * <i>Optional.</i> Caption of the MPEG-4 file to be sent, 0-1024 characters after entities
   * parsing.
   *
   * @return an optional value of caption as String.
   */
  public Optional<String> getCaption() {
    return Optional.ofNullable(caption);
  }

  /**
   * Sets the caption of the MPEG-4 to be sent, 0-1024 characters after entities parsing.
   *
   * @param caption the caption of the MPEG-4 to be sent (0-1024 characters after entities parsing)
   *     as String or null if it is not required.
   */
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * <i>Optional.</i> Mode for parsing entities in the caption. See <a
   * href="https://core.telegram.org/bots/api#formatting-options">formatting options</a> for more
   * details.
   *
   * @return an optional value of parse_mode as String.
   */
  public Optional<String> getParseMode() {
    return Optional.ofNullable(parseMode);
  }

  /**
   * Sets the mode for parsing entities in the caption. See <a
   * href="https://core.telegram.org/bots/api#formatting-options">formatting options</a> for more
   * details.
   *
   * @param parseMode the mode for parsing entities in the caption as String or null if a caption is
   *     not provided.
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
    return Optional.ofNullable(captionEntities);
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
    return Optional.ofNullable(replyMarkup);
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
   * <i>Optional.</i> Content of the message to be sent instead of the video animation.
   *
   * @return an optional value of input_message_content as {@link InputMessageContent}.
   */
  public Optional<InputMessageContent> getInputMessageContent() {
    return Optional.ofNullable(inputMessageContent);
  }

  /**
   * Sets the content of the message to be sent instead of the video animation.
   *
   * @param inputMessageContent the content of the message to be sent instead of the video animation
   *     as {@link InputMessageContent} or null if it is not reuiqred.
   */
  public void setInputMessageContent(InputMessageContent inputMessageContent) {
    this.inputMessageContent = inputMessageContent;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        type,
        id,
        mpeg4Url,
        mpeg4Width,
        mpeg4Height,
        mpeg4Duration,
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
    if (!(obj instanceof InlineQueryResultMpeg4Gif other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(mpeg4Url, other.mpeg4Url)
        && Objects.equals(mpeg4Width, other.mpeg4Width)
        && Objects.equals(mpeg4Height, other.mpeg4Height)
        && Objects.equals(mpeg4Duration, other.mpeg4Duration)
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
        .append("InlineQueryResultMpeg4Gif[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", mpeg4Url=")
        .append(mpeg4Url)
        .append(", mpeg4Width=")
        .append(mpeg4Width)
        .append(", mpeg4Height=")
        .append(mpeg4Height)
        .append(", mpeg4Duration=")
        .append(mpeg4Duration)
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
