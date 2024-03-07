package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * This object represents a service message about a user allowing a bot to write messages after
 * adding it to the attachment menu, launching a Web App from a link, or accepting an explicit
 * request from a Web App sent by the method requestWriteAccess.
 */
public final class WriteAccessAllowed {

  public static final class Builder {

    private WriteAccessAllowed buildingType;

    public Builder() {
      buildingType = new WriteAccessAllowed();
    }

    public Builder setFromRequest(Boolean fromRequest) {
      buildingType.fromRequest = fromRequest;
      return this;
    }

    public Builder setWebAppName(String webAppName) {
      buildingType.webAppName = webAppName;
      return this;
    }

    public Builder setFromAttachmentMenu(Boolean fromAttachmentMenu) {
      buildingType.fromAttachmentMenu = fromAttachmentMenu;
      return this;
    }

    public WriteAccessAllowed build() {
      return buildingType;
    }
  }

  /**
   * Optional. True, if the access was granted after the user accepted an explicit request from a
   * Web App sent by the method requestWriteAccess
   */
  @SerializedName("from_request")
  public Boolean fromRequest;

  /**
   * Optional. Name of the Web App, if the access was granted when the Web App was launched from a
   * link
   */
  @SerializedName("web_app_name")
  public String webAppName;

  /**
   * Optional. True, if the access was granted when the bot was added to the attachment or side menu
   */
  @SerializedName("from_attachment_menu")
  public Boolean fromAttachmentMenu;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof WriteAccessAllowed other)) return false;
    return Objects.equals(fromRequest, other.fromRequest)
        && Objects.equals(webAppName, other.webAppName)
        && Objects.equals(fromAttachmentMenu, other.fromAttachmentMenu);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(fromRequest, webAppName, fromAttachmentMenu);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("WriteAccessAllowed[fromRequest=")
        .append(fromRequest)
        .append(", webAppName=")
        .append(webAppName)
        .append(", fromAttachmentMenu=")
        .append(fromAttachmentMenu)
        .append("]");
    return builder.toString();
  }
}
