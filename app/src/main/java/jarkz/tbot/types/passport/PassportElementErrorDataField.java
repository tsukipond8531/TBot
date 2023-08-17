package jarkz.tbot.types.passport;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class PassportElementErrorDataField implements PassportElementError {

	protected static final String SOURCE = "data";

	private final String source = PassportElementErrorDataField.SOURCE;

	@NotNull
	private String type;

	@SerializedName("field_name")
	@NotNull
	private String fieldName;

	@SerializedName("data_hash")
	@NotNull
	private String dataHash;

	@NotNull
	private String message;

	public PassportElementErrorDataField() {
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

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getDataHash() {
		return dataHash;
	}

	public void setDataHash(String dataHash) {
		this.dataHash = dataHash;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(source, type, fieldName, dataHash, message);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PassportElementErrorDataField other))
			return false;
		return Objects.equals(source, other.source)
				&& Objects.equals(type, other.type)
				&& Objects.equals(fieldName, other.fieldName)
				&& Objects.equals(dataHash, other.dataHash)
				&& Objects.equals(message, other.message);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PassportElementErrorDataField[source=").append(source)
				.append(", type=").append(type)
				.append(", fieldName=").append(fieldName)
				.append(", dataHash=").append(dataHash)
				.append(", message=").append(message).append("]");
		return builder.toString();
	}
}
