package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents a contact with a phone number. By default, this contact will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the specified content
 * instead of the contact.
 */
public final class InlineQueryResultContact implements InlineQueryResult {

  public static final class Builder {

    private InlineQueryResultContact buildingType;

    public Builder() {
      buildingType = new InlineQueryResultContact();
    }

    public Builder setId(String id) {
      buildingType.id = id;
      return this;
    }

    public Builder setPhoneNumber(String phoneNumber) {
      buildingType.phoneNumber = phoneNumber;
      return this;
    }

    public Builder setFirstName(String firstName) {
      buildingType.firstName = firstName;
      return this;
    }

    public Builder setLastName(String lastName) {
      buildingType.lastName = lastName;
      return this;
    }

    public Builder setVcard(String vcard) {
      buildingType.vcard = vcard;
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

    public InlineQueryResultContact build() {
      return buildingType;
    }
  }

  public static final String TYPE = "contact";

  /** Type of the result, must be contact */
  @NotNull public final String type = TYPE;

  /** Unique identifier for this result, 1-64 Bytes */
  @NotNull public String id;

  /** Contact's phone number */
  @NotNull
  @SerializedName("phone_number")
  public String phoneNumber;

  /** Contact's first name */
  @NotNull
  @SerializedName("first_name")
  public String firstName;

  /** Optional. Contact's last name */
  @SerializedName("last_name")
  public String lastName;

  /** Optional. Additional data about the contact in the form of a vCard, 0-2048 bytes */
  public String vcard;

  /** Optional. Inline keyboard attached to the message */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  /** Optional. Content of the message to be sent instead of the contact */
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
    if (!(obj instanceof InlineQueryResultContact other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(phoneNumber, other.phoneNumber)
        && Objects.equals(firstName, other.firstName)
        && Objects.equals(lastName, other.lastName)
        && Objects.equals(vcard, other.vcard)
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
        phoneNumber,
        firstName,
        lastName,
        vcard,
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
        .append("InlineQueryResultContact[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", phoneNumber=")
        .append(phoneNumber)
        .append(", firstName=")
        .append(firstName)
        .append(", lastName=")
        .append(lastName)
        .append(", vcard=")
        .append(vcard)
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
