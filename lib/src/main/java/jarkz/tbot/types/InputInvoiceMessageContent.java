package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** Represents the content of an invoice message to be sent as the result of an inline query. */
public final class InputInvoiceMessageContent implements InputMessageContent {

  /** Product name, 1-32 characters */
  @NotNull public String title;

  /** Product description, 1-255 characters */
  @NotNull public String description;

  /**
   * Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use for your
   * internal processes.
   */
  @NotNull public String payload;

  /** Payment provider token, obtained via @BotFather */
  @NotNull
  @SerializedName("provider_token")
  public String providerToken;

  /** Three-letter ISO 4217 currency code, see more on currencies */
  @NotNull public String currency;

  /**
   * Price breakdown, a JSON-serialized list of components (e.g. product price, tax, discount,
   * delivery cost, delivery tax, bonus, etc.)
   */
  @NotNull public List<LabeledPrice> prices;

  /**
   * Optional. The maximum accepted amount for tips in the smallest units of the currency (integer,
   * not float/double). For example, for a maximum tip of US$ 1.45 pass max_tip_amount = 145. See
   * the exp parameter in currencies.json, it shows the number of digits past the decimal point for
   * each currency (2 for the majority of currencies). Defaults to 0
   */
  @SerializedName("max_tip_amount")
  public Integer maxTipAmount;

  /**
   * Optional. A JSON-serialized array of suggested amounts of tip in the smallest units of the
   * currency (integer, not float/double). At most 4 suggested tip amounts can be specified. The
   * suggested tip amounts must be positive, passed in a strictly increased order and must not
   * exceed max_tip_amount.
   */
  @SerializedName("suggested_tip_amounts")
  public List<Integer> suggestedTipAmounts;

  /**
   * Optional. A JSON-serialized object for data about the invoice, which will be shared with the
   * payment provider. A detailed description of the required fields should be provided by the
   * payment provider.
   */
  @SerializedName("provider_data")
  public String providerData;

  /**
   * Optional. URL of the product photo for the invoice. Can be a photo of the goods or a marketing
   * image for a service.
   */
  @SerializedName("photo_url")
  public String photoUrl;

  /** Optional. Photo size in bytes */
  @SerializedName("photo_size")
  public Integer photoSize;

  /** Optional. Photo width */
  @SerializedName("photo_width")
  public Integer photoWidth;

  /** Optional. Photo height */
  @SerializedName("photo_height")
  public Integer photoHeight;

  /** Optional. Pass True if you require the user's full name to complete the order */
  @SerializedName("need_name")
  public Boolean needName;

  /** Optional. Pass True if you require the user's phone number to complete the order */
  @SerializedName("need_phone_number")
  public Boolean needPhoneNumber;

  /** Optional. Pass True if you require the user's email address to complete the order */
  @SerializedName("need_email")
  public Boolean needEmail;

  /** Optional. Pass True if you require the user's shipping address to complete the order */
  @SerializedName("need_shipping_address")
  public Boolean needShippingAddress;

  /** Optional. Pass True if the user's phone number should be sent to provider */
  @SerializedName("send_phone_number_to_provider")
  public Boolean sendPhoneNumberToProvider;

  /** Optional. Pass True if the user's email address should be sent to provider */
  @SerializedName("send_email_to_provider")
  public Boolean sendEmailToProvider;

  /** Optional. Pass True if the final price depends on the shipping method */
  @SerializedName("is_flexible")
  public Boolean isFlexible;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputInvoiceMessageContent other)) return false;
    return Objects.equals(title, other.title)
        && Objects.equals(description, other.description)
        && Objects.equals(payload, other.payload)
        && Objects.equals(providerToken, other.providerToken)
        && Objects.equals(currency, other.currency)
        && Objects.equals(prices, other.prices)
        && Objects.equals(maxTipAmount, other.maxTipAmount)
        && Objects.equals(suggestedTipAmounts, other.suggestedTipAmounts)
        && Objects.equals(providerData, other.providerData)
        && Objects.equals(photoUrl, other.photoUrl)
        && Objects.equals(photoSize, other.photoSize)
        && Objects.equals(photoWidth, other.photoWidth)
        && Objects.equals(photoHeight, other.photoHeight)
        && Objects.equals(needName, other.needName)
        && Objects.equals(needPhoneNumber, other.needPhoneNumber)
        && Objects.equals(needEmail, other.needEmail)
        && Objects.equals(needShippingAddress, other.needShippingAddress)
        && Objects.equals(sendPhoneNumberToProvider, other.sendPhoneNumberToProvider)
        && Objects.equals(sendEmailToProvider, other.sendEmailToProvider)
        && Objects.equals(isFlexible, other.isFlexible);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        title,
        description,
        payload,
        providerToken,
        currency,
        prices,
        maxTipAmount,
        suggestedTipAmounts,
        providerData,
        photoUrl,
        photoSize,
        photoWidth,
        photoHeight,
        needName,
        needPhoneNumber,
        needEmail,
        needShippingAddress,
        sendPhoneNumberToProvider,
        sendEmailToProvider,
        isFlexible);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("InputInvoiceMessageContent[title=")
        .append(title)
        .append(", description=")
        .append(description)
        .append(", payload=")
        .append(payload)
        .append(", providerToken=")
        .append(providerToken)
        .append(", currency=")
        .append(currency)
        .append(", prices=")
        .append(prices)
        .append(", maxTipAmount=")
        .append(maxTipAmount)
        .append(", suggestedTipAmounts=")
        .append(suggestedTipAmounts)
        .append(", providerData=")
        .append(providerData)
        .append(", photoUrl=")
        .append(photoUrl)
        .append(", photoSize=")
        .append(photoSize)
        .append(", photoWidth=")
        .append(photoWidth)
        .append(", photoHeight=")
        .append(photoHeight)
        .append(", needName=")
        .append(needName)
        .append(", needPhoneNumber=")
        .append(needPhoneNumber)
        .append(", needEmail=")
        .append(needEmail)
        .append(", needShippingAddress=")
        .append(needShippingAddress)
        .append(", sendPhoneNumberToProvider=")
        .append(sendPhoneNumberToProvider)
        .append(", sendEmailToProvider=")
        .append(sendEmailToProvider)
        .append(", isFlexible=")
        .append(isFlexible)
        .append("]");
    return builder.toString();
  }
}
