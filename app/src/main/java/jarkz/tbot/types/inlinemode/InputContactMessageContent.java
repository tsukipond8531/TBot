package jarkz.tbot.types.inlinemode;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

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

	public InputContactMessageContent() {
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Optional<String> getLastName() {
		return Optional.of(lastName);
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Optional<String> getVcard() {
		return Optional.of(vcard);
	}

	public void setVcard(String vcard) {
		this.vcard = vcard;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(phoneNumber, firstName, lastName, vcard);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InputContactMessageContent other))
			return false;
		return Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName)
				&& Objects.equals(vcard, other.vcard);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InputContactMessageContent[phoneNumber=").append(phoneNumber)
				.append(", firstName=").append(firstName)
				.append(", lastName=").append(lastName)
				.append(", vcard=").append(vcard).append("]");
		return builder.toString();
	}
}
