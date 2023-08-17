package jarkz.tbot.types.inlinemode;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.payment.LabeledPrice;

public class InputInvoiceMessageContent implements InputMessageContent {

	@NotNull
	private String title;

	@NotNull
	private String description;

	@NotNull
	private String payload;

	@SerializedName("provider_token")
	@NotNull
	private String providerToken;

	@NotNull
	private String currency;

	@NotNull
	private List<LabeledPrice> prices;

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

	public InputInvoiceMessageContent() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getProviderToken() {
		return providerToken;
	}

	public void setProviderToken(String providerToken) {
		this.providerToken = providerToken;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public List<LabeledPrice> getPrices() {
		return prices;
	}

	public void setPrices(List<LabeledPrice> prices) {
		this.prices = prices;
	}

	public Optional<Integer> getMaxTipAmount() {
		return Optional.of(maxTipAmount);
	}

	public void setMaxTipAmount(Integer maxTipAmount) {
		this.maxTipAmount = maxTipAmount;
	}

	public Optional<List<Integer>> getSuggestedTipAmounts() {
		return Optional.of(suggestedTipAmounts);
	}

	public void setSuggestedTipAmounts(List<Integer> suggestedTipAmounts) {
		this.suggestedTipAmounts = suggestedTipAmounts;
	}

	public Optional<String> getProviderData() {
		return Optional.of(providerData);
	}

	public void setProviderData(String providerData) {
		this.providerData = providerData;
	}

	public Optional<String> getPhotoUrl() {
		return Optional.of(photoUrl);
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Optional<Integer> getPhotoSize() {
		return Optional.of(photoSize);
	}

	public void setPhotoSize(Integer photoSize) {
		this.photoSize = photoSize;
	}

	public Optional<Integer> getPhotoWidth() {
		return Optional.of(photoWidth);
	}

	public void setPhotoWidth(Integer photoWidth) {
		this.photoWidth = photoWidth;
	}

	public Optional<Integer> getPhotoHeight() {
		return Optional.of(photoHeight);
	}

	public void setPhotoHeight(Integer photoHeight) {
		this.photoHeight = photoHeight;
	}

	public Optional<Boolean> getNeedName() {
		return Optional.of(needName);
	}

	public void setNeedName(Boolean needName) {
		this.needName = needName;
	}

	public Optional<Boolean> getNeedPhoneNumber() {
		return Optional.of(needPhoneNumber);
	}

	public void setNeedPhoneNumber(Boolean needPhoneNumber) {
		this.needPhoneNumber = needPhoneNumber;
	}

	public Optional<Boolean> getNeedEmail() {
		return Optional.of(needEmail);
	}

	public void setNeedEmail(Boolean needEmail) {
		this.needEmail = needEmail;
	}

	public Optional<Boolean> getNeedShippingAddress() {
		return Optional.of(needShippingAddress);
	}

	public void setNeedShippingAddress(Boolean needShippingAddress) {
		this.needShippingAddress = needShippingAddress;
	}

	public Optional<Boolean> getSendPhoneNumberToProvider() {
		return Optional.of(sendPhoneNumberToProvider);
	}

	public void setSendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
		this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
	}

	public Optional<Boolean> getSendEmailToProvider() {
		return Optional.of(sendEmailToProvider);
	}

	public void setSendEmailToProvider(Boolean sendEmailToProvider) {
		this.sendEmailToProvider = sendEmailToProvider;
	}

	public Optional<Boolean> getIsFlexible() {
		return Optional.of(isFlexible);
	}

	public void setIsFlexible(Boolean isFlexible) {
		this.isFlexible = isFlexible;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(title,
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
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InputInvoiceMessageContent other))
			return false;
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
		builder.append("InputInvoiceMessageContent[title=").append(title)
				.append(", description=").append(description)
				.append(", payload=").append(payload)
				.append(", providerToken=").append(providerToken)
				.append(", currency=").append(currency)
				.append(", prices=").append(prices)
				.append(", maxTipAmount=").append(maxTipAmount)
				.append(", suggestedTipAmounts=").append(suggestedTipAmounts)
				.append(", providerData=").append(providerData)
				.append(", photoUrl=").append(photoUrl)
				.append(", photoSize=").append(photoSize)
				.append(", photoWidth=").append(photoWidth)
				.append(", photoHeight=").append(photoHeight)
				.append(", needName=").append(needName)
				.append(", needPhoneNumber=").append(needPhoneNumber)
				.append(", needEmail=").append(needEmail)
				.append(", needShippingAddress=").append(needShippingAddress)
				.append(", sendPhoneNumberToProvider=").append(sendPhoneNumberToProvider)
				.append(", sendEmailToProvider=").append(sendEmailToProvider)
				.append(", isFlexible=").append(isFlexible).append("]");
		return builder.toString();
	}
}
