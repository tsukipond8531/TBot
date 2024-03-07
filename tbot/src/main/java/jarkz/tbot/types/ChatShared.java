package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object contains information about the chat whose identifier was shared with the bot using a
 * KeyboardButtonRequestChat button.
 */
public final class ChatShared {

  public static final class Builder {

    private ChatShared buildingType;

    public Builder() {
      buildingType = new ChatShared();
    }

    public Builder setRequestId(int requestId) {
      buildingType.requestId = requestId;
      return this;
    }

    public Builder setChatId(long chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public ChatShared build() {
      return buildingType;
    }
  }

  /** Identifier of the request */
  @NotNull
  @SerializedName("request_id")
  public int requestId;

  /**
   * Identifier of the shared chat. This number may have more than 32 significant bits and some
   * programming languages may have difficulty/silent defects in interpreting it. But it has at most
   * 52 significant bits, so a 64-bit integer or double-precision float type are safe for storing
   * this identifier. The bot may not have access to the chat and could be unable to use this
   * identifier, unless the chat is already known to the bot by some other means.
   */
  @NotNull
  @SerializedName("chat_id")
  public long chatId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatShared other)) return false;
    return requestId == other.requestId && chatId == other.chatId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(requestId, chatId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatShared[requestId=")
        .append(requestId)
        .append(", chatId=")
        .append(chatId)
        .append("]");
    return builder.toString();
  }
}
