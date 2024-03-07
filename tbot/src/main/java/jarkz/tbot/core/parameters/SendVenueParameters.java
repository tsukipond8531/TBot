package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import jarkz.tbot.types.ReplyMarkup;
import jarkz.tbot.types.ReplyParameters;
import java.util.Objects;

/** Use this method to send information about a venue. On success, the sent Message is returned. */
public final class SendVenueParameters {

  public static final class Builder {

    private SendVenueParameters buildingType;

    public Builder() {
      buildingType = new SendVenueParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageThreadId(Integer messageThreadId) {
      buildingType.messageThreadId = messageThreadId;
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

    public Builder setDisableNotification(Boolean disableNotification) {
      buildingType.disableNotification = disableNotification;
      return this;
    }

    public Builder setProtectContent(Boolean protectContent) {
      buildingType.protectContent = protectContent;
      return this;
    }

    public Builder setReplyParameters(ReplyParameters replyParameters) {
      buildingType.replyParameters = replyParameters;
      return this;
    }

    public Builder setReplyMarkup(ReplyMarkup replyMarkup) {
      buildingType.replyMarkup = replyMarkup;
      return this;
    }

    public SendVenueParameters build() {
      return buildingType;
    }
  }

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /**
   * Unique identifier for the target message thread (topic) of the forum; for forum supergroups
   * only
   */
  @SerializedName("message_thread_id")
  public Integer messageThreadId;

  /** Latitude of the venue */
  @NotNull public float latitude;

  /** Longitude of the venue */
  @NotNull public float longitude;

  /** Name of the venue */
  @NotNull public String title;

  /** Address of the venue */
  @NotNull public String address;

  /** Foursquare identifier of the venue */
  @SerializedName("foursquare_id")
  public String foursquareId;

  /**
   * Foursquare type of the venue, if known. (For example, "arts_entertainment/default",
   * "arts_entertainment/aquarium" or "food/icecream".)
   */
  @SerializedName("foursquare_type")
  public String foursquareType;

  /** Google Places identifier of the venue */
  @SerializedName("google_place_id")
  public String googlePlaceId;

  /** Google Places type of the venue. (See supported types.) */
  @SerializedName("google_place_type")
  public String googlePlaceType;

  /** Sends the message silently. Users will receive a notification with no sound. */
  @SerializedName("disable_notification")
  public Boolean disableNotification;

  /** Protects the contents of the sent message from forwarding and saving */
  @SerializedName("protect_content")
  public Boolean protectContent;

  /** Description of the message to reply to */
  @SerializedName("reply_parameters")
  public ReplyParameters replyParameters;

  /**
   * Additional interface options. A JSON-serialized object for an inline keyboard, custom reply
   * keyboard, instructions to remove reply keyboard or to force a reply from the user.
   */
  @SerializedName("reply_markup")
  public ReplyMarkup replyMarkup;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SendVenueParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageThreadId, other.messageThreadId)
        && Float.floatToIntBits(latitude) == Float.floatToIntBits(other.latitude)
        && Float.floatToIntBits(longitude) == Float.floatToIntBits(other.longitude)
        && Objects.equals(title, other.title)
        && Objects.equals(address, other.address)
        && Objects.equals(foursquareId, other.foursquareId)
        && Objects.equals(foursquareType, other.foursquareType)
        && Objects.equals(googlePlaceId, other.googlePlaceId)
        && Objects.equals(googlePlaceType, other.googlePlaceType)
        && Objects.equals(disableNotification, other.disableNotification)
        && Objects.equals(protectContent, other.protectContent)
        && Objects.equals(replyParameters, other.replyParameters)
        && Objects.equals(replyMarkup, other.replyMarkup);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chatId,
        messageThreadId,
        latitude,
        longitude,
        title,
        address,
        foursquareId,
        foursquareType,
        googlePlaceId,
        googlePlaceType,
        disableNotification,
        protectContent,
        replyParameters,
        replyMarkup);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SendVenueParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
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
        .append(", disableNotification=")
        .append(disableNotification)
        .append(", protectContent=")
        .append(protectContent)
        .append(", replyParameters=")
        .append(replyParameters)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append("]");
    return builder.toString();
  }
}
