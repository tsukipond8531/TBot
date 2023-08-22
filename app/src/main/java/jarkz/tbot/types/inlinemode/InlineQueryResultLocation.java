package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a location on a map. By default, the location will be sent by the user. Alternatively,
 * you can use <i>input_message_content</i> to send a message with the specified content instead of
 * the location.
 *
 * @apiNote This will only work in Telegram versions released after 9 April, 2016. Older clients
 *     will ignore them.
 * @author Pavel Bialiauski
 */
public class InlineQueryResultLocation implements InlineQueryResult {

  /**
   * Type of {@link InlineQueryResult}. Always "location".
   */
  protected static final String TYPE = "location";

  private final String type = InlineQueryResultLocation.TYPE;

  @NotNull private String id;

  @NotNull private float latitude;

  @NotNull private float longitude;

  @NotNull private String title;

  @SerializedName("horizontal_accuracy")
  private Float horizontalAccuracy;

  @SerializedName("live_period")
  private Integer livePeriod;

  private Integer heading;

  @SerializedName("proximity_alert_radius")
  private Integer proximityAlertRadius;

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
  public InlineQueryResultLocation() {}

  /**
   * Type of the result, must be <i>location</i>.
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
   * Location latitude in degrees.
   *
   * @return latitude as float.
   */
  public float getLatitude() {
    return latitude;
  }

  /**
   * Sets the location latitude in degrees.
   *
   * @param latitude the location latitude in degrees as float.
   */
  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  /**
   * Location longitude in degrees.
   *
   * @return longitude as float.
   */
  public float getLongitude() {
    return longitude;
  }

  /**
   * Sets the location longitude in degrees.
   *
   * @param longitude the location longitude in degrees as float.
   */
  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  /**
   * Location title.
   *
   * @return title as String.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the location title.
   *
   * @param title the location title as String.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * <i>Optional.</i> The radius of uncertainty for the location, measured in meters; 0-1500.
   *
   * @return an optional value of horizontal_accuracy as Float.
   */
  public Optional<Float> getHorizontalAccuracy() {
    return Optional.of(horizontalAccuracy);
  }

  /**
   * Sets the radius of uncertainty for the location, measured in meters; 0-1500.
   *
   * @param horizontalAccuracy the radius of uncertainty for the location (0-1500 meters) as Float
   *     or null if it is not required.
   */
  public void setHorizontalAccuracy(Float horizontalAccuracy) {
    this.horizontalAccuracy = horizontalAccuracy;
  }

  /**
   * <i>Optional.</i> Period in seconds for which the location can be updated, should be between 60
   * and 86400.
   *
   * @return an optional value of live_period as Integer.
   */
  public Optional<Integer> getLivePeriod() {
    return Optional.of(livePeriod);
  }

  /**
   * Sets the period in seconds for which the location can be updated, should be between 60 and
   * 86400.
   *
   * @param livePeriod the period in seconds for which the location can be updated (60-86400
   *     seconds) as Integer or null if it is not required.
   */
  public void setLivePeriod(Integer livePeriod) {
    this.livePeriod = livePeriod;
  }

  /**
   * <i>Optional.</i> For live locations, a direction in which the user is moving, in degrees. Must
   * be between 1 and 360 if specified.
   *
   * @return an optional value of heading as Integer.
   */
  public Optional<Integer> getHeading() {
    return Optional.of(heading);
  }

  /**
   * Sets the direction in which the user is moving, in degrees; for live locations. Must be between
   * 1 and 360 if specified.
   *
   * @param heading the direction in which the user is moving (1-360 degree) as Integer or null if
   *     it is not for live location.
   */
  public void setHeading(Integer heading) {
    this.heading = heading;
  }

  /**
   * <i>Optional.</i> For live locations, a maximum distance for proximity alerts about approaching
   * another chat member, in meters. Must be between 1 and 100000 if specified.
   *
   * @return an optional value of proximity_alert_radius as Integer.
   */
  public Optional<Integer> getProximityAlertRadius() {
    return Optional.of(proximityAlertRadius);
  }

  /**
   * Sets the maximum distance for proximity alerts about approaching another chat member, in
   * meters; for live locations. Must be between 1 and 100000 if specified.
   *
   * @param proximityAlertRadius the maximum distance for proximity alerts about approaching another
   *     chat member (1 - 100000 meters) as Integer or null if it is not for live location.
   */
  public void setProximityAlertRadius(Integer proximityAlertRadius) {
    this.proximityAlertRadius = proximityAlertRadius;
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
   * <i>Optional.</i> Content of the message to be sent instead of the location.
   *
   * @return an optional value of input_message_content as {@link InputMessageContent}.
   */
  public Optional<InputMessageContent> getInputMessageContent() {
    return Optional.of(inputMessageContent);
  }

  /**
   * Sets the content of the message to be sent instead of the location.
   *
   * @param inputMessageContent the content of the message to be sent instead of the location as
   *     {@link InputMessageContent} or null if it is not required.
   */
  public void setInputMessageContent(InputMessageContent inputMessageContent) {
    this.inputMessageContent = inputMessageContent;
  }

  /**
   * <i>Optional.</i> URL of the thumbnail for the result.
   *
   * @return an optional value of thumbnail_url as String.
   */
  public Optional<String> getThumbnailUrl() {
    return Optional.of(thumbnailUrl);
  }

  /**
   * Sets the URL of the thumbnail for the result.
   *
   * @param thumbnailUrl the URL of the thumbnail for the result as String or null if it is not
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
        latitude,
        longitude,
        title,
        horizontalAccuracy,
        livePeriod,
        heading,
        proximityAlertRadius,
        replyMarkup,
        inputMessageContent,
        thumbnailUrl,
        thumbnailWidth,
        thumbnailHeight);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultLocation other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(latitude, other.latitude)
        && Objects.equals(longitude, other.longitude)
        && Objects.equals(title, other.title)
        && Objects.equals(horizontalAccuracy, other.horizontalAccuracy)
        && Objects.equals(livePeriod, other.livePeriod)
        && Objects.equals(heading, other.heading)
        && Objects.equals(proximityAlertRadius, other.proximityAlertRadius)
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
        .append("InlineQueryResultLocation[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", latitude=")
        .append(latitude)
        .append(", longitude=")
        .append(longitude)
        .append(", title=")
        .append(title)
        .append(", horizontalAccuracy=")
        .append(horizontalAccuracy)
        .append(", livePeriod=")
        .append(livePeriod)
        .append(", heading=")
        .append(heading)
        .append(", proximityAlertRadius=")
        .append(proximityAlertRadius)
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
