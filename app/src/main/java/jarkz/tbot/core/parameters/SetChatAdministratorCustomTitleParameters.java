package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to set a custom title for an administrator in a supergroup promoted by the bot.
 * Returns True on success.
 */
public final class SetChatAdministratorCustomTitleParameters {

  /**
   * Unique identifier for the target chat or username of the target supergroup (in the
   * format @supergroupusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** Unique identifier of the target user */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  /** New custom title for the administrator; 0-16 characters, emoji are not allowed */
  @NotNull
  @SerializedName("custom_title")
  public String customTitle;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetChatAdministratorCustomTitleParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && userId == other.userId
        && Objects.equals(customTitle, other.customTitle);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, userId, customTitle);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetChatAdministratorCustomTitleParameters[chatId=")
        .append(chatId)
        .append(", userId=")
        .append(userId)
        .append(", customTitle=")
        .append(customTitle)
        .append("]");
    return builder.toString();
  }
}
