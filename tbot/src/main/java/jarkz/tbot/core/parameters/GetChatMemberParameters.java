package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to get information about a member of a chat. The method is only guaranteed to
 * work for other users if the bot is an administrator in the chat. Returns a ChatMember object on
 * success.
 */
public final class GetChatMemberParameters {

  public static final class Builder {

    private GetChatMemberParameters buildingType;

    public Builder() {
      buildingType = new GetChatMemberParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setUserId(int userId) {
      buildingType.userId = userId;
      return this;
    }

    public GetChatMemberParameters build() {
      return buildingType;
    }
  }

  /**
   * Unique identifier for the target chat or username of the target supergroup or channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** Unique identifier of the target user */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetChatMemberParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && userId == other.userId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, userId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("GetChatMemberParameters[chatId=")
        .append(chatId)
        .append(", userId=")
        .append(userId)
        .append("]");
    return builder.toString();
  }
}
