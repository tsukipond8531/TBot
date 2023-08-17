package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

public class InlineQueryResultArticle implements InlineQueryResult {

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

  public InlineQueryResultArticle() {}

  public String getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public InputMessageContent getInputMessageContent() {
    return inputMessageContent;
  }

  public void setInputMessageContent(InputMessageContent inputMessageContent) {
    this.inputMessageContent = inputMessageContent;
  }

  public Optional<InlineKeyboardMarkup> getReplyMarkup() {
    return Optional.of(replyMarkup);
  }

  public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
    this.replyMarkup = replyMarkup;
  }

  public Optional<String> getUrl() {
    return Optional.of(url);
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Optional<Boolean> getHideUrl() {
    return Optional.of(hideUrl);
  }

  public void setHideUrl(Boolean hideUrl) {
    this.hideUrl = hideUrl;
  }

  public Optional<String> getDescription() {
    return Optional.of(description);
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Optional<String> getThumbnailUrl() {
    return Optional.of(thumbnailUrl);
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  public Optional<Integer> getThumbnailWidth() {
    return Optional.of(thumbnailWidth);
  }

  public void setThumbnailWidth(Integer thumbnailWidth) {
    this.thumbnailWidth = thumbnailWidth;
  }

  public Optional<Integer> getThumbnailHeight() {
    return Optional.of(thumbnailHeight);
  }

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
