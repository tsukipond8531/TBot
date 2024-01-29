package jarkz.tbot.types.poll;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * This object contains information about a poll.
 *
 * @author Pavel Bialiauski
 */
public class Poll {

  @NotNull private String id;

  @NotNull private String question;

  @NotNull private List<PollOption> options;

  @SerializedName("total_voter_count")
  @NotNull
  private int totalVoterCount;

  @SerializedName("is_closed")
  @NotNull
  private boolean isClosed;

  @SerializedName("is_anonymous")
  @NotNull
  private boolean isAnonymous;

  @NotNull private String type;

  @SerializedName("allows_multiple_answers")
  @NotNull
  private boolean allowsMultipleAnswers;

  @SerializedName("correct_option_id")
  private Integer correctOptionId;

  private String explanation;

  @SerializedName("explanation_entities")
  private List<MessageEntity> explanationEntities;

  @SerializedName("open_period")
  private Integer openPeriod;

  @SerializedName("close_date")
  private Long closeDate;

  /** Default constructor. */
  public Poll() {}

  /**
   * Unique poll identifier.
   *
   * @return id as String.
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the unique poll identifier.
   *
   * @param id the unique poll identifier as String.
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Poll question, 1-300 characters.
   *
   * @return question as String.
   */
  public String getQuestion() {
    return question;
  }

  /**
   * Sets the poll question, 1-300 characters.
   *
   * @param question the poll question, 1-300 characters, as String.
   */
  public void setQuestion(String question) {
    this.question = question;
  }

  /**
   * List of poll options.
   *
   * @return options as {@link List}&lt;{@link PollOption}&gt;.
   */
  public List<PollOption> getOptions() {
    return options;
  }

  /**
   * Sets the list of poll options.
   *
   * @param options the list of poll options as {@link List}&lt;{@link PollOption}&gt;.
   */
  public void setOptions(List<PollOption> options) {
    this.options = options;
  }

  /**
   * Total number of users that voted in the poll.
   *
   * @return total_voter_count as int.
   */
  public int getTotalVoterCount() {
    return totalVoterCount;
  }

  /**
   * Sets the total number of users that voted in the poll.
   *
   * @param totalVoterCount the total number of users that voted in the poll as int.
   */
  public void setTotalVoterCount(int totalVoterCount) {
    this.totalVoterCount = totalVoterCount;
  }

  /**
   * <i>True</i>, if the poll is closed.
   *
   * @return is_closed as boolean.
   */
  public boolean isClosed() {
    return isClosed;
  }

  /**
   * Sets wheter the poll is closed.
   *
   * @param isClosed true if the poll is closed, otherwise - null.
   */
  public void setClosed(boolean isClosed) {
    this.isClosed = isClosed;
  }

  /**
   * <i>True</i>, if the poll is anonymous.
   *
   * @return is_anonymous as boolean.
   */
  public boolean isAnonymous() {
    return isAnonymous;
  }

  /**
   * Sets whether the poll is anonymous.
   *
   * @param isAnonymous true if the poll is anonymous, otherwise - null.
   */
  public void setAnonymous(boolean isAnonymous) {
    this.isAnonymous = isAnonymous;
  }

  /**
   * Poll type, currently can be “regular” or “quiz”.
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the poll type, currently can be “regular” or “quiz”.
   *
   * @param type the poll type as String.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * <i>True</i>, if the poll allows multiple answers.
   *
   * @return allows_multiple_answers as boolean.
   */
  public boolean isAllowsMultipleAnswers() {
    return allowsMultipleAnswers;
  }

  /**
   * Sets whether the poll allows multiple answers.
   *
   * @param allowsMultipleAnswers true if the poll allows multiple answers, otherwise - null.
   */
  public void setAllowsMultipleAnswers(boolean allowsMultipleAnswers) {
    this.allowsMultipleAnswers = allowsMultipleAnswers;
  }

  /**
   * <i>Optional.</i> 0-based identifier of the correct answer option. Available only for polls in
   * the quiz mode, which are closed, or was sent (not forwarded) by the bot or to the private chat
   * with the bot.
   *
   * @return an optional value of correct_option_id as Integer.
   */
  public Optional<Integer> getCorrectOptionId() {
    return Optional.ofNullable(correctOptionId);
  }

  /**
   * Sets the 0-based identifier of the correct answer option. Available only for polls in the quiz
   * mode, which are closed, or was sent (not forwarded) by the bot or to the private chat with the
   * bot.
   *
   * @param correctOptionId the 0-based identifier of the correct answer option as Integer or null
   *     if poll is not quiz, which is not closed, or is not sent by the bot or the private chat
   *     with the bot.
   */
  public void setCorrectOptionId(Integer correctOptionId) {
    this.correctOptionId = correctOptionId;
  }

  /**
   * <i>Optional.</i> Text that is shown when a user chooses an incorrect answer or taps on the lamp
   * icon in a quiz-style poll, 0-200 characters.
   *
   * @return an optional value of explanation as String.
   */
  public Optional<String> getExplanation() {
    return Optional.ofNullable(explanation);
  }

  /**
   * Sets the text that is shown when a user chooses an incorrect answer or taps on the lamp icon in
   * a quiz-style poll, 0-200 characters.
   *
   * @param explanation the text that is shown when a user chooses an incorrect answer or taps on
   *     the lamp icon in a quiz-style poll, 0-200 characters, as String or null if it is not
   *     required.
   */
  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  /**
   * <i>Optional.</i> Special entities like usernames, URLs, bot commands, etc. that appear in the
   * <i>explanation</i>.
   *
   * @return an optional value of explanation_entities as {@link List}&lt;{@link MessageEntity}&gt;.
   */
  public Optional<List<MessageEntity>> getExplanationEntities() {
    return Optional.ofNullable(explanationEntities);
  }

  /**
   * Sets the special entities like usernames, URLs, bot commands, etc. that appear in the
   * <i>explanation</i>.
   *
   * @param explanationEntities the special entities like usernames, URLs, bot commands, etc. that
   *     appear in the <i>explanation</i> as {@link List}&lt;{@link MessageEntity}&gt; or null if
   *     the explanation doesn't contains the special entities.
   */
  public void setExplanationEntities(List<MessageEntity> explanationEntities) {
    this.explanationEntities = explanationEntities;
  }

  /**
   * <i>Optional.</i> Amount of time in seconds the poll will be active after creation.
   *
   * @return an optional value of open_period as Integer.
   */
  public Optional<Integer> getOpenPeriod() {
    return Optional.ofNullable(openPeriod);
  }

  /**
   * Sets the amount of time in seconds the poll will be active after creation.
   *
   * @param openPeriod the amount of time in seconds the poll will be active after creation as
   *     Integer or null if it is not required.
   */
  public void setOpenPeriod(Integer openPeriod) {
    this.openPeriod = openPeriod;
  }

  /**
   * <i>Optional.</i> Point in time (Unix timestamp) when the poll will be automatically closed.
   *
   * @return an optional value of close_date as Long.
   */
  public Optional<Long> getCloseDate() {
    return Optional.ofNullable(closeDate);
  }

  /**
   * Sets the point in time (Unix timestamp) when the poll will be automatically closed.
   *
   * @param closeDate the point in time (Unix timestamp), when the poll will be automatically
   *     closed, as Long or null if poll is not closed.
   */
  public void setCloseDate(Long closeDate) {
    this.closeDate = closeDate;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        id,
        question,
        options,
        totalVoterCount,
        isClosed,
        isAnonymous,
        type,
        allowsMultipleAnswers,
        correctOptionId,
        explanation,
        explanationEntities,
        openPeriod,
        closeDate);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Poll other)) return false;
    return Objects.equals(id, other.id)
        && Objects.equals(question, other.question)
        && Objects.equals(options, other.options)
        && totalVoterCount == other.totalVoterCount
        && isClosed == other.isClosed
        && isAnonymous == other.isAnonymous
        && Objects.equals(type, other.type)
        && allowsMultipleAnswers == other.allowsMultipleAnswers
        && Objects.equals(correctOptionId, other.correctOptionId)
        && Objects.equals(explanation, other.explanation)
        && Objects.equals(explanationEntities, other.explanationEntities)
        && Objects.equals(openPeriod, other.openPeriod)
        && Objects.equals(closeDate, other.closeDate);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("Poll[id=")
        .append(id)
        .append(", question=")
        .append(question)
        .append(", options=")
        .append(options)
        .append(", totalVoterCount=")
        .append(totalVoterCount)
        .append(", isClosed=")
        .append(isClosed)
        .append(", isAnonymous=")
        .append(isAnonymous)
        .append(", type=")
        .append(type)
        .append(", allowsMultipleAnswers=")
        .append(allowsMultipleAnswers)
        .append(", correctOptionId=")
        .append(correctOptionId)
        .append(", explanation=")
        .append(explanation)
        .append(", explanationEntities=")
        .append(explanationEntities)
        .append(", openPeriod=")
        .append(openPeriod)
        .append(", closeDate=")
        .append(closeDate)
        .append("]");
    return builder.toString();
  }
}
