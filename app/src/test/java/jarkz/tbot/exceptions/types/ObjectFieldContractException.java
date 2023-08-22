package jarkz.tbot.exceptions.types;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.TestContainer;

/**
 * The exception for object fields contract violations.
 *
 * <p>In a datatype, the filelds, which not marked annotation {@link NotNull}, have special rules.
 *
 * @author Pavel Bialiauski
 */
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
