package jarkz.tbot.types.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import jarkz.tbot.types.ChatBoostSource;
import jarkz.tbot.types.ChatBoostSourceGiftCode;
import jarkz.tbot.types.ChatBoostSourceGiveaway;
import jarkz.tbot.types.ChatBoostSourcePremium;
import java.lang.reflect.Type;

/**
 * The JSON deserializer for general interface {@link ChatBoostSource}.
 *
 * @author Pavel Bialiauski
 */
public class ChatBoostSourceDeserializer implements JsonDeserializer<ChatBoostSource> {

  private final String CHAT_BOOST_SOURCE_KEY = "source";

  @Override
  public ChatBoostSource deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject();
    JsonElement element = jsonObject.get(CHAT_BOOST_SOURCE_KEY);
    if (element == null) {
      throw new JsonNotFoundKey(
          String.format(
              "Not found the key \"%s\" in %s.",
              CHAT_BOOST_SOURCE_KEY, ChatBoostSource.class.getName()));
    }
    String value = element.getAsString();

    Class<? extends ChatBoostSource> clazz = null;
    switch (value) {
      case ChatBoostSourcePremium.SOURCE -> clazz = ChatBoostSourcePremium.class;
      case ChatBoostSourceGiftCode.SOURCE -> clazz = ChatBoostSourceGiftCode.class;
      case ChatBoostSourceGiveaway.SOURCE -> clazz = ChatBoostSourceGiveaway.class;
      default -> throw new JsonTypeNotDefined(
          String.format(
              "Given \"%s\" in %s is not defined.",
              CHAT_BOOST_SOURCE_KEY, ChatBoostSource.class.getName()));
    }

    return context.deserialize(json, clazz);
  }
}
