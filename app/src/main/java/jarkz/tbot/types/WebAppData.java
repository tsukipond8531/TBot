package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

public class WebAppData {

  @NotNull private String data;

  @SerializedName("button_text")
  @NotNull
  private String buttonText;

  public WebAppData() {}

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getButtonText() {
    return buttonText;
  }

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
