package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to create a topic in a forum supergroup chat. The bot must be an administrator in
 * the chat for this to work and must have the can_manage_topics administrator rights. Returns
 * information about the created topic as a ForumTopic object.
 */
public final class CreateForumTopicParameters {

  public static final class Builder {

    private CreateForumTopicParameters buildingType;

    public Builder() {
      buildingType = new CreateForumTopicParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setName(String name) {
      buildingType.name = name;
      return this;
    }

    public Builder setIconColor(Integer iconColor) {
      buildingType.iconColor = iconColor;
      return this;
    }

    public Builder setIconCustomEmojiId(String iconCustomEmojiId) {
      buildingType.iconCustomEmojiId = iconCustomEmojiId;
      return this;
    }

    public CreateForumTopicParameters build() {
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

  /** Topic name, 1-128 characters */
  @NotNull public String name;

  /**
   * Color of the topic icon in RGB format. Currently, must be one of 7322096 (0x6FB9F0), 16766590
   * (0xFFD67E), 13338331 (0xCB86DB), 9367192 (0x8EEE98), 16749490 (0xFF93B2), or 16478047
   * (0xFB6F5F)
   */
  @SerializedName("icon_color")
  public Integer iconColor;

  /**
   * Unique identifier of the custom emoji shown as the topic icon. Use getForumTopicIconStickers to
   * get all allowed custom emoji identifiers.
   */
  @SerializedName("icon_custom_emoji_id")
  public String iconCustomEmojiId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof CreateForumTopicParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(name, other.name)
        && Objects.equals(iconColor, other.iconColor)
        && Objects.equals(iconCustomEmojiId, other.iconCustomEmojiId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, name, iconColor, iconCustomEmojiId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("CreateForumTopicParameters[chatId=")
        .append(chatId)
        .append(", name=")
        .append(name)
        .append(", iconColor=")
        .append(iconColor)
        .append(", iconCustomEmojiId=")
        .append(iconCustomEmojiId)
        .append("]");
    return builder.toString();
  }
}
