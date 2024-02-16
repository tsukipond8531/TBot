package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents a location on a map. By default, the location will be sent by the user. Alternatively,
 * you can use input_message_content to send a message with the specified content instead of the
 * location.
 */
public final class InlineQueryResultLocation implements InlineQueryResult {

  /** Type of the result, must be location */
  @NotNull public String type;

  /** Unique identifier for this result, 1-64 Bytes */
  @NotNull public String id;

  /** Location latitude in degrees */
  @NotNull public float latitude;

  /** Location longitude in degrees */
  @NotNull public float longitude;

  /** Location title */
  @NotNull public String title;

  /** Optional. The radius of uncertainty for the location, measured in meters; 0-1500 */
  @SerializedName("horizontal_accuracy")
  public Float horizontalAccuracy;

  /**
   * Optional. Period in seconds for which the location can be updated, should be between 60 and
   * 86400.
   */
  @SerializedName("live_period")
  public Integer livePeriod;

  /**
   * Optional. For live locations, a direction in which the user is moving, in degrees. Must be
   * between 1 and 360 if specified.
   */
  public Integer heading;

  /**
   * Optional. For live locations, a maximum distance for proximity alerts about approaching another
   * chat member, in meters. Must be between 1 and 100000 if specified.
   */
  @SerializedName("proximity_alert_radius")
  public Integer proximityAlertRadius;

  /** Optional. Inline keyboard attached to the message */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  /** Optional. Content of the message to be sent instead of the location */
  @SerializedName("input_message_content")
  public InputMessageContent inputMessageContent;

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
    if (!(obj instanceof InlineQueryResultLocation other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Float.floatToIntBits(latitude) == Float.floatToIntBits(other.latitude)
        && Float.floatToIntBits(longitude) == Float.floatToIntBits(other.longitude)
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
  public final String toString() {
    var builder = new StringBuilder();
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
