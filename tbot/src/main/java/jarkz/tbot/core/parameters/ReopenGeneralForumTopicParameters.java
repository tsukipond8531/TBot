package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to reopen a closed 'General' topic in a forum supergroup chat. The bot must be an
 * administrator in the chat for this to work and must have the can_manage_topics administrator
 * rights. The topic will be automatically unhidden if it was hidden. Returns True on success.
 */
public final class ReopenGeneralForumTopicParameters {

  public static final class Builder {

    private ReopenGeneralForumTopicParameters buildingType;

    public Builder() {
      buildingType = new ReopenGeneralForumTopicParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public ReopenGeneralForumTopicParameters build() {
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

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ReopenGeneralForumTopicParameters other)) return false;
    return Objects.equals(chatId, other.chatId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("ReopenGeneralForumTopicParameters[chatId=").append(chatId).append("]");
    return builder.toString();
  }
}
