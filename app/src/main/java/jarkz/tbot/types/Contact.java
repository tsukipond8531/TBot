package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a phone contact. */
public final class Contact {

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

  /**
   * Optional. Contact's user identifier in Telegram. This number may have more than 32 significant
   * bits and some programming languages may have difficulty/silent defects in interpreting it. But
   * it has at most 52 significant bits, so a 64-bit integer or double-precision float type are safe
   * for storing this identifier.
   */
  @SerializedName("user_id")
  public Integer userId;

  /** Optional. Additional data about the contact in the form of a vCard */
  public String vcard;

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
  public final int hashCode() {
    return Objects.hash(phoneNumber, firstName, lastName, userId, vcard);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
