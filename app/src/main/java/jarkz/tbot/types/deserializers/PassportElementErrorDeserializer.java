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
      case "data" -> clazz = PassportElementErrorDataField.class;
      case "file" -> clazz = PassportElementErrorFile.class;
      case "files" -> clazz = PassportElementErrorFiles.class;
      case "front_side" -> clazz = PassportElementErrorFrontSide.class;
      case "reverse_side" -> clazz = PassportElementErrorReverseSide.class;
      case "selfie" -> clazz = PassportElementErrorSelfie.class;
      case "translation_file" -> clazz = PassportElementErrorTranslationFile.class;
      case "translation_files" -> clazz = PassportElementErrorTranslationFiles.class;
      case "unspecified" -> clazz = PassportElementErrorUnspecified.class;
      default -> throw new JsonTypeNotDefined(
          String.format(
              "Given \"%s\" in %s is not defined.",
              PASSPORT_ELEMENT_ERROR_KEY, PassportElementError.class.getName()));
    }

    return context.deserialize(json, clazz);
  }
}
