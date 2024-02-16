package jarkz.tbot.types;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jarkz.tbot.TestContainer;
import jarkz.tbot.exceptions.types.ContractException;
import jarkz.tbot.exceptions.types.JsonSerializationException;
import jarkz.tbot.types.annotations.Deserializer;
import jarkz.tbot.types.deserializers.BotCommandScopeDeserializer;
import jarkz.tbot.types.deserializers.ChatBoostSourceDeserializer;
import jarkz.tbot.types.deserializers.ChatMemberDeserializer;
import jarkz.tbot.types.deserializers.MaybeInaccessibleMessageDeserializer;
import jarkz.tbot.types.deserializers.MenuButtonDeserializer;
import jarkz.tbot.types.deserializers.MessageOriginDeserializer;
import jarkz.tbot.types.deserializers.PassportElementErrorDeserializer;
import jarkz.tbot.types.deserializers.ReactionTypeDeserializer;
import jarkz.tbot.violations.ViolationList;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

/**
 * This test verifies package {@link jarkz.tbot.types} and some methods verifies packages {@link
 * jarkz.tbot.types}.*.
 *
 * @author Pavel Bialiauski
 */
@TestContainer
public class TypesTest {

  public static final int TYPE_DEPTH = 1;
  public static final float NULLABLE_FIELD_CHANCE = 0.35f;
  public static final float GENERATE_ALL_FIELDS = 1f;

  /**
   * Verifies a class by JSON serialization.
   *
   * @param sourceClass a datatype class
   * @param errMessage the string builder that uses for writing any errors
   */
  public static void verifyClassByJsonSerialization(
      Class<?> sourceClass, StringBuilder errMessage) {
    if (sourceClass == InputFile.class) {
      return;
    }

    Object instance =
        TypeFactory.generate(sourceClass, TypesTest.TYPE_DEPTH, TypesTest.GENERATE_ALL_FIELDS);
    Gson gson = TypesTest.getGson();
    String json = gson.toJson(instance);

    Object otherInstance = gson.fromJson(json, sourceClass);
    if (!instance.equals(otherInstance)) {
      errMessage
          .append(
              "Objects not equals, when same object deserialized from json.\n" + "Source object: ")
          .append(instance)
          .append("\nDestination object: ")
          .append(otherInstance)
          .append("\n Json data: ")
          .append(json);
    }
  }

  /**
   * Generates general gson and returns it.
   *
   * @return a gson instance
   */
  public static Gson getGson() {
    final GsonBuilder gsonBuilder =
        new GsonBuilder()
            .registerTypeAdapter(BotCommandScope.class, new BotCommandScopeDeserializer())
            .registerTypeAdapter(ChatMember.class, new ChatMemberDeserializer())
            .registerTypeAdapter(MenuButton.class, new MenuButtonDeserializer())
            .registerTypeAdapter(MessageOrigin.class, new MessageOriginDeserializer())
            .registerTypeAdapter(ReactionType.class, new ReactionTypeDeserializer())
            .registerTypeAdapter(
                MaybeInaccessibleMessage.class, new MaybeInaccessibleMessageDeserializer())
            .registerTypeAdapter(ChatBoostSource.class, new ChatBoostSourceDeserializer())
            .registerTypeAdapter(
                PassportElementError.class, new PassportElementErrorDeserializer());
    return gsonBuilder.create();
  }

  /**
   * Verifies the equals and hashCode for each class, except deserializers, test containers and
   * etc., from the package {@link jarkz.tbot.types}.
   */
  @Test
  public void verifyEqualsAndHashCode() {
    verifyEqualsAndHashCodeForPackage(this.getClass().getPackageName());
  }

  /**
   * Verifies the JSON serialization for each class, except deserializers, test containers and etc.,
   * from the package {@link jarkz.tbot.types}.
   */
  @Test
  public void verifyJsonSerialization() {
    final String currentPackageName = this.getClass().getPackageName();
    var reflections =
        new Reflections(currentPackageName, Scanners.SubTypes.filterResultsBy(s -> true));

    StringBuilder errMessage = new StringBuilder();
    reflections.get(Scanners.SubTypes.of(Object.class).asClass()).stream()
        .filter(
            c ->
                !c.isInterface()
                    && c.getPackageName().equals(currentPackageName)
                    && !c.isAnnotationPresent(TestContainer.class))
        .forEach(c -> TypesTest.verifyClassByJsonSerialization(c, errMessage));

    if (!errMessage.isEmpty()) {
      throw new JsonSerializationException("\n" + errMessage.toString());
    }
  }

  /**
   * Verifies the datatype contracts for each class, except deserializers, test containers and etc.,
   * from the packages {@link jarkz.tbot.types}.
   */
  @Test
  public void verifyDatatypeContract() throws ContractException {
    Reflections reflections =
        new Reflections(
            this.getClass().getPackageName(), Scanners.SubTypes.filterResultsBy(s -> true));
    var violations = new ViolationList();
    // StringBuilder errMessage = new StringBuilder();
    //
    // final String wrapLine = "------------------------------------------------------------------";
    // final String skipLine = "\n\n";
    reflections.get(Scanners.SubTypes.of(Object.class).asClass()).stream()
        .map(c -> c.getPackageName())
        .distinct()
        .filter(p -> !p.startsWith(this.getClass().getPackageName() + ".deserializers"))
        .forEach(
            p -> {
              try {
                ContractVerifier.verifyPackage(p);
              } catch (ContractException e) {
                violations.extendFrom(e.getViolations());
                // errMessage
                //     .append(e.getMessage())
                //     .append(skipLine)
                //     .append(wrapLine)
                //     .append(wrapLine)
                //     .append(skipLine);
              }
            });

    // if (!errMessage.isEmpty()) throw new ContractException(errMessage.toString());
    if (!violations.isEmpty()) throw new ContractException(violations.toString());
  }

  /**
   * Verifies the equals and hashCode for each class, except deserializers, test containers and
   * etc., from the specific package.
   *
   * @param packageName the specific package, from which gets the classes to pass the test.
   */
  private void verifyEqualsAndHashCodeForPackage(String packageName) {
    EqualsVerifier.forPackage(packageName)
        .withPrefabValues(
            Message.class,
            PrefabTypes.getMessageInstance(TypesTest.TYPE_DEPTH, TypesTest.NULLABLE_FIELD_CHANCE),
            PrefabTypes.getMessageInstance(TypesTest.TYPE_DEPTH, TypesTest.NULLABLE_FIELD_CHANCE))
        .withPrefabValues(
            Chat.class,
            PrefabTypes.getChatInstance(TypesTest.TYPE_DEPTH, TypesTest.NULLABLE_FIELD_CHANCE),
            PrefabTypes.getChatInstance(TypesTest.TYPE_DEPTH, TypesTest.NULLABLE_FIELD_CHANCE))
        .except(
            c ->
                c.isAnnotationPresent(TestContainer.class)
                    || c.isAnnotationPresent(Deserializer.class))
        .suppress(Warning.ALL_FIELDS_SHOULD_BE_USED, Warning.NONFINAL_FIELDS)
        .verify();
  }
}
