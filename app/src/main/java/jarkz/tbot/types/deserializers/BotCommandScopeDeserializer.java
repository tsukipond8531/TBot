package jarkz.tbot.types.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import jarkz.tbot.types.botcommandscope.BotCommandScope;
import jarkz.tbot.types.botcommandscope.DeserializerProxy;
import java.lang.reflect.Type;

/**
 * The JSON deserializer adapter for general interface {@link BotCommandScope}.
 *
 * @author Pavel Bialiauski
 */
public class BotCommandScopeDeserializer implements JsonDeserializer<BotCommandScope> {

  @Override
  public BotCommandScope deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject();
    Class<? extends BotCommandScope> clazz = DeserializerProxy.getBotCommandScopeClass(jsonObject);
    return context.deserialize(json, clazz);
  }
}
