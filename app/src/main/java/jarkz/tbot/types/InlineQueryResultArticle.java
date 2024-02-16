package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents a link to an article or web page. */
public final class InlineQueryResultArticle implements InlineQueryResult {

  /** Type of the result, must be article */
  @NotNull public String type;

  /** Unique identifier for this result, 1-64 Bytes */
  @NotNull public String id;

  /** Title of the result */
  @NotNull public String title;

  /** Content of the message to be sent */
  @NotNull
  @SerializedName("input_message_content")
  public InputMessageContent inputMessageContent;

  /** Optional. Inline keyboard attached to the message */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  /** Optional. URL of the result */
  public String url;

  /** Optional. Pass True if you don't want the URL to be shown in the message */
  @SerializedName("hide_url")
  public Boolean hideUrl;

  /** Optional. Short description of the result */
  public String description;

  /** Optional. Url of the thumbnail for the result */
  @SerializedName("thumbnail_url")
  public String thumbnailUrl;

  /** Optional. Thumbnail width */
  @SerializedName("thumbnail_width")
  public Integer thumbnailWidth;

  /** Optional. Thumbnail height */
  @SerializedName("thumbnail_height")
  public Integer thumbnailHeight;

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
  public final String toString() {
    var builder = new StringBuilder();
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
