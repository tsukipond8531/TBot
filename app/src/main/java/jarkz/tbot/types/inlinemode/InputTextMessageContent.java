package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents the <a href="https://core.telegram.org/bots/api#inputmessagecontent">content</a> of a
 * text message to be sent as the result of an inline query.
 *
 * @author Pavel Bialiauski
 */
public class InputTextMessageContent implements InputMessageContent {

  @SerializedName("message_text")
  @NotNull
  private String messageText;

  @SerializedName("parse_mode")
  private String parseMode;

  private List<MessageEntity> entities;

  @SerializedName("disable_web_page_preview")
  private Boolean disableWebPagePreview;

  /** Default constructor. */
  public InputTextMessageContent() {}

  /**
   * Text of the message to be sent, 1-4096 characters.
   *
   * @return message_text as String.
   */
  public String getMessageText() {
    return messageText;
  }

  /**
   * Sets the text of the message to be sent, 1-4096 characters.
   *
   * @param messageText the text of the message to be sent (1-4096 characters) as String.
   */
  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  /**
   * <i>Optional.</i> Mode for parsing entities in the message text. See <a
   * href="https://core.telegram.org/bots/api#formatting-options">formatting options</a> for more
   * details.
   *
   * @return an optional value of parse_mode as String.
   */
  public Optional<String> getParseMode() {
    return Optional.ofNullable(parseMode);
  }

  /**
   * Sets the mode for parsing entities in the message text. See <a
   * href="https://core.telegram.org/bots/api#formatting-options">formatting options</a> for more
   * details.
   *
   * @param parseMode the mode for parsing entities in the message text as String or null if the
   *     entities is exists.
   */
  public void setParseMode(String parseMode) {
    this.parseMode = parseMode;
  }

  /**
   * <i>Optional.</i> List of special entities that appear in message text, which can be specified
   * instead of <i>parse_mode</i>.
   *
   * @return an optional value of entities as {@link List}&lt;{@link MessageEntity}&gt;.
   */
  public Optional<List<MessageEntity>> getEntities() {
    return Optional.ofNullable(entities);
  }

  /**
   * Sets the list of special entities that appear in message text, which can be specified instead
   * of <i>parse_mode</i>.
   *
   * @param entities the list of special entities that appear in message text, which can be
   *     specified instead of <i>parse_mode</i>, as {@link List}&lt;{@link MessageEntity}&gt; or
   *     null if the parse mode is specified.
   */
  public void setEntities(List<MessageEntity> entities) {
    this.entities = entities;
  }

  /**
   * <i>Optional.</i> Disables link previews for links in the sent message.
   *
   * @return an optional value of disable_web_page_preview as Boolean.
   */
  public Optional<Boolean> getDisableWebPagePreview() {
    return Optional.ofNullable(disableWebPagePreview);
  }

  /**
   * Sets the disables link previews for links in the sent message.
   *
   * @param disableWebPagePreview true if disable link previews for links in the sent message,
   *     otherwise - null or false.
   */
  public void setDisableWebPagePreview(Boolean disableWebPagePreview) {
    this.disableWebPagePreview = disableWebPagePreview;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(messageText, parseMode, entities, disableWebPagePreview);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputTextMessageContent other)) return false;
    return Objects.equals(messageText, other.messageText)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(entities, other.entities)
        && Objects.equals(disableWebPagePreview, other.disableWebPagePreview);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InputTextMessageContent[messageText=")
        .append(messageText)
        .append(", parseMode=")
        .append(parseMode)
        .append(", entities=")
        .append(entities)
        .append(", disableWebPagePreview=")
        .append(disableWebPagePreview)
        .append("]");
    return builder.toString();
  }
}
