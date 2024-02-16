package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * This object represents a game. Use BotFather to create and edit games, their short names will act
 * as unique identifiers.
 */
public final class Game {

  /** Title of the game */
  @NotNull public String title;

  /** Description of the game */
  @NotNull public String description;

  /** Photo that will be displayed in the game message in chats. */
  @NotNull public List<PhotoSize> photo;

  /**
   * Optional. Brief description of the game or high scores included in the game message. Can be
   * automatically edited to include current high scores for the game when the bot calls
   * setGameScore, or manually edited using editMessageText. 0-4096 characters.
   */
  public String text;

  /** Optional. Special entities that appear in text, such as usernames, URLs, bot commands, etc. */
  @SerializedName("text_entities")
  public List<MessageEntity> textEntities;

  /**
   * Optional. Animation that will be displayed in the game message in chats. Upload via BotFather
   */
  public Animation animation;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Game other)) return false;
    return Objects.equals(title, other.title)
        && Objects.equals(description, other.description)
        && Objects.equals(photo, other.photo)
        && Objects.equals(text, other.text)
        && Objects.equals(textEntities, other.textEntities)
        && Objects.equals(animation, other.animation);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(title, description, photo, text, textEntities, animation);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("Game[title=")
        .append(title)
        .append(", description=")
        .append(description)
        .append(", photo=")
        .append(photo)
        .append(", text=")
        .append(text)
        .append(", textEntities=")
        .append(textEntities)
        .append(", animation=")
        .append(animation)
        .append("]");
    return builder.toString();
  }
}
