package jarkz.tbot.types;

import java.util.Objects;

import jakarta.validation.constraints.NotNull;

public class WebAppInfo {

	@NotNull
	private String url;

	public WebAppInfo() {
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public int hashCode() {
		return Objects.hash(url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof WebAppInfo other))
			return false;
		return Objects.equals(url, other.url);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WebAppInfo[url=").append(url).append("]");
		return builder.toString();
	}
}
