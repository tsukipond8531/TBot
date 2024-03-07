package jarkz.tbot.core.parameters;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to change search keywords assigned to a regular or custom emoji sticker. The
 * sticker must belong to a sticker set created by the bot. Returns True on success.
 */
public final class SetStickerKeywordsParameters {

  /** File identifier of the sticker */
  @NotNull public String sticker;

  /**
   * A JSON-serialized list of 0-20 search keywords for the sticker with total length of up to 64
   * characters
   */
  public List<String> keywords;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetStickerKeywordsParameters other)) return false;
    return Objects.equals(sticker, other.sticker) && Objects.equals(keywords, other.keywords);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(sticker, keywords);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetStickerKeywordsParameters[sticker=")
        .append(sticker)
        .append(", keywords=")
        .append(keywords)
        .append("]");
    return builder.toString();
  }
}
