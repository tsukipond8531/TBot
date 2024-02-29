package jarkz.tbot.types;

import java.util.Objects;

/** The wrapper for id field, which accepts String or Integer. */
public final class Id {

  public enum Type {
    INTEGER,
    STRING
  }

  private Integer asInt;
  private String asString;
  private Type type;

  public Id(Integer data) {
    asInt = data;
    type = Type.INTEGER;
  }

  public Id(String data) {
    asString = data;
    type = Type.STRING;
  }

  public Type type() {
    return type;
  }

  public Integer integerData() {
    return asInt;
  }

  public String stringData() {
    return asString;
  }

  @Override
  public int hashCode() {
    return Objects.hash(asInt, asString, type);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Id)) return false;
    Id other = (Id) obj;
    return Objects.equals(asInt, other.asInt)
        && Objects.equals(asString, other.asString)
        && type == other.type;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("Id[asInt=")
        .append(asInt)
        .append(", asString=")
        .append(asString)
        .append(", type=")
        .append(type)
        .append("]");
    return builder.toString();
  }
}
