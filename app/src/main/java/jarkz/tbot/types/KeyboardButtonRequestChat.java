package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object defines the criteria used to request a suitable chat. The identifier of the selected
 * chat will be shared with the bot when the corresponding button is pressed. More about requesting
 * chats: https://core.telegram.org/bots/features#chat-and-user-selection
 */
public final class KeyboardButtonRequestChat {

  /**
   * Signed 32-bit identifier of the request, which will be received back in the ChatShared object.
   * Must be unique within the message
   */
  @NotNull
  @SerializedName("request_id")
  public int requestId;

  /** Pass True to request a channel chat, pass False to request a group or a supergroup chat. */
  @NotNull
  @SerializedName("chat_is_channel")
  public boolean chatIsChannel;

  /**
   * Optional. Pass True to request a forum supergroup, pass False to request a non-forum chat. If
   * not specified, no additional restrictions are applied.
   */
  @SerializedName("chat_is_forum")
  public Boolean chatIsForum;

  /**
   * Optional. Pass True to request a supergroup or a channel with a username, pass False to request
   * a chat without a username. If not specified, no additional restrictions are applied.
   */
  @SerializedName("chat_has_username")
  public Boolean chatHasUsername;

  /**
   * Optional. Pass True to request a chat owned by the user. Otherwise, no additional restrictions
   * are applied.
   */
  @SerializedName("chat_is_created")
  public Boolean chatIsCreated;

  /**
   * Optional. A JSON-serialized object listing the required administrator rights of the user in the
   * chat. The rights must be a superset of bot_administrator_rights. If not specified, no
   * additional restrictions are applied.
   */
  @SerializedName("user_administrator_rights")
  public ChatAdministratorRights userAdministratorRights;

  /**
   * Optional. A JSON-serialized object listing the required administrator rights of the bot in the
   * chat. The rights must be a subset of user_administrator_rights. If not specified, no additional
   * restrictions are applied.
   */
  @SerializedName("bot_administrator_rights")
  public ChatAdministratorRights botAdministratorRights;

  /**
   * Optional. Pass True to request a chat with the bot as a member. Otherwise, no additional
   * restrictions are applied.
   */
  @SerializedName("bot_is_member")
  public Boolean botIsMember;

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
  public final String toString() {
    var builder = new StringBuilder();
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
