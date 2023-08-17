package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

@TestContainer
public class ObjectFieldContractException extends ContractException {

  public ObjectFieldContractException(Throwable cause) {
    super(cause);
  }

  public ObjectFieldContractException(String message) {
    super(message);
  }

  public ObjectFieldContractException(String message, Throwable cause) {
    super(message, cause);
  }
}
