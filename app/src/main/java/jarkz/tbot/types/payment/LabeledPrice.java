package jarkz.tbot.types.payment;

import java.util.Objects;

import jakarta.validation.constraints.NotNull;

public class LabeledPrice {

	@NotNull
	private String label;

	@NotNull
	private int amount;

	public LabeledPrice() {
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(label, amount);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof LabeledPrice other))
			return false;
		return Objects.equals(label, other.label) && amount == other.amount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LabeledPrice[label=").append(label).append(", amount=").append(amount).append("]");
		return builder.toString();
	}
}
