package jarkz.tbot.types.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import jarkz.tbot.types.chatmember.ChatMember;
import jarkz.tbot.types.chatmember.DeserializerProxy;
import java.lang.reflect.Type;

public class ChatMemberDeserializer implements JsonDeserializer<ChatMember> {

  @Override
  public ChatMember deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject();
    Class<? extends ChatMember> clazz = DeserializerProxy.getChatMemberClass(jsonObject);
    return context.deserialize(json, clazz);
  }
}
