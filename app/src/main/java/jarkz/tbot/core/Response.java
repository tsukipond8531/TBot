package jarkz.tbot.core;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import jarkz.tbot.types.ResponseParameters;

public class Response {

  private boolean ok;
  private String description;
  private JsonElement result;

  @SerializedName("error_code")
  private Integer errorCode;

  private ResponseParameters parameters;

  public Response() {}

  public boolean isOk() {
    return ok;
  }

  public void setOk(boolean ok) {
    this.ok = ok;
  }

  public Optional<String> getDescription() {
    return Optional.of(description);
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Optional<JsonElement> getResult() {
    return Optional.of(result);
  }

  public void setResult(JsonElement result) {
    this.result = result;
  }

  public Optional<Integer> getErrorCode() {
    return Optional.of(errorCode);
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public Optional<ResponseParameters> getParameters() {
    return Optional.of(parameters);
  }

  public void setParameters(ResponseParameters parameters) {
    this.parameters = parameters;
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok, description, result, errorCode, parameters);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Response other)) return false;
    return ok == other.ok
        && Objects.equals(description, other.description)
        && Objects.equals(result, other.result)
        && Objects.equals(errorCode, other.errorCode)
        && Objects.equals(parameters, other.parameters);
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
        .append(", parameters=")
        .append(parameters)
        .append("]");
    return builder.toString();
  }
}
