package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a link to a file. By default, this file will be sent by the user with an optional
 * caption. Alternatively, you can use <i>input_message_content</i> to send a message with the
 * specified content instead of the file. Currently, only <strong>.PDF</strong> and
 * <strong>.ZIP</strong> files can be sent using this method.
 *
 * @apiNote This will only work in Telegram versions released after 9 April, 2016. Older clients
 *     will ignore them.
 * @author Pavel Bialiauski
 */
public class InlineQueryResultDocument implements InlineQueryResult {

  /** Type of {@link InlineQueryResult}. Always "document". */
  protected static final String TYPE = "document";

  private final String type = InlineQueryResultDocument.TYPE;

  @NotNull private String id;

  @NotNull private String title;

  private String caption;

  @SerializedName("parse_mode")
  private String parseMode;

  @SerializedName("caption_entities")
  private List<MessageEntity> captionEntities;

  @SerializedName("document_url")
  @NotNull
  private String documentUrl;

  @SerializedName("mime_type")
  @NotNull
  private String mimeType;

  private String description;

  @SerializedName("reply_markup")
  private InlineKeyboardMarkup replyMarkup;

  @SerializedName("input_message_content")
  private InputMessageContent inputMessageContent;

  @SerializedName("thumbnail_url")
  private String thumbnailUrl;

  @SerializedName("thumbnail_width")
  private Integer thumbnailWidth;

  @SerializedName("thumbnail_height")
  private Integer thumbnailHeight;

  /** Default constructor. */
  public InlineQueryResultDocument() {}

  /**
   * Type of the result, must be <i>document</i>.
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
   * Title for the result.
   *
   * @return title as String.
   */
  public String getTitle() {
    return title;
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
   * <i>Optional.</i> Caption of the document to be sent, 0-1024 characters after entities parsing.
   *
   * @return an optional value of caption as String.
   */
  public Optional<String> getCaption() {
    return Optional.of(caption);
  }

  /**
   * Sets the caption of the document to be sent, 0-1024 characters after entities parsing.
   *
   * @param caption the caption of the document to be sent (0-1024 characters after entities
   *     parsing) as String or null if it is not required.
   */
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * <i>Optional.</i> Mode for parsing entities in the voice message caption. See <a
   * href="https://core.telegram.org/bots/api#formatting-options">formatting options</a> for more
   * details.
   *
   * @return an optional value of parse_mode as String.
   */
  public Optional<String> getParseMode() {
    return Optional.of(parseMode);
  }

  /**
   * Sets the mode for parsing entities in the voice message caption. See <a
   * href="https://core.telegram.org/bots/api#formatting-options">formatting options</a> for more
   * details.
   *
   * @param parseMode the mode for parsing entities in the voice message caption as String or null
   *     if a caption is not provided.
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
   * A valid URL for the file.
   *
   * @return document_url as String.
   */
  public String getDocumentUrl() {
    return documentUrl;
  }

  /**
   * Sets the valid URL for the file.
   *
   * @param documentUrl the valid URL for the file as String.
   */
  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }

  /**
   * MIME type of the content of the file, either “application/pdf” or “application/zip”.
   *
   * @return mime_type as String.
   */
  public String getMimeType() {
    return mimeType;
  }

  /**
   * Sets the MIME type of the content of the file, either “application/pdf” or “application/zip”.
   *
   * @param mimeType the MIME type of the content of the file, either “application/pdf” or
   *     “application/zip”, as String.
   */
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * <i>Optional.</i> Short description of the result.
   *
   * @return an optional value of description as String.
   */
  public Optional<String> getDescription() {
    return Optional.of(description);
  }

  /**
   * Sets the short description of the result.
   *
   * @param description the short description of the result as String or null if it is not required.
   */
  public void setDescription(String description) {
    this.description = description;
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
   * <i>Optional.</i> Content of the message to be sent instead of the file.
   *
   * @return an optional value of input_message_content as {@link InputMessageContent}.
   */
  public Optional<InputMessageContent> getInputMessageContent() {
    return Optional.of(inputMessageContent);
  }

  /**
   * Sets the content of the message to be sent instead of the file.
   *
   * @param inputMessageContent the content of the message to be sent instead of the file as {@link
   *     InputMessageContent} or null if it is not required.
   */
  public void setInputMessageContent(InputMessageContent inputMessageContent) {
    this.inputMessageContent = inputMessageContent;
  }

  /**
   * <i>Optional.</i> URL of the thumbnail (JPEG only) for the file.
   *
   * @return an optional value of thumbnail_url as String.
   */
  public Optional<String> getThumbnailUrl() {
    return Optional.of(thumbnailUrl);
  }

  /**
   * Sets the URL of the thumbnail (JPEG only) for the file.
   *
   * @param thumbnailUrl the URL of the thumbnail (JPEG only) for the file as String or null if it
   *     is not required.
   */
  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  /**
   * <i>Optional.</i> Thumbnail width.
   *
   * @return an optional value of thumbnail_width as Integer.
   */
  public Optional<Integer> getThumbnailWidth() {
    return Optional.of(thumbnailWidth);
  }

  /**
   * Sets the thumbnail width.
   *
   * @param thumbnailWidth the thumbnail width as Integer or null if thumbnail doesn't provided.
   */
  public void setThumbnailWidth(Integer thumbnailWidth) {
    this.thumbnailWidth = thumbnailWidth;
  }

  /**
   * <i>Optional.</i> Thumbnail height.
   *
   * @return an optional value of thumbnail_height as Integer.
   */
  public Optional<Integer> getThumbnailHeight() {
    return Optional.of(thumbnailHeight);
  }

  /**
   * Sets the thumbnail height.
   *
   * @param thumbnailHeight the thumbnail height as Integer or null if thumbnail doesn't provided.
   */
  public void setThumbnailHeight(Integer thumbnailHeight) {
    this.thumbnailHeight = thumbnailHeight;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        type,
        id,
        title,
        caption,
        parseMode,
        captionEntities,
        documentUrl,
        mimeType,
        description,
        replyMarkup,
        inputMessageContent,
        thumbnailUrl,
        thumbnailWidth,
        thumbnailHeight);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultDocument other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(title, other.title)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(documentUrl, other.documentUrl)
        && Objects.equals(mimeType, other.mimeType)
        && Objects.equals(description, other.description)
        && Objects.equals(replyMarkup, other.replyMarkup)
        && Objects.equals(inputMessageContent, other.inputMessageContent)
        && Objects.equals(thumbnailUrl, other.thumbnailUrl)
        && Objects.equals(thumbnailWidth, other.thumbnailWidth)
        && Objects.equals(thumbnailHeight, other.thumbnailHeight);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InlineQueryResultDocument[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", title=")
        .append(title)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", documentUrl=")
        .append(documentUrl)
        .append(", mimeType=")
        .append(mimeType)
        .append(", description=")
        .append(description)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append(", inputMessageContent=")
        .append(inputMessageContent)
        .append(", thumbnailUrl=")
        .append(thumbnailUrl)
        .append(", thumbnailWidth=")
        .append(thumbnailWidth)
        .append(", thumbnailHeight=")
        .append(thumbnailHeight)
        .append("]");
    return builder.toString();
  }
}
