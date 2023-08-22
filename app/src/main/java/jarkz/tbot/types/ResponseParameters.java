package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import java.util.Optional;

/**
 * Describes why a request was unsuccessful.
 *
 * @author Pavel Bialiauski
 */
public class ResponseParameters {

  @SerializedName("migrate_to_chat_id")
  private Long migrateToChatId;

  @SerializedName("retry_after")
  private Integer retryAfter;

  /** Default constructor. */
  public ResponseParameters() {}

  /**
   * <i>Optional.</i> The group has been migrated to a supergroup with the specified identifier.
   *
   * @return an optional value of migrate_to_chat_id as Long.
   */
  public Optional<Long> getMigrateToChatId() {
    return Optional.of(migrateToChatId);
  }

  /**
   * Sets the group has been migrated to a supergroup with the specified identifier.
   *
   * @param migrateToChatId the group has been migrated to a supergroup with the specified
   *     identifier as Long.
   */
  public void setMigrateToChatId(Long migrateToChatId) {
    this.migrateToChatId = migrateToChatId;
  }

  /**
   * <i>Optional.</i> In case of exceeding flood control, the number of seconds left to wait before
   * the request can be repeated.
   *
   * @return an optional value of retry_after as Integer.
   */
  public Optional<Integer> getRetryAfter() {
    return Optional.of(retryAfter);
  }

  /**
   * Sets the number of seconds left to wait before the request can be repeated; in case of
   * exceeding flood control.
   *
   * @param retryAfter the number of seconds left to wait before the request can be repeated as
   *     Integer.
   */
  public void setRetryAfter(Integer retryAfter) {
    this.retryAfter = retryAfter;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(migrateToChatId, retryAfter);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ResponseParameters other)) return false;
    return Objects.equals(migrateToChatId, other.migrateToChatId)
        && Objects.equals(retryAfter, other.retryAfter);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ResponseParameters[migrateToChatId=")
        .append(migrateToChatId)
        .append(", retryAfter=")
        .append(retryAfter)
        .append("]");
    return builder.toString();
  }
}
