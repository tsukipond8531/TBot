package jarkz.tbot.types;

import jarkz.tbot.TestContainer;

/**
 * The specific "static" class for test equals and hashCode when required different instances for
 * same types for avoid dependency cycle.
 *
 * @author Pavel Bialiauski
 */
@TestContainer
public class PrefabTypes {

  /**
   * Returns a message instance, in which fields will be filled by the specific rules:
   *
   * <ul>
   *   <li>primitive must be filled;
   *   <li>nullable fields must be fills by chance;
   *   <li>complex type fields will be fills when depth allows do it.
   * </ul>
   *
   * @param depth the depth of fields fills.
   * @param nullableFieldsChance the chance, which used for defining whether to fill fields, which
   *     not marked by {@link NotNull} annotation.
   */
  public static Message getMessageInstance(int depth, float nullableFieldsChance) {
    TypeFactory<Message> messageFactory = new TypeFactory<>(depth, nullableFieldsChance);
    return messageFactory.generate(Message.class);
  }

  /**
   * Returns a chat instance, in which fields will be filled by the specific rules:
   *
   * <ul>
   *   <li>primitive must be filled;
   *   <li>nullable fields must be fills by chance;
   *   <li>complex type fields will be fills when depth allows do it.
   * </ul>
   *
   * @param depth the depth of fields fills.
   * @param nullableFieldsChance the chance, which used for defining whether to fill fields, which
   *     not marked by {@link NotNull} annotation.
   */
  public static Chat getChatInstance(int depth, float nullableFieldsChance) {
    TypeFactory<Chat> messageFactory = new TypeFactory<>(depth, nullableFieldsChance);
    return messageFactory.generate(Chat.class);
  }
}
