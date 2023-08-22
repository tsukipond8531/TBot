package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.payment.LabeledPrice;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents the <a href="https://core.telegram.org/bots/api#inputmessagecontent">content</a> of an
 * invoice message to be sent as the result of an inline query.
 *
 * @author Pavel Bialiauski
 */
public class InputInvoiceMessageContent implements InputMessageContent {

  @NotNull private String title;

  @NotNull private String description;

  @NotNull private String payload;

  @SerializedName("provider_token")
  @NotNull
  private String providerToken;

  @NotNull private String currency;

  @NotNull private List<LabeledPrice> prices;

  @SerializedName("max_tip_amount")
  private Integer maxTipAmount;

  @SerializedName("suggested_tip_amounts")
  private List<Integer> suggestedTipAmounts;

  @SerializedName("provider_data")
  private String providerData;

  @SerializedName("photo_url")
  private String photoUrl;

  @SerializedName("photo_size")
  private Integer photoSize;

  @SerializedName("photo_width")
  private Integer photoWidth;

  @SerializedName("photo_height")
  private Integer photoHeight;

  @SerializedName("need_name")
  private Boolean needName;

  @SerializedName("need_phone_number")
  private Boolean needPhoneNumber;

  @SerializedName("need_email")
  private Boolean needEmail;

  @SerializedName("need_shipping_address")
  private Boolean needShippingAddress;

  @SerializedName("send_phone_number_to_provider")
  private Boolean sendPhoneNumberToProvider;

  @SerializedName("send_email_to_provider")
  private Boolean sendEmailToProvider;

  @SerializedName("is_flexible")
  private Boolean isFlexible;

  /** Default constructor. */
  public InputInvoiceMessageContent() {}

  /**
   * Product name, 1-32 characters.
   *
   * @return title as String.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the product name, 1-32 characters.
   *
   * @param title the product name (1-32 characters) as String.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Product description, 1-255 characters.
   *
   * @return description as String.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the product description, 1-255 characters.
   *
   * @param description the product description (1-255 characters) as String.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use for your
   * internal processes.
   *
   * @return payload as String.
   */
  public String getPayload() {
    return payload;
  }

  /**
   * Sets the bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use
   * for your internal processes.
   *
   * @param payload the bot-defined invoice payload (1-128 bytes) as String.
   */
  public void setPayload(String payload) {
    this.payload = payload;
  }

  /**
   * Payment provider token, obtained via <a href="https://t.me/botfather">@BotFather</a>.
   *
   * @return provider_token as String.
   */
  public String getProviderToken() {
    return providerToken;
  }

  /**
   * Sets the payment provider token, obtained via <a href="https://t.me/botfather">@BotFather</a>.
   *
   * @param providerToken the payment provider token, obtained via @BotFather as String.
   */
  public void setProviderToken(String providerToken) {
    this.providerToken = providerToken;
  }

  /**
   * Three-letter ISO 4217 currency code, see <a
   * href="https://core.telegram.org/bots/payments#supported-currencies">more on currencies</a>.
   *
   * @return currency as String.
   */
  public String getCurrency() {
    return currency;
  }

  /**
   * Sets the three-letter ISO 4217 currency code, see <a
   * href="https://core.telegram.org/bots/payments#supported-currencies">more on currencies</a>.
   *
   * @param currency the three-letter ISO 4217 currency code as String.
   */
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Price breakdown, a list of components (e.g. product price, tax, discount,
   * delivery cost, delivery tax, bonus, etc.).
   *
   * @return prices as {@link List}&lt;{@link LabeledPrice}&gt;.
   */
  public List<LabeledPrice> getPrices() {
    return prices;
  }

  /**
   * Sets the price breakdown, a list of components (e.g. product price, tax,
   * discount, delivery cost, delivery tax, bonus, etc.).
   *
   * @param prices the price breakdown as {@link List}&lt;{@link LabeledPrice}&gt;.
   */
  public void setPrices(List<LabeledPrice> prices) {
    this.prices = prices;
  }

  /**
   * <i>Optional.</i> The maximum accepted amount for tips in the <i>smallest units</i> of the
   * currency (integer, <strong>not</strong> float/double).
   *
   * <p>For example, for a maximum tip of <code>
   * US$ 1.45</code> pass <code>max_tip_amount = 145</code>. See the <i>exp</i> parameter in <a
   * href="https://core.telegram.org/bots/payments/currencies.json">currencies.json</a>, it shows
   * the number of digits past the decimal point for each currency (2 for the majority of
   * currencies). Defaults to 0.
   *
   * @return an optional value of max_tip_amount as Integer.
   */
  public Optional<Integer> getMaxTipAmount() {
    return Optional.of(maxTipAmount);
  }

  /**
   * Sets the maximum accepted amount for tips in the <i>smallest units</i> of the currency
   * (integer, <strong>not</strong> float/double).
   *
   * <p>For example, for a maximum tip of <code>
   * US$ 1.45</code> pass <code>max_tip_amount = 145</code>. See the <i>exp</i> parameter in <a
   * href="https://core.telegram.org/bots/payments/currencies.json">currencies.json</a>, it shows
   * the number of digits past the decimal point for each currency (2 for the majority of
   * currencies). Defaults to 0.
   *
   * @param maxTipAmount the maximum accepted amount for tips in the <i>smallest units</i> of the
   *     currency as Integer or null if it is not required.
   */
  public void setMaxTipAmount(Integer maxTipAmount) {
    this.maxTipAmount = maxTipAmount;
  }

  /**
   * <i>Optional.</i> A list of suggested amounts of tip in the <i>smallest units</i> of the
   * currency (integer, <strong>not</strong> float/double). At most 4 suggested tip amounts can be
   * specified. The suggested tip amounts must be positive, passed in a strictly increased order and
   * must not exceed <i>max_tip_amount</i>.
   *
   * @return an optional value of suggested_tip_amounts as {@link List}&lt;Integer&gt;.
   */
  public Optional<List<Integer>> getSuggestedTipAmounts() {
    return Optional.of(suggestedTipAmounts);
  }

  /**
   * Sets the list of suggested amounts of tip in the <i>smallest units</i> of the
   * currency (integer, <strong>not</strong> float/double). At most 4 suggested tip amounts can be
   * specified. The suggested tip amounts must be positive, passed in a strictly increased order and
   * must not exceed <i>max_tip_amount</i>.
   *
   * @param suggestedTipAmounts the list of suggested amount of tip in the <i>smallest units</i> of
   *     the currency as {@link List}&lt;Integer&gt; or null if it is not required.
   */
  public void setSuggestedTipAmounts(List<Integer> suggestedTipAmounts) {
    this.suggestedTipAmounts = suggestedTipAmounts;
  }

  /**
   * <i>Optional.</i> A object for data about the invoice, which will be shared with the payment
   * provider. A detailed description of the required fields should be provided by the payment
   * provider.
   *
   * @return an optional value of provider_data as String.
   */
  public Optional<String> getProviderData() {
    return Optional.of(providerData);
  }

  /**
   * Sets the object for data about the invoice, which will be shared with the
   * payment provider. A detailed description of the required fields should be provided by the
   * payment provider.
   *
   * @param providerData the data about the invoice, which will be shared with the payment provider,
   *     as String or null if it is not required.
   */
  public void setProviderData(String providerData) {
    this.providerData = providerData;
  }

  /**
   * <i>Optional.</i> URL of the product photo for the invoice. Can be a photo of the goods or a
   * marketing image for a service.
   *
   * @return an optional value of photo_url as String.
   */
  public Optional<String> getPhotoUrl() {
    return Optional.of(photoUrl);
  }

  /**
   * Sets the URL of the product photo for the invoice. Can be a photo of the goods or a marketing
   * image for a service.
   *
   * @param photoUrl the URL of the product photo for the invoice as String or null if it is not
   *     required.
   */
  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }

  /**
   * <i>Optional.</i> Photo size in bytes.
   *
   * @return an optional value of photo_size as Integer.
   */
  public Optional<Integer> getPhotoSize() {
    return Optional.of(photoSize);
  }

  /**
   * Sets the photo size in bytes.
   *
   * @param photoSize the photo size in bytes as Integer or null if the photo is not provided.
   */
  public void setPhotoSize(Integer photoSize) {
    this.photoSize = photoSize;
  }

  /**
   * <i>Optional.</i> Photo width.
   *
   * @return an optional value of photo_width as Integer.
   */
  public Optional<Integer> getPhotoWidth() {
    return Optional.of(photoWidth);
  }

  /**
   * Sets the photo width.
   *
   * @param photoWidth the photo width as Integer or null if the photo is not provided.
   */
  public void setPhotoWidth(Integer photoWidth) {
    this.photoWidth = photoWidth;
  }

  /**
   * <i>Optional.</i> Photo height.
   *
   * @return an optional value of photo_height as Integer.
   */
  public Optional<Integer> getPhotoHeight() {
    return Optional.of(photoHeight);
  }

  /**
   * Sets the photo height.
   *
   * @param photoHeight the photo height as Integer or null if the photo is not provided.
   */
  public void setPhotoHeight(Integer photoHeight) {
    this.photoHeight = photoHeight;
  }

  /**
   * <i>Optional.</i> <i>True</i> if you require the user's full name to complete the order.
   *
   * @return an optional value of need_name as Boolean.
   */
  public Optional<Boolean> getNeedName() {
    return Optional.of(needName);
  }

  /**
   * Pass <i>True</i> if you require the user's full name to complete the order.
   *
   * @param needName true if you require the user's full name to complete the order, otherwise -
   *     false or null.
   */
  public void setNeedName(Boolean needName) {
    this.needName = needName;
  }

  /**
   * <i>Optional.</i> <i>True</i> if you require the user's phone number to complete the order.
   *
   * @return an optional value of need_phone_number as Boolean.
   */
  public Optional<Boolean> getNeedPhoneNumber() {
    return Optional.of(needPhoneNumber);
  }

  /**
   * Pass <i>True</i> if you require the user's phone number to complete the order.
   *
   * @param needPhoneNumber true if you require the user's phone number to complete the order,
   *     otherwise - false or null.
   */
  public void setNeedPhoneNumber(Boolean needPhoneNumber) {
    this.needPhoneNumber = needPhoneNumber;
  }

  /**
   * <i>Optional.</i> <i>True</i> if you require the user's email address to complete the order.
   *
   * @return an optional value of need_email as Boolean.
   */
  public Optional<Boolean> getNeedEmail() {
    return Optional.of(needEmail);
  }

  /**
   * Pass <i>True</i> if you require the user's email address to complete the order.
   *
   * @param needEmail true if you require the user's email address to complete the order, otherwise
   *     - false or null.
   */
  public void setNeedEmail(Boolean needEmail) {
    this.needEmail = needEmail;
  }

  /**
   * <i>Optional.</i> <i>True</i> if you require the user's shipping address to complete the order.
   *
   * @return an optional value of need_shipping_address as Boolean.
   */
  public Optional<Boolean> getNeedShippingAddress() {
    return Optional.of(needShippingAddress);
  }

  /**
   * Pass <i>True</i> if you require the user's shipping address to complete the order.
   *
   * @param needShippingAddress true if you require the user's shipping address to complete the
   *     order, otherwise - false or null.
   */
  public void setNeedShippingAddress(Boolean needShippingAddress) {
    this.needShippingAddress = needShippingAddress;
  }

  /**
   * <i>Optional.</i> <i>True</i> if the user's phone number should be sent to provider.
   *
   * @return an optional value of send_phone_number_to_provider as Boolean.
   */
  public Optional<Boolean> getSendPhoneNumberToProvider() {
    return Optional.of(sendPhoneNumberToProvider);
  }

  /**
   * Pass <i>True</i> if the user's phone number should be sent to provider.
   *
   * @param sendPhoneNumberToProvider true if the user's phone number should be sent to provider,
   *     otherwise - false or null.
   */
  public void setSendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
    this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
  }

  /**
   * <i>Optional.</i> <i>True</i> if the user's email address should be sent to provider.
   *
   * @return an optional value of send_email_to_provider as Boolean.
   */
  public Optional<Boolean> getSendEmailToProvider() {
    return Optional.of(sendEmailToProvider);
  }

  /**
   * Pass <i>True</i> if the user's email address should be sent to provider.
   *
   * @param sendEmailToProvider true if the user's email address should be sent to provider,
   *     otherwise - false or null.
   */
  public void setSendEmailToProvider(Boolean sendEmailToProvider) {
    this.sendEmailToProvider = sendEmailToProvider;
  }

  /**
   * <i>Optional.</i> <i>True</i> if the final price depends on the shipping method.
   *
   * @return an optional value of is_flexible as Boolean.
   */
  public Optional<Boolean> getIsFlexible() {
    return Optional.of(isFlexible);
  }

  /**
   * Pass <i>True</i> if the final price depends on the shipping method.
   *
   * @param isFlexible true if the final price depends on the shipping method, otherwise - false or
   *     null.
   */
  public void setIsFlexible(Boolean isFlexible) {
    this.isFlexible = isFlexible;
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
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
