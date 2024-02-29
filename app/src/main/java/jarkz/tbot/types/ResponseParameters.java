package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** Describes why a request was unsuccessful. */
public final class ResponseParameters {

  /**
   * Optional. The group has been migrated to a supergroup with the specified identifier. This
   * number may have more than 32 significant bits and some programming languages may have
   * difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a
   * signed 64-bit integer or double-precision float type are safe for storing this identifier.
   */
  @SerializedName("migrate_to_chat_id")
  public Long migrateToChatId;

  /**
   * Optional. In case of exceeding flood control, the number of seconds left to wait before the
   * request can be repeated
   */
  @SerializedName("retry_after")
  public Integer retryAfter;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ResponseParameters other)) return false;
    return Objects.equals(migrateToChatId, other.migrateToChatId)
        && Objects.equals(retryAfter, other.retryAfter);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(migrateToChatId, retryAfter);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ResponseParameters[migrateToChatId=")
        .append(migrateToChatId)
        .append(", retryAfter=")
        .append(retryAfter)
        .append("]");
    return builder.toString();
  }
}
