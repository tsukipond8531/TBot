package jarkz.tbot.types.deserializers;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import jarkz.tbot.types.botcommandscope.BotCommandScope;
import jarkz.tbot.types.botcommandscope.DeserializerProxy;

public class BotCommandScopeDeserializer implements JsonDeserializer<BotCommandScope> {

	@Override
	public BotCommandScope deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		JsonObject jsonObject = json.getAsJsonObject();
		Class<? extends BotCommandScope> clazz = DeserializerProxy.getBotCommandScopeClass(jsonObject);
		return context.deserialize(json, clazz);
	}
}
