package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Describes data sent from a <a href="https://core.telegram.org/bots/webapps">Web App</a> to the
 * bot.
 *
 * @author Pavel Bialiauski
 */
public class WebAppData {

  @NotNull private String data;

  @SerializedName("button_text")
  @NotNull
  private String buttonText;

  /** Default constructor. */
  public WebAppData() {}

  /**
   * The data.
   *
   * <p><strong>Be aware</strong> that a bad client can send arbitrary data in this field.
   *
   * @return data as String.
   */
  public String getData() {
    return data;
  }

  /**
   * Sets the data.
   *
   * <p><strong>Be aware</strong> that a bad client can send arbitrary data in this field.
   *
   * @param data the data as String.
   */
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Text of the <i>web_app</i> keyboard button from which the Web App was opened.
   *
   * <p><strong>Be aware</strong> that a bad client can send arbitrary data in this field.
   *
   * @return button_text as String.
   */
  public String getButtonText() {
    return buttonText;
  }

  /**
   * Sets the text of the <i>web_app</i> keyboard button from which the Web App was opened.
   *
   * <p><strong>Be aware</strong> that a bad client can send arbitrary data in this field.
   *
   * @param buttonText the text of the <i>web_app</i> keyboard button, from which the Web App was
   *     opened, as String.
   */
  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(data, buttonText);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof WebAppData other)) return false;
    return Objects.equals(data, other.data) && Objects.equals(buttonText, other.buttonText);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("WebAppData[data=")
        .append(data)
        .append(", buttonText=")
        .append(buttonText)
        .append("]");
    return builder.toString();
  }
}
