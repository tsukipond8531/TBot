package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import jarkz.tbot.types.ReplyParameters;
import java.util.List;
import java.util.Objects;

/** Use this method to send a native poll. On success, the sent Message is returned. */
public final class SendPollParameters {

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public String chatId;

  /**
   * Unique identifier for the target message thread (topic) of the forum; for forum supergroups
   * only
   */
  @SerializedName("message_thread_id")
  public Integer messageThreadId;

  /** Poll question, 1-300 characters */
  @NotNull public String question;

  /** A JSON-serialized list of answer options, 2-10 strings 1-100 characters each */
  @NotNull public List<String> options;

  /** True, if the poll needs to be anonymous, defaults to True */
  @SerializedName("is_anonymous")
  public Boolean isAnonymous;

  /** Poll type, "quiz" or "regular", defaults to "regular" */
  public String type;

  /**
   * True, if the poll allows multiple answers, ignored for polls in quiz mode, defaults to False
   */
  @SerializedName("allows_multiple_answers")
  public Boolean allowsMultipleAnswers;

  /** 0-based identifier of the correct answer option, required for polls in quiz mode */
  @SerializedName("correct_option_id")
  public Integer correctOptionId;

  /**
   * Text that is shown when a user chooses an incorrect answer or taps on the lamp icon in a
   * quiz-style poll, 0-200 characters with at most 2 line feeds after entities parsing
   */
  public String explanation;

  /** Mode for parsing entities in the explanation. See formatting options for more details. */
  @SerializedName("explanation_parse_mode")
  public String explanationParseMode;

  /**
   * A JSON-serialized list of special entities that appear in the poll explanation, which can be
   * specified instead of parse_mode
   */
  @SerializedName("explanation_entities")
  public List<MessageEntity> explanationEntities;

  /**
   * Amount of time in seconds the poll will be active after creation, 5-600. Can't be used together
   * with close_date.
   */
  @SerializedName("open_period")
  public Integer openPeriod;

  /**
   * Point in time (Unix timestamp) when the poll will be automatically closed. Must be at least 5
   * and no more than 600 seconds in the future. Can't be used together with open_period.
   */
  @SerializedName("close_date")
  public Integer closeDate;

  /** Pass True if the poll needs to be immediately closed. This can be useful for poll preview. */
  @SerializedName("is_closed")
  public Boolean isClosed;

  /** Sends the message silently. Users will receive a notification with no sound. */
  @SerializedName("disable_notification")
  public Boolean disableNotification;

  /** Protects the contents of the sent message from forwarding and saving */
  @SerializedName("protect_content")
  public Boolean protectContent;

  /** Description of the message to reply to */
  @SerializedName("reply_parameters")
  public ReplyParameters replyParameters;

  /**
   * Additional interface options. A JSON-serialized object for an inline keyboard, custom reply
   * keyboard, instructions to remove reply keyboard or to force a reply from the user.
   */
  @SerializedName("reply_markup")
  public ReplyMarkup replyMarkup;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SendPollParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageThreadId, other.messageThreadId)
        && Objects.equals(question, other.question)
        && Objects.equals(options, other.options)
        && Objects.equals(isAnonymous, other.isAnonymous)
        && Objects.equals(type, other.type)
        && Objects.equals(allowsMultipleAnswers, other.allowsMultipleAnswers)
        && Objects.equals(correctOptionId, other.correctOptionId)
        && Objects.equals(explanation, other.explanation)
        && Objects.equals(explanationParseMode, other.explanationParseMode)
        && Objects.equals(explanationEntities, other.explanationEntities)
        && Objects.equals(openPeriod, other.openPeriod)
        && Objects.equals(closeDate, other.closeDate)
        && Objects.equals(isClosed, other.isClosed)
        && Objects.equals(disableNotification, other.disableNotification)
        && Objects.equals(protectContent, other.protectContent)
        && Objects.equals(replyParameters, other.replyParameters)
        && Objects.equals(replyMarkup, other.replyMarkup);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chatId,
        messageThreadId,
        question,
        options,
        isAnonymous,
        type,
        allowsMultipleAnswers,
        correctOptionId,
        explanation,
        explanationParseMode,
        explanationEntities,
        openPeriod,
        closeDate,
        isClosed,
        disableNotification,
        protectContent,
        replyParameters,
        replyMarkup);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SendPollParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
        .append(", question=")
        .append(question)
        .append(", options=")
        .append(options)
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
        .append(", explanationParseMode=")
        .append(explanationParseMode)
        .append(", explanationEntities=")
        .append(explanationEntities)
        .append(", openPeriod=")
        .append(openPeriod)
        .append(", closeDate=")
        .append(closeDate)
        .append(", isClosed=")
        .append(isClosed)
        .append(", disableNotification=")
        .append(disableNotification)
        .append(", protectContent=")
        .append(protectContent)
        .append(", replyParameters=")
        .append(replyParameters)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append("]");
    return builder.toString();
  }
}
