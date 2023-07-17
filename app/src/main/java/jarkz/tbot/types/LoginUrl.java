package jarkz.tbot.types;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class LoginUrl {

	@NotNull
	private String url;

	@SerializedName("forward_text")
	private String forwardText;

	@SerializedName("bot_username")
	private String botUsername;

	@SerializedName("request_write_access")
	private Boolean requestWriteAccess;

	public LoginUrl() {
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Optional<String> getForwardText() {
		return Optional.of(forwardText);
	}

	public void setForwardText(String forwardText) {
		this.forwardText = forwardText;
	}

	public Optional<String> getBotUsername() {
		return Optional.of(botUsername);
	}

	public void setBotUsername(String botUsername) {
		this.botUsername = botUsername;
	}

	public Optional<Boolean> isRequestWriteAccess() {
		return Optional.of(requestWriteAccess);
	}

	public void setRequestWriteAccess(Boolean requestWriteAccess) {
		this.requestWriteAccess = requestWriteAccess;
	}

	@Override
	public int hashCode() {
		return Objects.hash(url, forwardText, botUsername, requestWriteAccess);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof LoginUrl other))
			return false;
		return Objects.equals(url, other.url)
				&& Objects.equals(forwardText, other.forwardText)
				&& Objects.equals(botUsername, other.botUsername)
				&& Objects.equals(requestWriteAccess, other.requestWriteAccess);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginUrl[url=").append(url)
				.append(", forwardText=").append(forwardText)
				.append(", botUsername=").append(botUsername)
				.append(", requestWriteAccess=").append(requestWriteAccess).append("]");
		return builder.toString();
	}
}
