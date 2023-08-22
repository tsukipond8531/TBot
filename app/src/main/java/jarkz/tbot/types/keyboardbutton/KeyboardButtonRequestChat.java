package jarkz.tbot.types.keyboardbutton;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.chat.ChatAdministratorRights;
import java.util.Objects;
import java.util.Optional;

/**
 * This object defines the criteria used to request a suitable chat. The identifier of the selected
 * chat will be shared with the bot when the corresponding button is pressed.
 *
 * <p><a href= "https://core.telegram.org/bots/features#chat-and-user-selection">More about
 * requesting chats »</a>
 *
 * @author Pavel Bialiauski
 */
public class KeyboardButtonRequestChat {

  @SerializedName("request_id")
  @NotNull
  private int requestId;

  @SerializedName("chat_is_channel")
  @NotNull
  private boolean chatIsChannel;

  @SerializedName("chat_is_forum")
  private Boolean chatIsForum;

  @SerializedName("chat_has_username")
  private Boolean chatHasUsername;

  @SerializedName("chat_is_created")
  private Boolean chatIsCreated;

  @SerializedName("user_administrator_rights")
  private ChatAdministratorRights userAdministratorRights;

  @SerializedName("bot_administrator_rights")
  private ChatAdministratorRights botAdministratorRights;

  @SerializedName("bot_is_member")
  private Boolean botIsMember;

  /** Default constructor. */
  public KeyboardButtonRequestChat() {}

  /**
   * Signed 32-bit identifier of the request, which will be received back in the <a
   * href="https://core.telegram.org/bots/api#chatshared">ChatShared</a> object. Must be unique
   * within the message.
   *
   * @return request_id as int.
   */
  public int getRequestId() {
    return requestId;
  }

  /**
   * Sets the signed 32-bit identifier of the request, which will be received back in the <a
   * href="https://core.telegram.org/bots/api#chatshared">ChatShared</a> object. Must be unique
   * within the message.
   *
   * @param requestId the identifier of the request as int.
   */
  public void setRequestId(int requestId) {
    this.requestId = requestId;
  }

  /**
   * <i>True</i> to request a channel chat, pass <i>False</i> to request a group or a supergroup
   * chat.
   *
   * @return chat_is_channel as boolean.
   */
  public boolean isChatIsChannel() {
    return chatIsChannel;
  }

  /**
   * Pass <i>True</i> to request a channel chat, pass <i>False</i> to request a group or a
   * supergroup chat.
   *
   * @param chatIsChannel true if to request a channel caht, false if to request a group or a
   *     supegroup chat.
   */
  public void setChatIsChannel(boolean chatIsChannel) {
    this.chatIsChannel = chatIsChannel;
  }

  /**
   * <i>Optional.</i> <i>True</i> to request a forum supergroup, pass <i>False</i> to request a
   * non-forum chat. If not specified, no additional restrictions are applied.
   *
   * @return an optional value of chat_is_forum as Boolean.
   */
  public Optional<Boolean> getChatIsForum() {
    return Optional.of(chatIsForum);
  }

  /**
   * Pass <i>True</i> to request a forum supergroup, pass <i>False</i> to request a non-forum chat.
   * If not specified, no additional restrictions are applied.
   *
   * @param chatIsForum true if to request a forum supegroup, false if to request a non-forum chat,
   *     null if no additional restrictions are applied.
   */
  public void setChatIsForum(Boolean chatIsForum) {
    this.chatIsForum = chatIsForum;
  }

  /**
   * <i>Optional.</i> <i>True</i> to request a supergroup or a channel with a username, pass
   * <i>False</i> to request a chat without a username. If not specified, no additional restrictions
   * are applied.
   *
   * @return an optional value of chat_has_username as Boolean.
   */
  public Optional<Boolean> getChatHasUsername() {
    return Optional.of(chatHasUsername);
  }

  /**
   * Pass <i>True</i> to request a supergroup or a channel with a username, pass <i>False</i> to
   * request a chat without a username. If not specified, no additional restrictions are applied.
   *
   * @param chatHasUsername true if to request a supegroup or a channel with a username, false if to
   *     request a chat without a username, null if no additional restrictions are applied.
   */
  public void setChatHasUsername(Boolean chatHasUsername) {
    this.chatHasUsername = chatHasUsername;
  }

  /**
   * <i>Optional.</i> <i>True</i> to request a chat owned by the user. Otherwise, no additional
   * restrictions are applied.
   *
   * @return an optional value of chat_is_created as Boolean.
   */
  public Optional<Boolean> getChatIsCreated() {
    return Optional.of(chatIsCreated);
  }

  /**
   * Pass <i>True</i> to request a chat owned by the user. Otherwise, no additional restrictions are
   * applied.
   *
   * @param chatIsCreated true if to request a chat owned by the user, false or null if no
   *     additional restrictions are applied.
   */
  public void setChatIsCreated(Boolean chatIsCreated) {
    this.chatIsCreated = chatIsCreated;
  }

  /**
   * <i>Optional.</i> A object listing the required administrator rights of the user in the chat.
   * The rights must be a superset of <i>bot_administrator_rights</i>. If not specified, no
   * additional restrictions are applied.
   *
   * @return an optional value of user_administrator_rights as {@link ChatAdministratorRights}.
   */
  public Optional<ChatAdministratorRights> getUserAdministratorRights() {
    return Optional.of(userAdministratorRights);
  }

  /**
   * Sets the object listing the required administrator rights of the user in the
   * chat. The rights must be a superset of <i>bot_administrator_rights</i>. If not specified, no
   * additional restrictions are applied.
   *
   * @param userAdministratorRights the object listing the required administrator
   *     rights of the user in the chat as {@link ChatAdministratorRights} or null if not additional
   *     restrictions are applied.
   */
  public void setUserAdministratorRights(ChatAdministratorRights userAdministratorRights) {
    this.userAdministratorRights = userAdministratorRights;
  }

  /**
   * <i>Optional.</i> A object listing the required administrator rights of the bot in the chat. The
   * rights must be a subset of <i>user_administrator_rights</i>. If not specified, no additional
   * restrictions are applied.
   *
   * @return an optional value of bot_administrator_rights as {@link ChatAdministratorRights}.
   */
  public Optional<ChatAdministratorRights> getBotAdministratorRights() {
    return Optional.of(botAdministratorRights);
  }

  /**
   * Sets the object listing the required administrator rights of the bot in the
   * chat. The rights must be a subset of <i>user_administrator_rights</i>. If not specified, no
   * additional restrictions are applied.
   *
   * @param botAdministratorRights the object listing the required administrator
   *     rights of the bot in the chat as {@link ChatAdministratorRights} or null if no additional
   *     restrictions are applied.
   */
  public void setBotAdministratorRights(ChatAdministratorRights botAdministratorRights) {
    this.botAdministratorRights = botAdministratorRights;
  }

  /**
   * <i>Optional.</i> <i>True</i> to request a chat with the bot as a member. Otherwise, no
   * additional restrictions are applied.
   *
   * @return an optional value of bot_is_member as Boolean.
   */
  public Optional<Boolean> getBotIsMember() {
    return Optional.of(botIsMember);
  }

  /**
   * Pass <i>True</i> to request a chat with the bot as a member. Otherwise, no additional
   * restrictions are applied.
   *
   * @param botIsMember true if to request a chat with the bot a member, false or null if no
   *     additional restrictions are applied.
   */
  public void setBotIsMember(Boolean botIsMember) {
    this.botIsMember = botIsMember;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        requestId,
        chatIsChannel,
        chatIsForum,
        chatHasUsername,
        chatIsCreated,
        userAdministratorRights,
        botAdministratorRights,
        botIsMember);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof KeyboardButtonRequestChat other)) return false;
    return requestId == other.requestId
        && chatIsChannel == other.chatIsChannel
        && Objects.equals(chatIsForum, other.chatIsForum)
        && Objects.equals(chatHasUsername, other.chatHasUsername)
        && Objects.equals(chatIsCreated, other.chatIsCreated)
        && Objects.equals(userAdministratorRights, other.userAdministratorRights)
        && Objects.equals(botAdministratorRights, other.botAdministratorRights)
        && Objects.equals(botIsMember, other.botIsMember);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("KeyboardButtonRequestChat[requestId=")
        .append(requestId)
        .append(", chatIsChannel=")
        .append(chatIsChannel)
        .append(", chatIsForum=")
        .append(chatIsForum)
        .append(", chatHasUsername=")
        .append(chatHasUsername)
        .append(", chatIsCreated=")
        .append(chatIsCreated)
        .append(", userAdministratorRights=")
        .append(userAdministratorRights)
        .append(", botAdministratorRights=")
        .append(botAdministratorRights)
        .append(", botIsMember=")
        .append(botIsMember)
        .append("]");
    return builder.toString();
  }
}
