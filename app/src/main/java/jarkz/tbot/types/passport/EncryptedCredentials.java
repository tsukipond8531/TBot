package jarkz.tbot.types.passport;

import java.util.Objects;

import jakarta.validation.constraints.NotNull;

public class EncryptedCredentials {

	@NotNull
	private String data;

	@NotNull
	private String hash;

	@NotNull
	private String secret;

	public EncryptedCredentials() {
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, hash, secret);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof EncryptedCredentials other))
			return false;
		return Objects.equals(data, other.data)
				&& Objects.equals(hash, other.hash)
				&& Objects.equals(secret, other.secret);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EncryptedCredentials[data=").append(data)
				.append(", hash=").append(hash)
				.append(", secret=").append(secret).append("]");
		return builder.toString();
	}
}
