package jarkz.tbot.types.poll;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;

public class PollAnswer {

	@SerializedName("poll_id")
	@NotNull
	private String pollId;

	@NotNull
	private User user;

	@SerializedName("option_ids")
	private List<Integer> optionIds;

	public PollAnswer() {
	}

	public String getPollId() {
		return pollId;
	}

	public void setPollId(String pollId) {
		this.pollId = pollId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Optional<List<Integer>> getOptionIds() {
		return Optional.of(optionIds);
	}

	public void setOptionIds(List<Integer> optionIds) {
		this.optionIds = optionIds;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pollId, user, optionIds);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PollAnswer other))
			return false;
		return Objects.equals(pollId, other.pollId)
				&& Objects.equals(user, other.user)
				&& Objects.equals(optionIds, other.optionIds);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PollAnswer[pollId=").append(pollId)
				.append(", user=").append(user)
				.append(", optionIds=").append(optionIds).append("]");
		return builder.toString();
	}
}
