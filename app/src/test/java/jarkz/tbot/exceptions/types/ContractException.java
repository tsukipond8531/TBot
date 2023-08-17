package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

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
