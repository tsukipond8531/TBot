package jarkz.tbot.types.botcommandscope;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents the <a href="https://core.telegram.org/bots/api#botcommandscope">scope</a> of bot
 * commands, covering a specific chat.
 *
 * @author Pavel Bialiauski
 */
public class BotCommandScopeChat implements BotCommandScope {

  /** Type of {@link BotCommandScope}. Always "chat". */
  protected static final String TYPE = "chat";

  private final String type = BotCommandScopeChat.TYPE;

  @SerializedName("chat_id")
  @NotNull
  private String chatId;

  /** Default constructor. */
  public BotCommandScopeChat() {}

  /**
   * Scope type, must be <i>chat</i>.
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  /**
   * Unique identifier for the target chat or username of the target supergroup (in the format
   * <code>@supergroupusername</code>).
   *
   * @return chat_id as String.
   */
  public String getChatId() {
    return chatId;
  }

  /**
   * Sets the unique identifier for the target chat or username of the target supergroup (in the
   * format <code>@supergroupusername</code>).
   *
   * @param chatId the unique identifier for the target chat or username of the target supergroup
   *     (in the format <code>@supergroupusername</code>) as String.
   */
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
