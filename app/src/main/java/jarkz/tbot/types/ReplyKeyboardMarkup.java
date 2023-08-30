package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.keyboardbutton.KeyboardButton;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a <a href="https://core.telegram.org/bots/features#keyboards">custom
 * keyboard</a> with reply options (see <a
 * href="https://core.telegram.org/bots/features#keyboards">Introduction to bots</a> for details and
 * examples).
 *
 * @author Pavel Bialiauski
 */
public class ReplyKeyboardMarkup {

  @NotNull private List<List<KeyboardButton>> keyboard;

  @SerializedName("is_persistent")
  private Boolean isPersistent;

  @SerializedName("resize_keyboard")
  private Boolean resizeKeyboard;

  @SerializedName("one_time_keyboard")
  private Boolean oneTimeKeyboard;

  @SerializedName("input_field_placeholder")
  private String inputFieldPlaceholder;

  private Boolean selective;

  /** Default constructor. */
  public ReplyKeyboardMarkup() {}

  /**
   * List of button rows, each represented by a list of <a href=
   * "https://core.telegram.org/bots/api#keyboardbutton">KeyboardButton</a> objects.
   *
   * @return keyboard as {@link List}&lt;{@link List}&lt;{@link KeyboardButton}&gt;&gt;.
   */
  public List<List<KeyboardButton>> getKeyboard() {
    return keyboard;
  }

  /**
   * Sets the list of button rows, each represented by a list of <a href=
   * "https://core.telegram.org/bots/api#keyboardbutton">KeyboardButton</a> objects.
   *
   * @param keyboard the list of button rows, each represented by list of {@link KeyboardButton}.
   */
  public void setKeyboard(List<List<KeyboardButton>> keyboard) {
    this.keyboard = keyboard;
  }

  /**
   * <i>Optional.</i> Requests clients to always show the keyboard when the regular keyboard is
   * hidden. Defaults to <i>false</i>, in which case the custom keyboard can be hidden and opened
   * with a keyboard icon.
   *
   * @return an optional value of is_persistent as Boolean.
   */
  public Optional<Boolean> getIsPersistent() {
    return Optional.of(isPersistent);
  }

  /**
   * Sets the requests clients to whether always show the keyboard when the regular keyboard is
   * hidden. Defaults to <i>false</i>, in which case the custom keyboard can be hidden and opened
   * with a keyboard icon.
   *
   * @param isPersistent true if always show the keyboard, otherwise - false or null.
   */
  public void setIsPersistent(Boolean isPersistent) {
    this.isPersistent = isPersistent;
  }

  /**
   * <i>Optional.</i> Requests clients to resize the keyboard vertically for optimal fit (e.g., make
   * the keyboard smaller if there are just two rows of buttons). Defaults to <i>false</i>, in which
   * case the custom keyboard is always of the same height as the app's standard keyboard.
   *
   * @return an optional value of resize_keyboard as Boolean.
   */
  public Optional<Boolean> getResizeKeyboard() {
    return Optional.of(resizeKeyboard);
  }

  /**
   * Sets the requests clients to whehter resize the keyboard vertically for optimal fit (e.g., make
   * the keyboard smaller if there are just two rows of buttons). Defaults to <i>false</i>, in which
   * case the custom keyboard is always of the same height as the app's standard keyboard.
   *
   * @param resizeKeyboard true if risize the keyboard vertically for optimal fit, otherwise - false
   *     or null.
   */
  public void setResizeKeyboard(Boolean resizeKeyboard) {
    this.resizeKeyboard = resizeKeyboard;
  }

  /**
   * <i>Optional.</i> Requests clients to hide the keyboard as soon as it's been used. The keyboard
   * will still be available, but clients will automatically display the usual letter-keyboard in
   * the chat - the user can press a special button in the input field to see the custom keyboard
   * again. Defaults to <i>false</i>.
   *
   * @return an optional value of one_time_keyboard as Boolean.
   */
  public Optional<Boolean> getOneTimeKeyboard() {
    return Optional.of(oneTimeKeyboard);
  }

  /**
   * Sets the requests clients to whether hide the keyboard as soon as it's been used. The keyboard
   * will still be available, but clients will automatically display the usual letter-keyboard in
   * the chat - the user can press a special button in the input field to see the custom keyboard
   * again. Defaults to <i>false</i>.
   *
   * @param oneTimeKeyboard true if hide the keyboard as soon as it's been used, otherwise - false
   *     or null.
   */
  public void setOneTimeKeyboard(Boolean oneTimeKeyboard) {
    this.oneTimeKeyboard = oneTimeKeyboard;
  }

  /**
   * <i>Optional.</i> The placeholder to be shown in the input field when the keyboard is active;
   * 1-64 characters.
   *
   * @return an optional value of input_field_placeholder as String.
   */
  public Optional<String> getInputFieldPlaceholder() {
    return Optional.of(inputFieldPlaceholder);
  }

  /**
   * Sets the placeholder to be shown in the input field when the keyboard is active; 1-64
   * characters.
   *
   * @param inputFieldPlaceholder the placeholder to be shown in the input field, when the keyboard
   *     is active (1-64 characters), as String or null if it is not required.
   */
  public void setInputFieldPlaceholder(String inputFieldPlaceholder) {
    this.inputFieldPlaceholder = inputFieldPlaceholder;
  }

  /**
   * <i>Optional.</i> True, if to show the keyboard to specific users only.<br>
   * Targets:<br>
   * 1) users that are &#64;mentioned in the <i>text</i> of the <a
   * href="https://core.telegram.org/bots/api#message">Message</a> object;<br>
   * 2) if the bot's message is a reply (has <i>reply_to_message_id</i>), sender of the original
   * message.<br>
   * <br>
   * <i>Example:</i> A user requests to change the bot's language, bot replies to the request with a
   * keyboard to select the new language. Other users in the group don't see the keyboard.
   *
   * @return an optional value of selective as Boolean.
   */
  public Optional<Boolean> getSelective() {
    return Optional.of(selective);
  }

  /**
   * Use this parameter if you want to show the keyboard to specific users only.<br>
   * Targets:<br>
   * 1) users that are &#64;mentioned in the <i>text</i> of the <a
   * href="https://core.telegram.org/bots/api#message">Message</a> object;<br>
   * 2) if the bot's message is a reply (has <i>reply_to_message_id</i>), sender of the original
   * message.<br>
   * <br>
   * <i>Example:</i> A user requests to change the bot's language, bot replies to the request with a
   * keyboard to select the new language. Other users in the group don't see the keyboard.
   *
   * @param selective true if you want to show the keyboard to specific users only, otherwise -
   *     false or null.
   */
  public void setSelective(Boolean selective) {
    this.selective = selective;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        keyboard, isPersistent, resizeKeyboard, oneTimeKeyboard, inputFieldPlaceholder, selective);
  }

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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
