package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Use this method to change the description of a group, a supergroup or a channel. The bot must be
 * an administrator in the chat for this to work and must have the appropriate administrator rights.
 * Returns True on success.
 */
public final class SetChatDescriptionParameters {

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public String chatId;

  /** New chat description, 0-255 characters */
  public String description;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetChatDescriptionParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && Objects.equals(description, other.description);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, description);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetChatDescriptionParameters[chatId=")
        .append(chatId)
        .append(", description=")
        .append(description)
        .append("]");
    return builder.toString();
  }
}
