package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

/**
 * This exception for JSON serialization/deserialization violations.
 *
 * @author Pavel Bialiauski
 */
@TestContainer
public class JsonSerializationException extends RuntimeException {

  public JsonSerializationException(String message) {
    super(message);
  }

  public JsonSerializationException(Throwable cause) {
    super(cause);
  }

  public JsonSerializationException(String message, Throwable cause) {
    super(message, cause);
  }
}
