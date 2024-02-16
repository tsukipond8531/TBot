package jarkz.tbot.types.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import jarkz.tbot.types.MessageOrigin;
import jarkz.tbot.types.MessageOriginChannel;
import jarkz.tbot.types.MessageOriginChat;
import jarkz.tbot.types.MessageOriginHiddenUser;
import jarkz.tbot.types.MessageOriginUser;
import java.lang.reflect.Type;

/**
 * The JSON deserializer for general interface {@link MessageOrigin}.
 *
 * @author Pavel Bialiauski
 */
public class MessageOriginDeserializer implements JsonDeserializer<MessageOrigin> {

  private final String MESSAGE_ORIGIN_KEY = "type";

  @Override
  public MessageOrigin deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject();
    JsonElement element = jsonObject.get(MESSAGE_ORIGIN_KEY);
    if (element == null) {
      throw new JsonNotFoundKey(
          String.format(
              "Not found the key \"%s\" in %s.",
              MESSAGE_ORIGIN_KEY, MessageOrigin.class.getName()));
    }
    String value = element.getAsString();

    Class<? extends MessageOrigin> clazz = null;
    switch (value) {
      case "user" -> clazz = MessageOriginUser.class;
      case "hidden_user" -> clazz = MessageOriginHiddenUser.class;
      case "chat" -> clazz = MessageOriginChat.class;
      case "channel" -> clazz = MessageOriginChannel.class;
      default -> throw new JsonTypeNotDefined(
          String.format(
              "Given \"%s\" in %s is not defined.",
              MESSAGE_ORIGIN_KEY, MessageOrigin.class.getName()));
    }
    return context.deserialize(json, clazz);
  }
}
