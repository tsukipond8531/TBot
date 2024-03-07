package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to delete multiple messages simultaneously. If some of the specified messages
 * can't be found, they are skipped. Returns True on success.
 */
public final class DeleteMessagesParameters {

  public static final class Builder {

    private DeleteMessagesParameters buildingType;

    public Builder() {
      buildingType = new DeleteMessagesParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageIds(List<Integer> messageIds) {
      buildingType.messageIds = messageIds;
      return this;
    }

    public DeleteMessagesParameters build() {
      return buildingType;
    }
  }

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /**
   * A JSON-serialized list of 1-100 identifiers of messages to delete. See deleteMessage for
   * limitations on which messages can be deleted
   */
  @NotNull
  @SerializedName("message_ids")
  public List<Integer> messageIds;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof DeleteMessagesParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && Objects.equals(messageIds, other.messageIds);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, messageIds);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("DeleteMessagesParameters[chatId=")
        .append(chatId)
        .append(", messageIds=")
        .append(messageIds)
        .append("]");
    return builder.toString();
  }
}
