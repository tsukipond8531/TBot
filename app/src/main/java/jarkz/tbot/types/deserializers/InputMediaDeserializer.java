package jarkz.tbot.types.deserializers;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import jarkz.tbot.types.inputmedia.DeserializerProxy;
import jarkz.tbot.types.inputmedia.InputMedia;

public class InputMediaDeserializer implements JsonDeserializer<InputMedia> {

	@Override
	public InputMedia deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		JsonObject jsonObject = json.getAsJsonObject();
		Class<? extends InputMedia> clazz = DeserializerProxy.getInputMediaClass(jsonObject);
		return context.deserialize(json, clazz);
	}

}
