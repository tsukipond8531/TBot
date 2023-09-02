package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetUpdatesParameters {

  public static final GetUpdatesParameters DEFAULT = new GetUpdatesParameters(null, 100, 1, null);

  private Integer offset;
  private Integer limit;
  private Integer timeout;

  @SerializedName("allowed_updates")
  private List<String> allowedUpdates;

  public GetUpdatesParameters() {}

  public GetUpdatesParameters(
      Integer offset, Integer limit, Integer timeout, List<String> allowedUpdates) {
    this.offset = offset;
    this.limit = limit;
    this.timeout = timeout;
    this.allowedUpdates = allowedUpdates;
  }

  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public List<String> getAllowedUpdates() {
    return allowedUpdates;
  }

  public void setAllowedUpdates(List<String> allowedUpdates) {
    this.allowedUpdates = allowedUpdates;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("GetUpdateParameters[offset=")
        .append(offset)
        .append(", limit=")
        .append(limit)
        .append(", timeout=")
        .append(timeout)
        .append(", allowedUpdates=")
        .append(allowedUpdates)
        .append("]");
    return builder.toString();
  }
}
