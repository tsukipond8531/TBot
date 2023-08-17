package jarkz.tbot.types.chat;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

public class ChatShared {

  @SerializedName("request_id")
  @NotNull
  private int requestId;

  @SerializedName("chat_id")
  @NotNull
  private long chatId;

  public ChatShared() {}

  public int getRequestId() {
    return requestId;
  }

  public void setRequestId(int requestId) {
    this.requestId = requestId;
  }

  public long getChatId() {
    return chatId;
  }

  public void setChatId(long chatId) {
    this.chatId = chatId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(requestId, chatId);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatShared other)) return false;
    return requestId == other.requestId && chatId == other.chatId;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ChatShared[requestId=")
        .append(requestId)
        .append(", chatId=")
        .append(chatId)
        .append("]");
    return builder.toString();
  }
}
