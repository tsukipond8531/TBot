package jarkz.tbot.types.payment;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class Invoice {

	@NotNull
	private String title;

	@NotNull
	private String description;

	@SerializedName("start_parameter")
	@NotNull
	private String startParameter;

	@NotNull
	private String currency;

	@SerializedName("total_amount")
	@NotNull
	private int totalAmount;

	public Invoice() {
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

	public String getStartParameter() {
		return startParameter;
	}

	public void setStartParameter(String startParameter) {
		this.startParameter = startParameter;
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

	@Override
	public int hashCode() {
		return Objects.hash(title, description, startParameter, currency, totalAmount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Invoice other))
			return false;
		return Objects.equals(title, other.title)
				&& Objects.equals(description, other.description)
				&& Objects.equals(startParameter, other.startParameter)
				&& Objects.equals(currency, other.currency)
				&& totalAmount == other.totalAmount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoice[title=").append(title)
				.append(", description=").append(description)
				.append(", startParameter=").append(startParameter)
				.append(", currency=").append(currency)
				.append(", totalAmount=").append(totalAmount).append("]");
		return builder.toString();
	}
}
