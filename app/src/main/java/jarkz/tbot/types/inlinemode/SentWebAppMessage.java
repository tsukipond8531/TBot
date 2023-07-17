package jarkz.tbot.types.inlinemode;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

public class SentWebAppMessage {

	@SerializedName("inline_message_id")
	private String inlineMessageId;

	public SentWebAppMessage() {
	}

	public Optional<String> getInlineMessageId() {
		return Optional.of(inlineMessageId);
	}

	public void setInlineMessageId(String inlineMessageId) {
		this.inlineMessageId = inlineMessageId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(inlineMessageId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SentWebAppMessage other))
			return false;
		return Objects.equals(inlineMessageId, other.inlineMessageId);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SentWebAppMessage[inlineMessageId=").append(inlineMessageId).append("]");
		return builder.toString();
	}
}
