package jarkz.tbot.types.games;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import jarkz.tbot.types.document.Animation;
import jarkz.tbot.types.document.PhotoSize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a game. Use BotFather to create and edit games, their short names will act
 * as unique identifiers.
 *
 * @author Pavel Bialiauski
 */
public class Game {

  @NotNull private String title;

  @NotNull private String description;

  @NotNull private List<PhotoSize> photo;

  private String text;

  @SerializedName("text_entities")
  private List<MessageEntity> textEntities;

  private Animation animation;

  /** Default constructor. */
  public Game() {}

  /**
   * Title of the game.
   *
   * @return title as String.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the title of the game.
   *
   * @param title the title of the game as String.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Description of the game.
   *
   * @return description as String.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the description of the game.
   *
   * @param description the description of the game as String.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Photo that will be displayed in the game message in chats.
   *
   * @return photo as {@link List}&lt;{@link PhotoSize}&gt;.
   */
  public List<PhotoSize> getPhoto() {
    return photo;
  }

  /**
   * Sets the photo that will be displayed in the game message in chats.
   *
   * @param photo the photo that will be displayed in the game message in chats as {@link
   *     List}&lt;{@link PhotoSize}&gt;.
   */
  public void setPhoto(List<PhotoSize> photo) {
    this.photo = photo;
  }

  /**
   * <i>Optional.</i> Brief description of the game or high scores included in the game message. Can
   * be automatically edited to include current high scores for the game when the bot calls <a
   * href="https://core.telegram.org/bots/api#setgamescore">setGameScore</a>, or manually edited
   * using <a href="https://core.telegram.org/bots/api#editmessagetext">editMessageText</a>. 0-4096
   * characters.
   *
   * @return an optional value of text as String.
   */
  public Optional<String> getText() {
    return Optional.of(text);
  }

  /**
   * Sets the brief description of the game or high scores included in the game message. Can be
   * automatically edited to include current high scores for the game when the bot calls <a
   * href="https://core.telegram.org/bots/api#setgamescore">setGameScore</a>, or manually edited
   * using <a href="https://core.telegram.org/bots/api#editmessagetext">editMessageText</a>. 0-4096
   * characters.
   *
   * @param text the brief description of the game or high scores included in the game message as
   *     String or null if it is not required.
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * <i>Optional.</i> Special entities that appear in <i>text</i>, such as usernames, URLs, bot
   * commands, etc.
   *
   * @return an optional value of text_entities as {@link List}&lt;{@link MessageEntity}&gt;.
   */
  public Optional<List<MessageEntity>> getTextEntities() {
    return Optional.of(textEntities);
  }

  /**
   * Sets the special entities that appear in <i>text</i>, such as usernames, URLs, bot commands,
   * etc.
   *
   * @param textEntities the special entities that appear in <i>text</i> as {@link List}&lt;{@link
   *     MessageEntity}&gt; or null if it is not required or the text is not provided.
   */
  public void setTextEntities(List<MessageEntity> textEntities) {
    this.textEntities = textEntities;
  }

  /**
   * <i>Optional.</i> Animation that will be displayed in the game message in chats. Upload via <a
   * href="https://t.me/botfather">BotFather</a>.
   *
   * @return an optional value of animation as {@link Animation}.
   */
  public Optional<Animation> getAnimation() {
    return Optional.of(animation);
  }

  /**
   * Sets the animation that will be displayed in the game message in chats. Upload via <a
   * href="https://t.me/botfather">BotFather</a>.
   *
   * @param animation the animation that will be displayed in the game message in chats as {@link
   *     Animation}.
   */
  public void setAnimation(Animation animation) {
    this.animation = animation;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(title, description, photo, text, textEntities, animation);
  }

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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
