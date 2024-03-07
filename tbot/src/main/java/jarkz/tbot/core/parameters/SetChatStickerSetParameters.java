package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to set a new group sticker set for a supergroup. The bot must be an administrator
 * in the chat for this to work and must have the appropriate administrator rights. Use the field
 * can_set_sticker_set optionally returned in getChat requests to check if the bot can use this
 * method. Returns True on success.
 */
public final class SetChatStickerSetParameters {

  public static final class Builder {

    private SetChatStickerSetParameters buildingType;

    public Builder() {
      buildingType = new SetChatStickerSetParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setStickerSetName(String stickerSetName) {
      buildingType.stickerSetName = stickerSetName;
      return this;
    }

    public SetChatStickerSetParameters build() {
      return buildingType;
    }
  }

  /**
   * Unique identifier for the target chat or username of the target supergroup (in the
   * format @supergroupusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** Name of the sticker set to be set as the group sticker set */
  @NotNull
  @SerializedName("sticker_set_name")
  public String stickerSetName;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetChatStickerSetParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(stickerSetName, other.stickerSetName);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, stickerSetName);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetChatStickerSetParameters[chatId=")
        .append(chatId)
        .append(", stickerSetName=")
        .append(stickerSetName)
        .append("]");
    return builder.toString();
  }
}
