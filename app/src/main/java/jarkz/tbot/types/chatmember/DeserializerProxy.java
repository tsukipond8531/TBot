package jarkz.tbot.types.chatmember;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import jarkz.tbot.types.annotations.Deserializer;
import jarkz.tbot.types.deserializers.JsonNotFoundKey;
import jarkz.tbot.types.deserializers.JsonTypeNotDefined;

@Deserializer
public class DeserializerProxy {

  private static final String CHAT_MEMBER_KEY = "status";

  public static Class<? extends ChatMember> getChatMemberClass(JsonObject jsonObject) {

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
    return clazz;
  }
}
