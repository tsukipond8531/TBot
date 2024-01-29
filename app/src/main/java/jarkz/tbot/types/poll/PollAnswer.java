package jarkz.tbot.types.poll;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import jarkz.tbot.types.chat.Chat;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents an answer of a user in a non-anonymous poll.
 *
 * @author Pavel Bialiauski
 */
public class PollAnswer {

  @SerializedName("poll_id")
  @NotNull
  private String pollId;

  @SerializedName("voter_chat")
  private Chat voterChat;

  private User user;

  @SerializedName("option_ids")
  private List<Integer> optionIds;

  /** Default constructor. */
  public PollAnswer() {}

  /**
   * Unique poll identifier.
   *
   * @return poll_id as String.
   */
  public String getPollId() {
    return pollId;
  }

  /**
   * Sets the unique poll identifier.
   *
   * @param pollId the unique poll identifier as String.
   */
  public void setPollId(String pollId) {
    this.pollId = pollId;
  }

  /**
   * <i>Optional.</i> The chat that changed the answer to the poll, if the voter is anonymous.
   *
   * @return an optional value of voter_chat as {@link Chat}.
   */
  public Optional<Chat> getVoterChat() {
    return Optional.of(voterChat);
  }

  /**
   * Sets the chat that changed the answer to the poll, if the voter is anonymous.
   *
   * @param voterChat the chat that changed the answer to the poll, if the voter is anonymous, as
   *     {@link Chat}, otherwise - null.
   */
  public void setVoterChat(Chat voterChat) {
    this.voterChat = voterChat;
  }

  /**
   * <i>Optional.</i> The user that changed the answer to the poll, if the voter isn't anonymous.
   *
   * @return an optional value of user as {@link User}.
   */
  public Optional<User> getUser() {
    return Optional.of(user);
  }

  /**
   * Sets the user that changed the answer to the poll, if the voter isn't anonymous.
   *
   * @param user the user that changed the answer to the poll, if the voter isn't anonymous, as
   *     {@link User}, otherwise - null.
   */
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * 0-based identifiers of chosen answer options. May be empty if the vote was retracted.
   *
   * @return option_ids as {@link List}&lt;Integer&gt;.
   */
  public Optional<List<Integer>> getOptionIds() {
    return Optional.ofNullable(optionIds);
  }

  /**
   * Sets the 0-based identifiers of chosen answer options. May be empty if the vote was retracted.
   *
   * @param optionIds the 0-based identifiers of chosen answer options as {@link
   *     List}&lt;Integer&gt; or emtpy list if none selected.
   */
  public void setOptionIds(List<Integer> optionIds) {
    this.optionIds = optionIds;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(pollId, voterChat, user, optionIds);
  }

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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
