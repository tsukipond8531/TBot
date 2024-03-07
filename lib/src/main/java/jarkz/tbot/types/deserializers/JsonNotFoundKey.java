package jarkz.tbot.types.deserializers;

/**
 * This excpetion describes that json doesn't contains specific key, which requires.
 *
 * @author Pavel Bialiauski
 */
public class JsonNotFoundKey extends NullPointerException {

  /**
   * Creates a exception with specific message.
   *
   * @param message the specific message as String.
   */
  public JsonNotFoundKey(String message) {
    super(message);
  }
}
