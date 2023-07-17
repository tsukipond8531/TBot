package jarkz.tbot.types;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class ForceReply {

	@SerializedName("force_reply")
	@NotNull
	private boolean forceReply;

	@SerializedName("input_field_placeholder")
	private String inputFieldPlaceholder;

	private Boolean selective;

	public ForceReply() {
	}

	public boolean isForceReply() {
		return forceReply;
	}

	public void setForceReply(boolean forceReply) {
		this.forceReply = forceReply;
	}

	public Optional<String> getInputFieldPlaceholder() {
		return Optional.of(inputFieldPlaceholder);
	}

	public void setInputFieldPlaceholder(String inputFieldPlaceholder) {
		this.inputFieldPlaceholder = inputFieldPlaceholder;
	}

	public Optional<Boolean> isSelective() {
		return Optional.of(selective);
	}

	public void setSelective(Boolean selective) {
		this.selective = selective;
	}

	@Override
	public int hashCode() {
		return Objects.hash(forceReply, inputFieldPlaceholder, selective);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ForceReply other))
			return false;
		return forceReply == other.forceReply
				&& Objects.equals(inputFieldPlaceholder, other.inputFieldPlaceholder)
				&& Objects.equals(selective, other.selective);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ForceReply[forceReply=").append(forceReply)
				.append(", inputFieldPlaceholder=").append(inputFieldPlaceholder)
				.append(", selective=").append(selective).append("]");
		return builder.toString();
	}
}
