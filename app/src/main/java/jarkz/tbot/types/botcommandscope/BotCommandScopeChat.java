package jarkz.tbot.types.botcommandscope;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

public class BotCommandScopeChat implements BotCommandScope {

  protected static final String TYPE = "chat";

  private final String type = BotCommandScopeChat.TYPE;

  @SerializedName("chat_id")
  @NotNull
  private String chatId;

  public BotCommandScopeChat() {}

  public String getType() {
    return type;
  }

  public String getChatId() {
    return chatId;
  }

  public void setChatId(String chatId) {
    this.chatId = chatId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, chatId);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotCommandScopeChat other)) return false;
    return Objects.equals(type, other.type) && Objects.equals(chatId, other.chatId);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("BotCommandScopeChat[type=")
        .append(type)
        .append(", chatId=")
        .append(chatId)
        .append("]");
    return builder.toString();
  }
}
