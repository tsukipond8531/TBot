package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

@TestContainer
public class TypeGenerationException extends RuntimeException {

  public TypeGenerationException(String message) {
    super(message);
  }

  public TypeGenerationException(Throwable cause) {
    super(cause);
  }

  public TypeGenerationException(String message, Throwable cause) {
    super(message, cause);
  }
}
