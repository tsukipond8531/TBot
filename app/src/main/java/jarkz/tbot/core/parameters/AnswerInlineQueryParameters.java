package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to send answers to an inline query. On success, True is returned.
 *
 * <p>No more than 50 results per query are allowed.
 */
public final class AnswerInlineQueryParameters {

  /** Unique identifier for the answered query */
  @NotNull
  @SerializedName("inline_query_id")
  public String inlineQueryId;

  /** A JSON-serialized array of results for the inline query */
  @NotNull public List<InlineQueryResult> results;

  /**
   * The maximum amount of time in seconds that the result of the inline query may be cached on the
   * server. Defaults to 300.
   */
  @SerializedName("cache_time")
  public Integer cacheTime;

  /**
   * Pass True if results may be cached on the server side only for the user that sent the query. By
   * default, results may be returned to any user who sends the same query.
   */
  @SerializedName("is_personal")
  public Boolean isPersonal;

  /**
   * Pass the offset that a client should send in the next query with the same text to receive more
   * results. Pass an empty string if there are no more results or if you don't support pagination.
   * Offset length can't exceed 64 bytes.
   */
  @SerializedName("next_offset")
  public String nextOffset;

  /** A JSON-serialized object describing a button to be shown above inline query results */
  public InlineQueryResultsButton button;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof AnswerInlineQueryParameters other)) return false;
    return Objects.equals(inlineQueryId, other.inlineQueryId)
        && Objects.equals(results, other.results)
        && Objects.equals(cacheTime, other.cacheTime)
        && Objects.equals(isPersonal, other.isPersonal)
        && Objects.equals(nextOffset, other.nextOffset)
        && Objects.equals(button, other.button);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(inlineQueryId, results, cacheTime, isPersonal, nextOffset, button);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("AnswerInlineQueryParameters[inlineQueryId=")
        .append(inlineQueryId)
        .append(", results=")
        .append(results)
        .append(", cacheTime=")
        .append(cacheTime)
        .append(", isPersonal=")
        .append(isPersonal)
        .append(", nextOffset=")
        .append(nextOffset)
        .append(", button=")
        .append(button)
        .append("]");
    return builder.toString();
  }
}
