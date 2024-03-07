package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a service message about a video chat scheduled in the chat. */
public final class VideoChatScheduled {

  public static final class Builder {

    private VideoChatScheduled buildingType;

    public Builder() {
      buildingType = new VideoChatScheduled();
    }

    public Builder setStartDate(int startDate) {
      buildingType.startDate = startDate;
      return this;
    }

    public VideoChatScheduled build() {
      return buildingType;
    }
  }

  /**
   * Point in time (Unix timestamp) when the video chat is supposed to be started by a chat
   * administrator
   */
  @NotNull
  @SerializedName("start_date")
  public int startDate;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof VideoChatScheduled other)) return false;
    return startDate == other.startDate;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(startDate);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("VideoChatScheduled[startDate=").append(startDate).append("]");
    return builder.toString();
  }
}
