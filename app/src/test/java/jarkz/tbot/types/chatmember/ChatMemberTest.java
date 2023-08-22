package jarkz.tbot.types.chatmember;

import jarkz.tbot.TestContainer;
import jarkz.tbot.exceptions.types.ContractException;
import jarkz.tbot.exceptions.types.JsonSerializationException;
import jarkz.tbot.types.ContractVerifier;
import jarkz.tbot.types.Message;
import jarkz.tbot.types.PrefabTypes;
import jarkz.tbot.types.TypesTest;
import jarkz.tbot.types.annotations.Deserializer;
import jarkz.tbot.types.chat.Chat;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

/**
 * This test verifies package {@link jarkz.tbot.types.chatmember}.
 *
 * @author Pavel Bialiauski
 */
@TestContainer
public class ChatMemberTest {

  private final int TYPE_DEPTH = 1;
  private final float CHANCE_OF_NULLABLE_FIELD = 0.35f;

  /**
   * Verifies the equals and hashCode for each class, except deserializers, test containers and
   * etc., from the package {@link jarkz.tbot.types.chatmember}.
   */
  @Test
  public void verifyEqualsAndHashCode() {
    EqualsVerifier.forPackage(this.getClass().getPackageName())
        .withPrefabValues(
            Message.class,
            PrefabTypes.getMessageInstance(TYPE_DEPTH, CHANCE_OF_NULLABLE_FIELD),
            PrefabTypes.getMessageInstance(TYPE_DEPTH, CHANCE_OF_NULLABLE_FIELD))
        .withPrefabValues(
            Chat.class,
            PrefabTypes.getChatInstance(TYPE_DEPTH, CHANCE_OF_NULLABLE_FIELD),
            PrefabTypes.getChatInstance(TYPE_DEPTH, CHANCE_OF_NULLABLE_FIELD))
        .except(c -> c.isAnnotationPresent(Deserializer.class))
        .suppress(Warning.ALL_FIELDS_SHOULD_BE_USED, Warning.NONFINAL_FIELDS)
        .verify();
  }

  /**
   * Verifies the datatype contracts for each class, except deserializers, test containers and etc.,
   * from the packages {@link jarkz.tbot.types.chatmember}.
   */
  @Test
  public void verifyDatatypesContract() throws ContractException {
    ContractVerifier.verifyPackage(this.getClass().getPackageName());
  }

  /**
   * Verifies the JSON serialization for each class, except deserializers, test containers and etc.,
   * from the package {@link jarkz.tbot.types.chatmember}.
   */
  @Test
  public void verifyJsonSerialization() {
    var reflections =
        new Reflections(
            this.getClass().getPackageName(), Scanners.SubTypes.filterResultsBy(s -> true));

    StringBuilder errMessage = new StringBuilder();
    reflections.get(Scanners.SubTypes.of(Object.class).asClass()).stream()
        .filter(
            c ->
                !c.isInterface()
                    && !c.isAnnotationPresent(Deserializer.class)
                    && !c.isAnnotationPresent(TestContainer.class))
        .forEach(c -> TypesTest.verifyClassByJsonSerialization(c, errMessage));

    if (!errMessage.isEmpty()) {
      throw new JsonSerializationException("\n" + errMessage.toString());
    }
  }
}
