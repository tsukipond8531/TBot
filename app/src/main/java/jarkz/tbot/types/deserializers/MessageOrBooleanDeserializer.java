package jarkz.tbot.types.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import jarkz.tbot.types.Message;
import jarkz.tbot.types.MessageOrBoolean;
import java.lang.reflect.Type;

public class MessageOrBooleanDeserializer implements JsonDeserializer<MessageOrBoolean> {

  @Override
  public MessageOrBoolean deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    if (json.isJsonObject()) {
      return new MessageOrBoolean(context.<Message>deserialize(json, Message.class));
    } else {
      return new MessageOrBoolean(context.<Boolean>deserialize(json, Boolean.class));
    }
  }
}
