package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** The reaction is based on a custom emoji. */
public final class ReactionTypeCustomEmoji implements ReactionType {

  public static final String TYPE = "custom_emoji";

  /** Type of the reaction, always "custom_emoji" */
  @NotNull public final String type = TYPE;

  /** Custom emoji identifier */
  @NotNull
  @SerializedName("custom_emoji_id")
  public String customEmojiId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ReactionTypeCustomEmoji other)) return false;
    return Objects.equals(type, other.type) && Objects.equals(customEmojiId, other.customEmojiId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, customEmojiId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ReactionTypeCustomEmoji[type=")
        .append(type)
        .append(", customEmojiId=")
        .append(customEmojiId)
        .append("]");
    return builder.toString();
  }
}
