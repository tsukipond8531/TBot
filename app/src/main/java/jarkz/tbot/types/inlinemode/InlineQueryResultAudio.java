package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a link to an MP3 audio file. By default, this audio file will be sent by the user.
 * Alternatively, you can use <i>input_message_content</i> to send a message with the specified
 * content instead of the audio.
 *
 * @author Pavel Bialiauski
 */
public class InlineQueryResultAudio implements InlineQueryResult {

  /**
   * Type of {@link InlineQueryResult}. Always "audio".
   */
  protected static final String TYPE = "audio";

  private final String type = InlineQueryResultAudio.TYPE;

  @NotNull private String id;

  @SerializedName("audio_url")
  @NotNull
  private String audioUrl;

  @NotNull private String title;

  private String caption;

  @SerializedName("parse_mode")
  private String parseMode;

  @SerializedName("caption_entities")
  private List<MessageEntity> captionEntities;

  private String performer;

  @SerializedName("audio_duration")
  private Integer audioDuration;

  @SerializedName("reply_markup")
  private InlineKeyboardMarkup replyMarkup;

  @SerializedName("input_message_content")
  private InputMessageContent inputMessageContent;

  /** Default constructor. */
  public InlineQueryResultAudio() {}

  /**
   * Type of the result, must be <i>audio</i>.
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
   * A valid URL for the audio file.
   *
   * @return audio_url as String.
   */
  public String getAudioUrl() {
    return audioUrl;
  }

  /**
   * Sets the valid URL for the audio file.
   *
   * @param audioUrl the valid URL for the audio file as String.
   */
  public void setAudioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
  }

  /**
   * Title.
   *
   * @return title as String.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the title.
   *
   * @param title the title as String.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * <i>Optional.</i> Caption, 0-1024 characters after entities parsing.
   *
   * @return an optional value of caption as String.
   */
  public Optional<String> getCaption() {
    return Optional.of(caption);
  }

  /**
   * Sets the caption, 0-1024 characters after entities parsing.
   *
   * @param caption the caption (0-1024 characters after entities parsing) as String or null if it
   *     is not required.
   */
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * <i>Optional.</i> Mode for parsing entities in the audio caption. See <a
   * href="https://core.telegram.org/bots/api#formatting-options">formatting options</a> for more
   * details.
   *
   * @return an optional value of parse_mode as String.
   */
  public Optional<String> getParseMode() {
    return Optional.of(parseMode);
  }

  /**
   * Sets the mode for parsing entities in the audio caption. See <a
   * href="https://core.telegram.org/bots/api#formatting-options">formatting options</a> for more
   * details.
   *
   * @param parseMode the mode for parsing entities in the audio caption as String or null if a
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
   * <i>Optional.</i> Performer.
   *
   * @return an optional value of performer as String.
   */
  public Optional<String> getPerformer() {
    return Optional.of(performer);
  }

  /**
   * Sets the performer.
   *
   * @param performer the performer as String or null if it doesn't provided.
   */
  public void setPerformer(String performer) {
    this.performer = performer;
  }

  /**
   * <i>Optional.</i> Audio duration in seconds.
   *
   * @return an optional value of audio_duration as Integer.
   */
  public Optional<Integer> getAudioDuration() {
    return Optional.of(audioDuration);
  }

  /**
   * Sets the audio duration in seconds.
   *
   * @param audioDuration the audio duration in seconds as Integer or null if it doesn't provided.
   */
  public void setAudioDuration(Integer audioDuration) {
    this.audioDuration = audioDuration;
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
   * <i>Optional.</i> Content of the message to be sent instead of the audio.
   *
   * @return an optional value of input_message_content as {@link InputMessageContent}.
   */
  public Optional<InputMessageContent> getInputMessageContent() {
    return Optional.of(inputMessageContent);
  }

  /**
   * Sets the content of the message to be sent instead of the audio.
   *
   * @param inputMessageContent the content of the message to be sent instead of the audio as {@link
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
        audioUrl,
        title,
        caption,
        parseMode,
        captionEntities,
        performer,
        audioDuration,
        replyMarkup,
        inputMessageContent);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultAudio other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(audioUrl, other.audioUrl)
        && Objects.equals(title, other.title)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(performer, other.performer)
        && Objects.equals(audioDuration, other.audioDuration)
        && Objects.equals(replyMarkup, other.replyMarkup)
        && Objects.equals(inputMessageContent, other.inputMessageContent);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InlineQueryResultAudio[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", audioUrl=")
        .append(audioUrl)
        .append(", title=")
        .append(title)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", performer=")
        .append(performer)
        .append(", audioDuration=")
        .append(audioDuration)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append(", inputMessageContent=")
        .append(inputMessageContent)
        .append("]");
    return builder.toString();
  }
}
