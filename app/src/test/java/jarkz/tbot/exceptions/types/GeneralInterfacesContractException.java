package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

/**
 * This exception for the general interface violations. For exepmle, in datatype, a field type is
 * another implemented datatype from general interface - the exception throws in this case.
 *
 * @author Pavel Bialiauski
 */
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
