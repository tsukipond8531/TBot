package jarkz.tbot.types.inlinemode;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Location;
import jarkz.tbot.types.User;

public class InlineQuery {

	@NotNull
	private String id;

	@NotNull
	private User from;

	@NotNull
	private String query;

	@NotNull
	private String offset;

	@SerializedName("chat_type")
	private String chatType;

	private Location location;

	public InlineQuery() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public Optional<String> getChatType() {
		return Optional.of(chatType);
	}

	public void setChatType(String chatType) {
		this.chatType = chatType;
	}

	public Optional<Location> getLocation() {
		return Optional.of(location);
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, from, query, offset, chatType, location);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InlineQuery other))
			return false;
		return Objects.equals(id, other.id)
				&& Objects.equals(from, other.from)
				&& Objects.equals(query, other.query)
				&& Objects.equals(offset, other.offset)
				&& Objects.equals(chatType, other.chatType)
				&& Objects.equals(location, other.location);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InlineQuery[id=").append(id)
				.append(", from=").append(from)
				.append(", query=").append(query)
				.append(", offset=").append(offset)
				.append(", chatType=").append(chatType)
				.append(", location=").append(location).append("]");
		return builder.toString();
	}
}
