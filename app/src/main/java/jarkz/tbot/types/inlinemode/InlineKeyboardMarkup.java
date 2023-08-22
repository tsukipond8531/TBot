package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * This object represents an <a
 * href="https://core.telegram.org/bots/features#inline-keyboards">inline keyboard</a> that appears
 * right next to the message it belongs to.
 *
 * @apiNote This will only work in Telegram versions released after 9 April, 2016. Older clients
 *     will display <i>unsupported message</i>.
 * @author Pavel Bialiauski
 */
public class InlineKeyboardMarkup {

  @SerializedName("inline_keyboard")
  @NotNull
  private List<List<InlineKeyboardButton>> inlineKeyboard;

  /** Default constructor. */
  public InlineKeyboardMarkup() {}

  /**
   * List of button rows, each represented by a list of <a href=
   * "https://core.telegram.org/bots/api#inlinekeyboardbutton">InlineKeyboardButton</a> ({@link
   * InlineKeyboardButton}) objects.
   *
   * @return inline_keyboard as {@link List}&lt;{@link List}&lt;{@link
   *     InlineKeyboardButton}&gt;&gt;.
   */
  public List<List<InlineKeyboardButton>> getInlineKeyboard() {
    return inlineKeyboard;
  }

  /**
   * Sets the list of button rows, each represented by a list of <a href=
   * "https://core.telegram.org/bots/api#inlinekeyboardbutton">InlineKeyboardButton</a> ({@link
   * InlineKeyboardButton}) objects.
   *
   * @param inlineKeyboard the list of button rows, each represented by the list of {@link
   *     InlineKeyboardButton}.
   */
  public void setInlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
    this.inlineKeyboard = inlineKeyboard;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(inlineKeyboard);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineKeyboardMarkup other)) return false;
    return Objects.equals(inlineKeyboard, other.inlineKeyboard);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("InlineKeyboardMarkup[inlineKeyboard=").append(inlineKeyboard).append("]");
    return builder.toString();
  }
}
