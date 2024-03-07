package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.ChatPermissions;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to set default chat permissions for all members. The bot must be an administrator
 * in the group or a supergroup for this to work and must have the can_restrict_members
 * administrator rights. Returns True on success.
 */
public final class SetChatPermissionsParameters {

  /**
   * Unique identifier for the target chat or username of the target supergroup (in the
   * format @supergroupusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** A JSON-serialized object for new default chat permissions */
  @NotNull public ChatPermissions permissions;

  /**
   * Pass True if chat permissions are set independently. Otherwise, the can_send_other_messages and
   * can_add_web_page_previews permissions will imply the can_send_messages, can_send_audios,
   * can_send_documents, can_send_photos, can_send_videos, can_send_video_notes, and
   * can_send_voice_notes permissions; the can_send_polls permission will imply the
   * can_send_messages permission.
   */
  @SerializedName("use_independent_chat_permissions")
  public Boolean useIndependentChatPermissions;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetChatPermissionsParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(permissions, other.permissions)
        && Objects.equals(useIndependentChatPermissions, other.useIndependentChatPermissions);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, permissions, useIndependentChatPermissions);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetChatPermissionsParameters[chatId=")
        .append(chatId)
        .append(", permissions=")
        .append(permissions)
        .append(", useIndependentChatPermissions=")
        .append(useIndependentChatPermissions)
        .append("]");
    return builder.toString();
  }
}
