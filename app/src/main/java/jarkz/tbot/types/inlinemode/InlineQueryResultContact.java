package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a contact with a phone number. By default, this contact will be sent by the user.
 * Alternatively, you can use <i>input_message_content</i> to send a message with the specified
 * content instead of the contact.
 *
 * @apiNote This will only work in Telegram versions released after 9 April, 2016. Older clients
 *     will ignore them.
 * @author Pavel Bialiauski
 */
public class InlineQueryResultContact implements InlineQueryResult {

  /**
   * Type of {@link InlineQueryResult}. Always "contact".
   */
  protected static final String TYPE = "contact";

  private final String type = InlineQueryResultContact.TYPE;

  @NotNull private String id;

  @SerializedName("phone_number")
  @NotNull
  private String phoneNumber;

  @SerializedName("first_name")
  @NotNull
  private String firstName;

  @SerializedName("last_name")
  private String lastName;

  private String vcard;

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
  public InlineQueryResultContact() {}

  /**
   * Type of the result, must be <i>contact</i>.
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
   * Contact's phone number.
   *
   * @return phone_number as String.
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Sets the contact's phone number.
   *
   * @param phoneNumber the contact's phone number as String.
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * Contact's first name.
   *
   * @return first_name as String.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets the contact's first name.
   *
   * @param firstName the contact's first name as String.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * <i>Optional.</i> Contact's last name.
   *
   * @return an optional value of last_name as String.
   */
  public Optional<String> getLastName() {
    return Optional.of(lastName);
  }

  /**
   * Sets the contact's last name.
   *
   * @param lastName the contact's last name as String or null if it doesn't exists.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * <i>Optional.</i> Additional data about the contact in the form of a <a
   * href="https://en.wikipedia.org/wiki/VCard">vCard</a>, 0-2048 bytes.
   *
   * @return an optional value of vcard as String.
   */
  public Optional<String> getVcard() {
    return Optional.of(vcard);
  }

  /**
   * Sets the additional data about the contact in the form of a <a
   * href="https://en.wikipedia.org/wiki/VCard">vCard</a>, 0-2048 bytes.
   *
   * @param vcard the additional data about the contact in the form of vCard (0-2048 bytes) as
   *     String or null if it doesn't exists.
   */
  public void setVcard(String vcard) {
    this.vcard = vcard;
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
   * <i>Optional.</i> Content of the message to be sent instead of the contact.
   *
   * @return an optional value of input_message_content as {@link InputMessageContent}.
   */
  public Optional<InputMessageContent> getInputMessageContent() {
    return Optional.of(inputMessageContent);
  }

  /**
   * Sets the content of the message to be sent instead of the contact.
   *
   * @param inputMessageContent the content of the message to be sent instead of the contact as
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
   * @param thumbnailUrl the URL of the thumbnail for the result as String.
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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
