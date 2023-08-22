package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;
import jarkz.tbot.types.TypeFactory;

/**
 * This excpetion uses for any errors in {@link TypeFactory} class.
 *
 * @author Pavel Bialiauski
 */
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
