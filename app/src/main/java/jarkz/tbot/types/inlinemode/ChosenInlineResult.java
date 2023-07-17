package jarkz.tbot.types.inlinemode;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Location;
import jarkz.tbot.types.User;

public class ChosenInlineResult {

	@SerializedName("result_id")
	@NotNull
	private String resultId;

	@NotNull
	private User from;

	private Location location;

	@SerializedName("inline_message_id")
	private String inlineMessageId;

	@NotNull
	private String query;

	public ChosenInlineResult() {
	}

	public String getResultId() {
		return resultId;
	}

	public void setResultId(String resultId) {
		this.resultId = resultId;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public Optional<Location> getLocation() {
		return Optional.of(location);
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Optional<String> getInlineMessageId() {
		return Optional.of(inlineMessageId);
	}

	public void setInlineMessageId(String inlineMessageId) {
		this.inlineMessageId = inlineMessageId;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	@Override
	public int hashCode() {
		return Objects.hash(resultId, from, location, inlineMessageId, query);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ChosenInlineResult other))
			return false;
		return Objects.equals(resultId, other.resultId)
				&& Objects.equals(from, other.from)
				&& Objects.equals(location, other.location)
				&& Objects.equals(inlineMessageId, other.inlineMessageId)
				&& Objects.equals(query, other.query);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChosenInlineResult[resultId=").append(resultId)
				.append(", from=").append(from)
				.append(", location=").append(location)
				.append(", inlineMessageId=").append(inlineMessageId)
				.append(", query=").append(query).append("]");
		return builder.toString();
	}
}
