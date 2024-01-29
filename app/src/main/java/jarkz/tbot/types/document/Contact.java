package jarkz.tbot.types.document;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a phone contact.
 *
 * @author Pavel Bialiauski
 */
public class Contact {

  @SerializedName("phone_number")
  @NotNull
  private String phoneNumber;

  @SerializedName("first_name")
  @NotNull
  private String firstName;

  @SerializedName("last_name")
  private String lastName;

  @SerializedName("user_id")
  private Long userId;

  private String vcard;

  /** Default constructor. */
  public Contact() {}

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
   * @param lastName the contact's last name as String or null if it doesn't provided.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * <i>Optional.</i> Contact's user identifier in Telegram.
   *
   * @return an optional value of user_id as Long.
   */
  public Optional<Long> getUserId() {
    return Optional.ofNullable(userId);
  }

  /**
   * Sets the contact's user identifier in Telegram.
   *
   * @param userId the contact's user identifier in Telegram as Long or null if it doesn't provided.
   */
  public void setUserId(Long userId) {
    this.userId = userId;
  }

  /**
   * <i>Optional.</i> Additional data about the contact in the form of a <a
   * href="https://en.wikipedia.org/wiki/VCard">vCard</a>.
   *
   * @return an optional value of vcard as String.
   */
  public Optional<String> getVcard() {
    return Optional.ofNullable(vcard);
  }

  /**
   * Sets the additional data about the contact in the form of a <a
   * href="https://en.wikipedia.org/wiki/VCard">vCard</a>.
   *
   * @param vcard the additional data about the contact in the form of a vCard as String or null if
   *     doesn't provided.
   */
  public void setVcard(String vcard) {
    this.vcard = vcard;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(phoneNumber, firstName, lastName, userId, vcard);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Contact other)) return false;
    return Objects.equals(phoneNumber, other.phoneNumber)
        && Objects.equals(firstName, other.firstName)
        && Objects.equals(lastName, other.lastName)
        && Objects.equals(userId, other.userId)
        && Objects.equals(vcard, other.vcard);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("Contact[phoneNumber=")
        .append(phoneNumber)
        .append(", firstName=")
        .append(firstName)
        .append(", lastName=")
        .append(lastName)
        .append(", userId=")
        .append(userId)
        .append(", vcard=")
        .append(vcard)
        .append("]");
    return builder.toString();
  }
}
