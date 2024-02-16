package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Describes data sent from a Web App to the bot. */
public final class WebAppData {

  /** The data. Be aware that a bad client can send arbitrary data in this field. */
  @NotNull public String data;

  /**
   * Text of the web_app keyboard button from which the Web App was opened. Be aware that a bad
   * client can send arbitrary data in this field.
   */
  @SerializedName("button_text")
  @NotNull
  public String buttonText;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof WebAppData other)) return false;
    return Objects.equals(data, other.data) && Objects.equals(buttonText, other.buttonText);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(data, buttonText);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("WebAppData[data=")
        .append(data)
        .append(", buttonText=")
        .append(buttonText)
        .append("]");
    return builder.toString();
  }
}
