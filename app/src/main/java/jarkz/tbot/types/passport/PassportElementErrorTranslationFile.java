package jarkz.tbot.types.passport;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class PassportElementErrorTranslationFile implements PassportElementError {

	protected static final String SOURCE = "translation_file";

	private final String source = PassportElementErrorTranslationFile.SOURCE;

	@NotNull
	private String type;

	@SerializedName("file_hash")
	@NotNull
	private String fileHash;

	@NotNull
	private String message;

	public PassportElementErrorTranslationFile() {
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
	final public int hashCode() {
		return Objects.hash(source, type, fileHash, message);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PassportElementErrorTranslationFile other))
			return false;
		return Objects.equals(source, other.source)
				&& Objects.equals(type, other.type)
				&& Objects.equals(fileHash, other.fileHash)
				&& Objects.equals(message, other.message);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PassportElementErrorTranslationFile[source=").append(source)
				.append(", type=").append(type)
				.append(", fileHash=").append(fileHash)
				.append(", message=").append(message).append("]");
		return builder.toString();
	}
}
