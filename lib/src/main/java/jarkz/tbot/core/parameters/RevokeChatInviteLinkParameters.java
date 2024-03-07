package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to revoke an invite link created by the bot. If the primary link is revoked, a
 * new link is automatically generated. The bot must be an administrator in the chat for this to
 * work and must have the appropriate administrator rights. Returns the revoked invite link as
 * ChatInviteLink object.
 */
public final class RevokeChatInviteLinkParameters {

  /**
   * Unique identifier of the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** The invite link to revoke */
  @NotNull
  @SerializedName("invite_link")
  public String inviteLink;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof RevokeChatInviteLinkParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && Objects.equals(inviteLink, other.inviteLink);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, inviteLink);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("RevokeChatInviteLinkParameters[chatId=")
        .append(chatId)
        .append(", inviteLink=")
        .append(inviteLink)
        .append("]");
    return builder.toString();
  }
}
