package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

/**
 * The exception for toString method contract violations. Used when in-text value is not equals to
 * value in object.
 *
 * @author Pavel Bialiauski
 */
@TestContainer
public class IllegalValueToStringException extends Exception {

  public IllegalValueToStringException(Throwable cause) {
    super(cause);
  }

  public IllegalValueToStringException(String message) {
    super(message);
  }

  public IllegalValueToStringException(String message, Throwable cause) {
    super(message, cause);
  }
}
