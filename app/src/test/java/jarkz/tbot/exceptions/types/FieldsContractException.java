package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

@TestContainer
public class FieldsContractException extends ContractException {

  public FieldsContractException(Throwable cause) {
    super(cause);
  }

  public FieldsContractException(String message) {
    super(message);
  }

  public FieldsContractException(String message, Throwable cause) {
    super(message, cause);
  }
}
