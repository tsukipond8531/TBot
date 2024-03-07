package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Describes a Web App. */
public final class WebAppInfo {

  public static final class Builder {

    private WebAppInfo buildingType;

    public Builder() {
      buildingType = new WebAppInfo();
    }

    public Builder setUrl(String url) {
      buildingType.url = url;
      return this;
    }

    public WebAppInfo build() {
      return buildingType;
    }
  }

  /**
   * An HTTPS URL of a Web App to be opened with additional data as specified in Initializing Web
   * Apps
   */
  @NotNull public String url;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof WebAppInfo other)) return false;
    return Objects.equals(url, other.url);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("WebAppInfo[url=").append(url).append("]");
    return builder.toString();
  }
}
