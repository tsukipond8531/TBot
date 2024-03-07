package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** Describes the options used for link preview generation. */
public final class LinkPreviewOptions {

  public static final class Builder {

    private LinkPreviewOptions buildingType;

    public Builder() {
      buildingType = new LinkPreviewOptions();
    }

    public Builder setIsDisabled(Boolean isDisabled) {
      buildingType.isDisabled = isDisabled;
      return this;
    }

    public Builder setUrl(String url) {
      buildingType.url = url;
      return this;
    }

    public Builder setPreferSmallMedia(Boolean preferSmallMedia) {
      buildingType.preferSmallMedia = preferSmallMedia;
      return this;
    }

    public Builder setPreferLargeMedia(Boolean preferLargeMedia) {
      buildingType.preferLargeMedia = preferLargeMedia;
      return this;
    }

    public Builder setShowAboveText(Boolean showAboveText) {
      buildingType.showAboveText = showAboveText;
      return this;
    }

    public LinkPreviewOptions build() {
      return buildingType;
    }
  }

  /** Optional. True, if the link preview is disabled */
  @SerializedName("is_disabled")
  public Boolean isDisabled;

  /**
   * Optional. URL to use for the link preview. If empty, then the first URL found in the message
   * text will be used
   */
  public String url;

  /**
   * Optional. True, if the media in the link preview is supposed to be shrunk; ignored if the URL
   * isn't explicitly specified or media size change isn't supported for the preview
   */
  @SerializedName("prefer_small_media")
  public Boolean preferSmallMedia;

  /**
   * Optional. True, if the media in the link preview is supposed to be enlarged; ignored if the URL
   * isn't explicitly specified or media size change isn't supported for the preview
   */
  @SerializedName("prefer_large_media")
  public Boolean preferLargeMedia;

  /**
   * Optional. True, if the link preview must be shown above the message text; otherwise, the link
   * preview will be shown below the message text
   */
  @SerializedName("show_above_text")
  public Boolean showAboveText;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof LinkPreviewOptions other)) return false;
    return Objects.equals(isDisabled, other.isDisabled)
        && Objects.equals(url, other.url)
        && Objects.equals(preferSmallMedia, other.preferSmallMedia)
        && Objects.equals(preferLargeMedia, other.preferLargeMedia)
        && Objects.equals(showAboveText, other.showAboveText);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(isDisabled, url, preferSmallMedia, preferLargeMedia, showAboveText);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("LinkPreviewOptions[isDisabled=")
        .append(isDisabled)
        .append(", url=")
        .append(url)
        .append(", preferSmallMedia=")
        .append(preferSmallMedia)
        .append(", preferLargeMedia=")
        .append(preferLargeMedia)
        .append(", showAboveText=")
        .append(showAboveText)
        .append("]");
    return builder.toString();
  }
}
