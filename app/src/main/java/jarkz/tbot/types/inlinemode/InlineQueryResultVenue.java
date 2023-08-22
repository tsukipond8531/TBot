package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a venue. By default, the venue will be sent by the user. Alternatively, you can use
 * <i>input_message_content</i> to send a message with the specified content instead of the venue.
 *
 * @apiNote This will only work in Telegram versions released after 9 April, 2016. Older clients
 *     will ignore them.
 * @author Pavel Bialiauski
 */
public class InlineQueryResultVenue implements InlineQueryResult {

  /**
   * Type of {@link InlineQueryResult}. Always "venue".
   */
  protected static final String TYPE = "venue";

  private final String type = InlineQueryResultVenue.TYPE;

  @NotNull private String id;

  @NotNull private float latitude;

  @NotNull private float longitude;

  @NotNull private String title;

  @NotNull private String address;

  @SerializedName("foursquare_id")
  private String foursquareId;

  @SerializedName("foursquare_type")
  private String foursquareType;

  @SerializedName("google_place_id")
  private String googlePlaceId;

  @SerializedName("google_place_type")
  private String googlePlaceType;

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
  public InlineQueryResultVenue() {}

  /**
   * Type of the result, must be <i>venue</i>.
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
   * Latitude of the venue location in degrees.
   *
   * @return latitude as float.
   */
  public float getLatitude() {
    return latitude;
  }

  /**
   * Sets the latitude of the venue location in degrees.
   *
   * @param latitude the latitude of the venue location in degrees as float.
   */
  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  /**
   * Longitude of the venue location in degrees.
   *
   * @return longitude as float.
   */
  public float getLongitude() {
    return longitude;
  }

  /**
   * Sets the longitude of the venue location in degrees.
   *
   * @param longitude the longitude of the venue location in degrees as float.
   */
  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  /**
   * Title of the venue.
   *
   * @return title as String.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the title of the venue.
   *
   * @param title the title of the venue as String.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Address of the venue.
   *
   * @return address as String.
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the address of the venue.
   *
   * @param address the address of the venue as String.
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * <i>Optional.</i> Foursquare identifier of the venue if known.
   *
   * @return an optional value of foursquare_id as String.
   */
  public Optional<String> getFoursquareId() {
    return Optional.of(foursquareId);
  }

  /**
   * Sets the foursquare identifier of the venue if known.
   *
   * @param foursquareId the foursquare identifier of the venue as String or null if it is unknown.
   */
  public void setFoursquareId(String foursquareId) {
    this.foursquareId = foursquareId;
  }

  /**
   * <i>Optional.</i> Foursquare type of the venue, if known. (For example,
   * “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.).
   *
   * @return an optional value of foursquare_type as String.
   */
  public Optional<String> getFoursquareType() {
    return Optional.of(foursquareType);
  }

  /**
   * Sets the foursquare type of the venue, if known. (For example, “arts_entertainment/default”,
   * “arts_entertainment/aquarium” or “food/icecream”.).
   *
   * @param foursquareType the foursquare type of the venue as String or null if it is unknown.
   */
  public void setFoursquareType(String foursquareType) {
    this.foursquareType = foursquareType;
  }

  /**
   * <i>Optional.</i> Google Places identifier of the venue.
   *
   * @return an optional value of google_place_id as String.
   */
  public Optional<String> getGooglePlaceId() {
    return Optional.of(googlePlaceId);
  }

  /**
   * Sets the Google Places identifier of the venue.
   *
   * @param googlePlaceId the Google Places identifier of the venue as String or null if it is not
   *     required.
   */
  public void setGooglePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
  }

  /**
   * <i>Optional.</i> Google Places type of the venue. (See <a
   * href="https://developers.google.com/places/web-service/supported_types">supported types</a>.).
   *
   * @return an optional value of google_place_type as String.
   */
  public Optional<String> getGooglePlaceType() {
    return Optional.of(googlePlaceType);
  }

  /**
   * Sets the Google Places type of the venue. (See <a
   * href="https://developers.google.com/places/web-service/supported_types">supported types</a>.).
   *
   * @param googlePlaceType the Google Places type of the venue as String or null if Google Place
   *     Type is not provided.
   */
  public void setGooglePlaceType(String googlePlaceType) {
    this.googlePlaceType = googlePlaceType;
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
   * <i>Optional.</i> Content of the message to be sent instead of the venue.
   *
   * @return an optional value of input_message_content as {@link InputMessageContent}.
   */
  public Optional<InputMessageContent> getInputMessageContent() {
    return Optional.of(inputMessageContent);
  }

  /**
   * Sets the content of the message to be sent instead of the venue.
   *
   * @param inputMessageContent the content of the message to be sent instead of the venue as {@link
   *     InputMessageContent} or null if it is not required.
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
   * <i>Optional.</i> Thumbnail height.
   *
   * @return an optional value of thumbnail_height as Integer.
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
        address,
        foursquareId,
        foursquareType,
        googlePlaceId,
        googlePlaceType,
        replyMarkup,
        inputMessageContent,
        thumbnailUrl,
        thumbnailWidth,
        thumbnailHeight);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultVenue other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(latitude, other.latitude)
        && Objects.equals(longitude, other.longitude)
        && Objects.equals(title, other.title)
        && Objects.equals(address, other.address)
        && Objects.equals(foursquareId, other.foursquareId)
        && Objects.equals(foursquareType, other.foursquareType)
        && Objects.equals(googlePlaceId, other.googlePlaceId)
        && Objects.equals(googlePlaceType, other.googlePlaceType)
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
        .append("InlineQueryResultVenue[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", latitude=")
        .append(latitude)
        .append(", longitude=")
        .append(longitude)
        .append(", title=")
        .append(title)
        .append(", address=")
        .append(address)
        .append(", foursquareId=")
        .append(foursquareId)
        .append(", foursquareType=")
        .append(foursquareType)
        .append(", googlePlaceId=")
        .append(googlePlaceId)
        .append(", googlePlaceType=")
        .append(googlePlaceType)
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
