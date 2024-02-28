package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Use this method to restrict a user in a supergroup. The bot must be an administrator in the
 * supergroup for this to work and must have the appropriate administrator rights. Pass True for all
 * permissions to lift restrictions from a user. Returns True on success.
 */
public final class RestrictChatMemberParameters {

  /**
   * Unique identifier for the target chat or username of the target supergroup (in the
   * format @supergroupusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public String chatId;

  /** Unique identifier of the target user */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  /** A JSON-serialized object for new user permissions */
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

  /**
   * Date when restrictions will be lifted for the user; Unix time. If user is restricted for more
   * than 366 days or less than 30 seconds from the current time, they are considered to be
   * restricted forever
   */
  @SerializedName("until_date")
  public Integer untilDate;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof RestrictChatMemberParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && userId == other.userId
        && Objects.equals(permissions, other.permissions)
        && Objects.equals(useIndependentChatPermissions, other.useIndependentChatPermissions)
        && Objects.equals(untilDate, other.untilDate);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, userId, permissions, useIndependentChatPermissions, untilDate);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("RestrictChatMemberParameters[chatId=")
        .append(chatId)
        .append(", userId=")
        .append(userId)
        .append(", permissions=")
        .append(permissions)
        .append(", useIndependentChatPermissions=")
        .append(useIndependentChatPermissions)
        .append(", untilDate=")
        .append(untilDate)
        .append("]");
    return builder.toString();
  }
}
