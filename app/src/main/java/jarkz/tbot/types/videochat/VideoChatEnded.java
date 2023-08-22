package jarkz.tbot.types.videochat;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a service message about a video chat ended in the chat.
 *
 * @author Pavel Bialiauski
 */
public class VideoChatEnded {

  @NotNull private int duration;

  /** Default constructor. */
  public VideoChatEnded() {}

  /**
   * Video chat duration in seconds.
   *
   * @return duration as int.
   */
  public int getDuration() {
    return duration;
  }

  /**
   * Sets the video chat duration in seconds.
   *
   * @param duration the video chat duartion in seconds as int.
   */
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
