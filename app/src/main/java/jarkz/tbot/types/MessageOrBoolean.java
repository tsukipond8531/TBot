package jarkz.tbot.types;

import java.util.Objects;

public final class MessageOrBoolean {

  public enum Type {
    MESSAGE,
    BOOLEAN,
  }

  private Message messageData;
  private Boolean booleanData;
  private Type type;

  public MessageOrBoolean(Message message) {
    this.messageData = message;
    this.type = Type.MESSAGE;
  }

  public MessageOrBoolean(Boolean data) {
    this.booleanData = data;
    this.type = Type.BOOLEAN;
  }

  public Type type() {
    return this.type;
  }

  public Message messageData() {
    return messageData;
  }

  public Boolean booleanData() {
    return booleanData;
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageData, booleanData, type);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MessageOrBoolean)) return false;
    MessageOrBoolean other = (MessageOrBoolean) obj;
    return Objects.equals(messageData, other.messageData)
        && Objects.equals(booleanData, other.booleanData)
        && type == other.type;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("MessageOrBoolean[messageData=")
        .append(messageData)
        .append(", booleanData=")
        .append(booleanData)
        .append(", type=")
        .append(type)
        .append("]");
    return builder.toString();
  }
}
