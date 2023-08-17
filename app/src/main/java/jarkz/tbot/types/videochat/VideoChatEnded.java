package jarkz.tbot.types.videochat;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

public class VideoChatEnded {

  @NotNull private int duration;

  public VideoChatEnded() {}

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(duration);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof VideoChatEnded other)) return false;
    return duration == other.duration;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("VideoChatEnded[duration=").append(duration).append("]");
    return builder.toString();
  }
}
