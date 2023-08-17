package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class InlineQueryResultVideo implements InlineQueryResult {

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

  public InlineQueryResultVideo() {}

  public String getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Optional<String> getCaption() {
    return Optional.of(caption);
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public Optional<String> getParseMode() {
    return Optional.of(parseMode);
  }

  public void setParseMode(String parseMode) {
    this.parseMode = parseMode;
  }

  public Optional<List<MessageEntity>> getCaptionEntities() {
    return Optional.of(captionEntities);
  }

  public void setCaptionEntities(List<MessageEntity> captionEntities) {
    this.captionEntities = captionEntities;
  }

  public Optional<Integer> getVideoWidth() {
    return Optional.of(videoWidth);
  }

  public void setVideoWidth(Integer videoWidth) {
    this.videoWidth = videoWidth;
  }

  public Optional<Integer> getVideoHeight() {
    return Optional.of(videoHeight);
  }

  public void setVideoHeight(Integer videoHeight) {
    this.videoHeight = videoHeight;
  }

  public Optional<Integer> getVideoDuration() {
    return Optional.of(videoDuration);
  }

  public void setVideoDuration(Integer videoDuration) {
    this.videoDuration = videoDuration;
  }

  public Optional<String> getDescription() {
    return Optional.of(description);
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Optional<InlineKeyboardMarkup> getReplyMarkup() {
    return Optional.of(replyMarkup);
  }

  public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
    this.replyMarkup = replyMarkup;
  }

  public Optional<InputMessageContent> getInputMessageContent() {
    return Optional.of(inputMessageContent);
  }

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
