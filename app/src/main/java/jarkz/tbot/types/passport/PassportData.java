package jarkz.tbot.types.passport;

import java.util.List;
import java.util.Objects;

import jakarta.validation.constraints.NotNull;

public class PassportData {

	@NotNull
	private List<EncryptedPassportElement> data;

	@NotNull
	private EncryptedCredentials credentials;

	public PassportData() {
	}

	public List<EncryptedPassportElement> getData() {
		return data;
	}

	public void setData(List<EncryptedPassportElement> data) {
		this.data = data;
	}

	public EncryptedCredentials getCredentials() {
		return credentials;
	}

	public void setCredentials(EncryptedCredentials credentials) {
		this.credentials = credentials;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, credentials);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PassportData other))
			return false;
		return Objects.equals(data, other.data) && Objects.equals(credentials, other.credentials);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PassportData[data=").append(data).append(", credentials=").append(credentials).append("]");
		return builder.toString();
	}
}
