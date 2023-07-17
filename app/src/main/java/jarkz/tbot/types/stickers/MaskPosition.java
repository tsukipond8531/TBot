package jarkz.tbot.types.stickers;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class MaskPosition {

	@NotNull
	private String point;

	@SerializedName("x_shift")
	@NotNull
	private Float xShift;

	@SerializedName("y_shift")
	@NotNull
	private Float yShift;

	@NotNull
	private Float scale;

	public MaskPosition() {
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public Float getxShift() {
		return xShift;
	}

	public void setxShift(Float xShift) {
		this.xShift = xShift;
	}

	public Float getyShift() {
		return yShift;
	}

	public void setyShift(Float yShift) {
		this.yShift = yShift;
	}

	public Float getScale() {
		return scale;
	}

	public void setScale(Float scale) {
		this.scale = scale;
	}

	@Override
	public int hashCode() {
		return Objects.hash(point, xShift, yShift, scale);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MaskPosition other))
			return false;
		return Objects.equals(point, other.point)
				&& Objects.equals(xShift, other.xShift)
				&& Objects.equals(yShift, other.yShift)
				&& Objects.equals(scale, other.scale);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MaskPosition[point=").append(point)
				.append(", xShift=").append(xShift)
				.append(", yShift=").append(yShift)
				.append(", scale=").append(scale).append("]");
		return builder.toString();
	}
}
