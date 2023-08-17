package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

@TestContainer
public class GeneralInterfacesContractException extends ContractException {

  public GeneralInterfacesContractException(Throwable cause) {
    super(cause);
  }

  public GeneralInterfacesContractException(String message) {
    super(message);
  }

  public GeneralInterfacesContractException(String message, Throwable cause) {
    super(message, cause);
  }
}
