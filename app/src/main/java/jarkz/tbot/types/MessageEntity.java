package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents one special entity in a text message. For example, hashtags, usernames,
 * URLs, etc.
 *
 * @author Pavel Bialiauski
 */
public class MessageEntity {

  @NotNull private String type;

  @NotNull private int offset;

  @NotNull private int length;

  private String url;

  private User user;

  private String language;

  @SerializedName("custom_emoji_id")
  private String customEmojiId;

  /** Default constructor. */
  public MessageEntity() {}

  /**
   * Type of the entity. Currently, can be
   *
   * <ul>
   *   <li>“mention” (<code>@username</code>);
   *   <li>“hashtag” (<code>#hashtag</code>);
   *   <li>“cashtag” (<code>$USD</code>);
   *   <li>“bot_command” (<code>/start@jobs_bot</code>);
   *   <li>“url” (<code>https://telegram.org</code>);
   *   <li>“email” (<code>do-not-reply@telegram.org</code>);
   *   <li>“phone_number” (<code>+1-212-555-0123</code>);
   *   <li>“bold” (<strong>bold text</strong>);
   *   <li>“italic” (<em>italic text</em>);
   *   <li>“underline” (underlined text);
   *   <li>“strikethrough” (strikethrough text);
   *   <li>“spoiler” (spoiler message);
   *   <li>“code” (monowidth string);
   *   <li>“pre” (monowidth block);
   *   <li>“text_link” (for clickable text URLs);
   *   <li>“text_mention” (for users <a href="https://telegram.org/blog/edit#new-mentions">without
   *       usernames</a>);
   *   <li>“custom_emoji” (for inline custom emoji stickers).
   * </ul>
   *
   * @return type as String.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the type of the entity. Currently, can be
   *
   * <ul>
   *   <li>“mention” (<code>@username</code>);
   *   <li>“hashtag” (<code>#hashtag</code>);
   *   <li>“cashtag” (<code>$USD</code>);
   *   <li>“bot_command” (<code>/start@jobs_bot</code>);
   *   <li>“url” (<code>https://telegram.org</code>);
   *   <li>“email” (<code>do-not-reply@telegram.org</code>);
   *   <li>“phone_number” (<code>+1-212-555-0123</code>);
   *   <li>“bold” (<strong>bold text</strong>);
   *   <li>“italic” (<em>italic text</em>);
   *   <li>“underline” (underlined text);
   *   <li>“strikethrough” (strikethrough text);
   *   <li>“spoiler” (spoiler message);
   *   <li>“code” (monowidth string);
   *   <li>“pre” (monowidth block);
   *   <li>“text_link” (for clickable text URLs);
   *   <li>“text_mention” (for users <a href="https://telegram.org/blog/edit#new-mentions">without
   *       usernames</a>);
   *   <li>“custom_emoji” (for inline custom emoji stickers).
   * </ul>
   *
   * @param type the type of the entity as String.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Offset in <a href="https://core.telegram.org/api/entities#entity-length">UTF-16 code units</a>
   * to the start of the entity.
   *
   * @return offset as int.
   */
  public int getOffset() {
    return offset;
  }

  /**
   * Sets the offset in <a href="https://core.telegram.org/api/entities#entity-length">UTF-16 code
   * units</a> to the start of the entity.
   *
   * @param offset the offset in UTF-16 code units tot he start of the entity as int.
   */
  public void setOffset(int offset) {
    this.offset = offset;
  }

  /**
   * Length of the entity in <a href="https://core.telegram.org/api/entities#entity-length">UTF-16
   * code units</a>.
   *
   * @return length as int.
   */
  public int getLength() {
    return length;
  }

  /**
   * Sets the length of the entity in <a
   * href="https://core.telegram.org/api/entities#entity-length">UTF-16 code units</a>.
   *
   * @param length the length of the entity in UTF-16 code units as int.
   */
  public void setLength(int length) {
    this.length = length;
  }

  /**
   * <i>Optional.</i> For “text_link” only, URL that will be opened after user taps on the text.
   *
   * @return an optional value of url as String.
   */
  public Optional<String> getUrl() {
    return Optional.of(url);
  }

  /**
   * Sets the url that will be opened after user taps on the text; for "text_link" only.
   *
   * @param url the url that will be opened after user taps on the text as String or null if the
   *     type is not "text_link".
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * <i>Optional.</i> For “text_mention” only, the mentioned user.
   *
   * @return an optional value of user as {@link User}.
   */
  public Optional<User> getUser() {
    return Optional.of(user);
  }

  /**
   * Sets the mentioned user; for "text_mention" only.
   *
   * @param user the mentioned user as {@link User} or null if the type is not "text_mention".
   */
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * <i>Optional.</i> For “pre” only, the programming language of the entity text.
   *
   * @return an optional value of language as String.
   */
  public Optional<String> getLanguage() {
    return Optional.of(language);
  }

  /**
   * Sets the programming language of the entity text; for "pre" only.
   *
   * @param language the programming language of the entity text as String or null if the type is
   *     not "pre".
   */
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * <i>Optional.</i> For “custom_emoji” only, unique identifier of the custom emoji.
   *
   * <p>Use <a href=
   * "https://core.telegram.org/bots/api#getcustomemojistickers">getCustomEmojiStickers</a> to get
   * full information about the sticker.
   *
   * @return an optional value of custom_emoji_id as String.
   */
  public Optional<String> getCustomEmojiId() {
    return Optional.of(customEmojiId);
  }

  /**
   * Sets the unique identifier of the custom emoji; for "custom_emoji" only.
   *
   * <p>Use <a href=
   * "https://core.telegram.org/bots/api#getcustomemojistickers">getCustomEmojiStickers</a> to get
   * full information about the sticker.
   *
   * @param customEmojiId the unique identifier of the custom emoji as String or null if the type is
   *     not "custom_emoji".
   */
  public void setCustomEmojiId(String customEmojiId) {
    this.customEmojiId = customEmojiId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, offset, length, url, user, language, customEmojiId);
  }

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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
