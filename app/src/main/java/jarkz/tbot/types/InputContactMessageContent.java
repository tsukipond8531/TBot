package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents the content of a contact message to be sent as the result of an inline query. */
public final class InputContactMessageContent implements InputMessageContent {

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
  public final int hashCode() {
    return Objects.hash(phoneNumber, firstName, lastName, vcard);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
