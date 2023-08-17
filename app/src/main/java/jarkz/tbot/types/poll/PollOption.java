package jarkz.tbot.types.poll;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class PollOption {

	@NotNull
	private String text;

	@SerializedName("voter_count")
	@NotNull
	private int voterCount;

	public PollOption() {
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getVoterCount() {
		return voterCount;
	}

	public void setVoterCount(int voterCount) {
		this.voterCount = voterCount;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(text, voterCount);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PollOption other))
			return false;
		return Objects.equals(text, other.text) && voterCount == other.voterCount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PollOption[text=").append(text).append(", voterCount=").append(voterCount).append("]");
		return builder.toString();
	}
}
