package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

@TestContainer
public class NamingContractException extends ContractException {

  public NamingContractException(Throwable cause) {
    super(cause);
  }

  public NamingContractException(String message) {
    super(message);
  }

  public NamingContractException(String message, Throwable cause) {
    super(message, cause);
  }
}
