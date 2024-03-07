package jarkz.tbot.types.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import jarkz.tbot.types.InaccessibleMessage;
import jarkz.tbot.types.MaybeInaccessibleMessage;
import jarkz.tbot.types.Message;
import java.lang.reflect.Type;

/**
 * The JSON deserializer for general interface {@link MaybeInaccessibleMessage}.
 *
 * @author Pavel Bialiauski
 */
public class MaybeInaccessibleMessageDeserializer
    implements JsonDeserializer<MaybeInaccessibleMessage> {

  private final String MAYBE_INACCESSIBLE_MESSAGE_KEY = "date";

  @Override
  public MaybeInaccessibleMessage deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject();
    JsonElement element = jsonObject.get(MAYBE_INACCESSIBLE_MESSAGE_KEY);
    if (element == null) {
      throw new JsonNotFoundKey(
          String.format(
              "Not found the key \"%s\" in %s.",
              MAYBE_INACCESSIBLE_MESSAGE_KEY, MaybeInaccessibleMessage.class.getName()));
    }

    Class<? extends MaybeInaccessibleMessage> clazz = Message.class;

    if (element.getAsInt() == 0) {
      clazz = InaccessibleMessage.class;
    }

    return context.deserialize(json, clazz);
  }
}
