package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a link to a photo. By default, this photo will be sent by the user with optional
 * caption. Alternatively, you can use <i>input_message_content</i> to send a message with the
 * specified content instead of the photo.
 *
 * @author Pavel Bialiauski
 */
public class InlineQueryResultPhoto implements InlineQueryResult {

  /** Type of {@link InlineQueryResult}. Always "photo". */
  protected static final String TYPE = "photo";

  private final String type = InlineQueryResultPhoto.TYPE;

  @NotNull private String id;

  @SerializedName("photo_url")
  @NotNull
  private String photoUrl;

  @SerializedName("thumbnail_url")
  @NotNull
  private String thumbnailUrl;

  @SerializedName("photo_width")
  private Integer photoWidth;

  @SerializedName("photo_height")
  private Integer photoHeight;

  private String title;

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
  public InlineQueryResultPhoto() {}

  /**
   * Type of the result, must be <i>photo</i>.
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
   * A valid URL of the photo. Photo must be in <strong>JPEG</strong> format. Photo size must not
   * exceed 5MB.
   *
   * @return photo_url as String.
   */
  public String getPhotoUrl() {
    return photoUrl;
  }

  /**
   * Sets the valid URL of the photo. Photo must be in <strong>JPEG</strong> format. Photo size must
   * not exceed 5MB.
   *
   * @param photoUrl the valid URL of the photo as String.
   */
  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }

  /**
   * URL of the thumbnail for the photo.
   *
   * @return thumbnail_url as String.
   */
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  /**
   * Sets the URL of the thumbnail for the photo.
   *
   * @param thumbnailUrl the URL of the thumbnail for the photo as String.
   */
  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  /**
   * <i>Optional.</i> Width of the photo.
   *
   * @return an optional value of photo_width as Integer.
   */
  public Optional<Integer> getPhotoWidth() {
    return Optional.ofNullable(photoWidth);
  }

  /**
   * Sets the width of the photo.
   *
   * @param photoWidth the width of the photo as Integer or null if it doesn't provided.
   */
  public void setPhotoWidth(Integer photoWidth) {
    this.photoWidth = photoWidth;
  }

  /**
   * <i>Optional.</i> Height of the photo.
   *
   * @return an optional value of photo_height as Integer.
   */
  public Optional<Integer> getPhotoHeight() {
    return Optional.ofNullable(photoHeight);
  }

  /**
   * Sets the height of the photo.
   *
   * @param photoHeight the height of the photo as Integer or null if it doesn't provided.
   */
  public void setPhotoHeight(Integer photoHeight) {
    this.photoHeight = photoHeight;
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
   * @param title the title for the result as String or null if it is not required.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * <i>Optional.</i> Short description of the result.
   *
   * @return an optional value of description as String.
   */
  public Optional<String> getDescription() {
    return Optional.ofNullable(description);
  }

  /**
   * Sets the short description of the result.
   *
   * @param description the short description of the result as String or null if it not required.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * <i>Optional.</i> Caption of the photo to be sent, 0-1024 characters after entities parsing.
   *
   * @return an optional value of caption as String.
   */
  public Optional<String> getCaption() {
    return Optional.ofNullable(caption);
  }

  /**
   * Sets the caption of the photo to be sent, 0-1024 characters after entities parsing.
   *
   * @param caption the caption of the photo to be sent (0-1024 characters after entities parsing)
   *     as String or null if it is not required.
   */
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * <i>Optional.</i> Mode for parsing entities in the photo caption. See <a
   * href="https://core.telegram.org/bots/api#formatting-options">formatting options</a> for more
   * details.
   *
   * @return an optional value of parse_mode as String.
   */
  public Optional<String> getParseMode() {
    return Optional.ofNullable(parseMode);
  }

  /**
   * Sets the mode for parsing entities in the photo caption. See <a
   * href="https://core.telegram.org/bots/api#formatting-options">formatting options</a> for more
   * details.
   *
   * @param parseMode the mode for parsing entities in the photo caption as String or null if a
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
   * <i>Optional.</i> Content of the message to be sent instead of the photo.
   *
   * @return an optional value of input_message_content as {@link InputMessageContent}.
   */
  public Optional<InputMessageContent> getInputMessageContent() {
    return Optional.ofNullable(inputMessageContent);
  }

  /**
   * Sets the content of the message to be sent instead of the photo.
   *
   * @param inputMessageContent the content of the message to be sent instead of the photo as {@link
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
        photoUrl,
        thumbnailUrl,
        photoWidth,
        photoHeight,
        title,
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
    if (!(obj instanceof InlineQueryResultPhoto other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(photoUrl, other.photoUrl)
        && Objects.equals(thumbnailUrl, other.thumbnailUrl)
        && Objects.equals(photoWidth, other.photoWidth)
        && Objects.equals(photoHeight, other.photoHeight)
        && Objects.equals(title, other.title)
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
        .append("InlineQueryResultPhoto[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", photoUrl=")
        .append(photoUrl)
        .append(", thumbnailUrl=")
        .append(thumbnailUrl)
        .append(", photoWidth=")
        .append(photoWidth)
        .append(", photoHeight=")
        .append(photoHeight)
        .append(", title=")
        .append(title)
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
