package jarkz.tbot.types.payment;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;

public class ShippingQuery {

	@NotNull
	private String id;

	@NotNull
	private User from;

	@SerializedName("invoice_payload")
	@NotNull
	private String invoicePayload;

	@SerializedName("shipping_address")
	@NotNull
	private ShippingAddress shippingAddress;

	public ShippingQuery() {
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

	public String getInvoicePayload() {
		return invoicePayload;
	}

	public void setInvoicePayload(String invoicePayload) {
		this.invoicePayload = invoicePayload;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(id, from, invoicePayload, shippingAddress);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ShippingQuery other))
			return false;
		return Objects.equals(id, other.id)
				&& Objects.equals(from, other.from)
				&& Objects.equals(invoicePayload, other.invoicePayload)
				&& Objects.equals(shippingAddress, other.shippingAddress);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShippingQuery[id=").append(id)
				.append(", from=").append(from)
				.append(", invoicePayload=").append(invoicePayload)
				.append(", shippingAddress=").append(shippingAddress).append("]");
		return builder.toString();
	}
}
