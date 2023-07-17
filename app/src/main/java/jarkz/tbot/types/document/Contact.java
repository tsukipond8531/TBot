package jarkz.tbot.types.document;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

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

	public Contact() {
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

	public Optional<Long> getUserId() {
		return Optional.of(userId);
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Optional<String> getVcard() {
		return Optional.of(vcard);
	}

	public void setVcard(String vcard) {
		this.vcard = vcard;
	}

	@Override
	public int hashCode() {
		return Objects.hash(phoneNumber, firstName, lastName, userId, vcard);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Contact other))
			return false;
		return Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName)
				&& Objects.equals(userId, other.userId)
				&& Objects.equals(vcard, other.vcard);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contact[phoneNumber=").append(phoneNumber)
				.append(", firstName=").append(firstName)
				.append(", lastName=").append(lastName)
				.append(", userId=").append(userId)
				.append(", vcard=").append(vcard).append("]");
		return builder.toString();
	}
}
