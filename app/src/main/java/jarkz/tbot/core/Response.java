package jarkz.tbot.core;

import java.util.Objects;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

public class Response {

  private boolean ok;
  private String description;
  private JsonElement result;

  @SerializedName("error_code")
  private Integer errorCode;

  public Response() {}

  public boolean isOk() {
    return ok;
  }

  public void setOk(boolean ok) {
    this.ok = ok;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JsonElement getResult() {
    return result;
  }

  public void setResult(JsonElement result) {
    this.result = result;
  }

  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok, description, result, errorCode);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Response other)) return false;
    return ok == other.ok
        && Objects.equals(description, other.description)
        && Objects.equals(result, other.result)
        && Objects.equals(errorCode, other.errorCode);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("Response[ok=")
        .append(ok)
        .append(", description=")
        .append(description)
        .append(", result=")
        .append(result)
        .append(", error_code=")
        .append(errorCode)
        .append("]");
    return builder.toString();
  }
}
