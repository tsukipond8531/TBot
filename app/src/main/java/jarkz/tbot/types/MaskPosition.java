package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object describes the position on faces where a mask should be placed by default. */
public final class MaskPosition {

  /**
   * The part of the face relative to which the mask should be placed. One of "forehead", "eyes",
   * "mouth", or "chin".
   */
  @NotNull public String point;

  /**
   * Shift by X-axis measured in widths of the mask scaled to the face size, from left to right. For
   * example, choosing -1.0 will place mask just to the left of the default mask position.
   */
  @NotNull
  @SerializedName("x_shift")
  public float xShift;

  /**
   * Shift by Y-axis measured in heights of the mask scaled to the face size, from top to bottom.
   * For example, 1.0 will place the mask just below the default mask position.
   */
  @NotNull
  @SerializedName("y_shift")
  public float yShift;

  /** Mask scaling coefficient. For example, 2.0 means double size. */
  @NotNull public float scale;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MaskPosition other)) return false;
    return Objects.equals(point, other.point)
        && Float.floatToIntBits(xShift) == Float.floatToIntBits(other.xShift)
        && Float.floatToIntBits(yShift) == Float.floatToIntBits(other.yShift)
        && Float.floatToIntBits(scale) == Float.floatToIntBits(other.scale);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(point, xShift, yShift, scale);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
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
