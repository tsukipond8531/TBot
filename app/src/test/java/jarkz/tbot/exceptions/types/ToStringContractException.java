package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;
import jarkz.tbot.violations.ViolationList;

/**
 * The exception for toString method contract violations.
 *
 * @authro Pavel Bialiauski
 */
@TestContainer
public class ToStringContractException extends ContractException {

  public ToStringContractException(Throwable cause) {
    super(cause);
  }

  public ToStringContractException(String message) {
    super(message);
  }

  public ToStringContractException(String message, Throwable cause) {
    super(message, cause);
  }

  public ToStringContractException(ViolationList violations) {
    super(violations);
  }
}
