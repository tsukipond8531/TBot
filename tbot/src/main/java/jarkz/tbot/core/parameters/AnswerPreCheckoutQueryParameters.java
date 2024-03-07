package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Once the user has confirmed their payment and shipping details, the Bot API sends the final
 * confirmation in the form of an Update with the field pre_checkout_query. Use this method to
 * respond to such pre-checkout queries. On success, True is returned. Note: The Bot API must
 * receive an answer within 10 seconds after the pre-checkout query was sent.
 */
public final class AnswerPreCheckoutQueryParameters {

  public static final class Builder {

    private AnswerPreCheckoutQueryParameters buildingType;

    public Builder() {
      buildingType = new AnswerPreCheckoutQueryParameters();
    }

    public Builder setPreCheckoutQueryId(String preCheckoutQueryId) {
      buildingType.preCheckoutQueryId = preCheckoutQueryId;
      return this;
    }

    public Builder setOk(boolean ok) {
      buildingType.ok = ok;
      return this;
    }

    public Builder setErrorMessage(String errorMessage) {
      buildingType.errorMessage = errorMessage;
      return this;
    }

    public AnswerPreCheckoutQueryParameters build() {
      return buildingType;
    }
  }

  /** Unique identifier for the query to be answered */
  @NotNull
  @SerializedName("pre_checkout_query_id")
  public String preCheckoutQueryId;

  /**
   * Specify True if everything is alright (goods are available, etc.) and the bot is ready to
   * proceed with the order. Use False if there are any problems.
   */
  @NotNull public boolean ok;

  /**
   * Required if ok is False. Error message in human readable form that explains the reason for
   * failure to proceed with the checkout (e.g. "Sorry, somebody just bought the last of our amazing
   * black T-shirts while you were busy filling out your payment details. Please choose a different
   * color or garment!"). Telegram will display this message to the user.
   */
  @SerializedName("error_message")
  public String errorMessage;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof AnswerPreCheckoutQueryParameters other)) return false;
    return Objects.equals(preCheckoutQueryId, other.preCheckoutQueryId)
        && ok == other.ok
        && Objects.equals(errorMessage, other.errorMessage);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(preCheckoutQueryId, ok, errorMessage);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("AnswerPreCheckoutQueryParameters[preCheckoutQueryId=")
        .append(preCheckoutQueryId)
        .append(", ok=")
        .append(ok)
        .append(", errorMessage=")
        .append(errorMessage)
        .append("]");
    return builder.toString();
  }
}
