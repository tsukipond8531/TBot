package jarkz.tbot.types.botcommandscope;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents the <a href="https://core.telegram.org/bots/api#botcommandscope">scope</a> of bot
 * commands, covering a specific member of a group or supergroup chat.
 *
 * @author Pavel Bialiauski
 */
public class BotCommandScopeChatMember implements BotCommandScope {

  /**
   * Type of {@link BotCommandScope}. Always "chat_member".
   */
  protected static final String TYPE = "chat_member";

  private final String type = BotCommandScopeChatMember.TYPE;

  @SerializedName("chat_id")
  @NotNull
  private String chatId;

  @SerializedName("user_id")
  @NotNull
  private int userId;

  /**
   * Default constructor.
   */
  public BotCommandScopeChatMember() {}

  /**
   * Scope type, must be <i>chat_member</i>.
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

  /**
   * Unique identifier of the target user.
   *
   * @return user_id as Integer.
   */
  public int getUserId() {
    return userId;
  }

  /**
   * Sets the unique identifier of the target user.
   *
   * @param userId the unique identifier of the target user as int.
   */
  public void setUserId(int userId) {
    this.userId = userId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, chatId, userId);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotCommandScopeChatMember other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(chatId, other.chatId)
        && userId == other.userId;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("BotCommandScopeChatMember[type=")
        .append(type)
        .append(", chatId=")
        .append(chatId)
        .append(", userId=")
        .append(userId)
        .append("]");
    return builder.toString();
  }
}
