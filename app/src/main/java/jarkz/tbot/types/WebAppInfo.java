package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

public class WebAppInfo {

  @NotNull private String url;

  public WebAppInfo() {}

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof WebAppInfo other)) return false;
    return Objects.equals(url, other.url);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("WebAppInfo[url=").append(url).append("]");
    return builder.toString();
  }
}
