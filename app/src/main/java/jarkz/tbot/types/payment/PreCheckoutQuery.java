package jarkz.tbot.types.payment;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;

public class PreCheckoutQuery {

	@NotNull
	private String id;

	@NotNull
	private User from;

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

	public PreCheckoutQuery() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
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

	@Override
	final public int hashCode() {
		return Objects.hash(id, from, currency, totalAmount, invoicePayload, shippingOptionId, orderInfo);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PreCheckoutQuery other))
			return false;
		return Objects.equals(id, other.id)
				&& Objects.equals(from, other.from)
				&& Objects.equals(currency, other.currency)
				&& totalAmount == other.totalAmount
				&& Objects.equals(invoicePayload, other.invoicePayload)
				&& Objects.equals(shippingOptionId, other.shippingOptionId)
				&& Objects.equals(orderInfo, other.orderInfo);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PreCheckoutQuery[id=").append(id)
				.append(", from=").append(from)
				.append(", currency=").append(currency)
				.append(", totalAmount=").append(totalAmount)
				.append(", invoicePayload=").append(invoicePayload)
				.append(", shippingOptionId=").append(shippingOptionId)
				.append(", orderInfo=").append(orderInfo).append("]");
		return builder.toString();
	}
}
