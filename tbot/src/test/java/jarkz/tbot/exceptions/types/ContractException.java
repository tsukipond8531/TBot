package jarkz.tbot.exceptions.types;

import jarkz.tbot.TestContainer;
import jarkz.tbot.violations.ViolationList;

/**
 * The exception for contract violations.
 *
 * @author Pavel Bialiauski
 */
@TestContainer
public class ContractException extends Exception {

  private ViolationList violations;
  private String message;

  public ContractException(Throwable cause) {
    super(cause);
  }

  public ContractException(String message) {
    super(message);
  }

  public ContractException(String message, Throwable cause) {
    super(message, cause);
  }

  public ContractException(ViolationList violations) {
    this.violations = violations;
    this.message = violations.toString();
  }

  public ViolationList getViolations() {
    return violations == null ? new ViolationList() : violations;
  }

  @Override
  public String getMessage() {
    return message == null ? super.getMessage() : message;
  }
}
