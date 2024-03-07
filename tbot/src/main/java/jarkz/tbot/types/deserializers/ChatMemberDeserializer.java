package jarkz.tbot.types.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import jarkz.tbot.types.ChatMember;
import jarkz.tbot.types.ChatMemberAdministrator;
import jarkz.tbot.types.ChatMemberBanned;
import jarkz.tbot.types.ChatMemberLeft;
import jarkz.tbot.types.ChatMemberMember;
import jarkz.tbot.types.ChatMemberOwner;
import jarkz.tbot.types.ChatMemberRestricted;
import java.lang.reflect.Type;

/**
 * The JSON deserializer for general interface {@link ChatMember}.
 *
 * @author Pavel Bialiauski
 */
public class ChatMemberDeserializer implements JsonDeserializer<ChatMember> {

  private final String CHAT_MEMBER_KEY = "status";

  @Override
  public ChatMember deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject();
    JsonElement element = jsonObject.get(CHAT_MEMBER_KEY);
    if (element == null) {
      throw new JsonNotFoundKey(
          String.format(
              "Not found the key \"%s\" in %s.", CHAT_MEMBER_KEY, ChatMember.class.getName()));
    }
    String value = element.getAsString();

    Class<? extends ChatMember> clazz = null;
    switch (value) {
      case ChatMemberAdministrator.STATUS -> clazz = ChatMemberAdministrator.class;
      case ChatMemberBanned.STATUS -> clazz = ChatMemberBanned.class;
      case ChatMemberLeft.STATUS -> clazz = ChatMemberLeft.class;
      case ChatMemberMember.STATUS -> clazz = ChatMemberMember.class;
      case ChatMemberOwner.STATUS -> clazz = ChatMemberOwner.class;
      case ChatMemberRestricted.STATUS -> clazz = ChatMemberRestricted.class;
      default -> throw new JsonTypeNotDefined(
          String.format(
              "Given \"%s\" in %s is not defined.", CHAT_MEMBER_KEY, ChatMember.class.getName()));
    }
    return context.deserialize(json, clazz);
  }
}
