package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

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
