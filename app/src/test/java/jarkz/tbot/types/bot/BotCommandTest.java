package jarkz.tbot.types.bot;

import jarkz.tbot.TestContainer;
import jarkz.tbot.exceptions.types.ContractException;
import jarkz.tbot.exceptions.types.JsonSerializationException;
import jarkz.tbot.types.ContractVerifier;
import jarkz.tbot.types.TypesTest;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

/**
 * This test verifies package {@link jarkz.tbot.types.bot}.
 *
 * @author Pavel Bialiauski
 */
@TestContainer
public class BotCommandTest {

  /**
   * Verifies the equals and hashCode for each class, except deserializers, test containers and
   * etc., from the package {@link jarkz.tbot.types.bot}.
   */
  @Test
  public void verifyEqualsAndHashCode() {
    EqualsVerifier.forPackage(this.getClass().getPackageName())
        .suppress(Warning.NONFINAL_FIELDS)
        .verify();
  }

  /**
   * Verifies the datatype contracts for each class, except deserializers, test containers and etc.,
   * from the packages {@link jarkz.tbot.types.bot}.
   */
  @Test
  public void verifyDatatypesContract() throws ContractException {
    ContractVerifier.verifyPackage(this.getClass().getPackageName());
  }

  /**
   * Verifies the JSON serialization for each class, except deserializers, test containers and etc.,
   * from the package {@link jarkz.tbot.types.bot}.
   */
  @Test
  public void verifyJsonSerialization() {
    var reflections =
        new Reflections(
            this.getClass().getPackageName(), Scanners.SubTypes.filterResultsBy(s -> true));

    StringBuilder errMessage = new StringBuilder();
    reflections.get(Scanners.SubTypes.of(Object.class).asClass()).stream()
        .filter(c -> !c.isInterface() && !c.isAnnotationPresent(TestContainer.class))
        .forEach(c -> TypesTest.verifyClassByJsonSerialization(c, errMessage));

    if (!errMessage.isEmpty()) {
      throw new JsonSerializationException("\n" + errMessage.toString());
    }
  }
}
