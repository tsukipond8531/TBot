package jarkz.tbot.types.inlinemode;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class InputTextMessageContent implements InputMessageContent {

  @SerializedName("message_text")
  @NotNull
  private String messageText;

  @SerializedName("parse_mode")
  private String parseMode;

  private List<MessageEntity> entities;

  @SerializedName("disable_web_page_preview")
  private Boolean disableWebPagePreview;

  public InputTextMessageContent() {}

  public String getMessageText() {
    return messageText;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  public Optional<String> getParseMode() {
    return Optional.of(parseMode);
  }

  public void setParseMode(String parseMode) {
    this.parseMode = parseMode;
  }

  public Optional<List<MessageEntity>> getEntities() {
    return Optional.of(entities);
  }

  public void setEntities(List<MessageEntity> entities) {
    this.entities = entities;
  }

  public Optional<Boolean> getDisableWebPagePreview() {
    return Optional.of(disableWebPagePreview);
  }

  public void setDisableWebPagePreview(Boolean disableWebPagePreview) {
    this.disableWebPagePreview = disableWebPagePreview;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(messageText, parseMode, entities, disableWebPagePreview);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputTextMessageContent other)) return false;
    return Objects.equals(messageText, other.messageText)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(entities, other.entities)
        && Objects.equals(disableWebPagePreview, other.disableWebPagePreview);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InputTextMessageContent[messageText=")
        .append(messageText)
        .append(", parseMode=")
        .append(parseMode)
        .append(", entities=")
        .append(entities)
        .append(", disableWebPagePreview=")
        .append(disableWebPagePreview)
        .append("]");
    return builder.toString();
  }
}
