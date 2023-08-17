package jarkz.tbot.types.stickers;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

public class MaskPosition {

  @NotNull private String point;

  @SerializedName("x_shift")
  @NotNull
  private float xShift;

  @SerializedName("y_shift")
  @NotNull
  private float yShift;

  @NotNull private float scale;

  public MaskPosition() {}

  public String getPoint() {
    return point;
  }

  public void setPoint(String point) {
    this.point = point;
  }

  public float getXShift() {
    return xShift;
  }

  public void setXShift(float xShift) {
    this.xShift = xShift;
  }

  public float getYShift() {
    return yShift;
  }

  public void setYShift(float yShift) {
    this.yShift = yShift;
  }

  public float getScale() {
    return scale;
  }

  public void setScale(float scale) {
    this.scale = scale;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(point, xShift, yShift, scale);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MaskPosition other)) return false;
    return Objects.equals(point, other.point)
        && Objects.equals(xShift, other.xShift)
        && Objects.equals(yShift, other.yShift)
        && Objects.equals(scale, other.scale);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("MaskPosition[point=")
        .append(point)
        .append(", xShift=")
        .append(xShift)
        .append(", yShift=")
        .append(yShift)
        .append(", scale=")
        .append(scale)
        .append("]");
    return builder.toString();
  }
}
