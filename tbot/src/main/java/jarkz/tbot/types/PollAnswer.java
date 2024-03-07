package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object represents an answer of a user in a non-anonymous poll. */
public final class PollAnswer {

  public static final class Builder {

    private PollAnswer buildingType;

    public Builder() {
      buildingType = new PollAnswer();
    }

    public Builder setPollId(String pollId) {
      buildingType.pollId = pollId;
      return this;
    }

    public Builder setVoterChat(Chat voterChat) {
      buildingType.voterChat = voterChat;
      return this;
    }

    public Builder setUser(User user) {
      buildingType.user = user;
      return this;
    }

    public Builder setOptionIds(List<Integer> optionIds) {
      buildingType.optionIds = optionIds;
      return this;
    }

    public PollAnswer build() {
      return buildingType;
    }
  }

  /** Unique poll identifier */
  @NotNull
  @SerializedName("poll_id")
  public String pollId;

  /** Optional. The chat that changed the answer to the poll, if the voter is anonymous */
  @SerializedName("voter_chat")
  public Chat voterChat;

  /** Optional. The user that changed the answer to the poll, if the voter isn't anonymous */
  public User user;

  /** 0-based identifiers of chosen answer options. May be empty if the vote was retracted. */
  @NotNull
  @SerializedName("option_ids")
  public List<Integer> optionIds;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PollAnswer other)) return false;
    return Objects.equals(pollId, other.pollId)
        && Objects.equals(voterChat, other.voterChat)
        && Objects.equals(user, other.user)
        && Objects.equals(optionIds, other.optionIds);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(pollId, voterChat, user, optionIds);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("PollAnswer[pollId=")
        .append(pollId)
        .append(", voterChat=")
        .append(voterChat)
        .append(", user=")
        .append(user)
        .append(", optionIds=")
        .append(optionIds)
        .append("]");
    return builder.toString();
  }
}
