package jarkz.tbot.types.passport;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import jarkz.tbot.types.annotations.Deserializer;
import jarkz.tbot.types.deserializers.JsonNotFoundKey;
import jarkz.tbot.types.deserializers.JsonTypeNotDefined;

@Deserializer
public class DeserializerProxy {

	private static final String PASSPORT_ELEMENT_ERROR_KEY = "source";

	public static Class<? extends PassportElementError> getPassportElementErrorClass(JsonObject jsonObject) {

		JsonElement element = jsonObject.get(PASSPORT_ELEMENT_ERROR_KEY);
		if (element == null) {
			throw new JsonNotFoundKey(String.format("Not found the key \"%s\" in %s.", PASSPORT_ELEMENT_ERROR_KEY,
					PassportElementError.class.getName()));
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
			case PassportElementErrorTranslationFile.SOURCE -> clazz = PassportElementErrorTranslationFile.class;
			case PassportElementErrorTranslationFiles.SOURCE -> clazz = PassportElementErrorTranslationFiles.class;
			case PassportElementErrorUnspecified.SOURCE -> clazz = PassportElementErrorUnspecified.class;
			default -> throw new JsonTypeNotDefined(String.format("Given \"%s\" in %s is not defined.",
					PASSPORT_ELEMENT_ERROR_KEY, PassportElementError.class.getName()));
		}
		return clazz;
	}
}
