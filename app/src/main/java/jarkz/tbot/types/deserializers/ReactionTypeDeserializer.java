package jarkz.tbot.types.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import jarkz.tbot.types.ReactionType;
import jarkz.tbot.types.ReactionTypeCustomEmoji;
import jarkz.tbot.types.ReactionTypeEmoji;
import java.lang.reflect.Type;

/**
 * The JSON deserializer for general interface {@link ReactionType}.
 *
 * @author Pavel Bialiauski
 */
public class ReactionTypeDeserializer implements JsonDeserializer<ReactionType> {

  private final String REACTION_TYPE_KEY = "type";

  @Override
  public ReactionType deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject();
    JsonElement element = jsonObject.get(REACTION_TYPE_KEY);
    if (element == null) {
      throw new JsonNotFoundKey(
          String.format(
              "Not found the key \"%s\" in %s.", REACTION_TYPE_KEY, ReactionType.class.getName()));
    }
    String value = element.getAsString();

    Class<? extends ReactionType> clazz = null;
    switch (value) {
      case ReactionTypeEmoji.TYPE -> clazz = ReactionTypeEmoji.class;
      case ReactionTypeCustomEmoji.TYPE -> clazz = ReactionTypeCustomEmoji.class;
      default -> throw new JsonTypeNotDefined(
          String.format(
              "Given \"%s\" in %s is not defined.",
              REACTION_TYPE_KEY, ReactionType.class.getName()));
    }
    return context.deserialize(json, clazz);
  }
}
