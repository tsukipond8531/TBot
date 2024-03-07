package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to close an open topic in a forum supergroup chat. The bot must be an
 * administrator in the chat for this to work and must have the can_manage_topics administrator
 * rights, unless it is the creator of the topic. Returns True on success.
 */
public final class CloseForumTopicParameters {

  public static final class Builder {

    private CloseForumTopicParameters buildingType;

    public Builder() {
      buildingType = new CloseForumTopicParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageThreadId(int messageThreadId) {
      buildingType.messageThreadId = messageThreadId;
      return this;
    }

    public CloseForumTopicParameters build() {
      return buildingType;
    }
  }

  /**
   * Unique identifier for the target chat or username of the target supergroup (in the
   * format @supergroupusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** Unique identifier for the target message thread of the forum topic */
  @NotNull
  @SerializedName("message_thread_id")
  public int messageThreadId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof CloseForumTopicParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && messageThreadId == other.messageThreadId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, messageThreadId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("CloseForumTopicParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
        .append("]");
    return builder.toString();
  }
}
