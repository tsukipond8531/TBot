package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * This object represents an inline keyboard that appears right next to the message it belongs to.
 */
public final class InlineKeyboardMarkup implements ReplyMarkup {

  public static final class Builder {

    private InlineKeyboardMarkup buildingType;

    public Builder() {
      buildingType = new InlineKeyboardMarkup();
    }

    public Builder setInlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
      buildingType.inlineKeyboard = inlineKeyboard;
      return this;
    }

    public InlineKeyboardMarkup build() {
      return buildingType;
    }
  }

  /** Array of button rows, each represented by an Array of InlineKeyboardButton objects */
  @NotNull
  @SerializedName("inline_keyboard")
  public List<List<InlineKeyboardButton>> inlineKeyboard;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineKeyboardMarkup other)) return false;
    return Objects.equals(inlineKeyboard, other.inlineKeyboard);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(inlineKeyboard);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("InlineKeyboardMarkup[inlineKeyboard=").append(inlineKeyboard).append("]");
    return builder.toString();
  }
}
