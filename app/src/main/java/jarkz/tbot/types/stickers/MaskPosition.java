package jarkz.tbot.types.stickers;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object describes the position on faces where a mask should be placed by default.
 *
 * @author Pavel Bialiauski
 */
public class MaskPosition {

  @NotNull private String point;

  @SerializedName("x_shift")
  @NotNull
  private float xShift;

  @SerializedName("y_shift")
  @NotNull
  private float yShift;

  @NotNull private float scale;

  /** Default constructor. */
  public MaskPosition() {}

  /**
   * The part of the face relative to which the mask should be placed. One of “forehead”, “eyes”,
   * “mouth”, or “chin”.
   *
   * @return point as String.
   */
  public String getPoint() {
    return point;
  }

  /**
   * Sets the part of the face relative to which the mask should be placed. One of “forehead”,
   * “eyes”, “mouth”, or “chin”.
   *
   * @param point the part of the face relative to which the mask should be placed as String.
   */
  public void setPoint(String point) {
    this.point = point;
  }

  /**
   * Shift by X-axis measured in widths of the mask scaled to the face size, from left to right. For
   * example, choosing -1.0 will place mask just to the left of the default mask position.
   *
   * @return x_shift as float.
   */
  public float getXShift() {
    return xShift;
  }

  /**
   * Sets the shift by X-axis measured in widths of the mask scaled to the face size, from left to
   * right. For example, choosing -1.0 will place mask just to the left of the default mask
   * position.
   *
   * @param xShift the shift by X-axis measured in widths of the mask scaled to the face size, from
   *     left to right, as float.
   */
  public void setXShift(float xShift) {
    this.xShift = xShift;
  }

  /**
   * Shift by Y-axis measured in heights of the mask scaled to the face size, from top to bottom.
   * For example, 1.0 will place the mask just below the default mask position.
   *
   * @return y_shift as float.
   */
  public float getYShift() {
    return yShift;
  }

  /**
   * Sets the shift by Y-axis measured in heights of the mask scaled to the face size, from top to
   * bottom. For example, 1.0 will place the mask just below the default mask position.
   *
   * @param yShift the shift by Y-axis measured in heights of the mask scaled to the face size, from
   *     top to bottom, as float.
   */
  public void setYShift(float yShift) {
    this.yShift = yShift;
  }

  /**
   * Mask scaling coefficient. For example, 2.0 means double size.
   *
   * @return scale as float.
   */
  public float getScale() {
    return scale;
  }

  /**
   * Sets the mask scaling coefficient. For example, 2.0 means double size.
   *
   * @param scale the mask scaling coefficient as float.
   */
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
