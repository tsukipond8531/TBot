package jarkz.tbot.types.passport;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class PassportElementErrorSelfie implements PassportElementError {

	protected static final String SOURCE = "selfie";

	private final String source = PassportElementErrorSelfie.SOURCE;

	@NotNull
	private String type;

	@SerializedName("file_hash")
	@NotNull
	private String fileHash;

	@NotNull
	private String message;

	public PassportElementErrorSelfie() {
	}

	public String getSource() {
		return source;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFileHash() {
		return fileHash;
	}

	public void setFileHash(String fileHash) {
		this.fileHash = fileHash;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		return Objects.hash(source, type, fileHash, message);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PassportElementErrorSelfie other))
			return false;
		return Objects.equals(source, other.source)
				&& Objects.equals(type, other.type)
				&& Objects.equals(fileHash, other.fileHash)
				&& Objects.equals(message, other.message);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PassportElementErrorSelfie[source=").append(source)
				.append(", type=").append(type)
				.append(", fileHash=").append(fileHash)
				.append(", message=").append(message).append("]");
		return builder.toString();
	}
}
