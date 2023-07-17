package jarkz.tbot.types.videochat;

import java.util.Objects;

import jakarta.validation.constraints.NotNull;

public class VideoChatEnded {

	@NotNull
	private int duration;

	public VideoChatEnded(){
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public int hashCode() {
		return Objects.hash(duration);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof VideoChatEnded other))
			return false;
		return duration == other.duration;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VideoChatEnded[duration=").append(duration).append("]");
		return builder.toString();
	}
}
