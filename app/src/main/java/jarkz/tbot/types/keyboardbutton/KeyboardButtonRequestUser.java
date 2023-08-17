package jarkz.tbot.types.keyboardbutton;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class KeyboardButtonRequestUser {

	@SerializedName("request_id")
	@NotNull
	private int requestId;

	@SerializedName("user_is_bot")
	private Boolean userIsBot;

	@SerializedName("user_is_premium")
	private Boolean userIsPremium;

	public KeyboardButtonRequestUser() {
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public Optional<Boolean> getUserIsBot() {
		return Optional.of(userIsBot);
	}

	public void setUserIsBot(Boolean userIsBot) {
		this.userIsBot = userIsBot;
	}

	public Optional<Boolean> getUserIsPremium() {
		return Optional.of(userIsPremium);
	}

	public void setUserIsPremium(Boolean userIsPremium) {
		this.userIsPremium = userIsPremium;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(requestId, userIsBot, userIsPremium);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof KeyboardButtonRequestUser other))
			return false;
		return requestId == other.requestId
				&& Objects.equals(userIsBot, other.userIsBot)
				&& Objects.equals(userIsPremium, other.userIsPremium);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KeyboardButtonRequestUser[requestId=").append(requestId)
				.append(", userIsBot=").append(userIsBot)
				.append(", userIsPremium=").append(userIsPremium).append("]");
		return builder.toString();
	}
}
