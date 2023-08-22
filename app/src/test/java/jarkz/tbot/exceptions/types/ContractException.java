package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

/**
 * The exception for contract violations.
 *
 * @author Pavel Bialiauski
 */
@TestContainer
public class ContractException extends Exception {

  public ContractException(Throwable cause) {
    super(cause);
  }

  public ContractException(String message) {
    super(message);
  }

  public ContractException(String message, Throwable cause) {
    super(message, cause);
  }
}
