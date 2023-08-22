package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;

/**
 * The exception for violations with fiels. May be incorrect naming, inconsistencies field types and
 * return type of getter or etc.
 *
 * @author Pavel Bialiauski
 */
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
