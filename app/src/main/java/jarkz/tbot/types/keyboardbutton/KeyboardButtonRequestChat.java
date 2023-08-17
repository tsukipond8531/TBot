package jarkz.tbot.types.keyboardbutton;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.chat.ChatAdministratorRights;
import java.util.Objects;
import java.util.Optional;

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

  public KeyboardButtonRequestChat() {}

  public int getRequestId() {
    return requestId;
  }

  public void setRequestId(int requestId) {
    this.requestId = requestId;
  }

  public boolean isChatIsChannel() {
    return chatIsChannel;
  }

  public void setChatIsChannel(boolean chatIsChannel) {
    this.chatIsChannel = chatIsChannel;
  }

  public Optional<Boolean> getChatIsForum() {
    return Optional.of(chatIsForum);
  }

  public void setChatIsForum(Boolean chatIsForum) {
    this.chatIsForum = chatIsForum;
  }

  public Optional<Boolean> getChatHasUsername() {
    return Optional.of(chatHasUsername);
  }

  public void setChatHasUsername(Boolean chatHasUsername) {
    this.chatHasUsername = chatHasUsername;
  }

  public Optional<Boolean> getChatIsCreated() {
    return Optional.of(chatIsCreated);
  }

  public void setChatIsCreated(Boolean chatIsCreated) {
    this.chatIsCreated = chatIsCreated;
  }

  public Optional<ChatAdministratorRights> getUserAdministratorRights() {
    return Optional.of(userAdministratorRights);
  }

  public void setUserAdministratorRights(ChatAdministratorRights userAdministratorRights) {
    this.userAdministratorRights = userAdministratorRights;
  }

  public Optional<ChatAdministratorRights> getBotAdministratorRights() {
    return Optional.of(botAdministratorRights);
  }

  public void setBotAdministratorRights(ChatAdministratorRights botAdministratorRights) {
    this.botAdministratorRights = botAdministratorRights;
  }

  public Optional<Boolean> getBotIsMember() {
    return Optional.of(botIsMember);
  }

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
