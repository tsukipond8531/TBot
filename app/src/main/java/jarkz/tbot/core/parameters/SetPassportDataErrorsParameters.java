package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Informs a user that some of the Telegram Passport elements they provided contains errors. The
 * user will not be able to re-submit their Passport to you until the errors are fixed (the contents
 * of the field for which you returned the error must change). Returns True on success.
 *
 * <p>Use this if the data submitted by the user doesn't satisfy the standards your service requires
 * for any reason. For example, if a birthday date seems invalid, a submitted document is blurry, a
 * scan shows evidence of tampering, etc. Supply some details in the error message to make sure the
 * user knows how to correct the issues.
 */
public final class SetPassportDataErrorsParameters {

  /** User identifier */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  /** A JSON-serialized array describing the errors */
  @NotNull public List<PassportElementError> errors;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetPassportDataErrorsParameters other)) return false;
    return userId == other.userId && Objects.equals(errors, other.errors);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(userId, errors);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetPassportDataErrorsParameters[userId=")
        .append(userId)
        .append(", errors=")
        .append(errors)
        .append("]");
    return builder.toString();
  }
}
