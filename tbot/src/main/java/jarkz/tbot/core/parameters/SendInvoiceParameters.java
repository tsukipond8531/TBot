package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import jarkz.tbot.types.InlineKeyboardMarkup;
import jarkz.tbot.types.LabeledPrice;
import jarkz.tbot.types.ReplyParameters;
import java.util.List;
import java.util.Objects;

/** Use this method to send invoices. On success, the sent Message is returned. */
public final class SendInvoiceParameters {

  public static final class Builder {

    private SendInvoiceParameters buildingType;

    public Builder() {
      buildingType = new SendInvoiceParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageThreadId(Integer messageThreadId) {
      buildingType.messageThreadId = messageThreadId;
      return this;
    }

    public Builder setTitle(String title) {
      buildingType.title = title;
      return this;
    }

    public Builder setDescription(String description) {
      buildingType.description = description;
      return this;
    }

    public Builder setPayload(String payload) {
      buildingType.payload = payload;
      return this;
    }

    public Builder setProviderToken(String providerToken) {
      buildingType.providerToken = providerToken;
      return this;
    }

    public Builder setCurrency(String currency) {
      buildingType.currency = currency;
      return this;
    }

    public Builder setPrices(List<LabeledPrice> prices) {
      buildingType.prices = prices;
      return this;
    }

    public Builder setMaxTipAmount(Integer maxTipAmount) {
      buildingType.maxTipAmount = maxTipAmount;
      return this;
    }

    public Builder setSuggestedTipAmounts(List<Integer> suggestedTipAmounts) {
      buildingType.suggestedTipAmounts = suggestedTipAmounts;
      return this;
    }

    public Builder setStartParameter(String startParameter) {
      buildingType.startParameter = startParameter;
      return this;
    }

    public Builder setProviderData(String providerData) {
      buildingType.providerData = providerData;
      return this;
    }

    public Builder setPhotoUrl(String photoUrl) {
      buildingType.photoUrl = photoUrl;
      return this;
    }

    public Builder setPhotoSize(Integer photoSize) {
      buildingType.photoSize = photoSize;
      return this;
    }

    public Builder setPhotoWidth(Integer photoWidth) {
      buildingType.photoWidth = photoWidth;
      return this;
    }

    public Builder setPhotoHeight(Integer photoHeight) {
      buildingType.photoHeight = photoHeight;
      return this;
    }

    public Builder setNeedName(Boolean needName) {
      buildingType.needName = needName;
      return this;
    }

    public Builder setNeedPhoneNumber(Boolean needPhoneNumber) {
      buildingType.needPhoneNumber = needPhoneNumber;
      return this;
    }

    public Builder setNeedEmail(Boolean needEmail) {
      buildingType.needEmail = needEmail;
      return this;
    }

    public Builder setNeedShippingAddress(Boolean needShippingAddress) {
      buildingType.needShippingAddress = needShippingAddress;
      return this;
    }

    public Builder setSendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
      buildingType.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
      return this;
    }

    public Builder setSendEmailToProvider(Boolean sendEmailToProvider) {
      buildingType.sendEmailToProvider = sendEmailToProvider;
      return this;
    }

    public Builder setIsFlexible(Boolean isFlexible) {
      buildingType.isFlexible = isFlexible;
      return this;
    }

    public Builder setDisableNotification(Boolean disableNotification) {
      buildingType.disableNotification = disableNotification;
      return this;
    }

    public Builder setProtectContent(Boolean protectContent) {
      buildingType.protectContent = protectContent;
      return this;
    }

    public Builder setReplyParameters(ReplyParameters replyParameters) {
      buildingType.replyParameters = replyParameters;
      return this;
    }

    public Builder setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      buildingType.replyMarkup = replyMarkup;
      return this;
    }

    public SendInvoiceParameters build() {
      return buildingType;
    }
  }

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /**
   * Unique identifier for the target message thread (topic) of the forum; for forum supergroups
   * only
   */
  @SerializedName("message_thread_id")
  public Integer messageThreadId;

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
   * The maximum accepted amount for tips in the smallest units of the currency (integer, not
   * float/double). For example, for a maximum tip of US$ 1.45 pass max_tip_amount = 145. See the
   * exp parameter in currencies.json, it shows the number of digits past the decimal point for each
   * currency (2 for the majority of currencies). Defaults to 0
   */
  @SerializedName("max_tip_amount")
  public Integer maxTipAmount;

  /**
   * A JSON-serialized array of suggested amounts of tips in the smallest units of the currency
   * (integer, not float/double). At most 4 suggested tip amounts can be specified. The suggested
   * tip amounts must be positive, passed in a strictly increased order and must not exceed
   * max_tip_amount.
   */
  @SerializedName("suggested_tip_amounts")
  public List<Integer> suggestedTipAmounts;

  /**
   * Unique deep-linking parameter. If left empty, forwarded copies of the sent message will have a
   * Pay button, allowing multiple users to pay directly from the forwarded message, using the same
   * invoice. If non-empty, forwarded copies of the sent message will have a URL button with a deep
   * link to the bot (instead of a Pay button), with the value used as the start parameter
   */
  @SerializedName("start_parameter")
  public String startParameter;

  /**
   * JSON-serialized data about the invoice, which will be shared with the payment provider. A
   * detailed description of required fields should be provided by the payment provider.
   */
  @SerializedName("provider_data")
  public String providerData;

  /**
   * URL of the product photo for the invoice. Can be a photo of the goods or a marketing image for
   * a service. People like it better when they see what they are paying for.
   */
  @SerializedName("photo_url")
  public String photoUrl;

  /** Photo size in bytes */
  @SerializedName("photo_size")
  public Integer photoSize;

  /** Photo width */
  @SerializedName("photo_width")
  public Integer photoWidth;

  /** Photo height */
  @SerializedName("photo_height")
  public Integer photoHeight;

  /** Pass True if you require the user's full name to complete the order */
  @SerializedName("need_name")
  public Boolean needName;

  /** Pass True if you require the user's phone number to complete the order */
  @SerializedName("need_phone_number")
  public Boolean needPhoneNumber;

  /** Pass True if you require the user's email address to complete the order */
  @SerializedName("need_email")
  public Boolean needEmail;

  /** Pass True if you require the user's shipping address to complete the order */
  @SerializedName("need_shipping_address")
  public Boolean needShippingAddress;

  /** Pass True if the user's phone number should be sent to provider */
  @SerializedName("send_phone_number_to_provider")
  public Boolean sendPhoneNumberToProvider;

  /** Pass True if the user's email address should be sent to provider */
  @SerializedName("send_email_to_provider")
  public Boolean sendEmailToProvider;

  /** Pass True if the final price depends on the shipping method */
  @SerializedName("is_flexible")
  public Boolean isFlexible;

  /** Sends the message silently. Users will receive a notification with no sound. */
  @SerializedName("disable_notification")
  public Boolean disableNotification;

  /** Protects the contents of the sent message from forwarding and saving */
  @SerializedName("protect_content")
  public Boolean protectContent;

  /** Description of the message to reply to */
  @SerializedName("reply_parameters")
  public ReplyParameters replyParameters;

  /**
   * A JSON-serialized object for an inline keyboard. If empty, one 'Pay total price' button will be
   * shown. If not empty, the first button must be a Pay button.
   */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SendInvoiceParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageThreadId, other.messageThreadId)
        && Objects.equals(title, other.title)
        && Objects.equals(description, other.description)
        && Objects.equals(payload, other.payload)
        && Objects.equals(providerToken, other.providerToken)
        && Objects.equals(currency, other.currency)
        && Objects.equals(prices, other.prices)
        && Objects.equals(maxTipAmount, other.maxTipAmount)
        && Objects.equals(suggestedTipAmounts, other.suggestedTipAmounts)
        && Objects.equals(startParameter, other.startParameter)
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
        && Objects.equals(isFlexible, other.isFlexible)
        && Objects.equals(disableNotification, other.disableNotification)
        && Objects.equals(protectContent, other.protectContent)
        && Objects.equals(replyParameters, other.replyParameters)
        && Objects.equals(replyMarkup, other.replyMarkup);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chatId,
        messageThreadId,
        title,
        description,
        payload,
        providerToken,
        currency,
        prices,
        maxTipAmount,
        suggestedTipAmounts,
        startParameter,
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
        isFlexible,
        disableNotification,
        protectContent,
        replyParameters,
        replyMarkup);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SendInvoiceParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
        .append(", title=")
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
        .append(", startParameter=")
        .append(startParameter)
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
        .append(", disableNotification=")
        .append(disableNotification)
        .append(", protectContent=")
        .append(protectContent)
        .append(", replyParameters=")
        .append(replyParameters)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append("]");
    return builder.toString();
  }
}
