package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to edit the name of the 'General' topic in a forum supergroup chat. The bot must
 * be an administrator in the chat for this to work and must have can_manage_topics administrator
 * rights. Returns True on success.
 */
public final class EditGeneralForumTopicParameters {

  /**
   * Unique identifier for the target chat or username of the target supergroup (in the
   * format @supergroupusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** New topic name, 1-128 characters */
  @NotNull public String name;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof EditGeneralForumTopicParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && Objects.equals(name, other.name);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, name);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("EditGeneralForumTopicParameters[chatId=")
        .append(chatId)
        .append(", name=")
        .append(name)
        .append("]");
    return builder.toString();
  }
}
