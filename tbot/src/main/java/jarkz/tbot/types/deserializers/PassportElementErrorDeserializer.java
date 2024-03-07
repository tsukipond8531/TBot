package jarkz.tbot.types.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import jarkz.tbot.types.PassportElementError;
import jarkz.tbot.types.PassportElementErrorDataField;
import jarkz.tbot.types.PassportElementErrorFile;
import jarkz.tbot.types.PassportElementErrorFiles;
import jarkz.tbot.types.PassportElementErrorFrontSide;
import jarkz.tbot.types.PassportElementErrorReverseSide;
import jarkz.tbot.types.PassportElementErrorSelfie;
import jarkz.tbot.types.PassportElementErrorTranslationFile;
import jarkz.tbot.types.PassportElementErrorTranslationFiles;
import jarkz.tbot.types.PassportElementErrorUnspecified;
import java.lang.reflect.Type;

/**
 * The JSON deserializer for general interface {@link PassportElementError}.
 *
 * @author Pavel Bialiauski
 */
public class PassportElementErrorDeserializer implements JsonDeserializer<PassportElementError> {

  private final String PASSPORT_ELEMENT_ERROR_KEY = "source";

  @Override
  public PassportElementError deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject();

    JsonElement element = jsonObject.get(PASSPORT_ELEMENT_ERROR_KEY);
    if (element == null) {
      throw new JsonNotFoundKey(
          String.format(
              "Not found the key \"%s\" in %s.",
              PASSPORT_ELEMENT_ERROR_KEY, PassportElementError.class.getName()));
    }
    String value = element.getAsString();

    Class<? extends PassportElementError> clazz = null;
    switch (value) {
      case PassportElementErrorDataField.SOURCE -> clazz = PassportElementErrorDataField.class;
      case PassportElementErrorFile.SOURCE -> clazz = PassportElementErrorFile.class;
      case PassportElementErrorFiles.SOURCE -> clazz = PassportElementErrorFiles.class;
      case PassportElementErrorFrontSide.SOURCE -> clazz = PassportElementErrorFrontSide.class;
      case PassportElementErrorReverseSide.SOURCE -> clazz = PassportElementErrorReverseSide.class;
      case PassportElementErrorSelfie.SOURCE -> clazz = PassportElementErrorSelfie.class;
      case PassportElementErrorTranslationFile.SOURCE -> clazz =
          PassportElementErrorTranslationFile.class;
      case PassportElementErrorTranslationFiles.SOURCE -> clazz =
          PassportElementErrorTranslationFiles.class;
      case PassportElementErrorUnspecified.SOURCE -> clazz = PassportElementErrorUnspecified.class;
      default -> throw new JsonTypeNotDefined(
          String.format(
              "Given \"%s\" in %s is not defined.",
              PASSPORT_ELEMENT_ERROR_KEY, PassportElementError.class.getName()));
    }

    return context.deserialize(json, clazz);
  }
}
