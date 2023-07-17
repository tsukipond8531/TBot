package jarkz.tbot.types.videochat;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

public class VideoChatScheduled {

	@SerializedName("start_date")
	private Long startDate;

	public VideoChatScheduled(){
	}

	public Optional<Long> getStartDate() {
		return Optional.of(startDate);
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(startDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof VideoChatScheduled other))
			return false;
		return Objects.equals(startDate, other.startDate);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VideoChatScheduled[startDate=").append(startDate).append("]");
		return builder.toString();
	}
}
