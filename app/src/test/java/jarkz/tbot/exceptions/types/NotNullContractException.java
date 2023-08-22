package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

/**
 * This exception for null contract violations.
 *
 * <p>In a datatype, the fields, which marked by {@link NotNull} annotation, have special rules.
 *
 * @author Pavel Bialiauski
 */
@TestContainer
public class NotNullContractException extends ContractException {

  public NotNullContractException(Throwable cause) {
    super(cause);
  }

  public NotNullContractException(String message) {
    super(message);
  }

  public NotNullContractException(String message, Throwable cause) {
    super(message, cause);
  }
}
