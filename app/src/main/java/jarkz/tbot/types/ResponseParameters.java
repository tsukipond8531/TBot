package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import java.util.Optional;

public class ResponseParameters {

  @SerializedName("migrate_to_chat_id")
  private Long migrateToChatId;

  @SerializedName("retry_after")
  private Integer retryAfter;

  public ResponseParameters() {}

  public Optional<Long> getMigrateToChatId() {
    return Optional.of(migrateToChatId);
  }

  public void setMigrateToChatId(Long migrateToChatId) {
    this.migrateToChatId = migrateToChatId;
  }

  public Optional<Integer> getRetryAfter() {
    return Optional.of(retryAfter);
  }

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
