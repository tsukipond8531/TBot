package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.core.parameters.ReplyMarkup;
import java.util.List;
import java.util.Objects;

/**
 * This object represents a custom keyboard with reply options (see Introduction to bots for details
 * and examples).
 */
public final class ReplyKeyboardMarkup implements ReplyMarkup {

  /** Array of button rows, each represented by an Array of KeyboardButton objects */
  @NotNull public List<List<KeyboardButton>> keyboard;

  /**
   * Optional. Requests clients to always show the keyboard when the regular keyboard is hidden.
   * Defaults to false, in which case the custom keyboard can be hidden and opened with a keyboard
   * icon.
   */
  @SerializedName("is_persistent")
  public Boolean isPersistent;

  /**
   * Optional. Requests clients to resize the keyboard vertically for optimal fit (e.g., make the
   * keyboard smaller if there are just two rows of buttons). Defaults to false, in which case the
   * custom keyboard is always of the same height as the app's standard keyboard.
   */
  @SerializedName("resize_keyboard")
  public Boolean resizeKeyboard;

  /**
   * Optional. Requests clients to hide the keyboard as soon as it's been used. The keyboard will
   * still be available, but clients will automatically display the usual letter-keyboard in the
   * chat - the user can press a special button in the input field to see the custom keyboard again.
   * Defaults to false.
   */
  @SerializedName("one_time_keyboard")
  public Boolean oneTimeKeyboard;

  /**
   * Optional. The placeholder to be shown in the input field when the keyboard is active; 1-64
   * characters
   */
  @SerializedName("input_field_placeholder")
  public String inputFieldPlaceholder;

  /**
   * Optional. Use this parameter if you want to show the keyboard to specific users only. Targets:
   * 1) users that are @mentioned in the text of the Message object; 2) if the bot's message is a
   * reply to a message in the same chat and forum topic, sender of the original message. Example: A
   * user requests to change the bot's language, bot replies to the request with a keyboard to
   * select the new language. Other users in the group don't see the keyboard.
   */
  public Boolean selective;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ReplyKeyboardMarkup other)) return false;
    return Objects.equals(keyboard, other.keyboard)
        && Objects.equals(isPersistent, other.isPersistent)
        && Objects.equals(resizeKeyboard, other.resizeKeyboard)
        && Objects.equals(oneTimeKeyboard, other.oneTimeKeyboard)
        && Objects.equals(inputFieldPlaceholder, other.inputFieldPlaceholder)
        && Objects.equals(selective, other.selective);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        keyboard, isPersistent, resizeKeyboard, oneTimeKeyboard, inputFieldPlaceholder, selective);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ReplyKeyboardMarkup[keyboard=")
        .append(keyboard)
        .append(", isPersistent=")
        .append(isPersistent)
        .append(", resizeKeyboard=")
        .append(resizeKeyboard)
        .append(", oneTimeKeyboard=")
        .append(oneTimeKeyboard)
        .append(", inputFieldPlaceholder=")
        .append(inputFieldPlaceholder)
        .append(", selective=")
        .append(selective)
        .append("]");
    return builder.toString();
  }
}
