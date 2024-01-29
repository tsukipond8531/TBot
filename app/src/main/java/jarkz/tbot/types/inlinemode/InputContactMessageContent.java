package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents the <a href="https://core.telegram.org/bots/api#inputmessagecontent">content</a> of a
 * contact message to be sent as the result of an inline query.
 *
 * @author Pavel Bialiauski
 */
public class InputContactMessageContent implements InputMessageContent {

  @SerializedName("phone_number")
  @NotNull
  private String phoneNumber;

  @SerializedName("first_name")
  @NotNull
  private String firstName;

  @SerializedName("last_name")
  private String lastName;

  private String vcard;

  /** Default constructor. */
  public InputContactMessageContent() {}

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
    return Optional.ofNullable(lastName);
  }

  /**
   * Sets the contact's last name.
   *
   * @param lastName the contact's last name as String or null if it is not required.
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
    return Optional.ofNullable(vcard);
  }

  /**
   * Sets the additional data about the contact in the form of a <a
   * href="https://en.wikipedia.org/wiki/VCard">vCard</a>, 0-2048 bytes.
   *
   * @param vcard the additional data about the contact in the form of a vcard (0-2048 bytes) as
   *     String or null if it is not required.
   */
  public void setVcard(String vcard) {
    this.vcard = vcard;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(phoneNumber, firstName, lastName, vcard);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputContactMessageContent other)) return false;
    return Objects.equals(phoneNumber, other.phoneNumber)
        && Objects.equals(firstName, other.firstName)
        && Objects.equals(lastName, other.lastName)
        && Objects.equals(vcard, other.vcard);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InputContactMessageContent[phoneNumber=")
        .append(phoneNumber)
        .append(", firstName=")
        .append(firstName)
        .append(", lastName=")
        .append(lastName)
        .append(", vcard=")
        .append(vcard)
        .append("]");
    return builder.toString();
  }
}
