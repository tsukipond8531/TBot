package jarkz.tbot.types.inlinemode;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.WebAppInfo;

public class InlineQueryResultsButton {

	@NotNull
	private String text;

	@SerializedName("web_app")
	private WebAppInfo webApp;

	@SerializedName("start_parameter")
	private String startParameter;

	public InlineQueryResultsButton() {
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Optional<WebAppInfo> getWebApp() {
		return Optional.of(webApp);
	}

	public void setWebApp(WebAppInfo webApp) {
		if (startParameter != null) {
			throw new IllegalStateException(
					"You must use exactly one of the optional fields: webApp or startParameter! Cause: startParameter is not null.");
		}
		this.webApp = webApp;
	}

	public Optional<String> getStartParameter() {
		return Optional.of(startParameter);
	}

	public void setStartParameter(String startParameter) {
		if (webApp != null) {
			throw new IllegalStateException(
					"You must use exactly one of the optional fields: webApp or startParameter! Cause: webApp is not null.");
		}
		this.startParameter = startParameter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(text, webApp, startParameter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InlineQueryResultsButton other))
			return false;
		return Objects.equals(text, other.text)
				&& Objects.equals(webApp, other.webApp)
				&& Objects.equals(startParameter, other.startParameter);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InlineQueryResultsButton[text=").append(text)
				.append(", webApp=").append(webApp)
				.append(", startParameter=").append(startParameter).append("]");
		return builder.toString();
	}
}
