package jarkz.tbot.types.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import jarkz.tbot.types.passport.DeserializerProxy;
import jarkz.tbot.types.passport.PassportElementError;
import java.lang.reflect.Type;

public class PassportElementErrorDeserializer implements JsonDeserializer<PassportElementError> {

  @Override
  public PassportElementError deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject();
    Class<? extends PassportElementError> clazz =
        DeserializerProxy.getPassportElementErrorClass(jsonObject);
    return context.deserialize(json, clazz);
  }
}
