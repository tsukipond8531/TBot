package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Use this method for your bot to leave a group, supergroup or channel. Returns True on success.
 */
public final class LeaveChatParameters {

  /**
   * Unique identifier for the target chat or username of the target supergroup or channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public String chatId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof LeaveChatParameters other)) return false;
    return Objects.equals(chatId, other.chatId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("LeaveChatParameters[chatId=").append(chatId).append("]");
    return builder.toString();
  }
}
