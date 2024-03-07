package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import jarkz.tbot.types.InlineKeyboardMarkup;
import java.util.Objects;

/**
 * Use this method to edit live location messages. A location can be edited until its live_period
 * expires or editing is explicitly disabled by a call to stopMessageLiveLocation. On success, if
 * the edited message is not an inline message, the edited Message is returned, otherwise True is
 * returned.
 */
public final class EditMessageLiveLocationParameters {

  public static final class Builder {

    private EditMessageLiveLocationParameters buildingType;

    public Builder() {
      buildingType = new EditMessageLiveLocationParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageId(Integer messageId) {
      buildingType.messageId = messageId;
      return this;
    }

    public Builder setInlineMessageId(String inlineMessageId) {
      buildingType.inlineMessageId = inlineMessageId;
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

    public Builder setHorizontalAccuracy(Float horizontalAccuracy) {
      buildingType.horizontalAccuracy = horizontalAccuracy;
      return this;
    }

    public Builder setHeading(Integer heading) {
      buildingType.heading = heading;
      return this;
    }

    public Builder setProximityAlertRadius(Integer proximityAlertRadius) {
      buildingType.proximityAlertRadius = proximityAlertRadius;
      return this;
    }

    public Builder setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      buildingType.replyMarkup = replyMarkup;
      return this;
    }

    public EditMessageLiveLocationParameters build() {
      return buildingType;
    }
  }

  /**
   * Required if inline_message_id is not specified. Unique identifier for the target chat or
   * username of the target channel (in the format @channelusername)
   */
  @SerializedName("chat_id")
  public Id chatId;

  /** Required if inline_message_id is not specified. Identifier of the message to edit */
  @SerializedName("message_id")
  public Integer messageId;

  /** Required if chat_id and message_id are not specified. Identifier of the inline message */
  @SerializedName("inline_message_id")
  public String inlineMessageId;

  /** Latitude of new location */
  @NotNull public float latitude;

  /** Longitude of new location */
  @NotNull public float longitude;

  /** The radius of uncertainty for the location, measured in meters; 0-1500 */
  @SerializedName("horizontal_accuracy")
  public Float horizontalAccuracy;

  /** Direction in which the user is moving, in degrees. Must be between 1 and 360 if specified. */
  public Integer heading;

  /**
   * The maximum distance for proximity alerts about approaching another chat member, in meters.
   * Must be between 1 and 100000 if specified.
   */
  @SerializedName("proximity_alert_radius")
  public Integer proximityAlertRadius;

  /** A JSON-serialized object for a new inline keyboard. */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof EditMessageLiveLocationParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageId, other.messageId)
        && Objects.equals(inlineMessageId, other.inlineMessageId)
        && Float.floatToIntBits(latitude) == Float.floatToIntBits(other.latitude)
        && Float.floatToIntBits(longitude) == Float.floatToIntBits(other.longitude)
        && Objects.equals(horizontalAccuracy, other.horizontalAccuracy)
        && Objects.equals(heading, other.heading)
        && Objects.equals(proximityAlertRadius, other.proximityAlertRadius)
        && Objects.equals(replyMarkup, other.replyMarkup);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chatId,
        messageId,
        inlineMessageId,
        latitude,
        longitude,
        horizontalAccuracy,
        heading,
        proximityAlertRadius,
        replyMarkup);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("EditMessageLiveLocationParameters[chatId=")
        .append(chatId)
        .append(", messageId=")
        .append(messageId)
        .append(", inlineMessageId=")
        .append(inlineMessageId)
        .append(", latitude=")
        .append(latitude)
        .append(", longitude=")
        .append(longitude)
        .append(", horizontalAccuracy=")
        .append(horizontalAccuracy)
        .append(", heading=")
        .append(heading)
        .append(", proximityAlertRadius=")
        .append(proximityAlertRadius)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append("]");
    return builder.toString();
  }
}
