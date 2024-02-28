package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.core.parameters.ReplyMarkup;
import java.util.Objects;

/**
 * Upon receiving a message with this object, Telegram clients will remove the current custom
 * keyboard and display the default letter-keyboard. By default, custom keyboards are displayed
 * until a new keyboard is sent by a bot. An exception is made for one-time keyboards that are
 * hidden immediately after the user presses a button (see ReplyKeyboardMarkup).
 */
public final class ReplyKeyboardRemove implements ReplyMarkup {

  /**
   * Requests clients to remove the custom keyboard (user will not be able to summon this keyboard;
   * if you want to hide the keyboard from sight but keep it accessible, use one_time_keyboard in
   * ReplyKeyboardMarkup)
   */
  @NotNull
  @SerializedName("remove_keyboard")
  public boolean removeKeyboard;

  /**
   * Optional. Use this parameter if you want to remove the keyboard for specific users only.
   * Targets: 1) users that are @mentioned in the text of the Message object; 2) if the bot's
   * message is a reply to a message in the same chat and forum topic, sender of the original
   * message. Example: A user votes in a poll, bot returns confirmation message in reply to the vote
   * and removes the keyboard for that user, while still showing the keyboard with poll options to
   * users who haven't voted yet.
   */
  public Boolean selective;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ReplyKeyboardRemove other)) return false;
    return removeKeyboard == other.removeKeyboard && Objects.equals(selective, other.selective);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(removeKeyboard, selective);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ReplyKeyboardRemove[removeKeyboard=")
        .append(removeKeyboard)
        .append(", selective=")
        .append(selective)
        .append("]");
    return builder.toString();
  }
}
