package jarkz.tbot.types.videochat;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a service message about a video chat scheduled in the chat.
 *
 * @author Pavel Bialiauski
 */
public class VideoChatScheduled {

  @SerializedName("start_date")
  @NotNull
  private long startDate;

  /** Default constructor. */
  public VideoChatScheduled() {}

  /**
   * Point in time (Unix timestamp) when the video chat is supposed to be started by a chat
   * administrator.
   *
   * @return start_date as long.
   */
  public long getStartDate() {
    return startDate;
  }

  /**
   * Sets the point in time (Unix timestamp) when the video chat is supposed to be started by a chat
   * administrator.
   *
   * @param startDate the point in time (Unix timestamp) when the video chat is supposed to be
   *     started by a chat administrator as long.
   */
  public void setStartDate(long startDate) {
    this.startDate = startDate;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(startDate);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof VideoChatScheduled other)) return false;
    return startDate == other.startDate;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("VideoChatScheduled[startDate=").append(startDate).append("]");
    return builder.toString();
  }
}
