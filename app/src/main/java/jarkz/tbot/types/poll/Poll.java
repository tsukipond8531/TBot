package jarkz.tbot.types.poll;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

  public Poll() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public List<PollOption> getOptions() {
    return options;
  }

  public void setOptions(List<PollOption> options) {
    this.options = options;
  }

  public int getTotalVoterCount() {
    return totalVoterCount;
  }

  public void setTotalVoterCount(int totalVoterCount) {
    this.totalVoterCount = totalVoterCount;
  }

  public boolean isClosed() {
    return isClosed;
  }

  public void setClosed(boolean isClosed) {
    this.isClosed = isClosed;
  }

  public boolean isAnonymous() {
    return isAnonymous;
  }

  public void setAnonymous(boolean isAnonymous) {
    this.isAnonymous = isAnonymous;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isAllowsMultipleAnswers() {
    return allowsMultipleAnswers;
  }

  public void setAllowsMultipleAnswers(boolean allowsMultipleAnswers) {
    this.allowsMultipleAnswers = allowsMultipleAnswers;
  }

  public Optional<Integer> getCorrectOptionId() {
    return Optional.of(correctOptionId);
  }

  public void setCorrectOptionId(Integer correctOptionId) {
    this.correctOptionId = correctOptionId;
  }

  public Optional<String> getExplanation() {
    return Optional.of(explanation);
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public Optional<List<MessageEntity>> getExplanationEntities() {
    return Optional.of(explanationEntities);
  }

  public void setExplanationEntities(List<MessageEntity> explanationEntities) {
    this.explanationEntities = explanationEntities;
  }

  public Optional<Integer> getOpenPeriod() {
    return Optional.of(openPeriod);
  }

  public void setOpenPeriod(Integer openPeriod) {
    this.openPeriod = openPeriod;
  }

  public Optional<Long> getCloseDate() {
    return Optional.of(closeDate);
  }

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
