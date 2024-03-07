package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object contains information about a poll. */
public final class Poll {

  public static final class Builder {

    private Poll buildingType;

    public Builder() {
      buildingType = new Poll();
    }

    public Builder setId(String id) {
      buildingType.id = id;
      return this;
    }

    public Builder setQuestion(String question) {
      buildingType.question = question;
      return this;
    }

    public Builder setOptions(List<PollOption> options) {
      buildingType.options = options;
      return this;
    }

    public Builder setTotalVoterCount(int totalVoterCount) {
      buildingType.totalVoterCount = totalVoterCount;
      return this;
    }

    public Builder setClosed(boolean isClosed) {
      buildingType.isClosed = isClosed;
      return this;
    }

    public Builder setAnonymous(boolean isAnonymous) {
      buildingType.isAnonymous = isAnonymous;
      return this;
    }

    public Builder setType(String type) {
      buildingType.type = type;
      return this;
    }

    public Builder setAllowsMultipleAnswers(boolean allowsMultipleAnswers) {
      buildingType.allowsMultipleAnswers = allowsMultipleAnswers;
      return this;
    }

    public Builder setCorrectOptionId(Integer correctOptionId) {
      buildingType.correctOptionId = correctOptionId;
      return this;
    }

    public Builder setExplanation(String explanation) {
      buildingType.explanation = explanation;
      return this;
    }

    public Builder setExplanationEntities(List<MessageEntity> explanationEntities) {
      buildingType.explanationEntities = explanationEntities;
      return this;
    }

    public Builder setOpenPeriod(Integer openPeriod) {
      buildingType.openPeriod = openPeriod;
      return this;
    }

    public Builder setCloseDate(Integer closeDate) {
      buildingType.closeDate = closeDate;
      return this;
    }

    public Poll build() {
      return buildingType;
    }
  }

  /** Unique poll identifier */
  @NotNull public String id;

  /** Poll question, 1-300 characters */
  @NotNull public String question;

  /** List of poll options */
  @NotNull public List<PollOption> options;

  /** Total number of users that voted in the poll */
  @NotNull
  @SerializedName("total_voter_count")
  public int totalVoterCount;

  /** True, if the poll is closed */
  @NotNull
  @SerializedName("is_closed")
  public boolean isClosed;

  /** True, if the poll is anonymous */
  @NotNull
  @SerializedName("is_anonymous")
  public boolean isAnonymous;

  /** Poll type, currently can be "regular" or "quiz" */
  @NotNull public String type;

  /** True, if the poll allows multiple answers */
  @NotNull
  @SerializedName("allows_multiple_answers")
  public boolean allowsMultipleAnswers;

  /**
   * Optional. 0-based identifier of the correct answer option. Available only for polls in the quiz
   * mode, which are closed, or was sent (not forwarded) by the bot or to the private chat with the
   * bot.
   */
  @SerializedName("correct_option_id")
  public Integer correctOptionId;

  /**
   * Optional. Text that is shown when a user chooses an incorrect answer or taps on the lamp icon
   * in a quiz-style poll, 0-200 characters
   */
  public String explanation;

  /**
   * Optional. Special entities like usernames, URLs, bot commands, etc. that appear in the
   * explanation
   */
  @SerializedName("explanation_entities")
  public List<MessageEntity> explanationEntities;

  /** Optional. Amount of time in seconds the poll will be active after creation */
  @SerializedName("open_period")
  public Integer openPeriod;

  /** Optional. Point in time (Unix timestamp) when the poll will be automatically closed */
  @SerializedName("close_date")
  public Integer closeDate;

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
  public final String toString() {
    var builder = new StringBuilder();
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
