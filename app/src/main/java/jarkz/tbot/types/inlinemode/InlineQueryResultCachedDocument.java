package jarkz.tbot.types.inlinemode;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a link to a file stored on the Telegram servers. By default, this file will be sent by
 * the user with an optional caption. Alternatively, you can use <i>input_message_content</i> to
 * send a message with the specified content instead of the file.
 *
 * @apiNote This will only work in Telegram versions released after 9 April, 2016. Older clients
 *     will ignore them.
 * @author Pavel Bialiauski
 */
public class InlineQueryResultCachedDocument implements InlineQueryResult {

  /** Type of {@link InlineQueryResult}. Always "document". */
  protected static final String TYPE = "document";

  /**
   * Check whether a inline query document is cached or not.
   *
   * @param jsonObject the InlineQueryResult as json object.
   * @return true if it is cached, otherwise false.
   */
  protected static boolean isCached(JsonObject jsonObject) {
    final String keyToCheck = "document_file_id";
    return jsonObject.get(keyToCheck) != null;
  }

  private final String type = InlineQueryResultCachedDocument.TYPE;

  @NotNull private String id;

  @NotNull private String title;

  @SerializedName("document_file_id")
  @NotNull
  private String documentFileId;

  private String description;

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
  public InlineQueryResultCachedDocument() {}

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
   * A valid file identifier for the file.
   *
   * @return document_file_id as String.
   */
  public String getDocumentFileId() {
    return documentFileId;
  }

  /**
   * Sets the valid file identifier for the file.
   *
   * @param documentFileId the valid file identifier for the file as String.
   */
  public void setDocumentFileId(String documentFileId) {
    this.documentFileId = documentFileId;
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

  @Override
  public final int hashCode() {
    return Objects.hash(
        type,
        id,
        title,
        documentFileId,
        description,
        caption,
        parseMode,
        captionEntities,
        replyMarkup,
        inputMessageContent);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultCachedDocument other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(title, other.title)
        && Objects.equals(documentFileId, other.documentFileId)
        && Objects.equals(description, other.description)
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
        .append("InlineQueryResultCachedDocument[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", title=")
        .append(title)
        .append(", documentFileId=")
        .append(documentFileId)
        .append(", description=")
        .append(description)
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
