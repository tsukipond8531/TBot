package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to clear the list of pinned messages in a General forum topic. The bot must be an
 * administrator in the chat for this to work and must have the can_pin_messages administrator right
 * in the supergroup. Returns True on success.
 */
public final class UnpinAllGeneralForumTopicMessagesParameters {

  public static final class Builder {

    private UnpinAllGeneralForumTopicMessagesParameters buildingType;

    public Builder() {
      buildingType = new UnpinAllGeneralForumTopicMessagesParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public UnpinAllGeneralForumTopicMessagesParameters build() {
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
    if (!(obj instanceof UnpinAllGeneralForumTopicMessagesParameters other)) return false;
    return Objects.equals(chatId, other.chatId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("UnpinAllGeneralForumTopicMessagesParameters[chatId=")
        .append(chatId)
        .append("]");
    return builder.toString();
  }
}
