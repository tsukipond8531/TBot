package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents a venue. By default, the venue will be sent by the user. Alternatively, you can use
 * input_message_content to send a message with the specified content instead of the venue.
 */
public final class InlineQueryResultVenue implements InlineQueryResult {

  public static final class Builder {

    private InlineQueryResultVenue buildingType;

    public Builder() {
      buildingType = new InlineQueryResultVenue();
    }

    public Builder setId(String id) {
      buildingType.id = id;
      return this;
    }

    public Builder setLatitude(float latitude) {
      buildingType.latitude = latitude;
      return this;
    }

    public Builder setLongitude(float longitude) {
      buildingType.longitude = longitude;
      return this;
    }

    public Builder setTitle(String title) {
      buildingType.title = title;
      return this;
    }

    public Builder setAddress(String address) {
      buildingType.address = address;
      return this;
    }

    public Builder setFoursquareId(String foursquareId) {
      buildingType.foursquareId = foursquareId;
      return this;
    }

    public Builder setFoursquareType(String foursquareType) {
      buildingType.foursquareType = foursquareType;
      return this;
    }

    public Builder setGooglePlaceId(String googlePlaceId) {
      buildingType.googlePlaceId = googlePlaceId;
      return this;
    }

    public Builder setGooglePlaceType(String googlePlaceType) {
      buildingType.googlePlaceType = googlePlaceType;
      return this;
    }

    public Builder setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      buildingType.replyMarkup = replyMarkup;
      return this;
    }

    public Builder setInputMessageContent(InputMessageContent inputMessageContent) {
      buildingType.inputMessageContent = inputMessageContent;
      return this;
    }

    public Builder setThumbnailUrl(String thumbnailUrl) {
      buildingType.thumbnailUrl = thumbnailUrl;
      return this;
    }

    public Builder setThumbnailWidth(Integer thumbnailWidth) {
      buildingType.thumbnailWidth = thumbnailWidth;
      return this;
    }

    public Builder setThumbnailHeight(Integer thumbnailHeight) {
      buildingType.thumbnailHeight = thumbnailHeight;
      return this;
    }

    public InlineQueryResultVenue build() {
      return buildingType;
    }
  }

  public static final String TYPE = "venue";

  /** Type of the result, must be venue */
  @NotNull public final String type = TYPE;

  /** Unique identifier for this result, 1-64 Bytes */
  @NotNull public String id;

  /** Latitude of the venue location in degrees */
  @NotNull public float latitude;

  /** Longitude of the venue location in degrees */
  @NotNull public float longitude;

  /** Title of the venue */
  @NotNull public String title;

  /** Address of the venue */
  @NotNull public String address;

  /** Optional. Foursquare identifier of the venue if known */
  @SerializedName("foursquare_id")
  public String foursquareId;

  /**
   * Optional. Foursquare type of the venue, if known. (For example, "arts_entertainment/default",
   * "arts_entertainment/aquarium" or "food/icecream".)
   */
  @SerializedName("foursquare_type")
  public String foursquareType;

  /** Optional. Google Places identifier of the venue */
  @SerializedName("google_place_id")
  public String googlePlaceId;

  /** Optional. Google Places type of the venue. (See supported types.) */
  @SerializedName("google_place_type")
  public String googlePlaceType;

  /** Optional. Inline keyboard attached to the message */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  /** Optional. Content of the message to be sent instead of the venue */
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
    if (!(obj instanceof InlineQueryResultVenue other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Float.floatToIntBits(latitude) == Float.floatToIntBits(other.latitude)
        && Float.floatToIntBits(longitude) == Float.floatToIntBits(other.longitude)
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
  public final String toString() {
    var builder = new StringBuilder();
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
