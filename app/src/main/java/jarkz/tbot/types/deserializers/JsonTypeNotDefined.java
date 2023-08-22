package jarkz.tbot.types.deserializers;

/**
 * This exception describes that JSON contains the specific key, which requires, but not defined a
 * type as value.
 *
 * @author Pavel Bialiauski
 */
public class JsonTypeNotDefined extends IllegalStateException {

  /**
   * Creates a exception with specific message.
   *
   * @param message the specific message as String.
   */
  public JsonTypeNotDefined(String message) {
    super(message);
  }

  /**
   * Creates a exception with specific cause.
   *
   * @param cause the specific cause as {@link Throwable}.
   */
  public JsonTypeNotDefined(Throwable cause) {
    super(cause);
  }

  /**
   * Creates a exception with specific message and specific cause.
   *
   * @param message the specific message as String.
   * @param cause the specific cause as {@link Throwable}.
   */
  public JsonTypeNotDefined(String message, Throwable cause) {
    super(message, cause);
  }
}
