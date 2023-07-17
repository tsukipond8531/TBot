package jarkz.tbot.types.passport;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class EncryptedPassportElement {

	@NotNull
	private String type;

	private String data;

	@SerializedName("phone_number")
	private String phoneNumber;

	private String email;

	private List<PassportFile> files;

	@SerializedName("front_side")
	private PassportFile frontSide;

	@SerializedName("reverse_side")
	private PassportFile reverseSide;

	private PassportFile selfie;

	private List<PassportFile> translation;

	@NotNull
	private String hash;

	public EncryptedPassportElement() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Optional<String> getData() {
		return Optional.of(data);
	}

	public void setData(String data) {
		this.data = data;
	}

	public Optional<String> getPhoneNumber() {
		return Optional.of(phoneNumber);
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Optional<String> getEmail() {
		return Optional.of(email);
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Optional<List<PassportFile>> getFiles() {
		return Optional.of(files);
	}

	public void setFiles(List<PassportFile> files) {
		this.files = files;
	}

	public Optional<PassportFile> getFrontSide() {
		return Optional.of(frontSide);
	}

	public void setFrontSide(PassportFile frontSide) {
		this.frontSide = frontSide;
	}

	public Optional<PassportFile> getReverseSide() {
		return Optional.of(reverseSide);
	}

	public void setReverseSide(PassportFile reverseSide) {
		this.reverseSide = reverseSide;
	}

	public Optional<PassportFile> getSelfie() {
		return Optional.of(selfie);
	}

	public void setSelfie(PassportFile selfie) {
		this.selfie = selfie;
	}

	public Optional<List<PassportFile>> getTranslation() {
		return Optional.of(translation);
	}

	public void setTranslation(List<PassportFile> translation) {
		this.translation = translation;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, data, phoneNumber, email, files, frontSide, reverseSide, selfie, translation, hash);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof EncryptedPassportElement other))
			return false;
		return Objects.equals(type, other.type)
				&& Objects.equals(data, other.data)
				&& Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(email, other.email)
				&& Objects.equals(files, other.files)
				&& Objects.equals(frontSide, other.frontSide)
				&& Objects.equals(reverseSide, other.reverseSide)
				&& Objects.equals(selfie, other.selfie)
				&& Objects.equals(translation, other.translation)
				&& Objects.equals(hash, other.hash);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EncryptedPassportElement[type=").append(type)
				.append(", data=").append(data)
				.append(", phoneNumber=").append(phoneNumber)
				.append(", email=").append(email)
				.append(", files=").append(files)
				.append(", frontSide=").append(frontSide)
				.append(", reverseSide=").append(reverseSide)
				.append(", selfie=").append(selfie)
				.append(", translation=").append(translation)
				.append(", hash=").append(hash).append("]");
		return builder.toString();
	}
}
