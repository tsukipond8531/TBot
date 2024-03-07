package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to generate a new primary invite link for a chat; any previously generated
 * primary link is revoked. The bot must be an administrator in the chat for this to work and must
 * have the appropriate administrator rights. Returns the new invite link as String on success.
 */
public final class ExportChatInviteLinkParameters {

  public static final class Builder {

    private ExportChatInviteLinkParameters buildingType;

    public Builder() {
      buildingType = new ExportChatInviteLinkParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public ExportChatInviteLinkParameters build() {
      return buildingType;
    }
  }

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ExportChatInviteLinkParameters other)) return false;
    return Objects.equals(chatId, other.chatId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("ExportChatInviteLinkParameters[chatId=").append(chatId).append("]");
    return builder.toString();
  }
}
