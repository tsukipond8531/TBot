package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InlineQueryResult;
import java.util.Objects;

/**
 * Use this method to set the result of an interaction with a Web App and send a corresponding
 * message on behalf of the user to the chat from which the query originated. On success, a
 * SentWebAppMessage object is returned.
 */
public final class AnswerWebAppQueryParameters {

  /** Unique identifier for the query to be answered */
  @NotNull
  @SerializedName("web_app_query_id")
  public String webAppQueryId;

  /** A JSON-serialized object describing the message to be sent */
  @NotNull public InlineQueryResult result;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof AnswerWebAppQueryParameters other)) return false;
    return Objects.equals(webAppQueryId, other.webAppQueryId)
        && Objects.equals(result, other.result);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(webAppQueryId, result);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("AnswerWebAppQueryParameters[webAppQueryId=")
        .append(webAppQueryId)
        .append(", result=")
        .append(result)
        .append("]");
    return builder.toString();
  }
}
