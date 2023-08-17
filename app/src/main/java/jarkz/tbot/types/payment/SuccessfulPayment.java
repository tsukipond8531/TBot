package jarkz.tbot.types.payment;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class SuccessfulPayment {

	@NotNull
	private String currency;

	@SerializedName("total_amount")
	@NotNull
	private int totalAmount;

	@SerializedName("invoice_payload")
	@NotNull
	private String invoicePayload;

	@SerializedName("shipping_option_id")
	private String shippingOptionId;

	@SerializedName("order_info")
	private OrderInfo orderInfo;

	@SerializedName("telegram_payment_charge_id")
	@NotNull
	private String telegramPaymentChargeId;

	@SerializedName("provider_payment_charge_id")
	@NotNull
	private String providerPaymentChargeId;

	public SuccessfulPayment() {
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getInvoicePayload() {
		return invoicePayload;
	}

	public void setInvoicePayload(String invoicePayload) {
		this.invoicePayload = invoicePayload;
	}

	public Optional<String> getShippingOptionId() {
		return Optional.of(shippingOptionId);
	}

	public void setShippingOptionId(String shippingOptionId) {
		this.shippingOptionId = shippingOptionId;
	}

	public Optional<OrderInfo> getOrderInfo() {
		return Optional.of(orderInfo);
	}

	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getTelegramPaymentChargeId() {
		return telegramPaymentChargeId;
	}

	public void setTelegramPaymentChargeId(String telegramPaymentChargeId) {
		this.telegramPaymentChargeId = telegramPaymentChargeId;
	}

	public String getProviderPaymentChargeId() {
		return providerPaymentChargeId;
	}

	public void setProviderPaymentChargeId(String providerPaymentChargeId) {
		this.providerPaymentChargeId = providerPaymentChargeId;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(currency,
				totalAmount,
				invoicePayload,
				shippingOptionId,
				orderInfo,
				telegramPaymentChargeId,
				providerPaymentChargeId);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SuccessfulPayment other))
			return false;
		return Objects.equals(currency, other.currency)
				&& totalAmount == other.totalAmount
				&& Objects.equals(invoicePayload, other.invoicePayload)
				&& Objects.equals(shippingOptionId, other.shippingOptionId)
				&& Objects.equals(orderInfo, other.orderInfo)
				&& Objects.equals(telegramPaymentChargeId, other.telegramPaymentChargeId)
				&& Objects.equals(providerPaymentChargeId, other.providerPaymentChargeId);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SuccessfulPayment[currency=").append(currency)
				.append(", totalAmount=").append(totalAmount)
				.append(", invoicePayload=").append(invoicePayload)
				.append(", shippingOptionId=").append(shippingOptionId)
				.append(", orderInfo=").append(orderInfo)
				.append(", telegramPaymentChargeId=").append(telegramPaymentChargeId)
				.append(", providerPaymentChargeId=").append(providerPaymentChargeId).append("]");
		return builder.toString();
	}
}
