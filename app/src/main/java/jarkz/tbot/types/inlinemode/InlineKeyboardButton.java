package jarkz.tbot.types.inlinemode;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.LoginUrl;
import jarkz.tbot.types.SwitchInlineQueryChosenChat;
import jarkz.tbot.types.WebAppInfo;
import jarkz.tbot.types.games.CallbackGame;

public class InlineKeyboardButton {

	@NotNull
	private String text;

	private String url;

	@SerializedName("callback_data")
	private String callbackData;

	@SerializedName("web_app")
	private WebAppInfo webApp;

	@SerializedName("login_url")
	private LoginUrl loginUrl;

	@SerializedName("switch_inline_query")
	private String switchInlineQuery;

	@SerializedName("switch_inline_query_current_chat")
	private String switchInlineQueryCurrentChat;

	@SerializedName("switch_inline_query_chosen_chat")
	private SwitchInlineQueryChosenChat switchInlineQueryChosenChat;

	@SerializedName("callback_game")
	private CallbackGame callbackGame;

	private Boolean pay;

	public InlineKeyboardButton() {
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Optional<String> getUrl() {
		return Optional.of(url);
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Optional<String> getCallbackData() {
		return Optional.of(callbackData);
	}

	public void setCallbackData(String callbackData) {
		this.callbackData = callbackData;
	}

	public Optional<WebAppInfo> getWebApp() {
		return Optional.of(webApp);
	}

	public void setWebApp(WebAppInfo webApp) {
		this.webApp = webApp;
	}

	public Optional<LoginUrl> getLoginUrl() {
		return Optional.of(loginUrl);
	}

	public void setLoginUrl(LoginUrl loginUrl) {
		this.loginUrl = loginUrl;
	}

	public Optional<String> getSwitchInlineQuery() {
		return Optional.of(switchInlineQuery);
	}

	public void setSwitchInlineQuery(String switchInlineQuery) {
		this.switchInlineQuery = switchInlineQuery;
	}

	public Optional<String> getSwitchInlineQueryCurrentChat() {
		return Optional.of(switchInlineQueryCurrentChat);
	}

	public void setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
		this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
	}

	public Optional<SwitchInlineQueryChosenChat> getSwitchInlineQueryChosenChat() {
		return Optional.of(switchInlineQueryChosenChat);
	}

	public void setSwitchInlineQueryChosenChat(SwitchInlineQueryChosenChat switchInlineQueryChosenChat) {
		this.switchInlineQueryChosenChat = switchInlineQueryChosenChat;
	}

	public Optional<CallbackGame> getCallbackGame() {
		return Optional.of(callbackGame);
	}

	public void setCallbackGame(CallbackGame callbackGame) {
		this.callbackGame = callbackGame;
	}

	public Optional<Boolean> isPay() {
		return Optional.of(pay);
	}

	public void setPay(Boolean pay) {
		this.pay = pay;
	}

	@Override
	public int hashCode() {
		return Objects.hash(text,
				url,
				callbackData,
				webApp,
				loginUrl,
				switchInlineQuery,
				switchInlineQueryCurrentChat,
				switchInlineQueryChosenChat,
				callbackGame,
				pay);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InlineKeyboardButton other))
			return false;
		return Objects.equals(text, other.text)
				&& Objects.equals(url, other.url)
				&& Objects.equals(callbackData, other.callbackData)
				&& Objects.equals(webApp, other.webApp)
				&& Objects.equals(loginUrl, other.loginUrl)
				&& Objects.equals(switchInlineQuery, other.switchInlineQuery)
				&& Objects.equals(switchInlineQueryCurrentChat, other.switchInlineQueryCurrentChat)
				&& Objects.equals(switchInlineQueryChosenChat, other.switchInlineQueryChosenChat)
				&& Objects.equals(callbackGame, other.callbackGame)
				&& Objects.equals(pay, other.pay);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InlineKeyboardButton[text=").append(text)
				.append(", url=").append(url)
				.append(", callbackData=").append(callbackData)
				.append(", webApp=").append(webApp)
				.append(", loginUrl=").append(loginUrl)
				.append(", switchInlineQuery=").append(switchInlineQuery)
				.append(", switchInlineQueryCurrentChat=").append(switchInlineQueryCurrentChat)
				.append(", switchInlineQueryChosenChat=").append(switchInlineQueryChosenChat)
				.append(", callbackGame=").append(callbackGame)
				.append(", pay=").append(pay).append("]");
		return builder.toString();
	}
}
