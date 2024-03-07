package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jarkz.tbot.types.MenuButton;
import java.util.Objects;

/**
 * Use this method to change the bot's menu button in a private chat, or the default menu button.
 * Returns True on success.
 */
public final class SetChatMenuButtonParameters {

  public static final class Builder {

    private SetChatMenuButtonParameters buildingType;

    public Builder() {
      buildingType = new SetChatMenuButtonParameters();
    }

    public Builder setChatId(Integer chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMenuButton(MenuButton menuButton) {
      buildingType.menuButton = menuButton;
      return this;
    }

    public SetChatMenuButtonParameters build() {
      return buildingType;
    }
  }

  /**
   * Unique identifier for the target private chat. If not specified, default bot's menu button will
   * be changed
   */
  @SerializedName("chat_id")
  public Integer chatId;

  /** A JSON-serialized object for the bot's new menu button. Defaults to MenuButtonDefault */
  @SerializedName("menu_button")
  public MenuButton menuButton;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetChatMenuButtonParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && Objects.equals(menuButton, other.menuButton);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, menuButton);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetChatMenuButtonParameters[chatId=")
        .append(chatId)
        .append(", menuButton=")
        .append(menuButton)
        .append("]");
    return builder.toString();
  }
}
