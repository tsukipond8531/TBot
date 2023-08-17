package jarkz.tbot.types.forum;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

public class ForumTopicCreated {

  @NotNull private String name;

  @SerializedName("icon_color")
  @NotNull
  private int iconColor;

  @SerializedName("icon_custom_emoji_id")
  private String iconCustomEmojiId;

  public ForumTopicCreated() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getIconColor() {
    return iconColor;
  }

  public void setIconColor(int iconColor) {
    this.iconColor = iconColor;
  }

  public Optional<String> getIconCustomEmojiId() {
    return Optional.of(iconCustomEmojiId);
  }

  public void setIconCustomEmojiId(String iconCustomEmojiId) {
    this.iconCustomEmojiId = iconCustomEmojiId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name, iconColor, iconCustomEmojiId);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ForumTopicCreated other)) return false;
    return Objects.equals(name, other.name)
        && iconColor == other.iconColor
        && Objects.equals(iconCustomEmojiId, other.iconCustomEmojiId);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ForumTopicCreated[name=")
        .append(name)
        .append(", iconColor=")
        .append(iconColor)
        .append(", iconCustomEmojiId=")
        .append(iconCustomEmojiId)
        .append("]");
    return builder.toString();
  }
}
