package jarkz.tbot.types.passport;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class PassportElementErrorUnspecified implements PassportElementError {

	protected static final String SOURCE = "unspecified";

	private final String source = PassportElementErrorUnspecified.SOURCE;

	@NotNull
	private String type;

	@SerializedName("element_hash")
	@NotNull
	private String elementHash;

	@NotNull
	private String message;

	public PassportElementErrorUnspecified() {
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

	public String getElementHash() {
		return elementHash;
	}

	public void setElementHash(String elementHash) {
		this.elementHash = elementHash;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(source, type, elementHash, message);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PassportElementErrorUnspecified other))
			return false;
		return Objects.equals(source, other.source)
				&& Objects.equals(type, other.type)
				&& Objects.equals(elementHash, other.elementHash)
				&& Objects.equals(message, other.message);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PassportElementErrorUnspecified[source=").append(source)
				.append(", type=").append(type)
				.append(", elementHash=").append(elementHash)
				.append(", message=").append(message).append("]");
		return builder.toString();
	}
}
