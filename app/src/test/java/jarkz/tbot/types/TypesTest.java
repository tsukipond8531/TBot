package jarkz.tbot.types;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jarkz.tbot.TestContainer;
import jarkz.tbot.exceptions.types.ContractException;
import jarkz.tbot.exceptions.types.JsonSerializationException;
import jarkz.tbot.types.annotations.Deserializer;
import jarkz.tbot.types.botcommandscope.BotCommandScope;
import jarkz.tbot.types.chat.Chat;
import jarkz.tbot.types.chatmember.ChatMember;
import jarkz.tbot.types.deserializers.BotCommandScopeDeserializer;
import jarkz.tbot.types.deserializers.ChatMemberDeserializer;
import jarkz.tbot.types.deserializers.InlineQueryResultDeserializer;
import jarkz.tbot.types.deserializers.InputMediaDeserializer;
import jarkz.tbot.types.deserializers.MenuButtonDeserializer;
import jarkz.tbot.types.deserializers.PassportElementErrorDeserializer;
import jarkz.tbot.types.inlinemode.InlineQueryResult;
import jarkz.tbot.types.inputmedia.InputMedia;
import jarkz.tbot.types.menubutton.MenuButton;
import jarkz.tbot.types.passport.PassportElementError;
import java.lang.reflect.InvocationTargetException;
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

  private static final int TYPE_DEPTH = 1;
  private static final float CHANCE_OF_NULLABLE_FIELD = 0.35f;
  private static final float GENERATE_ALL_FIELDS = 1f;

  /**
   * Verifies a class by JSON serialization.
   *
   * @param clazz a datatype class
   * @param errMessage the string builder that uses for writing any errors
   */
  public static void verifyClassByJsonSerialization(Class<?> clazz, StringBuilder errMessage) {
    Object instance;
    try {
      instance = clazz.getDeclaredConstructor().newInstance();
    } catch (InvocationTargetException
        | IllegalAccessException
        | InstantiationException
        | NoSuchMethodException e) {
      errMessage
          .append("An error occurred in invocation default constructor.\nError message: ")
          .append(e.getMessage())
          .append("\nSource object: ")
          .append(clazz)
          .append("\n\n");
      return;
    }

    TypeFactory<Object> factory =
        new TypeFactory<>(TypesTest.TYPE_DEPTH, TypesTest.GENERATE_ALL_FIELDS);
    factory.generate(instance);

    Gson gson = TypesTest.getGson();
    String json = gson.toJson(instance);

    Object otherInstance = gson.fromJson(json, clazz);
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
    GsonBuilder gsonBuilder =
        new GsonBuilder()
            .registerTypeAdapter(BotCommandScope.class, new BotCommandScopeDeserializer())
            .registerTypeAdapter(ChatMember.class, new ChatMemberDeserializer())
            .registerTypeAdapter(InlineQueryResult.class, new InlineQueryResultDeserializer())
            .registerTypeAdapter(InputMedia.class, new InputMediaDeserializer())
            .registerTypeAdapter(MenuButton.class, new MenuButtonDeserializer())
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
   * Verifies the JSON serialization for each class, except deserializers, test containers and etc.,
   * from the packages {@link jarkz.tbot.types}.*.
   */
  @Test
  public void verifyJsonSerializationAllPackages() {
    var reflections =
        new Reflections(
            this.getClass().getPackageName(), Scanners.SubTypes.filterResultsBy(s -> true));

    StringBuilder errMessage = new StringBuilder();
    reflections.get(Scanners.SubTypes.of(Object.class).asClass()).stream()
        .filter(
            c ->
                !c.isInterface()
                    && !c.getPackage().isAnnotationPresent(Deserializer.class)
                    && !c.isAnnotationPresent(Deserializer.class)
                    && !c.isAnnotationPresent(TestContainer.class))
        .forEach(c -> TypesTest.verifyClassByJsonSerialization(c, errMessage));

    if (!errMessage.isEmpty()) {
      throw new JsonSerializationException("\n" + errMessage.toString());
    }
  }

  /**
   * Verifies the equals and hashCode for each class, except deserializers, test containers and
   * etc., from the packages {@link jarkz.tbot.types}.*.
   */
  @Test
  public void verifyEqualsAndHashCodeAllPackages() {
    Reflections reflections =
        new Reflections(
            this.getClass().getPackageName(), Scanners.SubTypes.filterResultsBy(s -> true));
    reflections.get(Scanners.SubTypes.of(Object.class).asClass()).stream()
        .filter(c -> !c.getPackage().isAnnotationPresent(Deserializer.class))
        .map(c -> c.getPackageName())
        .distinct()
        .forEach(p -> verifyEqualsAndHashCodeForPackage(p));
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
    StringBuilder errMessage = new StringBuilder();

    reflections.get(Scanners.SubTypes.of(Object.class).asClass()).stream()
        .map(c -> c.getPackageName())
        .distinct()
        .filter(p -> !p.startsWith(this.getClass().getPackageName() + ".deserializers"))
        .forEach(
            p -> {
              try {
                ContractVerifier.verifyPackage(p);
              } catch (ContractException e) {
                errMessage
                    .append(e.getMessage())
                    .append("\n\n")
                    .append("------------------------------------------------------------------")
                    .append("------------------------------------------------------------------")
                    .append("\n\n");
              }
            });

    if (!errMessage.isEmpty()) throw new ContractException(errMessage.toString());
  }

  /**
   * Verifies the equals and hashCode for each class, except deserializers, test containers and
   * etc., from the specific package.
   *
   * @param packageName the specific package, from which gets the classes to pass the test.
   */
  private void verifyEqualsAndHashCodeForPackage(String packageName) {
    var verifier =
        EqualsVerifier.forPackage(packageName)
            .withPrefabValues(
                Message.class,
                PrefabTypes.getMessageInstance(
                    TypesTest.TYPE_DEPTH, TypesTest.CHANCE_OF_NULLABLE_FIELD),
                PrefabTypes.getMessageInstance(
                    TypesTest.TYPE_DEPTH, TypesTest.CHANCE_OF_NULLABLE_FIELD))
            .withPrefabValues(
                Chat.class,
                PrefabTypes.getChatInstance(
                    TypesTest.TYPE_DEPTH, TypesTest.CHANCE_OF_NULLABLE_FIELD),
                PrefabTypes.getChatInstance(
                    TypesTest.TYPE_DEPTH, TypesTest.CHANCE_OF_NULLABLE_FIELD))
            .except(
                c ->
                    c.isAnnotationPresent(TestContainer.class)
                        || c.isAnnotationPresent(Deserializer.class));

    verifier.suppress(Warning.ALL_FIELDS_SHOULD_BE_USED, Warning.NONFINAL_FIELDS).verify();
  }
}
