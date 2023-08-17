package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

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
}
