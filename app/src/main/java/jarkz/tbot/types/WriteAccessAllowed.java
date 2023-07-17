package jarkz.tbot.types;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

public class WriteAccessAllowed {

	@SerializedName("web_app_name")
	private String webAppName;

	public WriteAccessAllowed() {
	}

	public Optional<String> getWebAppName() {
		return Optional.of(webAppName);
	}

	public void setWebAppName(String webAppName) {
		this.webAppName = webAppName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(webAppName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof WriteAccessAllowed other))
			return false;
		return Objects.equals(webAppName, other.webAppName);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WriteAccessAllowed[webAppName=").append(webAppName).append("]");
		return builder.toString();
	}
}
