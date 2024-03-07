package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/** Use this method to get the number of members in a chat. Returns Int on success. */
public final class GetChatMemberCountParameters {

  public static final class Builder {

    private GetChatMemberCountParameters buildingType;

    public Builder() {
      buildingType = new GetChatMemberCountParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public GetChatMemberCountParameters build() {
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

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetChatMemberCountParameters other)) return false;
    return Objects.equals(chatId, other.chatId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("GetChatMemberCountParameters[chatId=").append(chatId).append("]");
    return builder.toString();
  }
}
