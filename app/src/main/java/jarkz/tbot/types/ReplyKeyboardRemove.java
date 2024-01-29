package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Upon receiving a message with this object, Telegram clients will remove the current custom
 * keyboard and display the default letter-keyboard. By default, custom keyboards are displayed
 * until a new keyboard is sent by a bot. An exception is made for one-time keyboards that are
 * hidden immediately after the user presses a button (see <a href=
 * "https://core.telegra.org/bots/api#replykeyboardmarkup">ReplyKeyboardMarkup</a> or {@link
 * ReplyKeyboardMarkup}).
 *
 * @author Pavel Bialiauski
 */
public class ReplyKeyboardRemove {

  @SerializedName("remove_keyboard")
  @NotNull
  private boolean removeKeyboard;

  private Boolean selective;

  /** Default constructor. */
  public ReplyKeyboardRemove() {}

  /**
   * Requests clients to remove the custom keyboard (user will not be able to summon this keyboard;
   * if you want to hide the keyboard from sight but keep it accessible, use
   * <i>one_time_keyboard</i> in <a href=
   * "https://core.telegra.org/bots/api#replykeyboardmarkup">ReplyKeyboardMarkup</a> or {@link
   * ReplyKeyboardMarkup}).
   *
   * @return remove_keyboard as boolean.
   */
  public boolean isRemoveKeyboard() {
    return removeKeyboard;
  }

  /**
   * Sets the requests clients to whether remove the custom keyboard (user will not be able to
   * summon this keyboard; if you want to hide the keyboard from sight but keep it accessible, use
   * <i>one_time_keyboard</i> in <a href=
   * "https://core.telegra.org/bots/api#replykeyboardmarkup">ReplyKeyboardMarkup</a> or {@link
   * ReplyKeyboardMarkup}).
   *
   * @param removeKeyboard true if remove the custom keyboard, otherwise - false.
   */
  public void setRemoveKeyboard(boolean removeKeyboard) {
    this.removeKeyboard = removeKeyboard;
  }

  /**
   * <i>Optional.</i> True, if removes the keyboard for specific users only.
   *
   * <p>Targets:
   *
   * <ul>
   *   <li>1) users that are &#64;mentioned in the <i>text</i> of the <a
   *       href="https://core.telegram.org/bots/api#message">Message</a> object;
   *   <li>2) if the bot's message is a reply (has <i>reply_to_message_id</i>), sender of the
   *       original message.<br>
   * </ul>
   *
   * <i>Example:</i> A user votes in a poll, bot returns confirmation message in reply to the vote
   * and removes the keyboard for that user, while still showing the keyboard with poll options to
   * users who haven't voted yet.
   *
   * @return an optional value of selective as Boolean.
   */
  public Optional<Boolean> getSelective() {
    return Optional.ofNullable(selective);
  }

  /**
   * Use this parameter if you want to remove the keyboard for specific users only.
   *
   * <p>Targets:
   *
   * <ul>
   *   <li>1) users that are &#64;mentioned in the <i>text</i> of the <a
   *       href="https://core.telegram.org/bots/api#message">Message</a> object;
   *   <li>2) if the bot's message is a reply (has <i>reply_to_message_id</i>), sender of the
   *       original message.<br>
   * </ul>
   *
   * <i>Example:</i> A user votes in a poll, bot returns confirmation message in reply to the vote
   * and removes the keyboard for that user, while still showing the keyboard with poll options to
   * users who haven't voted yet.
   *
   * @param selective true if remove the keyboard for specific users only, otherwise - false or
   *     null.
   */
  public void setSelective(Boolean selective) {
    this.selective = selective;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(removeKeyboard, selective);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ReplyKeyboardRemove other)) return false;
    return removeKeyboard == other.removeKeyboard && Objects.equals(selective, other.selective);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ReplyKeyboardRemove[removeKeyboard=")
        .append(removeKeyboard)
        .append(", selective=")
        .append(selective)
        .append("]");
    return builder.toString();
  }
}
