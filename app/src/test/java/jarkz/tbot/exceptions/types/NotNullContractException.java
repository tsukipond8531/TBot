package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

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
