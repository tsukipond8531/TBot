package jarkz.tbot.types;

import jarkz.tbot.TestContainer;
import jarkz.tbot.types.chat.Chat;

@TestContainer
public class PrefabTypes {

  public static Message getMessageInstance(int depth, float chanceGenerationNullableFields) {
    TypeFactory<Message> messageFactory = new TypeFactory<>(depth, chanceGenerationNullableFields);
    Message instance = new Message();
    messageFactory.generate(instance);
    return instance;
  }

  public static Chat getChatInstance(int depth, float chanceGenerationNullableFields) {
    TypeFactory<Chat> messageFactory = new TypeFactory<>(depth, chanceGenerationNullableFields);
    Chat instance = new Chat();
    messageFactory.generate(instance);
    return instance;
  }
}
