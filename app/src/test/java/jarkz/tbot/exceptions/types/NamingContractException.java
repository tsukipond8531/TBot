package jarkz.tbot.exceptions.types;

import com.google.gson.annotations.SerializedName;
import jarkz.tbot.TestContainer;

/**
 * The exception for naming contract violations.
 *
 * <p>May be used for inconsistence field name and name in {@link SerializedName} annotation.
 *
 * @author Pavel Bialiauski
 */
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
