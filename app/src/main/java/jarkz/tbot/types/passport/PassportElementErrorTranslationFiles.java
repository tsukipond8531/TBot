package jarkz.tbot.types.passport;

import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class PassportElementErrorTranslationFiles implements PassportElementError {

	protected static final String SOURCE = "translation_files";

	private final String source = PassportElementErrorTranslationFiles.SOURCE;

	@NotNull
	private String type;

	@SerializedName("file_hashes")
	@NotNull
	private List<String> fileHashes;

	@NotNull
	private String message;

	public PassportElementErrorTranslationFiles() {
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

	public List<String> getFileHashes() {
		return fileHashes;
	}

	public void setFileHashes(List<String> fileHashes) {
		this.fileHashes = fileHashes;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(source, type, fileHashes, message);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PassportElementErrorTranslationFiles other))
			return false;
		return Objects.equals(source, other.source)
				&& Objects.equals(type, other.type)
				&& Objects.equals(fileHashes, other.fileHashes)
				&& Objects.equals(message, other.message);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PassportElementErrorTranslationFiles[source=").append(source)
				.append(", type=").append(type)
				.append(", fileHashes=").append(fileHashes)
				.append(", message=").append(message).append("]");
		return builder.toString();
	}
}
