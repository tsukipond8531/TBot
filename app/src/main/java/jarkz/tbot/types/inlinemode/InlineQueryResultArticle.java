package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a link to an article or web page.
 *
 * @author Pavel Bialiauski
 */
public class InlineQueryResultArticle implements InlineQueryResult {

  /**
   * Type of {@link InlineQueryResult}. Always "article".
   */
  protected static final String TYPE = "article";

  private final String type = InlineQueryResultArticle.TYPE;

  @NotNull private String id;

  @NotNull private String title;

  @SerializedName("input_message_content")
  @NotNull
  private InputMessageContent inputMessageContent;

  @SerializedName("reply_markup")
  private InlineKeyboardMarkup replyMarkup;

  private String url;

  @SerializedName("hide_url")
  private Boolean hideUrl;

  private String description;

  @SerializedName("thumbnail_url")
  private String thumbnailUrl;

  @SerializedName("thumbnail_width")
  private Integer thumbnailWidth;

  @SerializedName("thumbnail_height")
  private Integer thumbnailHeight;

  /** Default constructor. */
  public InlineQueryResultArticle() {}

  /**
   * Type of the result, must be <i>article</i>.
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
   * Title of the result.
   *
   * @return title as String.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the title of the result.
   *
   * @param title the title of the result as String.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Content of the message to be sent.
   *
   * @return input_message_content as {@link InputMessageContent}.
   */
  public InputMessageContent getInputMessageContent() {
    return inputMessageContent;
  }

  /**
   * Sets the content of the message to be sent.
   *
   * @param inputMessageContent the content of the message to be sent as {@link
   *     InputMessageContent}.
   */
  public void setInputMessageContent(InputMessageContent inputMessageContent) {
    this.inputMessageContent = inputMessageContent;
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
   * <i>Optional.</i> URL of the result.
   *
   * @return an optional value of url as String.
   */
  public Optional<String> getUrl() {
    return Optional.of(url);
  }

  /**
   * Sets the URL of the result.
   *
   * @param url the URL of the result as String or null if it not required.
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * <i>Optional.</i> <i>True</i> if you don't want the URL to be shown in the message.
   *
   * @return an optional value of hide_url as Boolean.
   */
  public Optional<Boolean> getHideUrl() {
    return Optional.of(hideUrl);
  }

  /**
   * Pass <i>True</i> if you don't want the URL to be shown in the message.
   *
   * @param hideUrl true if you don't want the URL to be shown in message, otherwise - false or
   *     null.
   */
  public void setHideUrl(Boolean hideUrl) {
    this.hideUrl = hideUrl;
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
   * @param description the short description of the result as String or null if it not required.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * <i>Optional.</i> Url of the thumbnail for the result.
   *
   * @return an optional value of thumbnail_url as String.
   */
  public Optional<String> getThumbnailUrl() {
    return Optional.of(thumbnailUrl);
  }

  /**
   * Sets the url of the thumbnail for the result.
   *
   * @param thumbnailUrl the url of the thumbnail for the result as String or null if it not
   *     required.
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
   * @param thumbnailWidth the thumbnail width as Integer or null if a thumbnail url is not
   *     provided.
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
   * @param thumbnailHeight the thumbnail height as Integer or null if a thumbnail url is not
   *     provided.
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
        inputMessageContent,
        replyMarkup,
        url,
        hideUrl,
        description,
        thumbnailUrl,
        thumbnailWidth,
        thumbnailHeight);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultArticle other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(title, other.title)
        && Objects.equals(inputMessageContent, other.inputMessageContent)
        && Objects.equals(replyMarkup, other.replyMarkup)
        && Objects.equals(url, other.url)
        && Objects.equals(hideUrl, other.hideUrl)
        && Objects.equals(description, other.description)
        && Objects.equals(thumbnailUrl, other.thumbnailUrl)
        && Objects.equals(thumbnailWidth, other.thumbnailWidth)
        && Objects.equals(thumbnailHeight, other.thumbnailHeight);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InlineQueryResultArticle[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", title=")
        .append(title)
        .append(", inputMessageContent=")
        .append(inputMessageContent)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append(", url=")
        .append(url)
        .append(", hideUrl=")
        .append(hideUrl)
        .append(", description=")
        .append(description)
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
