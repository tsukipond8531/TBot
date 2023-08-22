package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a link to a page containing an embedded video player or a video file. By default, this
 * video file will be sent by the user with an optional caption. Alternatively, you can use
 * <i>input_message_content</i> to send a message with the specified content instead of the video.
 *
 * @author Pavel Bialiauski
 */
public class InlineQueryResultVideo implements InlineQueryResult {

  /**
   * Type of {@link InlineQueryResult}. Always "video".
   */
  protected static final String TYPE = "video";

  private final String type = InlineQueryResultVideo.TYPE;

  @NotNull private String id;

  @SerializedName("video_url")
  @NotNull
  private String videoUrl;

  @SerializedName("mime_type")
  @NotNull
  private String mimeType;

  @SerializedName("thumbnail_url")
  @NotNull
  private String thumbnailUrl;

  @NotNull private String title;

  private String caption;

  @SerializedName("parse_mode")
  private String parseMode;

  @SerializedName("caption_entities")
  private List<MessageEntity> captionEntities;

  @SerializedName("video_width")
  private Integer videoWidth;

  @SerializedName("video_height")
  private Integer videoHeight;

  @SerializedName("video_duration")
  private Integer videoDuration;

  private String description;

  @SerializedName("reply_markup")
  private InlineKeyboardMarkup replyMarkup;

  @SerializedName("input_message_content")
  private InputMessageContent inputMessageContent;

  /** Default constructor. */
  public InlineQueryResultVideo() {}

  /**
   * Type of the result, must be <i>video</i>.
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
   * A valid URL for the embedded video player or video file.
   *
   * @return video_url as String.
   */
  public String getVideoUrl() {
    return videoUrl;
  }

  /**
   * Sets the valid URL for the embedded video player or video file.
   *
   * @param videoUrl the valid URL for the embedded video player or video file as String.
   */
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  /**
   * MIME type of the content of the video URL, “text/html” or “video/mp4”.
   *
   * @return mime_type as String.
   */
  public String getMimeType() {
    return mimeType;
  }

  /**
   * Sets the MIME type of the content of the video URL, “text/html” or “video/mp4”.
   *
   * @param mimeType the MIME type of the content of the video URL, “text/html” or “video/mp4”, as
   *     String.
   */
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * URL of the thumbnail (JPEG only) for the video.
   *
   * @return thumbnail_url as String.
   */
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  /**
   * Sets the URL of the thumbnail (JPEG only) for the video.
   *
   * @param thumbnailUrl the URL of the thumbnail (JPEG only) for the video as String.
   */
  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  /**
   * <i>Optional.</i> Title for the result.
   *
   * @return an optional value of title as String.
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
   * <i>Optional.</i> Caption of the video file to be sent, 0-1024 characters after entities
   * parsing.
   *
   * @return an optional value of caption as String.
   */
  public Optional<String> getCaption() {
    return Optional.of(caption);
  }

  /**
   * Sets the caption of the video to be sent, 0-1024 characters after entities parsing.
   *
   * @param caption the caption of the video to be sent (0-1024 characters after entities parsing)
   *     as String or null if it is not required.
   */
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * <i>Optional.</i> Mode for parsing entities in the video caption. See <a
   * href="https://core.telegram.org/bots/api#formatting-options">formatting options</a> for more
   * details.
   *
   * @return an optional value of parse_mode as String.
   */
  public Optional<String> getParseMode() {
    return Optional.of(parseMode);
  }

  /**
   * Sets the mode for parsing entities in the video caption. See <a
   * href="https://core.telegram.org/bots/api#formatting-options">formatting options</a> for more
   * details.
   *
   * @param parseMode the mode for parsing entities in the video caption as String or null if a
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
   * <i>Optional.</i> Video width.
   *
   * @return an optional value of video_width as Integer.
   */
  public Optional<Integer> getVideoWidth() {
    return Optional.of(videoWidth);
  }

  /**
   * Sets the video width.
   *
   * @param videoWidth the video width as Integer or null if it doesn't provided.
   */
  public void setVideoWidth(Integer videoWidth) {
    this.videoWidth = videoWidth;
  }

  /**
   * <i>Optional.</i> Video height.
   *
   * @return an optional value of video_height as Integer.
   */
  public Optional<Integer> getVideoHeight() {
    return Optional.of(videoHeight);
  }

  /**
   * Sets the video height.
   *
   * @param videoHeight the video height as Integer or null if it doesn't provided.
   */
  public void setVideoHeight(Integer videoHeight) {
    this.videoHeight = videoHeight;
  }

  /**
   * <i>Optional.</i> Video duration in seconds.
   *
   * @return an optional value of video_duration as Integer.
   */
  public Optional<Integer> getVideoDuration() {
    return Optional.of(videoDuration);
  }

  /**
   * Sets the video duration in seconds.
   *
   * @param videoDuration the video duration in seconds as Integer or null if it doesn't provided.
   */
  public void setVideoDuration(Integer videoDuration) {
    this.videoDuration = videoDuration;
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
   * <i>Optional.</i> Content of the message to be sent instead of the video. This field is
   * <strong>required</strong> if InlineQueryResultVideo is used to send an HTML-page as a result
   * (e.g., a YouTube video).
   *
   * @return an optional value of input_message_content as {@link InputMessageContent}.
   */
  public Optional<InputMessageContent> getInputMessageContent() {
    return Optional.of(inputMessageContent);
  }

  /**
   * Sets the content of the message to be sent instead of the video. This field is
   * <strong>required</strong> if InlineQueryResultVideo is used to send an HTML-page as a result
   * (e.g., a YouTube video).
   *
   * @param inputMessageContent the content of the message to be sent instead of the video as {@link
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
        videoUrl,
        mimeType,
        thumbnailUrl,
        title,
        caption,
        parseMode,
        captionEntities,
        videoWidth,
        videoHeight,
        videoDuration,
        description,
        replyMarkup,
        inputMessageContent);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultVideo other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(videoUrl, other.videoUrl)
        && Objects.equals(mimeType, other.mimeType)
        && Objects.equals(thumbnailUrl, other.thumbnailUrl)
        && Objects.equals(title, other.title)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(videoWidth, other.videoWidth)
        && Objects.equals(videoHeight, other.videoHeight)
        && Objects.equals(videoDuration, other.videoDuration)
        && Objects.equals(description, other.description)
        && Objects.equals(replyMarkup, other.replyMarkup)
        && Objects.equals(inputMessageContent, other.inputMessageContent);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InlineQueryResultVideo[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", videoUrl=")
        .append(videoUrl)
        .append(", mimeType=")
        .append(mimeType)
        .append(", thumbnailUrl=")
        .append(thumbnailUrl)
        .append(", title=")
        .append(title)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", videoWidth=")
        .append(videoWidth)
        .append(", videoHeight=")
        .append(videoHeight)
        .append(", videoDuration=")
        .append(videoDuration)
        .append(", description=")
        .append(description)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append(", inputMessageContent=")
        .append(inputMessageContent)
        .append("]");
    return builder.toString();
  }
}
