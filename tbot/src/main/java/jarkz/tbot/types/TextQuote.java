package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * This object contains information about the quoted part of a message that is replied to by the
 * given message.
 */
public final class TextQuote {

  public static final class Builder {

    private TextQuote buildingType;

    public Builder() {
      buildingType = new TextQuote();
    }

    public Builder setText(String text) {
      buildingType.text = text;
      return this;
    }

    public Builder setEntities(List<MessageEntity> entities) {
      buildingType.entities = entities;
      return this;
    }

    public Builder setPosition(int position) {
      buildingType.position = position;
      return this;
    }

    public Builder setIsManual(Boolean isManual) {
      buildingType.isManual = isManual;
      return this;
    }

    public TextQuote build() {
      return buildingType;
    }
  }

  /** Text of the quoted part of a message that is replied to by the given message */
  @NotNull public String text;

  /**
   * Optional. Special entities that appear in the quote. Currently, only bold, italic, underline,
   * strikethrough, spoiler, and custom_emoji entities are kept in quotes.
   */
  public List<MessageEntity> entities;

  /**
   * Approximate quote position in the original message in UTF-16 code units as specified by the
   * sender
   */
  @NotNull public int position;

  /**
   * Optional. True, if the quote was chosen manually by the message sender. Otherwise, the quote
   * was added automatically by the server.
   */
  @SerializedName("is_manual")
  public Boolean isManual;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof TextQuote other)) return false;
    return Objects.equals(text, other.text)
        && Objects.equals(entities, other.entities)
        && position == other.position
        && Objects.equals(isManual, other.isManual);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(text, entities, position, isManual);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("TextQuote[text=")
        .append(text)
        .append(", entities=")
        .append(entities)
        .append(", position=")
        .append(position)
        .append(", isManual=")
        .append(isManual)
        .append("]");
    return builder.toString();
  }
}
