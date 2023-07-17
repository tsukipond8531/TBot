package jarkz.tbot.types.deserializers;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import jarkz.tbot.types.inlinemode.DeserializerProxy;
import jarkz.tbot.types.inlinemode.InlineQueryResult;

public class InlineQueryResultDeserializer implements JsonDeserializer<InlineQueryResult> {

	@Override
	public InlineQueryResult deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		JsonObject jsonObject = json.getAsJsonObject();
		Class<? extends InlineQueryResult> clazz = DeserializerProxy.getInlineQueryResultClass(jsonObject);
		return context.deserialize(json, clazz);
	}
}
