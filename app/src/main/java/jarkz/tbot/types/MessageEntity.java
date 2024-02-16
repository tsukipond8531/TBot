package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents one special entity in a text message. For example, hashtags, usernames,
 * URLs, etc.
 */
public final class MessageEntity {

  /**
   * Type of the entity. Currently, can be "mention" (@username), "hashtag" (#hashtag), "cashtag"
   * ($USD), "bot_command" (/start@jobs_bot), "url" (https://telegram.org), "email"
   * (do-not-reply@telegram.org), "phone_number" (+1-212-555-0123), "bold" (bold text), "italic"
   * (italic text), "underline" (underlined text), "strikethrough" (strikethrough text), "spoiler"
   * (spoiler message), "blockquote" (block quotation), "code" (monowidth string), "pre" (monowidth
   * block), "text_link" (for clickable text URLs), "text_mention" (for users without usernames),
   * "custom_emoji" (for inline custom emoji stickers)
   */
  @NotNull public String type;

  /** Offset in UTF-16 code units to the start of the entity */
  @NotNull public int offset;

  /** Length of the entity in UTF-16 code units */
  @NotNull public int length;

  /** Optional. For "text_link" only, URL that will be opened after user taps on the text */
  public String url;

  /** Optional. For "text_mention" only, the mentioned user */
  public User user;

  /** Optional. For "pre" only, the programming language of the entity text */
  public String language;

  /**
   * Optional. For "custom_emoji" only, unique identifier of the custom emoji. Use
   * getCustomEmojiStickers to get full information about the sticker
   */
  @SerializedName("custom_emoji_id")
  public String customEmojiId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MessageEntity other)) return false;
    return Objects.equals(type, other.type)
        && offset == other.offset
        && length == other.length
        && Objects.equals(url, other.url)
        && Objects.equals(user, other.user)
        && Objects.equals(language, other.language)
        && Objects.equals(customEmojiId, other.customEmojiId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, offset, length, url, user, language, customEmojiId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("MessageEntity[type=")
        .append(type)
        .append(", offset=")
        .append(offset)
        .append(", length=")
        .append(length)
        .append(", url=")
        .append(url)
        .append(", user=")
        .append(user)
        .append(", language=")
        .append(language)
        .append(", customEmojiId=")
        .append(customEmojiId)
        .append("]");
    return builder.toString();
  }
}
